Algoritmo sin_titulo
	Escribir 'Hola ingrese su temperatura en grados cent�grados, para determinar el deporte adecuado'
	Leer GradosCentigrados
	GradosFahrenheit <- (GradosCentigrados*9/5)+32
	Si GradosFahrenheit>85 Entonces
		Escribir 'Usted puede hacer Nataci�n'
	SiNo
		Si GradosFahrenheit>70 Y GradosFahrenheit<=85 Entonces
			Escribir 'Usted puede hacer Tenis'
		SiNo
			Si GradosFahrenheit>35 Y GradosFahrenheit<=70 Entonces
				Escribir 'Usted puede hacer Golf'
			SiNo
				Si GradosFahrenheit>32 Y GradosFahrenheit<=35 Entonces
					Escribir 'Usted puede hacer Esqu�'
				SiNo
					Escribir 'Usted puede hacer otro deporte'
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
