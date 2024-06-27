public class Empleado {
    private String nombre;
    private int sueldo;
    
    public Empleado(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        verificarImpuesto(sueldo);
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
        verificarImpuesto(sueldo);
    }

    @Override
    public String toString() {
        String resultado = "Empleado: Nombre: " + nombre + ", Sueldo: " + sueldo;
        if (sueldo > 3000) {
            resultado += " - Debe Pagar Impuestos";
        }
        return resultado;
    }


    public void verificarImpuesto(double sueldo) {
        if (sueldo > 3000) {
            System.out.println("Debe Pagar Impuestos");
        }
    }

}
