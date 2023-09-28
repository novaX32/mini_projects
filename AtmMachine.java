package nova;

import java.util.Scanner;

class ATM{
    float balance;
    int pin=4567;
    ATM(){
        System.out.println("Enter your pin:");
        Scanner sc=new Scanner(System.in);
        int enterpin=sc.nextInt();
        if(enterpin==pin){
            menu();
        }
        else{
            System.out.println("Enter a valid pin");


        }
    }
    public void menu(){
        System.out.println("Enter your Choice:");
        System.out.println("1.AC_BALANCE \n2.withdraw\n3.depo_money\n4exit");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        if(choice==1){
            checkbalance();

        } else if (choice==2) {
            withdrawmoney();


        } else if (choice==3) {
            depositmoney();


        }
        else if (choice==4){
            return;
        }
        else {
            System.out.println("Enter a valid choics");
        }

    }
    public void checkbalance(){
        System.out.println("Balance:"+balance);
        menu();

    }


    public void withdrawmoney(){
        System.out.println("Enter the Amount to withdraw:");
        Scanner sc =new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount>balance){
            System.out.println("Insufficient Balance");
        }
        else {
            balance=balance-amount;
            System.out.println("The Withdrawl amount is"+amount);

        }
        menu();

    }
    public void depositmoney(){
        System.out.println("Enter the amount to deposit:");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        balance=balance+amount;
        System.out.println("Money deposited Successfully");
        menu();
    }

}




public class AtmMachine {
    public static void main(String[] args) {
        ATM obj=new ATM();
    }
    }
