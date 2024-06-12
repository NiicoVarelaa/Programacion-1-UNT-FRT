Algoritmo sin_titulo
	Definir contador, aux, n1, n2, n3, n4, n5, n6, n7, n8, n9, n10 Como Entero
	contador <- 0
	Escribir 'Ingrese 10 Números'
	Leer n1, n2, n3, n4, n5, n6, n7, n8, n9, n10
	Mientras contador<10 Hacer
		Si n1<n2 Entonces
			aux <- n1
			n1 <- n2
			n2 <- aux
		FinSi
		Si n2<n3 Entonces
			aux <- n2
			n2 <- n3
			n3 <- aux
		FinSi
		Si n3<n4 Entonces
			aux <- n3
			n3 <- n4
			n4 <- aux
		FinSi
		Si n4<n5 Entonces
			aux <- n4
			n4 <- n5
			n5 <- aux
		FinSi
		Si n5<n6 Entonces
			aux <- n5
			n5 <- n6
			n6 <- aux
		FinSi
		Si n6<n7 Entonces
			aux <- n6
			n6 <- n7
			n7 <- aux
		FinSi
		Si n7<n8 Entonces
			aux <- n7
			n7 <- n8
			n8 <- aux
		FinSi
		Si n8<n9 Entonces
			aux <- n8
			n8 <- n9
			n9 <- aux
		FinSi
		Si n9<n10 Entonces
			aux <- n9
			n9 <- n10
			n10 <- aux
		FinSi
		Si n1<n2 Entonces
			aux <- n1
			n1 <- n2
			n2 <- aux
		FinSi
		contador <- contador+1
	FinMientras
	Escribir n1, ' ', n2, ' ', n3, ' ', n4, ' ', n5, ' ', n6, ' ', n7, ' ', n8, ' ', n9, ' ', n10
FinAlgoritmo
