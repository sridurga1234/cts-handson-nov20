package com.org;

public class JpaImpl {
	private DBConfig dbconfig;
	public void store()
	{
		
		System.out.println("stored implementation via JPA");
		System.out.print("dburl : "+dbconfig.getDburl());
		System.out.println("dbname :"+dbconfig.getDbname());
	}
	public void setdbconfig(DBConfig dbconfig) {
		this.dbconfig=dbconfig;
	}


}
