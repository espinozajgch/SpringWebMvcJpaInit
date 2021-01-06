CREATE TABLE public.persona (
	id_persona serial NOT NULL,
	apellido varchar(50) NULL,
	fecha_nacimiento varchar(15) NULL,
	nombre varchar(50) NULL,
	rut varchar(20) NULL
);

INSERT INTO persona(nombre, apellido, fecha_nacimiento, rut) VALUES
 ('Jose','Espinoza','27/06/1989','267383421'),
 ('Cesar','Polo','31/12/1987','264128692'),
 ('fulano','mengano','01/02/03','123456789');