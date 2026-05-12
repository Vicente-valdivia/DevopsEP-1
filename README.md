# DevopsEP-1
# 1.Justificación GITFLOW
### Hemos adoptado el modelo Gitflow debido a su capacidad para separar estrictamente el código en fase de desarrollo del código estable destinado a producción. Dado que el proyecto se basa en una arquitectura de microservicios, cada cambio debe ser gestionado de manera modular. Gitflow facilita la supervisión de estas modificaciones sin comprometer la integridad de la rama principal de forma prematura.
## La cual fue estructurada por:
### MAIN :Es la rama de producción. Mantiene el servidor activo y solo recibe actualizaciones cuando el código ha sido validado por completo
### DEVELOP: Es nuestra rama de integración. Aquí es donde se consolidan y testean todas las funcionalidades, parches o actualizaciones antes de ser fusionadas con la rama Main

## 2. Guía de Estándares y Buenas Prácticas 

### Convención de Commits
Para la normalización de todos los cambios en el proyecto, cada commit deberá incluir obligatoriamente el **prefijo de la función** que se está realizando (ej: `feat`, `fix`), seguido de **dos puntos** y una **descripción breve** de lo que trata el commit.

### Naming de Ramas
* **Funcionalidades:** `feature/nombre-de-la-mejora`
* **Correcciones:** `hotfix/descripcion-del-error`

### Flujo de Merge
### Nuestro flujo de merge esta separa por `main`  `develop`, el main es directamente para el usuario por lo tanto no se modifica hasta que este completamente desarrollado y testeado en la rama de "Develop"


# Prueba 2. 

Microservicio Registrar Cliente - Pipeline CI/CD
Este repositorio contiene la automatización del ciclo de vida del microservicio de registro de clientes mediante un pipeline implementado en GitHub Actions.

Trazabilidad y Calidad del Proyecto
Para garantizar la estabilidad y seguridad en cada etapa del desarrollo, nuestro pipeline (main.yml) automatiza el siguiente flujo:
Escaneo de Seguridad: Ejecución de Snyk para analizar vulnerabilidades en las dependencias. Si se detectan fallos críticos, el pipeline se bloquea automáticamente.
Pruebas Automatizadas: Ejecución de pruebas unitarias con JaCoCo para asegurar que los cambios no rompan la lógica del negocio.
Calidad de Código: Análisis estático con SonarCloud para mantener un estándar alto de "Clean Code".
Construcción (Build): Compilación y empaquetado del microservicio en un artefacto .jar.
Orquestación y Despliegue: Uso de un Dockerfile optimizado (imagen Alpine) y docker-compose.yml para construir el contenedor y desplegar automáticamente la aplicación en un entorno simulado.

Declaración de uso de Inteligencia Artificial (IA)
Para el desarrollo de este encargo, se utilizó la herramienta de IA Gemini como apoyo técnico para:
Guiar la estructura correcta y optimización del archivo Dockerfile.
Corregir errores de sintaxis al implementar los comandos de despliegue en el archivo de GitHub Actions.
Apoyo en la resolución de conflictos de control de versiones con Git.
