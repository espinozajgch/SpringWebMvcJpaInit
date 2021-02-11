## Proyecto Spring Boot con un Modelo MVC y JPA

El servicio utiliza una base de datos `PostgreSQL`,
para lo cual se implemento `docker-compose` para crear una base de datos local,
es necesario tener instalado `docker`, 

Before we can start PostgreSQL with Docker Compose, we need to turn our Spring Boot application into a Docker image.
The first step is to package the application as a JAR file:
> mvn clean package -DskipTests

Here, we first clean-up our previous builds before packaging the application. In addition, we skip the tests because they fail without PostgreSQL.

Let's run our Spring Boot application and PostgreSQL with Docker Compose:
> `docker-compose up`

En la base de datos se creara una tabla llamada persona con unos registros 
de prueba, dichos registros estan en el archivo `init.sql`

El servicio se desplegara en el puerto 8080, se puede consultar de la sigiente forma:

> `localhost:8080/reverse_rut?rut=26738342-1`

EL campo `RUT` debera contener los datos sin puntos, solo el guien para separar 
el digito verificador.

Ejemplo: `26738342-1`

####Si el rut buscado no es valido como por ejemplo "12345678-9", el serivcio retornara
####un mensaje de error, debido a que se hace una validacion del mismo y no buscara la informacion en la tabla.

Se utilizo la version 3.6.3 de Apache Maven, 1.8 de Java