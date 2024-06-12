Algoritmo sin_titulo
	Definir contador, aux, n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, valorEncontrar Como Entero
	contador <- 0
	Escribir 'Ingrese 10 Números'
	Leer n1, n2, n3, n4, n5, n6, n7, n8, n9, n10
	bandera <- 1
	Mientras contador<10 Hacer
		Si n1>n2 Entonces
			aux <- n1
			n1 <- n2
			n2 <- aux
		FinSi
		Si n2>n3 Entonces
			aux <- n2
			n2 <- n3
			n3 <- aux
		FinSi
		Si n3>n4 Entonces
			aux <- n3
			n3 <- n4
			n4 <- aux
		FinSi
		Si n4>n5 Entonces
			aux <- n4
			n4 <- n5
			n5 <- aux
		FinSi
		Si n5>n6 Entonces
			aux <- n5
			n5 <- n6
			n6 <- aux
		FinSi
		Si n6>n7 Entonces
			aux <- n6
			n6 <- n7
			n7 <- aux
		FinSi
		Si n7>n8 Entonces
			aux <- n7
			n7 <- n8
			n8 <- aux
		FinSi
		Si n8>n9 Entonces
			aux <- n8
			n8 <- n9
			n9 <- aux
		FinSi
		Si n9>n10 Entonces
			aux <- n9
			n9 <- n10
			n10 <- aux
		FinSi
		Si n1>n2 Entonces
			aux <- n1
			n1 <- n2
			n2 <- aux
		FinSi
		contador <- contador+1
	FinMientras
	Escribir n1, ' ', n2, ' ', n3, ' ', n4, ' ', n5, ' ', n6, ' ', n7, ' ', n8, ' ', n9, ' ', n10
	Escribir 'Ingrese el valor que desea encontrar'
	Leer valorEncontrar
	Si n1==valorEncontrar Entonces
		Escribir 'Valor Encontrado'
	SiNo
		Si n2==valorEncontrar Entonces
			Escribir 'Valor Encontrado'
		SiNo
			Si n3==valorEncontrar Entonces
				Escribir 'Valor Encontrado'
			SiNo
				Si n4==valorEncontrar Entonces
					Escribir 'Valor Encontrado'
				SiNo
					Si n5==valorEncontrar Entonces
						Escribir 'Valor Encontrado'
					SiNo
						Si n6==valorEncontrar Entonces
							Escribir 'Valor Encontrado'
						SiNo
							Si n7==valorEncontrar Entonces
								Escribir 'Valor Encontrado'
							SiNo
								Si n8==valorEncontrar Entonces
									Escribir 'Valor Encontrado'
								SiNo
									Si n9==valorEncontrar Entonces
										Escribir 'Valor Encontrado'
									SiNo
										Si n10==valorEncontrar Entonces
											Escribir 'Valor Encontrado'
										SiNo
											Escribir 'Valor No Encontrado'
										FinSi
									FinSi
								FinSi
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
