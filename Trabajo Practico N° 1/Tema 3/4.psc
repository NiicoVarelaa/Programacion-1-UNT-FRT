Algoritmo sin_titulo
	Definir bandera, num, a Como Entero
	bandera <- 1
	Escribir 'Ingrese un Número Positivo'
	Leer num
	Mientras num>0 Y bandera==1 Hacer
		a <- num MOD 10
		num <- trunc(num/10)
		Si a==3 Entonces
			bandera <- 3
		FinSi
	FinMientras
	Si bandera==3 Entonces
		Escribir 'Encontrado'
	SiNo
		Escribir 'No Encontrado'
	FinSi
FinAlgoritmo
