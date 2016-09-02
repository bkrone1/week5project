package com.ravensOffense;

import java.sql.*;
import java.util.ArrayList;

public class DAO {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/?user=root&autoReconnect=true&useSSL=false";
	static final String USER = "root";
	static final String PASSWORD = "sesame";
	
	static Connection CONN = null;
	static Statement STMT = null;
	static PreparedStatement PREP_STMT = null;
	static ResultSet RES_SET = null;
	
	public static final ArrayList<Player> myPlayers = new ArrayList<>();
	
	public static void connToDB(){
		
		try {
			
			Class.forName(JDBC_DRIVER);
			
			System.out.println("Trying to connect to the DB...");
			CONN= DriverManager.getConnection(DB_URL, USER, PASSWORD);
			System.out.println("Connected to DB.");
		}catch (SQLException | ClassNotFoundException e){
			System.out.println("Connection Failed");
			e.printStackTrace();
		}
	}
	
	public static void readFromDB(){
		
		connToDB();
		
		try {
			STMT = CONN.createStatement();
			RES_SET = STMT.executeQuery("SELECT * FROM ravens_players.skill_players;");
		
		while (RES_SET.next()) {
			
			Player playerInDB = new Player();
			
			playerInDB.setPlayerID(RES_SET.getString("player_id"));
			playerInDB.setLastName(RES_SET.getString("last_name"));
			playerInDB.setFirstName(RES_SET.getString("first_name"));
			playerInDB.setNumber(RES_SET.getString("number"));
			playerInDB.setPosition(RES_SET.getString("position"));
			
			myPlayers.add(playerInDB);
		}
		
		for (Player player : myPlayers){
			System.out.println(player);
		}
		
		} catch (SQLException e){
			e.printStackTrace();
		}
	
	}
	
	public static void writeToDB(Player player){
		
				
		try{
			
			connToDB();
			
			PREP_STMT = CONN.prepareStatement(insertIntoTable);
			
			PREP_STMT.setString(1, player.getLastName());
			PREP_STMT.setString(2, player.getFirstName());
			PREP_STMT.setString(3, player.getNumber());
			PREP_STMT.setString(4, player.getPosition());
		
			PREP_STMT.executeUpdate();
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	private static String insertIntoTable = "INSERT INTO `ravens_players`.`skill_players`"
			+ "(last_name, first_name, number, position)"
			+ " VALUES "
			+ "(?, ?, ?, ?)";
}
