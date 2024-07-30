FROM openjdk:18
WORKDIR /app
COPY ./target/ManualTesting1-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "ManualTesting1-0.0.1-SNAPSHOT.jar"]
