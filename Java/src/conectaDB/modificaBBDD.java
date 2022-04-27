package conectaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class modificaBBDD {

	public static void main(String[] args) {
		try {			
			//-----Crear conexion sql -------
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Test","root","Miguelito2020*");
			//-----Objeto Statement ---------
			Statement miStat = conn.createStatement();
			String insertSql = "INSERT INTO Productos (CodigoArticulo, Seccion, NombreArticulo, Precio) VALUES ('AR0003', 'Ropa', 'Pantalon Hombre', 16000)";
			String updateSql = "UPDATE Productos SET Precio=Precio*2 WHERE CodigoArticulo='AR0003'";
			
			miStat.executeUpdate(updateSql);
			System.out.println("Datos Modificados correctamente ... ");
			
			} catch (Exception e){
				System.out.println("No Conecta");
				e.printStackTrace();
		}


	}

}
