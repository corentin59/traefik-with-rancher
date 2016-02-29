FROM java:8

MAINTAINER Corentin <corentin@azelart.fr>

COPY target/traefik-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 80

ENTRYPOINT ["java", "-jar", "app.jar", "--server.port=80"]