
FROM gradle:8.5-jdk17 AS builder

WORKDIR /app
COPY . .
RUN gradle shadowJar --no-daemon
FROM eclipse-temurin:17-jre

WORKDIR /app

COPY --from=builder /app/build/libs/testCloud-all.jar app.jar

EXPOSE 8080
ENV PORT=8080
CMD ["java", "-jar", "app.jar"]
