#!/bin/bash
mvn install:install-file -Dfile=./de.hsos.richwps.dsl.jar -DgroupId=de.hsos.richwps\
    -DartifactId=dsl.lang -Dversion=1.0-SNAPSHOT -Dpackaging=jar
