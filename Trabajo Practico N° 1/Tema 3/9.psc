Algoritmo sin_titulo
	Definir individuos, numAnios Como Entero
	Escribir 'Ingrese el numero de individuos'
	Leer individuos
	Escribir 'Ingrese el numero de años prara determinar el numero de individuos que quedaran '
	Leer numAnios
	contadorAnios <- 1
	Mientras contadorAnios<=numAnios Hacer
		Escribir 'Al cabo de ', contadorAnios, ' años la poblacion quedara en: ', individuos
		individuos <- individuos/5
		contadorAnios <- contadorAnios+1
	FinMientras
FinAlgoritmo
