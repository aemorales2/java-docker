FROM openjdk:16-alpine
EXPOSE 8080
ADD target/ws_docker_example.jar ws_docker_example.jar
ENTRYPOINT exec java -jar ws_docker_example.jar