Algoritmo sin_titulo
	Escribir 'Ingrese un número entero positivo:'
	Leer num
	numero1 <- 0
	numero2 <- num-numero1
	Escribir 'Las parejas de números cuya suma es ', num, ' son:'
	Mientras numero1<=num/2 Hacer
		Escribir '(', numero1, ' y ', numero2, ')'
		numero1 <- numero1+1
		numero2 <- numero2-1
	FinMientras
FinAlgoritmo
