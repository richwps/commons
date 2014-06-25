* install `de.hsos.richwps.wd.jar` to m2-repository with 
    `mvn install:install-file -Dfile=./de.hsos.richwps.wd.jar -DgroupId=de.hsos.richwps -DartifactId=d
    wd.lang -Dversion=1.0-SNAPSHOT -Dpackaging=jar` or `./installM2.sh`
* `cd api && mvn clean install`
* reference the library in your maven-project:

`       <dependency>
                <groupId>de.hsos.richwps</groupId>
                <artifactId>dsl.api</artifactId>
                <version>1.0-SNAPSHOT</version>
                <classifier>jar-with-dependencies</classifier>
            </dependency>

* reading scripts
	* Instantiate `de.hsos.richwps.dsl.api.Reader`
	* `load` a script.
	* `inspect` the script.
	* `get` WorksequenceDescription
* creating wd-scripts
 	* `TODO`
