package prj.member;

import javax.sql.*;
import java.sql.*;
import javax.naming.*;
import java.util.*;

public class MemberDAOImpl implements MemberDAO{
	private static final String driver="oracle.jdbc.driver.OracleDriver";  //상수에 DB연결 관련 데이터를 세팅한다.
	private static final String url ="jdbc:oracle:thin:@localhost:1521:XE";
	private static final String user = "scott";
	private static final String pwd="tiger";

	
	private Connection con;  //DB연결에 사용되는 객체를  선언한다.
    private	Statement stmt;
//  private	PreparedStatement pstmt;
    private ResultSet rs;	

	public ArrayList<MemberVo> listMember(){   
		 ArrayList<MemberVo> list =  new ArrayList<MemberVo>();
		  try{			
				connDB();  //DB와 연결하는 메서드 
				String query="select * from Member order by id";
				System.out.println(query);
				ResultSet rs = stmt.executeQuery(query);  //select문 실행

				 while( rs.next() ){				       
					 String id=rs.getString("id");						 
					 String name = rs.getString("name");
					 int height = rs.getInt("height");
					 int weight = rs.getInt("weight");
					 int age = rs.getInt("age");

					MemberVo data = new MemberVo();     
					data.setId(id);
					data.setName( name);                
					data.setHeight(height);
					data.setWeight(weight);
					data.setAge(age);
					
					list.add( data);					
				} //end while 
				rs.close();
				stmt.close();
				con.close();
		  }catch(Exception e){
			e.printStackTrace();	
		  }

		  return list;
	} //end list()
	
	public void insertMember(MemberVo mem){
		String id=mem.getId();
		String name=mem.getName();
		int height= mem.getHeight();
		int weight = mem.getWeight();
		int age = mem.getAge();
		try{
		
		connDB();
		
		String query = "insert into member(id,name,height,weight,age) ";
		System.out.println(query);
		      query=query +"values("+"'"+id+"','"+name+"',"+height+","+weight+","+age +")" ;
		stmt.executeUpdate(query);  //insert문 실행 
		
		/*pstmt로 작성한경우
		try{
		conn DB()
		String query = "insert into member(id,name,height,weight,age) ";
		       query=query +"values(?,?,?,?,?)" ;
		 pstmt = con.prepareStatement(query);
		 pstmt.setString(1,id);
		 pstmt.setString(2,name);
		 pstmt.setString(3,height);
		 pstmt.setString(4,weight);
		 pstmt.setString(5,age);
		 pstmt.executeUpdate();
		 } catch(Exception e){
			e.printStackTrace();
		}
		 */
		 
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	//회원 정보 수정하는 메소드
	public void updateMember(MemberVo mem){
		String id=mem.getId();
		String name=mem.getName();
		int height= mem.getHeight();
		int weight = mem.getWeight();
		int age = mem.getAge();
		String query = "Update member set name = " +"'"+name+"'," +"height = "+height+","+"weight = "+weight+","+"age = "+age; 
		query += "where id = "+"'"+id+"'";  //id, name은 문자열이라 '' 필요.
		
		/* pstmt로 작성하면
	    String query = "Update member set id = ?, name = ?, height = ?," + "weight=?, age=?"
	                   +"where id=?";
	     pstmt = con.prepareStatement(query);
		 pstmt.setString(1,id);
		 pstmt.setString(2,name);
		 pstmt.setString(3,height);
		 pstmt.setString(4,weight);
		 pstmt.setString(5,age);
		 pstmt.setString(6,id);
		 pstmt.executeUpdate();	//실행할때는 query 던지면 안됨    				
	    			
	    */
		try {
			connDB();
			System.out.println(query);
			stmt.executeUpdate(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
				
		
	}
	
	//회원 정보 삭제하는 메소드
	public void deleteMember(MemberVo mem){
		
		String sql = "delete from Member where id = ?";
		PreparedStatement pstmt;
		String id=mem.getId();
		try {
			connDB();
			pstmt = con.prepareStatement(sql);
			System.out.println("sql문 입력");
			pstmt.setString(1, id);
			System.out.println("업데이트 실행");
			pstmt.execute();   //실행할때는 query 던지면 안됨
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void connDB(){
		try{
			Class.forName(driver);  
			System.out.println("Oracle 드라이버 로딩 성공");
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection 생성 성공");
//			pstmt = con.prepareStatement(driver); 
			stmt = con.createStatement();
			System.out.println("Statement 생성 성공");		
		}catch(Exception e){
		e.printStackTrace();	
		}
	}
}//end class MemberDAO

