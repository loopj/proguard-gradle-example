Example Java App with Proguard
==============================
[![Build Status](https://travis-ci.org/gengjiawen/proguard-gradle-example.svg?branch=master)](https://travis-ci.org/gengjiawen/proguard-gradle-example)

Building
--------

```shell
./gradlew clean proguard
```

Running
-------

```shell
java -jar build/libs/proguard-gradle-example.jar
```

Outputs
-------

-   `build/libs/proguard-gradle-example.jar` - main package

-   `build/libs/proguard-gradle-example.out.jar` - obfuscated main package

-   `proguard.map` - proguard obfuscation mapping file

