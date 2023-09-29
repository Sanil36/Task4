package atm_machine;
import java.util.*;
import java.util.Scanner;
class ATM{
    float balance;
    int pin=1234;
    
    public void checkPin(){
        System.out.println("Enter Four Digit PIN : ");
        Scanner sc=new Scanner(System.in);
        int enter_pin=sc.nextInt();
        if(pin==enter_pin){
            menu();
        }
        else
        {
            System.out.println("Enter Valid PIN\n");
            checkPin();
        }
    }
    public void menu(){
        System.out.println("\nEnter Your Choice :");
        System.out.println("1.Check A/C Balance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposite Money");
        System.out.println("4.EXIT");
        
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        
        if(choice==1){
            checkBalance();
        }
        else if(choice==2){
            withdraw_money();
        }
        else if(choice==3){
            deposite_money();
        }
        else if(choice==4){
            System.out.println("Process finished with exit code 0");
        }
        else{
            System.out.println("Enter valid Option");
        }
    }
    public void checkBalance(){
        System.out.println("\nBalance : "+balance);
        menu();
    }
    public void withdraw_money(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter Amout to withdraw : ");
        float amount=sc.nextFloat();
        if(amount>balance){
            System.out.println("Insufficient Balance");
        }
        else{
            balance=balance-amount;
            System.out.println("Moeny Withdrawl Successful");
            
        }
        menu();
    }
    public void deposite_money(){
        System.out.println("\nEnter the Amount");
        Scanner sc=new Scanner(System.in);
        float depo_amt=sc.nextFloat();
        balance=balance+depo_amt;
        System.out.println("Money Deposited is successfully");
        System.out.println("Your total Balance is "+balance);
        menu();
    }
}
public class ATM_Machine {

    public static void main(String[] args) {
            ATM obj=new ATM();
            obj.checkPin();
    }
    
}