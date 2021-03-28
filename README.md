## Proyecto Spring Boot con JPA

El servicio se conecta una base de datos `MySQL`, la cual fue otorgada para la prueba

El servicio se desplegara en el puerto 8080, se puede consultar de la sigiente forma:

> `localhost:8080/demo/{problema}/{segmento}`

para los problmeas 1 y 2 el parametro segmento (A,B,C) es un obligatario, no asi para los problemas del 3 al 6

> 1 : CANTIDAD DE EMPLEADOS CON
> > A : SALARIO MENOR A 3.500 USD
> 
> > B : SALARIO MAYOR O IGUAL A 3.500 Y MENOR QUE 8.000
>
> > C : SALARIO MAYOR O IGUAL A 8.000

> 2 : CANTIDAD DE EMPLEADOS POR DEPARTAMENTO CON
> > A : SALARIO MENOR A 3.500 USD
>
> > B : SALARIO MAYOR O IGUAL A 3.500 Y MENOR QUE 8.000
>
> > C : SALARIO MAYOR O IGUAL A 8.000

> 3 : INFORMACION DEL EMPLEADO CON MAYOR SUELDO POR DEPARTAMENTO

> 4 : INFORMACION DE LOS GERENTES QUE HAYAN SIDO CONTRATADOS HACE MAS DE 15 AÑOS

> 5 : SALARIO PROMEDIO DE TODOS LOS DEPARTAMENTOS CON MAS DE 10 EMPLEADOS

> 6 : CANTIDAD DE EMPLEADOS, SALARIO PROMEDIO, MAXIMO Y MINIMO, PROMEDIO DE AÑOS DE ANTIGUEDAD POR PAIS

Se utilizo la version 3.6.3 de Apache Maven, 1.8 de Java

docker build -t nyg-frontend .
Run container
docker run -d -p 8090:80 --rm nyg-frontend