FROM ubuntu:latest
LABEL authors="saurabh"

ENTRYPOINT ["java", "-jar", "/springboot-image-new.jar"]