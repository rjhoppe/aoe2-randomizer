FROM eclipse-temurin:21.0.4-jdk-slim

WORKDIR /app

COPY out/aoe2_randomizer_jar/aoe2-randomizer.jar /app/aoe2-randomizer.jar

CMD ["java", "-jar", "aoe2-randomizer.jar"]