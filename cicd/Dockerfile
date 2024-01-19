FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080
ADD target/*.jar cicd-app.jar
ENTRYPOINT ["java","-jar","cicd-app.jar"]