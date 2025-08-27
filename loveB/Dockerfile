# Use Java 21 JDK
FROM eclipse-temurin:21-jdk

# Set working directory
WORKDIR /app

# Copy Maven configuration first
COPY pom.xml .

# Copy the source code
COPY src ./src

# Build the Spring Boot application
RUN ./mvnw clean package -DskipTests || mvn clean package -DskipTests

# Expose port
EXPOSE 8080

# Run the Spring Boot JAR
CMD ["java", "-jar", "target/loveB-0.0.1-SNAPSHOT.jar"]
