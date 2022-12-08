FROM openjdk:8
ADD target/test-demo.jar test-demo.jar
ENTRYPOINT ["java","-jar" , "test-demo.jar"]
EXPOSE 8089