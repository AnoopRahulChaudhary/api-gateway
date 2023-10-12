FROM eclipse-temurin:17
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} api-gateway.jar
ENTRYPOINT ["java","-jar","/api-gateway.jar"]