Algoritmo sin_titulo
	Mostrar  'Hola Ingrese las notas de los 3 examenes para determinar si esta Aprobado o Desaprobado'
	Escribir 'Ingrese la nota del Primer examen'
	Leer Nota1
	Escribir 'Ingrese la nota del Segundo examen'
	Leer Nota2
	Escribir 'Ingrese la nota del Tercer examen'
	Leer Nota3
	NotaSumadas <- (Nota1+Nota2+Nota3)/3
	Si NotaSumadas>=7 Entonces
		Escribir 'Alumno Aprobado'
	SiNo
		Escribir 'Alumno Desaprobado'
	FinSi
FinAlgoritmo
