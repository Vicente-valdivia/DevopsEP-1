resumen del proyecto
el objetivo de este proyecto es implementar un flujo de trabajo de integración y despliegue continuo (ci/cd). eliminamos los despliegues manuales para garantizar que cada mejora en el código sea validada, probada y desplegada en nuestro servidor de amazon aws ec2 automáticamente.

objetivos alcanzados
pipeline automatizado: flujo de trabajo en github actions para coordinar el ciclo de vida del software.

control de calidad: integración con sonarcloud y jacoco para verificar la calidad y cobertura de pruebas.

despliegue continuo: automatización en aws ec2 mediante contenedores docker.

seguridad y cumplimiento: implementación de branch protection rules para asegurar que solo código probado llegue a producción.

tecnologías utilizadas
lenguaje: java con spring boot.

ci/cd: github actions.

infraestructura: aws ec2, docker y docker compose.

calidad: sonarcloud, jacoco.

declaración de uso de inteligencia artificial
para el desarrollo de este proyecto, se utilizó asistencia de inteligencia artificial (gemini) como herramienta de soporte técnico y pair programming. el uso de la ia se enfocó en:

resolución de problemas técnicos: depuración de errores en la configuración de github actions (especialmente optimización de memoria).

optimización de archivos yaml: asistencia en la estructura y sintaxis del archivo de configuración del pipeline.

arquitectura de despliegue: guía para la configuración de scripts en el servidor ec2 y orquestación con docker compose.

refactorización: apoyo en la resolución de conflictos de ramas y comandos de consola.
todas las decisiones arquitectónicas y configuraciones finales fueron validadas y supervisadas por el estudiante para asegurar el cumplimiento de los objetivos.

funcionamiento
cada vez que se realiza un push a la rama master:

test: github ejecuta las pruebas unitarias y genera reportes con jacoco.

calidad: sonarcloud analiza el código en busca de bugs y vulnerabilidades.

deploy: si todo es exitoso, el servidor se sincroniza vía ssh, recompila la aplicación y reinicia el contenedor con docker compose.
