# Use the official eclipse jdk image
FROM eclipse-temurin:21-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the Gradle files
COPY build.gradle .
COPY settings.gradle .
COPY gradlew .
COPY gradle/ gradle/
COPY src src

# Build the app
RUN ./gradlew build

# Expose the port and run .jar file
EXPOSE 8080
CMD ["java", "-jar", "build/libs/movie-mingle-backend-0.0.1-SNAPSHOT.jar"]