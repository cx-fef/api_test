FROM openjdk:23-slim

LABEL Name="Cx API Sec + Dast Demo App" Version=1.0.0

COPY target/sanityScan-0.0.1-SNAPSHOT.jar .

EXPOSE 8888

CMD ["java", "-jar", "sanityScan-0.0.1-SNAPSHOT.jar"]
