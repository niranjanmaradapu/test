FROM java:8
EXPOSE 8080
ADD target/test-demo test-demo
ENTRYPOINT ["java","-jar" , "test-demo.jar"]