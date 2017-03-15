package com.snail.easybuy.entity;

import java.util.Date;

public class Comment {
	
	private  int  EC_ID ;    //编号
	private  String  EC_REPLY ;    //回复
	private  String  EC_CONTENT ;    //内容
	private  Date  EC_CREATE_TIME ;    //创建时间
	private  Date  EC_REPLY_TIME ;    //回复时间
	private  String  EC_NICK_NAME ;   //留言用户昵称
	
	public int getEC_ID() {
		return EC_ID;
	}
	public void setEC_ID(int eC_ID) {
		EC_ID = eC_ID;
	}
	public String getEC_REPLY() {
		return EC_REPLY;
	}
	public void setEC_REPLY(String eC_REPLY) {
		EC_REPLY = eC_REPLY;
	}
	public String getEC_CONTENT() {
		return EC_CONTENT;
	}
	public void setEC_CONTENT(String eC_CONTENT) {
		EC_CONTENT = eC_CONTENT;
	}
	public Date getEC_CREATE_TIME() {
		return EC_CREATE_TIME;
	}
	public void setEC_CREATE_TIME(Date eC_CREATE_TIME) {
		EC_CREATE_TIME = eC_CREATE_TIME;
	}
	public Date getEC_REPLY_TIME() {
		return EC_REPLY_TIME;
	}
	public void setEC_REPLY_TIME(Date eC_REPLY_TIME) {
		EC_REPLY_TIME = eC_REPLY_TIME;
	}
	public String getEC_NICK_NAME() {
		return EC_NICK_NAME;
	}
	public void setEC_NICK_NAME(String eC_NICK_NAME) {
		EC_NICK_NAME = eC_NICK_NAME;
	}
	@Override
	public String toString() {
		return "Comment [EC_ID=" + EC_ID + ", EC_REPLY=" + EC_REPLY
				+ ", EC_CONTENT=" + EC_CONTENT + ", EC_CREATE_TIME="
				+ EC_CREATE_TIME + ", EC_REPLY_TIME=" + EC_REPLY_TIME
				+ ", EC_NICK_NAME=" + EC_NICK_NAME + "]";
	}  	
}
