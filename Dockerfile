FROM maven:3.9.11-eclipse-temurin-17 AS build
WORKDIR /opt/app
COPY . .
RUN mvn -B -DskipTests clean package

FROM eclipse-temurin:17-jre-jammy
WORKDIR /opt/app
COPY --from=build /opt/app/target/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/opt/app/app.jar"]


