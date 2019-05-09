# RESTfulWS
Repositorio de la evidencia de la materia Computacion Avanzada en Java

## Instalación

Para la correcta realizacion de este repositorio se instalaron los siguientes componentes:

+ JDK 8 en la version mas reciente (en este caso la 172 para windows x64)

+ GitHub para escritorio o Git en linea de comando

+ Un IDE con el cual podamos manejar el repositorio de GitHub (en este caso eclipse)

**Clonar el repositorio**  
```
git clone https://github.com/josu11/RESTfulWS.git
```

**Importar a Eclipse**  
1. Dar clic en `File -> Import -> Existing Projects into Workspace`.
2. Seleccionar la carpeta raíz donde se clonó el proyecto.
3. Correr `Maven install`.

**Exportar .war**  
1. Dar clic derecho al proyecto en Eclipse.
2. Seleccionar `Export -> WAR file`.

**Desplegar el archivo .war**  
1. Descargar o exportar el archivo WAR.
2. Ir a la página principal de Tomcat `http://localhost:8080`.
3. Dar clic en `Manager App`.
4. Escribir el usuario y contraseña correctos.
5. Dar clic en `Choose File` y seleccionar el archivo WAR.
6. Dar clic en `Desplegar`.

## Uso

**Recurso api/v1/**  
1. **GET**: Lista los recursos disponibles.
2. **OPTIONS**: Documentación del recurso.

**Recurso api/v1/file**  
1. **GET**: Descarga un archivo mediante el parámetro path. 
```
api/v1/file/?path=
```
2. **POST**: Sube un archivo mediante los parámetros name, dir y file.
```
api/v1/file/ name="imagen.jpg" dir="/Files" file@/Users/User/Downloads/imagen.jpg --form
```
3. **DELETE**: Elimina un archivo mediante el parámetro path.
```
api/v1/file/?path=
```
4. **OPTIONS**: Documentación del recurso.

**Recurso api/v1/directory**  
1. **GET**: Lista los archivos de un directorio mediante el parámetro dir. 
```
api/v1/directory/?dir=
```
2. **OPTIONS**: Documentación del recurso.

**Recurso api/v1/notify**  
1. **GET**: Lista las notificaciones enviadas.
2. **POST**: Envía una notificación mediante los parámetros subject, message, toAddress y ccAddress.
```
api/v1/notify subject="hello" message="Hello from Spring" toAddress="a@email.com" ccAddress="b@email.com"
```
3. **OPTIONS**: Documentación del recurso.

**Recurso api/v1/user**  
1. **GET**: Lista los usuarios.
2. **POST**: Crea un usuario mediante los parámetros username, password y fullName.
```
api/v1/user username="user" password="pass" fullName="John Doe"
```
3. **OPTIONS**: Documentación del recurso.

**Recurso api/v1/user/{username}**  
1. **GET**: Muestra la información del usuario.
2. **PUT**: Actualiza la información del usuario mediante los parámetros username, password y fullName.
```
api/v1/user/user username="user" password="pass" fullName="John Doe"
```
3. **DELETE**: Elimina al usuario.
4. **OPTIONS**: Documentación del recurso.

## Créditos

Josue Rodriguez (josu11) -- Creador de este repositorio y alumno de la materia Computacion avanzada en Java

Jose Manuel (jm66) -- Creador del repositorio original de donde se obtuvo la informacion

## Licencia

Este repositorio fue creado bajo la licencia de APACHE 2.0. Para mayor informacion acerca de la licencia ir al archivo LICENSE.
