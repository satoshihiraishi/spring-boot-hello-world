FROM openjdk:17-jdk-slim
# FROM eclipse-temurin:17-jre
COPY build/libs/spring-helloworld-0.0.1-SNAPSHOT.jar app.jar
RUN chmod +x /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
