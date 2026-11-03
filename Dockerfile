
FROM eclipse-temurin:21-jre

WORKDIR /app

COPY target/iot-application-1.0-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]
