package openbootcamp;

public class Empleados {
	
	private String nombre;
	private int edad;
	private String departamento;
	private int antiguedad;
	
	public Empleados(String nombre, int edad, String departamento, int antiguedad) {
		this.nombre = nombre;
		this.edad = edad;
		this.departamento = departamento;
		this.antiguedad = antiguedad;
	}

	public Empleados() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return "Empleados [nombre=" + nombre + ", edad=" + edad + ", departamento=" + departamento + ", antiguedad="
				+ antiguedad + "]";
	}
	
	
	

}
