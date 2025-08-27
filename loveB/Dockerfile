# Use Eclipse Temurin JDK 21
FROM eclipse-temurin:21-jdk

# Set working directory inside container
WORKDIR /app

# Copy Maven configuration first to leverage Docker cache
COPY pom.xml .

# Copy source code
COPY src ./src

# Build the project (skip tests for faster build)
RUN ./mvnw clean package -DskipTests || mvn clean package -DskipTests

# Expose default port
EXPOSE 8080

# Run the Spring Boot JAR
CMD ["java", "-jar", "target/loveB-0.0.1-SNAPSHOT.jar"]
