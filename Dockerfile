# Use the official OpenJDK image as a base image
FROM eclipse-temurin:21-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the Gradle files to the container
COPY build.gradle .
COPY settings.gradle .
COPY gradlew .
COPY gradle/ gradle/

# Copy the source code to the container
COPY src src

# Build the application
RUN ./gradlew build

# Expose the port that your Spring Boot application will run on
EXPOSE 8080
CMD ["java", "-jar", "build/libs/movie-mingle-backend-0.0.1-SNAPSHOT.jar"]