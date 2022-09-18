#FROM amazoncorretto:11.0.14
#COPY . .
#ENTRYPOINT ["java", "-jar", "*.jar"]
#EXPOSE 8080

FROM openjdk
#ARG JAR_FILE=target/*.jar
COPY target/sampleToDoApp-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]