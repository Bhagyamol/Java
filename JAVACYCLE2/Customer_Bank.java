import java.util.*;
class Bank{
int accno;
String 	name,type;
float amount;
void details(int n,String nm,String t,float a)
{
accno=n;
name=nm;
type=t;
amount=a;
}
	
void show()
{
System.out.println("Account number of the customer:"+accno);
System.out.println("Customer Name:"+name);
System.out.println("Account Type:"+type);
System.out.println("Amount:" +amount);
}
void deposit(float a)
{
amount=+a;
System.out.println("deposit amount:"+a);
}
void withdraw(float a)
{
if(amount<a)
System.out.println("insufficentt balance");
else
amount-=a;
System.out.println("withdraw amount is:"+a);

}
void checkbalance()
{
System.out.println("balance is:"+amount);
}
}
class Customer_Bank{
public static void main(String args[])
{
Bank b =new Bank();
b.details(123456,"Bhagya","savings",3000);
b.show();
b.deposit(50000);
b.checkbalance();
b.withdraw(10000);
b.checkbalance();
}
}
