# Build stage
FROM maven:3.9.8-eclipse-temurin-21 AS build
COPY . /app
WORKDIR /app
RUN ls -la /app
RUN mvn clean package -DskipTests

# Run stage
FROM eclipse-temurin:21-jdk
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]