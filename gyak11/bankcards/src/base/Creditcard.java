package base;

import java.time.LocalDate;

public class Creditcard extends Card {
	private int credit;

	public Creditcard(String owner, LocalDate validity, int balance, Bank cardbank, int credit) {
		super(owner, validity, balance, cardbank);
		this.credit = credit;
	}

	public Creditcard(String owner, LocalDate validity, int balance, Bank cardbank) {
		super(owner, validity, balance, cardbank);
		this.credit = 100000;
	}

	//My Methods of Creditcard class
	@Override
	public boolean withdraw(int amount){					
		if(!this.getValidity().isBefore(LocalDate.now())){			//withdraw checks validity first and than the balance
				if(this.getBalance()  + this.credit >= amount){
					int diff = getBalance() - amount;
					
					if(diff >= 0){
						this.setBalance(this.getBalance() - amount);	//if balance is good then withdraw amount
					}else{
						this.setCredit(credit - amount - getBalance());
						this.setBalance(0);
					}
					return true;
					
				}else{
					return false;
				}
		}
		
		return false;
	} 
	

	@Override
	public String toString() {
		return "Creditcard [credit=" + credit + ", toString()=" + super.toString() + "]";
	}

	//Getters&Setters
	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	
	
}
