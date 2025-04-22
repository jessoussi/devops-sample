FROM openjdk:17-jdk-slim
RUN apt-get -y update; apt-get -y install curl
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]