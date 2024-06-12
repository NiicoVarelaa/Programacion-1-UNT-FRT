Algoritmo sin_titulo
	Definir num, suma, promedio, minimo, maximo Como Real
	Definir contador Como Entero
	suma <- 0
	minimo <- 0
	maximo <- 0
	contador <- 0
	Mientras contador<10 Hacer
		Escribir 'Ingrese un Número:'
		Leer num
		suma <- suma+num
		Si contador=0 Entonces
			minimo <- num
			maximo <- num
		SiNo
			Si num<minimo Entonces
				minimo <- num
			FinSi
			Si num>maximo Entonces
				maximo <- num
			FinSi
		FinSi
		contador <- contador+1
	FinMientras
	promedio <- suma/10
	Escribir 'La suma de los números es:', suma
	Escribir 'El promedio de los números es:', promedio
	Escribir 'El número menor es:', minimo
	Escribir 'El número mayor es:', maximo
FinAlgoritmo
