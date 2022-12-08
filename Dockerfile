FROM openjdk:8
COPY  target/  target/
RUN  mv target/*.jar   target/test-demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar" , "target/test-demo.jar"]
