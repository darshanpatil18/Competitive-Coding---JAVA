class Account{
	int balance;
	int accountNo;
	int amtRem=1000;
Account(){
	int bal=balance;
	int acc=accountNo;
}
void deposit(){
	System.out.println("Amount to be Deposited: 500 from Account Number: " + accountNo);
	amtRem=amtRem + 500;
	System.out.println("Amount after Deposit: 1500");
}
void withdraw(){
	System.out.println("Amount to be Withdrawn: 900 from Account Number: " + accountNo);
	amtRem = amtRem - 500;
	System.out.println("Amount after Withdrawn: 600");
}
}
class Transact{
	public static void main(String args[]){
		Account ABC=new Account();
		ABC.balance=1000;
		ABC.accountNo=111;
		ABC.deposit();
		ABC.withdraw();
		/*TransactionD t1;
		TransactionW t2;
		t1=new TransactionD(ABC,500);
		t2=new TransactionW(ABC,900);
		t1.start();
		t2.start();*/

	}


}