FROM openjdk:11
ADD target/inventory-system.jar inventory-system.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","inventory-system.jar"]