package com.snail.easybuy.entity;

import java.util.Date;

public class Comment {
	private  int  EC_ID ;    
	private  String  EC_REPLY ;    
	private  String  EC_CONTENT ;    
	private  Date  EC_CREATE_TIME ;    
	private  Date  EC_REPLY_TIME ;    
	private  String  EC_NICK_NAME ;
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
}
