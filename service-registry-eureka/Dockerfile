FROM eclipse-temurin:21-jre-alpine
WORKDIR /opt
ENV PORT 8761
EXPOSE 8761
COPY target/*.jar /opt/app.jar
ENTRYPOINT exec java "$JAVA_OPTS" -jar app.jar