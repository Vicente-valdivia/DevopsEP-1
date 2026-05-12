# Usamos una imagen de Java optimizada y ligera (Alpine)
FROM eclipse-temurin:17-jdk-alpine

# Definimos el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiamos el archivo .jar que se genera al compilar
# Nota: Esto asume que el jar se crea en la carpeta target/
COPY target/*.jar app.jar

# Exponemos el puerto que usa tu API de Spring Boot
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]