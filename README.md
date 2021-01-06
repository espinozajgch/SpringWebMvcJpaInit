El servicio utiliza una conexion a base de datos PostgreSQL,
los parametros de dicha conexion se encuentran en el archivo de configuraicon
`application.properties` ubicado en la carpeta `resources`.

En la base de datos debe exister una tabla llamada Persona, esta sera
en la cual se almacenaran los datos a mostrar por el servicio, los campos
seran generados autimaticamente al ejecutar el proyecto.

El campo `RUT` debera contener los datos sin puntos ni guion, 
Ejemplo: "267383421"

`Si el rut almacenado no es valido como por ejemplo `123456789`, el serivcio retornara
un mensaje de error, debido a que se hace una validacion del mismo y no buscara la informacion
en la tabla.`

Se utilizo la version 3.6.3 de Apache Maven, 1.8 de Java