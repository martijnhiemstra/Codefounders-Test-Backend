FROM amazoncorretto:17.0.9
EXPOSE 8080
ADD target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
