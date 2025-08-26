# ---------- Build stage ----------
FROM maven:3.9-eclipse-temurin-23 AS build
WORKDIR /app

# Copy pom first to leverage Docker layer caching
COPY pom.xml .
RUN mvn -B -q -DskipTests dependency:go-offline

# Copy source and build
COPY src ./src
RUN mvn -B clean package -DskipTests

# ---------- Run stage ----------
FROM eclipse-temurin:23-jdk
WORKDIR /app

# Copy only the JAR from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose default Spring Boot port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java","-jar","app.jar"]
