package openbootcamp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) throws IOException {

		File carpeta1 = new File("C:\\BootCamp");
		File carpeta2 = new File("C:\\BootCamp\\carpetaEmpleados");
		File texto1 = new File("C:\\BootCamp\\carpetaEmpleados\\listaEmpleados.txt");
		File texto2 = new File("C:\\BootCamp\\carpetaEmpleados\\archivoCopia.txt");

		archivos(carpeta1, carpeta2, texto1, texto2);
		escribirFichero(texto1);

		try {
			FileInputStream original = new FileInputStream(texto1);
			FileOutputStream copia = new FileOutputStream(texto2);
			ficheroCopia(original, copia);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Creo un método para poder crear carpetas y a su vez, archivos de texto dentro
	// de ellas con ayuda de la clase File
	private static void archivos(File carpeta1, File carpeta2, File texto1, File texto2) {
		if (carpeta1.mkdir()) {
			System.out.println("Carpeta1 creada correctamente");
		} else {
			System.out.println("No se ha podido crear la carpeta seleccionada");
		}
		if (carpeta2.mkdir()) {
			System.out.println("Carpeta2 creada correctamente");
		} else {
			System.out.println("No se ha podido crear la carpeta seleccionada");
		}

		try {
			if (texto1.createNewFile()) {
				System.out.println("Archivo de texto1 creado correctamente");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			if (texto2.createNewFile()) {
				System.out.println("Archivo de texto2 creado correctamente");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Creo un método para que me sirva copiar archivos de entrada a uno de salida
	// de forma clara y sencilla.
	public static void ficheroCopia(FileInputStream in, FileOutputStream out) throws IOException {

		int n = 0;
		int c = 0;

		while ((c = in.read()) != -1) {
			out.write(c);
			n++;
		}
		in.close();
		out.close();
		System.out.println("Archivos copiados correctamente.");

	}

	public static void escribirFichero(File texto1) {

		try {
			FileWriter fw = new FileWriter(texto1, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			ArrayList<Empleados> listadoAlumnos = new ArrayList<>();
			listadoAlumnos.add(new Empleados("Paco", 32, "Informático", 5));
			listadoAlumnos.add(new Empleados("Susana", 30, "Calidad", 8));
			listadoAlumnos.add(new Empleados("Benito", 28, "Mantenimiento", 12));
			listadoAlumnos.add(new Empleados("María", 29, "Comercial", 7));
			listadoAlumnos.add(new Empleados("Fernando", 45, "Gerente", 21));
			for (int i = 0; i < listadoAlumnos.size(); i++) {
				pw.println(listadoAlumnos.get(i));
			}
			System.out.println("Empleados escritos correctamente");
			pw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
