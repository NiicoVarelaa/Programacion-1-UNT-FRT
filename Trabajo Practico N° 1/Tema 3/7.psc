Algoritmo sin_titulo
	Definir totalDePacientes, pacientes, numPaciente, edadPacientes, edadIngresada, indicePaciente, edadMediaPacientes, edadMediaIngresados, edadMediaOperados Como Real
	Escribir 'Ingrese la cantidad de pacientes a analizar'
	Leer totalDePacientes
	pacientes <- 0
	edadPacienteOperar <- 0
	edadPacienteIngresado <- 0
	Repetir
		Escribir 'Ingrese el Número del Paciente'
		Leer numPaciente
		Escribir 'Ingrese la Edad del Paciente'
		Leer edadIngresada
		edadPacientes <- edadPacientes+edadIngresada
		Escribir 'Ingrese el Indice del Paciente'
		Leer indicePaciente
		Si totalDePacientes>0 Entonces
			Si indicePaciente>0.6 Entonces
				Si indicePaciente>0.9 Entonces
					edadPacienteOperar <- edadPacienteOperar+edadIngresada
					Escribir 'Paciente para Operación'
				SiNo
					edadPacienteIngresado <- edadPacienteIngresado+edadIngresada
					Escribir 'Paciente Ingresado al Hospital'
				FinSi
			FinSi
		FinSi
		pacientes <- pacientes+1
	Hasta Que pacientes==totalDePacientes
	edadMediaPacientes <- edadPacientes/totalDePacientes
	edadMediaIngresados <- edadPacienteIngresado/totalDePacientes
	edadMediaOperados <- edadPacienteOperar/totalDePacientes
	Escribir 'La Edad Media de los Pacientes es:', edadMediaPacientes
	Escribir 'La Edad Media de los Pacientes Ingresados al Hospital es:', edadMediaIngresados
	Escribir 'La Edad Media de los Pacientes Operados es:', edadMediaOperados
FinAlgoritmo
