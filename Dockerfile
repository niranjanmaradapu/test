FROM openjdk:8
ADD mv target/*.jar   target/test-demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar" , "test-demo.jar"]