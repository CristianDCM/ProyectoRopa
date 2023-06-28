Algoritmo Tienda
	Dimension identificaciones[10]
    Dimension nombres[10]
    Dimension  generos[10]
    Dimension calificacion1[10]
    Dimension calificacion2[10]
	Dimension calificacion3[10]
	Definir promedio como real
    Definir nClientes como entero
    Escribir "Digite el número de clientes encuestados: "
    Leer nClientes
    Para i desde 1 hasta nClientes hacer
        Escribir "Digite la identificación del cliente " , i , ": "
        Leer idCliente
        Escribir "Digite el nombre del cliente: "
        Leer nombreCliente
        Escribir "Digite el genero del cliente: "
        Leer generoCliente
        Escribir "Digite la calificación 1 del cliente " + nombreCliente + ": "
        Leer calificacionUno
        Escribir "Digite la calificación 2 del cliente " + nombreCliente + ": "
        Leer calificacionDos
        Escribir "Digite la calificación 3 del cliente " + nombreCliente + ": "
        Leer calificacionTres
        identificaciones[i] <- idCliente
        nombres[i] <- nombreCliente
        generos[i] <- generoCliente
        calificacion1[i] <- calificacionUno
        calificacion2[i] <- calificacionDos
        calificacion3[i] <- calificacionTres
    Fin Para
    Para i desde 1 hasta nClientes hacer
        promedio <- promedio + ((calificacion1[i] + calificacion2[i] + calificacion3[i]) / 3) / nClientes
    Fin Para
    Escribir "El promedio de calificación de los clientes es: " , promedio
Fin Algoritmo