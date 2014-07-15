Various software components that are used in different contexts in the BMBF research project RichWPS.

# Usage

* `cd rola-core && ./installM2.sh && cd ..` or `mvn install:install-file -Dfile=./rola-core/de.hsos.richwps.dsl.jar -DgroupId=de.hsos.richwps\
    -DartifactId=dsl.lang -Dversion=1.0.0-SNAPSHOT -Dpackaging=jar`
* `mvn clean install`

# Contents

* `wps-client-api::3.3.0` - forked 52n wps-client-api: Standalone WPS client API based on the 52North WPS implementation - [README](./wps-client-api/README.md).
* `wps-config::1.0.0-SNAPSHOT` - forked 52n wps-client-api: XML-based configuration of the WPS. -  [README](./wps-config/README.md).
* `common-xml` - forked 52n common-xml: - [README](./common-xml/README.md).
  * `52n-xml-wps-v100::1.1.5` - With **preliminary** WPS-T schema.
* `rola-core::1.0.0-SNAPSHOT` - XText-based toolchain for processing the RichWPS DSL. This library is part of the BMBF research project RichWPS. - [README](./rola-core/README.md).
* `rola-api::1.0.0.-SNAPSHOT` - XText-based toolchain for processing the RichWPS DSL. This library is part of the BMBF research project RichWPS. - [README](./rola-api/README.md).