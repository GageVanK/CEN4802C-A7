FROM openjdk:8
EXPOSE 8080
ADD target/cen4802c-a7.jar cen4802c-a7.jar
ENTRYPOINT ["java", "-jar","cen4802c-a7.jar"