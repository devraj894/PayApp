import java.util.Scanner;
public class PayApp{
    void getData(){
        int password = 2114;
        int balance = 10000;
        System.out.print("Welcome to our App\n");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your password : ");
        int userPassward = sc.nextInt();
        if(userPassward == password){
            System.out.print("You succefully log in.......!\n");
            System.out.print("***OPTIONS***\n");
            
            System.out.println("Enter 1 for check balance\nEnter 2 for pay someone\nEnter 3 for deposite");
            int n = sc.nextInt();
            switch(n){
                case 1:
                System.out.println("Bank Balance : " +balance);
                break;

                case 2:
                System.out.print("Enter the amount which you want to pay someone : ");
                int pay = sc.nextInt();
                if(pay <= balance){
                    balance -= pay;
                    System.out.println("Current Bank Balance : " +balance);
                }else{
                    System.out.println("Insufficient Balance");
                }
                break;

                case 3:
                System.out.print("Enter the amount which you want to deposite : ");
                int deposite = sc.nextInt();
                balance += deposite;
                System.out.println("Current Bank Balance : "+balance);
                break;

                default:
                System.out.println("Oops...! You entered wrong number");
            }
    }else{
        System.out.println("please Enter correct passward......!");
    }
}
    public static void main(String[] args){
        PayApp p=new PayApp();
        p.getData();
    }
}