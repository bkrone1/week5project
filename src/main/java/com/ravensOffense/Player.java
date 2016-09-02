package com.ravensOffense;

public class Player {
	
	private String playerID = null;
	private String lastName = null;
	private String firstName = null;
	private String number = null;
	private String position = null;
	
	
	public Player(String playerID, String lastName, String firstName, String number, String postition) {
		super();
		this.playerID = playerID;
		this.lastName = lastName;
		this.firstName = firstName;
		this.number = number;
		this.position = position;
	}


	public Player() {
		super();
	}


	public String getPlayerID() {
		return playerID;
	}


	public void setPlayerID(String playerID) {
		this.playerID = playerID;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String postition) {
		this.position = postition;
	}


	@Override
	public String toString() {
		return "Player [playerID=" + playerID + ", lastName=" + lastName + ", firstName=" + firstName + ", number="
				+ number + ", position=" + position + "]";
	}
	
	
	
	
	

}
