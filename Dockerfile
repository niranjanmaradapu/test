FROM java:8
EXPOSE 8080
ADD target/test-demo.jar test-demo.jar
ENTRYPOINT ["java","-jar" , "test-demo.jar"]