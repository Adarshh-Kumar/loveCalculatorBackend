FROM eclipse-temurin:21-jdk
WORKDIR /app

# Copy everything first
COPY . .

# Make mvnw executable and build
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

# Run the application
CMD ["java", "-jar", "target/*.jar"]