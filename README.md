RESTfulWS
Repositorio de la evidencia de la materia Computacion Avanzada en Java

Instalación
Para la correcta realizacion de este repositorio se instalaron los siguientes componentes:

JDK 8 en la version mas reciente (en este caso la 172 para windows x64)

GitHub para escritorio o Git en linea de comando

Un IDE con el cual podamos manejar el repositorio de GitHub (en este caso eclipse)

Clonar el repositorio

git clone https://github.com/josu11/RESTfulWS.git
Importar a Eclipse

Dar clic en File -> Import -> Existing Projects into Workspace.
Seleccionar la carpeta raíz donde se clonó el proyecto.
Correr Maven install.
Exportar .war

Dar clic derecho al proyecto en Eclipse.
Seleccionar Export -> WAR file.
Desplegar el archivo .war

Descargar o exportar el archivo WAR.
Ir a la página principal de Tomcat http://localhost:8080.
Dar clic en Manager App.
Escribir el usuario y contraseña correctos.
Dar clic en Choose File y seleccionar el archivo WAR.
Dar clic en Desplegar.
Uso
Recurso api/v1/

GET: Lista los recursos disponibles.
OPTIONS: Documentación del recurso.
Recurso api/v1/file

GET: Descarga un archivo mediante el parámetro path.
api/v1/file/?path=
POST: Sube un archivo mediante los parámetros name, dir y file.
api/v1/file/ name="imagen.jpg" dir="/Files" file@/Users/User/Downloads/imagen.jpg --form
DELETE: Elimina un archivo mediante el parámetro path.
api/v1/file/?path=
OPTIONS: Documentación del recurso.
Recurso api/v1/directory

GET: Lista los archivos de un directorio mediante el parámetro dir.
api/v1/directory/?dir=
OPTIONS: Documentación del recurso.
Recurso api/v1/notify

GET: Lista las notificaciones enviadas.
POST: Envía una notificación mediante los parámetros subject, message, toAddress y ccAddress.
api/v1/notify subject="hello" message="Hello from Spring" toAddress="a@email.com" ccAddress="b@email.com"
OPTIONS: Documentación del recurso.
Recurso api/v1/user

GET: Lista los usuarios.
POST: Crea un usuario mediante los parámetros username, password y fullName.
api/v1/user username="user" password="pass" fullName="John Doe"
OPTIONS: Documentación del recurso.
Recurso api/v1/user/{username}

GET: Muestra la información del usuario.
PUT: Actualiza la información del usuario mediante los parámetros username, password y fullName.
api/v1/user/user username="user" password="pass" fullName="John Doe"
DELETE: Elimina al usuario.
OPTIONS: Documentación del recurso.
Créditos
Josue Rodriguez (josu11) -- Creador de este repositorio y alumno de la materia Computacion avanzada en Java

Jose Manuel (jm66) -- Creador del repositorio original de donde se obtuvo la informacion

Licencia
Este repositorio fue creado bajo la licencia de APACHE 2.0. Para mayor informacion acerca de la licencia ir al archivo LICENSE.
