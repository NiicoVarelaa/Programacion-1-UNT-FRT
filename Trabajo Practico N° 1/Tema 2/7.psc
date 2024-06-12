Algoritmo EdadSexo
	CM <- 0
	CH <- 0
	C <- 0
	Mientras C<3 Hacer
		Escribir 'Ingrese Edad y Sexo'
		Leer Edad, Sexo
		Si Sexo=='M' Entonces
			Si Edad>=20 Y Edad<=30 Entonces
				CM <- CM+1
			FinSi
		SiNo
			Si Sexo=='H' Entonces
				Si Edad<=37 Y Edad>0 Entonces
					CH <- CH+1
				FinSi
			SiNo
				Escribir 'Error'
			FinSi
		FinSi
		C <- C+1
	FinMientras
	Escribir 'La cantidad de hombres de edad entre 20 y 30 es:', CH
	Escribir 'La cantidad de mujeres de edad menor o igual a 37 es:', CM
FinAlgoritmo
