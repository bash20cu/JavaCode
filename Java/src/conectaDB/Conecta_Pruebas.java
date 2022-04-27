package conectaDB;

import java.sql.*;

public class Conecta_Pruebas {

	public static void main(String[] args) {
		try {
			
			//-----Crear conexion sql -------
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Test","root","Miguelito2020*");
			//-----Objeto Statement ---------
			Statement miStat = conn.createStatement();
			//-----Ejecutar SQL ---------
			ResultSet miResult = miStat.executeQuery("SELECT * FROM Productos"); 
			//-----Recorrer el ResultSet
			while (miResult.next()) {
				System.out.println("| ------------------------------------------------------------------|");
				System.out.println(miResult.getString(1) + "|---| " 
						+ miResult.getString("Seccion") + "|---| " + miResult.getString("NombreArticulo") + "|---| "
						+ miResult.getString("Precio"));
			}
		} catch (Exception e){
			System.out.println("No Conecta");
			e.printStackTrace();
		}

	}

}
