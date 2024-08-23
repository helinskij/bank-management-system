import java.util.Scanner;
public class bank {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        user alice = new user("Alice", "1");
        user robert = new user("Robert", "2");

        bankAccount aliceAccount = new bankAccount("1", alice);
        bankAccount robertAccount = new bankAccount("2", robert);

        System.out.println(alice.getUserID() + " " +alice.getName());
        System.out.println(robert.getUserID() + " " +robert.getName());

        aliceAccount.deposit(1000);


        System.out.println("Alice: " + aliceAccount.getBalance());
        System.out.println("Robert: " + robertAccount.getBalance());

        aliceAccount.transfer(robertAccount, 750);
        robertAccount.withdraw(250);

        System.out.println("Alice: " + aliceAccount.getBalance());
        System.out.println("Robert: " + robertAccount.getBalance());

        keyboard.close();

//
//        int end = 1;
//        while(end ==1) {
//            System.out.println("Choose user: ");
//            int user = keyboard.nextInt();
//            if(user==1){
//                System.out.println(alice.getName() + ", balance: " + aliceAccount.getBalance());
//
//            }
//            else{
//                System.out.println(robert.getName() + ", balance: " + robertAccount.getBalance());
//            }
//
//            System.out.println("type 0 to quit 1 to keep going");
//            end = keyboard.nextInt();
//
//
//        }


        
    }
}