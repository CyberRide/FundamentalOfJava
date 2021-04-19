/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author heri
 */
import java.util.Scanner;

public class AtmSystem {
	//Member variables
	// Create user, password, account amount
	private String [] users = {"heritech", "Ayo"};	
	private String [] password = {"1234" , "2468"};
	private int [] money = {10000 , 20000};
	private String [] AccNo = {"08169404796" , "08055256492"};
	private String yes = "yes";
	private int x = 0;
	
	// Member function
	// Method to validate user name and password are correct
	boolean login(String loginusre,String loginpass){
		for(int i = 0;i<users.length;i++){
			if(loginusre.equals(users[i])&&loginpass.equals(password[i])){
				x = (i);
				return true;
			}
		}
		return false;
	}
	
	// withdraw
	void withdraw(){
		Scanner b = new Scanner(System.in);
		System.out.print("Please enter the withdrawal amount:");
		int MoneyToWithdraw = b.nextInt();
		
		if(MoneyToWithdraw <= money[x]) {
			money[x] = money[x] - MoneyToWithdraw;
			System.out.println("Withdrawal amount:"+MoneyToWithdraw);
			System.out.println("balance:"+money[x]);
		}else {
			System.out.println("Insufficient balance!!!");
		}
	}
	void deposit() {
		Scanner sc4 = new Scanner(System.in);
		System.out.print("Please enter the deposit amount:");
		int MoneyToDeposit = sc4.nextInt();
		
		money[x] = money[x] + MoneyToDeposit;
		System.out.println("The deposit amount is:"+MoneyToDeposit+"! Deposit successful!");
		System.out.println("The current balance is:"+money[x]);
	}
	// Transfer
	void MoneyToTransfer(){
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Please enter the Account number:");
		String AccNo1 = sc1.next();
		System.out.println("Please enter the transfer amount:");
		int c = sc1.nextInt();
		
		for(int i = 0;i<=AccNo.length;i++){
			if(AccNo1.equals(AccNo[i])){
				if(i!= x){
					if(c <= money[x]){
						System.out.println("Please check the account name:"+users[i]);
						System.out.println("Are you sure to transfer money: yes / no?");
						String yesNo = sc1.next();
						if(yesNo.equals(yes)) {
							money[i] = money[i]+c;
							System.out.println("Transfer succeeded!");
							money[x]= money[x]-c;
							System.out.println("Your current balance is:"+money[x]);
							break;
						}else {
							System.out.println("!!! Transfer failed !!!");
							System.out.println("Your current balance is:"+money[x]);
							break;
						}
					}else {
						System.out.println("Transfer failed, your balance is insufficient !!");
						break;
					}
				}else{
					System.out.println("Number entered incorrectly! Cannot transfer money to yourself !!!");
					break;
				}
			}else if(i == 2){
				System.out.println("The AccNo you entered is wrong!");
				break;
			}
		}
	}
	// Display balance
	void Balance() {
		System.out.println("The current balance is:"+money[x]);
	}
	// Main method
	public static void main(String[]args){
		AtmSystem AS = new AtmSystem();
		Scanner sc = new Scanner(System.in);
		// Enter the interface
		System.out.println("*********************** Welcome to Aptech Bank of Nigeria ******************** *** ");
		int i;
		int number;
		//Enter your user name
		for(i = 1;i <= 3;i++) {
			System.out.print("please enter user name:");
			String user= sc.next();
			//enter password
			System.out.print("Please enter the password:");
			String pass= sc.next();
			
			while(AS.login(user, pass)){
				// Determine whether the user name and password are correct. If it is correct, handle the business. If it is wrong, re-enter it. If the input is wrong three times, lock it.
				if(AS.login(user, pass)){
					System.out.println("Please select the business to be handled:"
                                                + "\n1. Withdrawal \n"
                                                + "2. Deposit \n"
                                                + "3. Transfer \n"
                                                + "4. Check balance \n"
                                                + "5. Exit");
					number = sc.nextInt();
					// Select business through switch and case
					switch(number){
					// Need to call the "Withdraw" method
					case 1:
						AS.withdraw();
						break;
					// Need to call the "deposit" method
					case 2:
						AS.deposit();
						break;
					// Need to call the "transfer" method
					case 3:
						AS.MoneyToTransfer();
						break;
					//Check balances
					case 4:
						AS.Balance();
						break;
					// Exit, output statement
					case 5:
						System.out.print("Welcome to use it again! Bye!");
						return;
					}
				}
			}
			if(i<3){
				System.out.println("wrong user name or password"+i+"Time, please re-enter");
			}else{
				System.out.println("User name or password is wrong 3 times !!! Your card has been locked !!! Please call the bank !!!");
				break;
			}
		}
	}
}