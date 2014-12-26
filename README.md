Example Java App with Proguard
==============================

Building
--------

```shell
./gradlew clean build proguard
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
