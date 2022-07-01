package mulesoft;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main {
public static void main(String [] args) {
	createtable.createNewTable();
	insert("  VIKRAM ","  Kamala Hasan  ","Vijay Sethupathi    ",2022,"Lokesh Kanagaraj");
	insert("  K R K  ","Vijay Sethupathi","Samantha            ",2022,"Vignesh Shivan");
	insert("Hridayam "," Pranav Mohanlal","Kalyani Priyadarshan",2022,"Vineeth Sreenivasan");
	insert("M.S.Dhoni","Sushant Singh   ","Kiara Advani        ",2016,"Neeraj Pandey");
	insert("    83   ","Ranveer Singh   ","Deepika Padukone    ",2021,"Kabir Khan");
	select.selectAll();
	select.selectactormovie();
}
private static void insert(String moviename,String leadactor,String actress,Integer yearofrelease,String director) {
	Connection con=Dbconnection.connect();
	PreparedStatement ps=null;
	try {
		String sql="INSERT INTO movies(moviename,leadactor,actress,yearofrelease,director) VALUES(?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, moviename);
		ps.setString(2, leadactor);
		ps.setString(3, actress);
		ps.setInt(4,yearofrelease);
		ps.setString(5, director);
		ps.execute();
		System.out.println("Data has been inserted");
	}catch(SQLException e) {
		System.out.println(e.toString());
	}
}
}
