Algoritmo sin_titulo
	Definir ANIOACTUAL, mesActual, diaActual, ANIOINGRESADO, mesIngresado, diaIngresado Como Entero
	Escribir 'Ingrese la Fehca Actual'
	Escribir 'Ingrese el A�o Actual'
	Leer ANIOACTUAL
	Escribir 'Ingrese el Mes Actual'
	Leer mesActual
	Escribir 'Ingrese el D�a Actual'
	Leer diaActual
	Escribir 'Ingresa la Fecha a Consultar'
	Escribir 'Ingrese el A�o a Consultar'
	Leer ANIOINGRESADO
	Escribir 'Ingrese el Mes a Consultar'
	Leer mesIngresado
	Escribir 'Ingrese el D�a a Consultar'
	Leer diaIngresado
	Si ANIOINGRESADO<ANIOACTUAL Entonces
		Escribir 'Fecha Correcta'
	SiNo
		Si ANIOINGRESADO==ANIOACTUAL Entonces
			Si mesIngresado<mesActual Entonces
				Escribir 'Fecha Correcta'
			SiNo
				Si mesIngresado==mesActual Entonces
					Si diaIngresado<diaActual Entonces
						Escribir 'Fecha Correcta'
					SiNo
						Escribir 'Fecha Incorrecta'
					FinSi
				SiNo
					Escribir 'Fecha Incorrecta'
				FinSi
			FinSi
		SiNo
			Escribir 'Fecha Incorrecta'
		FinSi
	FinSi
FinAlgoritmo
