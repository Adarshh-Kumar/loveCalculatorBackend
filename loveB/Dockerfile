# Build stage
FROM eclipse-temurin:21-jdk AS build
WORKDIR /app

# Copy project files
COPY pom.xml .
COPY src ./src

# Build the application (skip tests to make it faster)
RUN ./mvnw clean package -DskipTests

# Run stage
FROM eclipse-temurin:21-jdk
WORKDIR /app

# Copy the jar from the build stage
COPY --from=build /app/target/*.jar app.jar

# Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]