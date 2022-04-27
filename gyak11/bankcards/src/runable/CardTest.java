package runable;

import java.io.*;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Scanner;

import base.*;
import base.Card.Bank;

public class CardTest {

	public static void main(String[] args) {
		
		int size = readInt();
		Card[] cardArray = new Card[size];
		
		for(int i = 0 ; i < cardArray.length ; i++){
			cardArray[i] = createCard();
			System.out.println(cardArray[i]);
		}
		
		for (int i = 0; i < cardArray.length; i++) {
			cardArray[i].withdraw(2000);
			System.out.println(cardArray[i].getBalance()+ " " + cardArray[i].getOwner() + ". ");
		}
		
	}//eofmain
	
	public static Card createCard(){
		InputStreamReader in = new  InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		Card newcard = null;
		
		
		try{
			System.out.print("Név: ");
			String name = br.readLine();
			System.out.println("Egyenleg: ");
			int balance = Integer.parseInt( br.readLine());
			System.out.println("Bank: ");
			String bankstr = br.readLine().toUpperCase();
			Bank bank = Bank.valueOf(bankstr);
			System.out.println("Lejárat: ");
			
			String d = br.readLine();
			String[] datestr = d.split("-"); 
			int year = Integer.parseInt(datestr[0]);
			int month = Integer.parseInt(datestr[1]);
			int day = Integer.parseInt(datestr[2]);
			
			System.out.println("Hitelkeret: ");
			int credit = Integer.parseInt(br.readLine());
			
			if(credit == 0){
				newcard = new Card(name, LocalDate.of(year, month, day), balance, bank );
			}else if(credit > 0){
				newcard = new Creditcard(name, LocalDate.of(year, month, day), balance, bank, credit );
			}
			
			newcard = new Card(name, LocalDate.of(year, month, day), balance, bank );
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}catch(NumberFormatException e){
			System.out.println(e.getMessage());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		return newcard;
		
	}
	
	
	//beolvassa a tömb méretét
	public static int readInt(){
		Scanner input = new Scanner(System.in);
		int num;
		
		boolean ok;
		
		do {
			ok = true;
			
			System.out.print("Adj meg egy számot a tömb méretéhez: ");
			while(!input.hasNextInt()){
				ok = false;
				System.out.println("Nem jó!");
				input.nextLine();
			}
			
			num = input.nextInt();
			input.nextLine();		//buffer törlés
			
		}while(!ok || num > 10 || num < 1);
		
		return num;
	}

}
