# DevopsEP-1
# 1.Justificación GITFLOW
### Utilizamos gitflow ya que este modelo porque separa estrictamente el código en desarrollo del código estable que va a producción. Como estamos trabajando con un microservicio cada cambio debe estar presente de manera modular por lo cuál se ajusta al modelo de ramas de gitflow para cambiar y supervisar cambios sin tener que comprometer el código de manera inicial. 
## La cúal fue estructurada por:
### MAIN : Nos permite mantener el servidor activo hasta el momento de realizar una actualización. 
### DEVELOP: Nos permite testear parches o actualizaciónes antes de mandar al main. 

## 2. Guía de Estándares y Buenas Prácticas 

### Convención de Commits
Para la **normalización** de todos los cambios en el proyecto, cada commit deberá incluir obligatoriamente el **prefijo de la función** que se está realizando (ej: `feat`, `fix`), seguido de **dos puntos** y una **descripción breve** de lo que trata el commit.

### Naming de Ramas
* **Funcionalidades:** `feature/nombre-de-la-mejora`
* **Correcciones:** `hotfix/descripcion-del-error`

### Flujo de Merge
### Nuestro flujo de merge esta separa por `main`  `develop`, el main es directamente para el usuario por lo tanto no se modifica hasta que este completamente desarrollado y testeado en la rama de "Develop"
