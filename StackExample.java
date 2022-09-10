import java.util.Scanner;

class StackExample {
    public static void main(String[] args) {
        Stack stk = new Stack(5);
        boolean yes = true;
        int choice;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Enter your choice\n 1.push\n2.pop\n3.display\n4.exit");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter the puh item");
                    stk.PushItem(s.nextInt());
                    break;
                case 2:
                    stk.PopItem();
                    break;
                case 3:
                    stk.display();
                    break;
                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("invalid choice");
            }
        } while (yes == true);

        s.close();
    }

}