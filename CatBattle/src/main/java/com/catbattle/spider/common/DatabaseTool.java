package com.catbattle.spider.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

public class DatabaseTool {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/catbattle";
    static final String USER = "root";
    static final String PASS = "123";
 
    public static void saveCat(List<List<String>> allList) throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;
        for (List<String> list : allList) {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            String sql = "INSERT INTO cat_info (`cat_id`, `cat_name`, `category`, `default_level`, `max_level`, `HP`, `KB`, `attack`, `attack_rate`, `speed`, `attack_animation`, `attack_distance`, `cooldown`, `attack_type`, `cost`, `CD`, `skill`, `get_condition`,`img`) "
            		+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            stmt = conn.prepareStatement(sql);
			for (int i = 0; i < list.size(); i++) {
				stmt.setString(i + 1, list.get(i));
			}
            stmt.executeUpdate();
        }
        if(stmt!=null) stmt.close();
        if(conn!=null) conn.close();
    }
    
    public static void saveEnemy(List<String> list) throws Exception {
    	Connection conn = null;
    	PreparedStatement stmt = null;
    	Class.forName("com.mysql.jdbc.Driver");
    	conn = DriverManager.getConnection(DB_URL,USER,PASS);
    	String sql = "insert into enemy_info (`enemy_id`, `enemy_name`, `category`, `power_up_rate`, `HP`, `KB`, `attack`, `speed`, `attack_animation`, `attack_distance`, `cooldown`, `attack_type`, `reward`, `skill`, `img`) "
    			+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		stmt = conn.prepareStatement(sql);
		for (int i = 0; i < list.size(); i++) {
			stmt.setString(i + 1, list.get(i));
		}
		stmt.executeUpdate();
    	if(stmt!=null) stmt.close();
    	if(conn!=null) conn.close();
    }
}
