Algoritmo sin_titulo
	Definir numFamilias, hijosPorFamilia, numMaxHijosPorFamilia, numMinHijosPorFamilia, edad, ci, ciMaxHijos, ciMinHijos Como Entero
	Definir promHijosPorFamilia, ciPromHijos, ciPromHijosMenores6, ciPromHijosMayores6 Como Real
	contadorFamilias <- 0
	contadorHijosFamilia <- 0
	totalHijos <- 0
	ciTotal <- 0
	ciTotalMenores6 <- 0
	ciTotalMayores6 <- 0
	totalHijosMenores6 <- 0
	totalHijosMayores6 <- 0
	Escribir 'Ingrese El Numero de Familias'
	Leer numFamilias
	Repetir
		contadorHijosFamilia <- 0
		Escribir 'Ingrese la cantidad de hijos por familia'
		Leer hijosPorFamilia
		totalHijos <- totalHijos+hijosPorFamilia
		Si contadorFamilias==0 Entonces
			numMinHijosPorFamilia <- hijosPorFamilia
			numMaxHijosPorFamilia <- hijosPorFamilia
		FinSi
		Si hijosPorFamilia>numMaxHijosPorFamilia Entonces
			numMaxHijosPorFamilia <- hijosPorFamilia
		FinSi
		Si hijosPorFamilia<numMinHijosPorFamilia Entonces
			numMinHijosPorFamilia <- hijosPorFamilia
		FinSi
		Repetir
			Escribir 'Ingrese la Edad'
			Leer edad
			Escribir 'Ingrese el CI'
			Leer ci
			Si edad<6 Entonces
				ciTotalMenores6 <- ciTotalMenores6+ci
				totalHijosMenores6 <- totalHijosMenores6+1
			SiNo
				ciTotalMayores6 <- ciTotalMayores6+ci
				totalHijosMayores6 <- totalHijosMayores6+1
			FinSi
			ciTotal <- ciTotal+ci
			Si contadorHijosFamilia==0 Entonces
				ciMaxHijos <- ci
				ciMinHijos <- ci
			FinSi
			Si ci>ciMaxHijos Entonces
				ciMaxHijos <- ci
			FinSi
			Si ci<ciMinHijos Entonces
				ciMinHijos <- ci
			FinSi
			contadorHijosFamilia <- contadorHijosFamilia+1
		Hasta Que contadorHijosFamilia==hijosPorFamilia
		contadorFamilias <- contadorFamilias+1
	Hasta Que contadorFamilias==numFamilias
	promHijosPorFamilia <- totalHijos/numFamilias
	ciPromHijos <- ciTotal/totalHijos
	ciPromHijosMenores6 <- ciTotalMenores6/totalHijosMenores6
	ciPromHijosMayores6 <- ciTotalMayores6/totalHijosMayores6
	Escribir 'El número máximo de hijos por familia es: ', numMaxHijosPorFamilia
	Escribir 'El número mínimo de hijos por familia es: ', numMinHijosPorFamilia
	Escribir 'El promedio de hijos por familia es: ', promHijosPorFamilia
	Escribir 'El CI Maximo de los hijos es: ', ciMaxHijos
	Escribir 'El CI Minimo de los hijos es: ', ciMinHijos
	Escribir 'El promedio del CI de todos los hijos de todas las familias es: ', ciPromHijos
	Escribir 'El promedio del CI de los hijos mayores de 6 años es: ', ciPromHijosMayores6
	Escribir 'El promedio del CI de los hijos menores de 6 años es: ', ciPromHijosMenores6
FinAlgoritmo
