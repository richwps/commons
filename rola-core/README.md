XText-based toolchain for processing scripts written in the RichWPS Orchestration Language (ROLA).
This library is part of the BMBF research project RichWPS.

This library works as tool for reading and generating workflows. It is not intended to be a runtime environment that executes a given workflow.

## Usage

* see [ROLA API](https://github.com/richwps/commons/tree/master/rola-api)

## Development

* Obtain [XText Standalone](http://www.eclipse.org/Xtext/download.html)
* Import the project**
  * `Import` -> `General` -> `Existing Projects into Workspace` 
    * `Select Root Directory` `xtext` e.g. `/~/repositories/richwps.wd/xtext`
    * `Finish`

* Exporting The Library

This procedure is based on [stackoverflow question](http://stackoverflow.com/questions/7840685/is-it-possible-to-use-xtext-without-eclipse/7854545#7854545) and especially [Sebastian Zarnekow's](http://zarnekow.blogspot.de/2010/06/how-to-deploy-xtext-standalone.html) article.

* Select `de.hsos.richwps.dsl`-project
* `Export` -> `Java` -> `Runnable Jar file`
	* Select `Copy required libraries into a sub-folder next to the generated JAR.`
* `Finish`

* Export generated lib to `rola-api/libs/de/hsos/richwps/dsl.lang/dsl.lang-1.0.0-SNAPSHOT.jar`

## Notation

* [elements](#elements) - a short description of available/planed elements
* [elements in detail](#elements in detail)
  * [references](#references)
  * [assignments](#assignments)
  * [bindings](#bindings)
  * [execute-statements](#execute-statements)
  * [variables, constants](#variables, constants)
  * [datatypes](#datatypes)
  * [control structures](#control structures)
  * [resources](#resources)
  * [assertions](#assertions)

### elements

* `//` : Comment till end of line
* references : References for runtime-objects such as wps:inputs, wps:outputs and variables.
* assignments: Assignments which are used to assign values to wps:outputs and variables.
* bindings : Bindings that refer local or remote process by using a (workflow-)unique handle.
* execute : Statements that executes remote and local processes by using the unique handle and given references.
* variables : Variables and constants which can be used for storing values.
* resources : Certain types of resources that are stored relative to the script an can be loaded at runtime `pending
* control structures : Necessary control structures `pending`
* asserts : Assertions which can be used to abort processing under certain circumstances.

### elements in detail

#### references

References are used to handle every referable runtime-object such as wps:inputs, wps:outputs or variables. They are refereed to by unique identifiers. Whilst the identifiers for in- and outputs are based on the given wps:processdescription variables can be declared on on-the-fly.

* inputs wps-compliant inputs. `in.$wps-input-identifier$`
* outputs wps-compliant outputs: `out.$wps-output-identifier$` 
* variables `var.$unique-identifier$`

The values for inputs are setup when instantiating the script - they can not be altered whilst runtime.

#### assignments

Assignments for values to runtime-objects such as outputs or variables. 

* `out.$wps-output-identifier$ = var.$unique-identifier$`
* `var.$unique-identifier$ = in.$wps-input-identifier$`

#### bindings

Bindings are used to associate local or remote wps-processes to a variable but unique handle. A binding provides the very basis for a following execute-statement. In order to maintain consistency a binding needs to include every information necessary to obtain a wps:processdescription at runtime.

    bind
    process $wps-compliant-process-identifier$
    to $org/name$

A remote binding can be identified by its additional information: protocol, host, port and path to the given wps-endpoint.

    bind
    process $http/https$, $port$, $path$, $wps-compliant-process-identifier$
    to $org/name$

#### execute-statements

Execute-statemments are used to call remote or local processes which are identified by bindings. In order to fit in variables as wps:inputs for the targeted process the target inputs needs to be well-known.

    execute $org/name$
    with
    $runtimereference{in/var}$ as wps-input-identifier-targetprocess
    . . .
    $runtimereference{in/var}$ as wps-input-identifier-targetprocess
    store
    wps-output-identifier-targetprocess as $runtimereference{out/var}$
    . . .
    wps-output-identifier-targetprocess as $runtimereference{out/var}$

### open issues

* The definition for a wps-execute statement goes beyond simply calling remote processes. For instance the format for outputs and the necessity to store them can be configured. The above shown syntax promotes the  `convention over configuration`-approach as a first draft.  

#### variables, constants

##### datatypes

The OGC Web Processing Service defines the three input- and output datatypes `BoundingBox`, `LiteralData` and `ComplexData`. However more sophisticated subtypes can be derived.

### LiteralData

For instance the the 52°N WPS Server (V. 3.2.0) defines these subtypes for LiteralDatas.

* LiteralAnyURIBinding
* LiteralBase64BinaryBinding
* LiteralBoolenBinding
* LiteralByteBinding
* LiteralDateTimeBinding
* LiteralDoubleBinding
* LiteralFloatBinding
* LiteralIntBinding
* LiteralLongBinding
* LiteralShortBinding
* LiteralStringBinding

Regarding variables those datatypes should be available and detected at runtime.

* `var.unique-identifier = "A String"` : LiteralStringBinding
* `var.unique-identifier = 10` : LiteralStringBinding
* `var.unique-identifier = {true/false}` : LiteralBooleanBinding
* ...

Further LiteralDatatypes will be derived from the given use cases.

#### open issues

* Supporting LiteralData heavily relies on parsing a given string and identifying the contained datatype. 
* Selection of most important datatypes for first implementation. 
* Who detects datatypes? The interpreter or the reader/parser? 

### ComplexData

As with its version 3.2.0 the 52°N WPS Server supports the ComplexData subtypes

* ArrayDataBinding
* FileDataBinding
* GTRasterDataBinding
* GTVectorDataBinding
* GenericFileDataBinding
* GeotiffBinding
* JTSGEometryBinding
* PlainStringBinding
* ShapefileBinding

and provides a set of parsers for different data representation (e.g. AsciiGrassParser, GML2BasicParser, GML3BasicParser, .., WKTParser). However the runtime objects created, rely on the GeoTools API v. 8.4.

Having that said various datatypes and formats needs to be supported in an consistent manner on different level.

Referencing `in.wps-compliant-identifier` could refer to a feature collection encapsulated using a `GTVectorDataBinding`. When using that reference for a **remote** process call [e.g. buffer(10, in.wps-compliant-identifier] transportation needs to be realized using a common file format (e.g. GML3). When using a **local** process call relying on the GeoTools datatype FeatureCollection should just work fine.

Having that in mind supporting the encapsulated datatypes (e.g. JTS- or GeoTools) at runtime is necessary.

For instance:
`var.unique-identifier = in.wps-compliant-identifier` could refer to a 
* GeoTools FeatureCollection
* GeoTools GridCoverage2D
* JTS Geometry
* Java Byte Array
* ...

Further ComplexDatatypes will be derived from the given use cases.

### open issues

## resources

Resources can be used to load data from process related, local resources into variables and outputs.
Those resources are - in first place - **simple pieces of non-geo-related information** which needs to be outsourced in order to improve maintainability.

* `var.2DMatrix = res:2DMatrix.csv`
* `var.longString = res:AString.txt`
* ...

Supported formats heavily depend on the supported [datatypes](#datatypes).

## control structures

## assertions

Assertions can be used to verify a boolean-outcome of a process. The results of that process needs to be stored within an variable.

`assert var.unique-identifier "ABORTMESSAGE"`

If the value of the variable is `false` processing will be aborted with an abort message. 

## License

Not, yet.