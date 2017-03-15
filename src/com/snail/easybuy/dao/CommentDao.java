package com.snail.easybuy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.snail.easybuy.entity.Comment;
import com.snail.easybuy.util.DbUtils;

public class CommentDao{
	
	
	
	public List<Comment> findAll(){
		
		Connection connection = DbUtils.getConnection();
		if(connection!=null){
			PreparedStatement statement=null ;
			ResultSet resultSet =null;
			
			try {
				String sql="select * from EASYBUY_COMMENT";
				statement=connection.prepareStatement(sql);
				resultSet=statement.executeQuery();
				
				List<Comment>comments=new ArrayList<>();
				Comment temp=null;
				while(resultSet.next()){
					temp=new Comment();
					temp.setEC_ID(resultSet.getInt("EC_ID"));
					temp.setEC_REPLY(resultSet.getString("EC_REPLY"));
					temp.setEC_CONTENT(resultSet.getString("EC_CONTENT"));
					temp.setEC_CREATE_TIME(resultSet.getTimestamp("EC_CREATE_TIME"));
					temp.setEC_REPLY_TIME(resultSet.getTimestamp("EC_REPLY_TIME"));
					temp.setEC_NICK_NAME(resultSet.getString("EC_NICK_NAME"));
					
					comments.add(temp);
					temp=null;
				}
				return comments.isEmpty()?null:comments;
			} catch (Exception e) {
				
				e.printStackTrace();
			}finally{
				DbUtils.closeResource(connection, statement, resultSet);
				
			}
			
		}
		
		
		return null;
		
	}
	
	public void saveComment(Comment comment){
		Connection connection = DbUtils.getConnection();
		if(connection!=null){
			PreparedStatement statement=null ;
			ResultSet resultSet =null;
			
			try {
				String sql="insert into  EASYBUY_COMMENT(EC_ID,EC_REPLY,EC_CONTENT,EC_CREATE_TIME,EC_REPLY_TIME,EC_NICK_NAME) values(?,?,?,?,?,?)";
				statement=connection.prepareStatement(sql);
				statement.setInt(1,comment.getEC_ID() );
				statement.setString(2, comment.getEC_REPLY());
				statement.setString(3, comment.getEC_CONTENT());
				statement.setTimestamp(4, (Timestamp) comment.getEC_CREATE_TIME());
				statement.setTimestamp(5, (Timestamp) comment.getEC_REPLY_TIME());
				statement.setString(6, comment.getEC_NICK_NAME());
				
				statement.execute();
			} catch (Exception e) {
				
				e.printStackTrace();
			}finally{
				DbUtils.closeResource(connection, statement, resultSet);
				
			}
			
		}
		
		
	}

	public void deleteCommentById(int ec_ID) {
		Connection connection = DbUtils.getConnection();
		if(connection!=null){
			PreparedStatement statement=null ;
			
			
			try {
				String sql="delete from EASYBUY_COMMENT where EC_ID=?";
				statement=connection.prepareStatement(sql);
				//绑定数据
				statement.setInt(1, ec_ID);
				
				statement.executeUpdate();
			} catch (Exception e) {
			
				e.printStackTrace();
			}finally{
				DbUtils.closeResource(connection, statement, null);
				
			}
			
		}
		
	}

		 
}