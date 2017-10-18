# serving_client
This project contains generated java code based on current(10/17/2017) tensorflow_serving and tensorflow proto files
If you suspect that proto files are out of date, then you need to manually sync those files and 
use "protoc" tool and plugin protoc-gen-grpc-java-1.7.0-osx-x86_64.exe to regenerate the java files
something like this: protoc -I=./src/main/proto --plugin=protoc-gen-grpc-java=./protoc-gen-grpc-java-1.7.0-osx-x86_64.exe --grpc-java_out=./src/main/java --java_out=./src/main/java ./src/main/proto/tensorflow_serving/apis/*.proto
note: I could not generate the sources within intellij with the plug-in set in pom.xml, neither command: mvn package works for me

A Scala testing client can be used against the predict service running on AWS, so make sure you get that server up first
make sure the image used is 512x512x3
