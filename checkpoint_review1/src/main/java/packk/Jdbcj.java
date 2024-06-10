package packk;


import java.sql.*;

public class Jdbcj{
	public boolean check(String uname,String email,String pass1,String confirm_pass1,String dob,String pho,String addre ) {
		   try {
			   	  String sql="insert into customer values(?,?,?,?,?,?,?)";
			      Class.forName("oracle.jdbc.driver.OracleDriver");
			      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345678");
			      PreparedStatement pst=con.prepareStatement(sql);
			      pst.setString(1,uname);
			      pst.setString(2, email);
			      pst.setString(3, pass1);
			      pst.setString(4, confirm_pass1);
			      pst.setString(5, dob);
			      pst.setString(6, pho);
			      pst.setString(7, addre);
			      pst.executeUpdate();
			      con.close();
			       return true;
			     
			    }
		   
			    catch(Exception e) {
			      e.printStackTrace();
			    }
		return false;
	}
	public boolean check(String uname,String pass) {
		   try {
			      String sql="select * from customer where USERNAME=? and PASSWORD=?";
			      Class.forName("oracle.jdbc.driver.OracleDriver");
			      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345678");
			      PreparedStatement pst=con.prepareStatement(sql);
			      pst.setString(1, uname);
			      pst.setString(2, pass);
			      ResultSet rs=pst.executeQuery();
                  if(rs.next()) {
                	  con.close();
                	  return true;
                  }
			      
			    }
			    catch(Exception e){
			      e.printStackTrace();
			    }
		return false;
	}
	public boolean check_m(String uname,String pass) {
		   try {
			      String sql="select * from manager where USERNAME=? and PASSWORD=?";
			      Class.forName("oracle.jdbc.driver.OracleDriver");
			      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345678");
			      PreparedStatement pst=con.prepareStatement(sql);
			      pst.setString(1,uname);
			      pst.setString(2, pass);
			      ResultSet rs=pst.executeQuery();
			      System.out.println(con);
			      if(rs.next()) {
			    	  con.close();
                 return true;
			      }
			    }
			    catch(Exception e){
			      e.printStackTrace();
			    }
		return false;
	
}
	public boolean check_t(String uname,String pass) {
		   try {
			      String sql="select * technician where USERNAME=? and PASSWORD=?";
			      Class.forName("oracle.jdbc.driver.OracleDriver");
			      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345678");
			      PreparedStatement pst=con.prepareStatement(sql);
			      pst.setString(1,uname);
			      pst.setString(2, pass);
			      ResultSet rs=pst.executeQuery();
			      System.out.println(con);
			      if(rs.next()) {
			    	  con.close();
              return true;
			      }
			    }
			    catch(Exception e){
			      e.printStackTrace();
			    }
		return false;
	
}
	public boolean check_addequip(String uname,long idequip,long cost,long sprice,long quant,long mid) {
		   try {
			   	  String sql="insert into addequip values(?,?,?,?,?,?)";
			      Class.forName("oracle.jdbc.driver.OracleDriver");
			      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345678");
			      PreparedStatement pst=con.prepareStatement(sql);
			      pst.setString(1,uname);
			      pst.setLong(2, idequip);
			      pst.setLong(3, cost);
			      pst.setLong(4, sprice);
			      pst.setLong(5, quant);
			      pst.setLong(6, mid);
			      pst.executeUpdate();
			      con.close();
			       return true;
			     
			    }
		   
			    catch(Exception e) {
			      e.printStackTrace();
			    }
		return false;
	}
public ResultSet show_equip() {
	       ResultSet rs=null;
		   try {
			   	  String sql="select * from addequip";
			      Class.forName("oracle.jdbc.driver.OracleDriver");
			      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345678");
			      PreparedStatement pst=con.prepareStatement(sql);
			      rs=pst.executeQuery();
			       return rs;
			     
			    }
		   
			    catch(Exception e) {
			      e.printStackTrace();
			    }
		return rs;
	}
public boolean check_addtest(String uname,long idtest,long tcost,long mid) {
	   try {
		   	  String sql="insert into addtest values(?,?,?,?)";
		      Class.forName("oracle.jdbc.driver.OracleDriver");
		      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345678");
		      PreparedStatement pst=con.prepareStatement(sql);
		      pst.setString(1,uname);
		      pst.setLong(2, idtest);
		      pst.setLong(3, tcost);
		      pst.setLong(4, mid);
		      pst.executeUpdate();
		      con.close();
		       return true;
		     
		    }
	   
		    catch(Exception e) {
		      e.printStackTrace();
		    }
	return false;
}
}



	

