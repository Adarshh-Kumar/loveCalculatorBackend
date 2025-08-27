# Build stage
FROM eclipse-temurin:21-jdk AS build
WORKDIR /app

# Copy ALL project files including Maven wrapper
COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn
COPY src ./src

# Make mvnw executable and build
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

# Run stage
FROM eclipse-temurin:21-jdk
WORKDIR /app

# Copy the jar from the build stage
COPY --from=build /app/target/*.jar app.jar

# Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]