## Proyecto Spring Boot con un Modelo MVC y JPA

El servicio utiliza una base de datos `PostgreSQL`,
para lo cual se implemento `docker-compose` para crear una base de datos local,
se debe ejecutar el comando `docker-compose up` para la creacion de la base de datos.
es necesario tener instalado `docker` 

En la base de datos se creara una tabla llamada persona con unos registros 
de prueba, dichos registros estan en el archivo `init.sql`

Luego se debe ejecutar el servicio ejecutando `mvn clean install` para la compilacion
del proyecto y luego desplegar el .jar creado en la carpeta `target`
con el comando `java -jar`

Ejemplo: `java -jar demo-0.0.1.jar`

El servicio se desplegara en el puerto 8080, se puede consultar de la sigiente forma:

`localhost:8080/reverse_rut?rut=26738342-1`

EL campo `RUT` debera contener los datos sin puntos, solo el guien para separar 
el digito verificador.

Ejemplo: `26738342-1`

`Si el rut buscado no es valido como por ejemplo "12345678-9", el serivcio retornara
un mensaje de error, debido a que se hace una validacion del mismo y no buscara la informacion
en la tabla.`

Se utilizo la version 3.6.3 de Apache Maven, 1.8 de Java