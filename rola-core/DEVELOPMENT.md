
## DSL (XText)

* Obtain [XText Standalone](http://www.eclipse.org/Xtext/download.html)

### Importing The Project

* `Import` -> `General` -> `Existing Projects into Workspace` 
  * `Select Root Directory` `xtext` e.g. `/~/repositories/richwps.wd/xtext`
  * `Finish`

### Exporting The Library

This procedure is based on [stackoverflow question](http://stackoverflow.com/questions/7840685/is-it-possible-to-use-xtext-without-eclipse/7854545#7854545) and especially [Sebastian Zarnekow's](http://zarnekow.blogspot.de/2010/06/how-to-deploy-xtext-standalone.html) article.

* Select `de.hsos.richwps.dsl`-project
* `Export` -> `Java` -> `Runnable Jar file`
	* Select `Copy required libraries into a sub-folder next to the generated JAR.`
* `Finish`
