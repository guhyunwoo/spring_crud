FROM openjdk:17-jdk-slim

WORKDIR /beomeo-wiki

COPY build/libs/*SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/beomeo-wiki/app.jar"]