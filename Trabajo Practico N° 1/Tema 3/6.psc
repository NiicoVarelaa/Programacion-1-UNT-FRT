Algoritmo sin_titulo
	Definir ventasIngresadas, cantidadVendedores Como Entero
	ventasPorSemana <- 200.000
	Escribir 'Ingrese la cantidad de vendedores en el dpto de ventas'
	Leer cantidadVendedores
	Mientras cantidadVendedores>0 Hacer
		Escribir 'Ingrese las ventas realizadas en la semana'
		Leer ventasIngresadas
		sueldoTotal <- ventasPorSemana+(ventasIngresadas*9/100)
		Escribir 'Las ganancias a cobrar esta semana del vendedor ', cantidadVendedores, ' son: $', sueldoTotal
		cantidadVendedores <- cantidadVendedores-1
	FinMientras
FinAlgoritmo
