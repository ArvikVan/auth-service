FROM openjdk
WORKDIR aurh-service
ADD build/libs/auth-service-0.0.1.jar app.jar
ENTRYPOINT java -jar app.jar