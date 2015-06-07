package Inventaris;
import java.sql.*;

import javax.swing.*;

public class SqliteConnection {
	Connection connect=null;
	public static Connection dbConnector(){
		try{
			Class.forName("org.sqlite.JDBC");
			Connection connect=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\inung\\Documents\\NetBeansProjects\\LoginPengguna.sqlite");
			return connect;
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
}
}