#FROM amazoncorretto:11.0.14
#COPY . .
#ENTRYPOINT ["java", "-jar", "*.jar"]
#EXPOSE 8080

FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]