package atm;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		AtmOperationImpl impl= new AtmOperationImpl();
		int atmnumber=12345;
		int atmpin=123;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("WELCOME TO ATM MACHINE");
		System.out.print("ENTER THE ATM NUMBER: ");
		int atmnum2=scan.nextInt();
		System.out.print("ENTER THE ATM PIN: ");
		int atmpin2=scan.nextInt();
		if((atmnumber==atmnum2) &&(atmpin==atmpin2))
		{
			
			while(true) {
				
				System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit amount\n4.View MiniStatement\n5.exit");
				System.out.println("enter choice :");
				int ch=scan.nextInt();
				if(ch==1)
				{
					//System.out.println("View Available Balance");
					impl.viewBalance();
				}
				else if(ch==2) {
					System.out.println("Enter the amount to withdraw");
					double withdrawamount=scan.nextDouble();
					impl.withdrawAmount(withdrawamount);
				}
				else if(ch==3) {
					System.out.println("Enter the amount to deposit");
					double depositAmount=scan.nextDouble();
					impl.depositAmount(depositAmount);
				}
				else if(ch==4) {
					impl.viewMiniStatement();
				}
				else if(ch==5) {
					System.out.println("collect your ATM card \n Thank you");
				}
			}
		}
		else {
			System.out.println("INCORRECT ATM NUMBER OR PIN");
			System.out.println("PLEASE CHECK IT");
		}
	}
}
