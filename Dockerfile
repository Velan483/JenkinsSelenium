#
# Build
#
FROM maven:3.8.3-openjdk-17 AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package
#
# Package stage
#
FROM openjdk:17-alpine
COPY --from=build /home/app/target/ManualTesting1-0.0.1-SNAPSHOT.jar /usr/local/lib/ManualTesting1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/usr/local/lib/ManualTesting1-0.0.1-SNAPSHOT.jar"]
