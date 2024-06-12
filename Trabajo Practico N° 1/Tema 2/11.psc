Algoritmo CalcularCostoAgua
	Definir metrosCubicos, costoTotal Como Real
	Escribir 'Ingrese la cantidad de metros cúbicos consumidos:'
	Leer metrosCubicos
	Si metrosCubicos<=100 Entonces
		costoTotal <- metrosCubicos*0.15
	SiNo
		Si metrosCubicos>100 Y metrosCubicos<=500 Entonces
			costoTotal <- 15+(metrosCubicos-100)*0.20
		SiNo
			Si metrosCubicos>500 Y metrosCubicos<=1000 Entonces
				costoTotal <- 95+(metrosCubicos-500)*0.35
			SiNo
				costoTotal <- 270+(metrosCubicos-1000)*0.80
			FinSi
		FinSi
	FinSi
	Escribir 'El costo total del agua consumida es: $', costoTotal
FinAlgoritmo
