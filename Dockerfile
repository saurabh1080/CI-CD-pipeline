# Step 1: Base image (Java install karne ki zaroorat nahi padegi)
FROM openjdk:17-jdk-slim

# Step 2: JAR file ko apne target folder se container ke andar copy karo
# Ye line sabse zaroori hai!
COPY target/springboot-image-new.jar springboot-image-new.jar

# Step 3: Command to run the application
ENTRYPOINT ["java", "-jar", "/springboot-image-new.jar"]