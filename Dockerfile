FROM openjdk:18
WORKDIR /app
COPY ./target/Loan_Management_System-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "Loan_Management_System-0.0.1-SNAPSHOT.jar"]
