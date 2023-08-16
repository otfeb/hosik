package model.car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import oracle.db.DBConnect;

public class carDao {

	DBConnect db=new DBConnect();
	
	public void insertCar(carDto dto) {
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		String sql="insert into car values(seq_1.nextval,?,?,?,?,sysdate,?)";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getCname());
			pstmt.setString(3, dto.getCid());
			pstmt.setString(4, dto.getDevice());
			pstmt.setString(5, dto.getCimage());
			
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	public ArrayList<carDto> selectCar(){
		ArrayList<carDto> list=new ArrayList<carDto>();
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from car order by sdate";
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				carDto dto=new carDto();
				
				dto.setNum(rs.getString("num"));
				dto.setName(rs.getString("name"));
				dto.setCname(rs.getString("cname"));
				dto.setCid(rs.getString("cid"));
				dto.setDevice(rs.getString("device"));
				dto.setCdate(rs.getTimestamp("cdate"));
				dto.setCimage(rs.getString("cimage"));
				
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			db.dbClose(rs, pstmt, conn);
		}	
		return list;
	}
}
