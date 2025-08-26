FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY . .

# Give execute permission to mvnw
RUN chmod +x mvnw

# Build the JAR
RUN ./mvnw clean package -DskipTests

# Copy JAR
RUN cp target/*.jar app.jar

EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
