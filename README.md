Example Java App with Proguard
==============================

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

Proguard Version
-------
The inner progurd version is 5.2.1
Download at [http://proguard.sourceforge.net/downloads.html](http://proguard.sourceforge.net/downloads.html)

