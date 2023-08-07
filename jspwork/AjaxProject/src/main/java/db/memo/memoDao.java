package db.memo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import oracle_db.DBConnect;

public class memoDao {
	
	DBConnect db=new DBConnect();
	
	//추가
	public void insertMemo(memoDto dto) {
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		String sql="insert into memo values (seq1.nextval,?,?,?,,sysdate)";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getWriter());
			pstmt.setString(2, dto.getStory());
			pstmt.setString(3, dto.getAvata());
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	//조회
	public List<memoDto> getAllMemos(){
		List<memoDto> list=new Vector<memoDto>();
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		return list;
	}
}
