import java.util.*;
public class SavingsAccount {
  
    int balance;
    
    public SavingsAccount(int initialBalance){
      balance = initialBalance;
    }
    public void checkBalance(){
      System.out.println("Your balance is "+balance);
    }
    public void deposit(int amountToDeposit){
        balance +=amountToDeposit;
      System.out.println("You just deposited "+amountToDeposit );
  
    }
    public void withdraw(int amountToWithdraw){
     if(amountToWithdraw>balance){
        System.out.println("Insufficient funds! Withdrawal failed.");
     }else{
        balance-=amountToWithdraw;
        System.out.println("You just withdrew: " + amountToWithdraw);
     }
    }
    
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter intial balance:");
      int initialBalance=sc.nextInt();
      SavingsAccount sA=new SavingsAccount(initialBalance);
      while(true){
        System.out.println("\n 1.check Balance:");
        System.out.println("2. Deposit Money:");
        System.out.println("3.withdraw Money:");
        System.out.println("4.exit");
        System.out.print("please choose an option: ");
        int choice= sc.nextInt();
        switch(choice){
            case 1:
                sA.checkBalance();
                break;
            case 2:
                System.out.println("Enter amount to deposit: ");
                int amountToDeposit=sc.nextInt();
                sA.deposit(amountToDeposit);
                break;
            case 3:
                System.out.println("Enter amount to withdraw: ");
                int amountToWithdraw=sc.nextInt();
                sA.withdraw(amountToWithdraw);
                break;
            case 4:
                System.out.println("Exiting... Thank you!");
                sc.close();
                return;
            default:
                System.out.println("Invalid choice! Please try again.");
        }
      }
    }       
  }
  