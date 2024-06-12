Algoritmo sin_titulo
	Definir tanquesIngresados, tanquesUtilizados, kmPorTanque, litrosUtilizados Como Entero
	kmTotal <- 0
	Escribir 'Ingrese la cantidad de tanques de nafta'
	Leer tanquesIngresados
	tanquesRestantes <- tanquesIngresados
	Mientras tanquesRestantes>0 Hacer
		Escribir 'Ingrese los litros utilizados con el tanque ', tanquesRestantes
		Leer litrosUtilizados
		Escribir 'Ingrese los km recorridos con el tanque ', tanquesRestantes
		Leer kmPorLitro
		kmPorTanque <- kmPorLitro*litrosUtilizados
		kmTotal <- kmTotal+kmPorTanque
		tanquesRestantes <- tanquesRestantes-1
	FinMientras
	Escribir 'Los km recorridos en total son: ', kmTotal, 'km'
FinAlgoritmo
