FROM openjdk:8-jdk-alpine
COPY target/*.jar EmployeeDBManager-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/EmployeeDBManager-1.0-SNAPSHOT.jar"]
