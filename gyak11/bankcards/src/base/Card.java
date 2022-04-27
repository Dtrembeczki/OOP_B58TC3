package base;

import java.time.LocalDate;

public class Card {
	
	//enums 
	public enum Bank{
		OTP, ERSTE, KH, CIB
	}
	
	private String owner;
	private LocalDate validity;
	private int balance;
	private Bank cardbank;
	
	//Constructor
	public Card(String owner, LocalDate validity, int balance, Bank cardbank) {
		super();
		this.owner = owner;
		this.validity = validity;
		this.balance = balance;
		this.cardbank = cardbank;
	}
	
	//My methods
	public boolean withdraw(int amount){
		if(!this.validity.isBefore(LocalDate.now())){
				if(this.balance >= amount){
					this.balance -= amount;
					return true;
				}else{
					return false;
				}
		}
		
		return false;
	} 
	
	
	@Override
	public String toString() {
		return "Card [owner=" + owner + ", validity=" + validity + ", balance=" + balance + ", cardbank=" + cardbank
				+ "]";
	}

	//Getters&Setters
	public String getOwner() {
		return owner;
	}

	public LocalDate getValidity() {
		return validity;
	}

	public int getBalance() {
		return balance;
	}
	
	public int setBalance(int balance){
		return this.balance = balance;
	}

	public Bank getCardbank() {
		return cardbank;
	}
	
	
	
	
}
