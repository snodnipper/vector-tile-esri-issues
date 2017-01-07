# ESRI Vector Tile Issues

The "example" directory contains a project that can be easily edited with Intellij.  It would appear that a version field is missing from ESRI vector tile output, which is part of the [Mapbox Vector Tile specification](1).

That project was made by executing

```console
./run.sh
```
which breaks down the steps for transparency.

With Mapbox vector tiles I get:

```console
/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/bin/java -Didea.launcher.port=7532 "-Didea.launcher.bin.path=/Applications/IntelliJ IDEA.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath "/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/lib/tools.jar:/Users/osnowden/code/vector-tile-esri-issues/vt-source/example/build/classes/main:/Users/osnowden/code/vector-tile-esri-issues/vt-source/example/build/resources/main:/Users/osnowden/.gradle/caches/modules-2/files-2.1/org.slf4j/slf4j-api/1.7.22/a1c83373863cec7ae8d89dc1c5722d8cb6ec0309/slf4j-api-1.7.22.jar:/Users/osnowden/.gradle/caches/modules-2/files-2.1/com.google.protobuf/protobuf-java/3.1.0/e13484d9da178399d32d2d27ee21a77cfb4b7873/protobuf-java-3.1.0.jar:/Users/osnowden/.gradle/caches/modules-2/files-2.1/com.google.guava/guava/20.0/89507701249388e1ed5ddcf8c41f4ce1be7831ef/guava-20.0.jar:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar" com.intellij.rt.execution.application.AppMain DemoSuccess
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
Total layers: 14

Process finished with exit code 0
```

With ESRI vector tiles I get:

```console
/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/bin/java -Didea.launcher.port=7534 "-Didea.launcher.bin.path=/Applications/IntelliJ IDEA.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath "/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/lib/tools.jar:/Users/osnowden/code/vector-tile-esri-issues/vt-source/example/build/classes/main:/Users/osnowden/code/vector-tile-esri-issues/vt-source/example/build/resources/main:/Users/osnowden/.gradle/caches/modules-2/files-2.1/org.slf4j/slf4j-api/1.7.22/a1c83373863cec7ae8d89dc1c5722d8cb6ec0309/slf4j-api-1.7.22.jar:/Users/osnowden/.gradle/caches/modules-2/files-2.1/com.google.protobuf/protobuf-java/3.1.0/e13484d9da178399d32d2d27ee21a77cfb4b7873/protobuf-java-3.1.0.jar:/Users/osnowden/.gradle/caches/modules-2/files-2.1/com.google.guava/guava/20.0/89507701249388e1ed5ddcf8c41f4ce1be7831ef/guava-20.0.jar:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar" com.intellij.rt.execution.application.AppMain DemoFailure
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
Exception in thread "main" com.google.protobuf.InvalidProtocolBufferException: Message missing required fields: layers[0].version
	at com.google.protobuf.UninitializedMessageException.asInvalidProtocolBufferException(UninitializedMessageException.java:81)
	at com.google.protobuf.AbstractParser.checkMessageInitialized(AbstractParser.java:72)
	at com.google.protobuf.AbstractParser.parseFrom(AbstractParser.java:172)
	at com.google.protobuf.AbstractParser.parseFrom(AbstractParser.java:185)
	at com.google.protobuf.AbstractParser.parseFrom(AbstractParser.java:190)
	at com.google.protobuf.AbstractParser.parseFrom(AbstractParser.java:49)
	at vector_tile.VectorTile$Tile.parseFrom(VectorTile.java:4765)
	at DemoFailure.main(DemoFailure.java:36)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:497)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
 ```

Using vector tiles from [ESRI basemaps beta](2) I get:

```console
/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/bin/java -Didea.launcher.port=7535 "-Didea.launcher.bin.path=/Applications/IntelliJ IDEA.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath "/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/lib/tools.jar:/Users/osnowden/code/vector-tile-esri-issues/vt-source/example/build/classes/main:/Users/osnowden/code/vector-tile-esri-issues/vt-source/example/build/resources/main:/Users/osnowden/.gradle/caches/modules-2/files-2.1/org.slf4j/slf4j-api/1.7.22/a1c83373863cec7ae8d89dc1c5722d8cb6ec0309/slf4j-api-1.7.22.jar:/Users/osnowden/.gradle/caches/modules-2/files-2.1/com.google.protobuf/protobuf-java/3.1.0/e13484d9da178399d32d2d27ee21a77cfb4b7873/protobuf-java-3.1.0.jar:/Users/osnowden/.gradle/caches/modules-2/files-2.1/com.google.guava/guava/20.0/89507701249388e1ed5ddcf8c41f4ce1be7831ef/guava-20.0.jar:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar" com.intellij.rt.execution.application.AppMain DemoFailure
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
Exception in thread "main" com.google.protobuf.InvalidProtocolBufferException: Message missing required fields: layers[0].version, layers[1].version, layers[2].version, layers[3].version, layers[4].version, layers[5].version, layers[6].version, layers[7].version, layers[8].version, layers[9].version, layers[10].version, layers[11].version, layers[12].version, layers[13].version, layers[14].version, layers[15].version
	at com.google.protobuf.UninitializedMessageException.asInvalidProtocolBufferException(UninitializedMessageException.java:81)
	at com.google.protobuf.AbstractParser.checkMessageInitialized(AbstractParser.java:72)
	at com.google.protobuf.AbstractParser.parseFrom(AbstractParser.java:172)
	at com.google.protobuf.AbstractParser.parseFrom(AbstractParser.java:185)
	at com.google.protobuf.AbstractParser.parseFrom(AbstractParser.java:190)
	at com.google.protobuf.AbstractParser.parseFrom(AbstractParser.java:49)
	at vector_tile.VectorTile$Tile.parseFrom(VectorTile.java:4765)
	at DemoFailure.main(DemoFailure.java:36)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:497)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
```

 [1]: https://github.com/mapbox/vector-tile-spec/
 [2]: http://basemapsbeta.arcgis.com/preview/app/index.html
