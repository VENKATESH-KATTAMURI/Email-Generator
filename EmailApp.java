import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Generate Organization's Email ==>");
        System.out.println("Generating the email...");
        System.out.println("Enter firstname :");
        String first = sc.nextLine();
        System.out.println("Enter Lastname :");
        String second = sc.nextLine();

        Email em = new Email(first, second);

        while (true) {
            System.out.println("\n1 : Information ");
            System.out.println("2 : Change Email");
            System.out.println("3 : Change Password");
            System.out.println("4 : Disclose Password");
            System.out.println("5 : Exit");
            System.out.print("Enter operation code : ");
            int a = sc.nextInt();
            sc.nextLine(); // consume newline
            switch (a) {
                case 1:
                    System.out.println(em.showInfo());
                    break;
                case 2:
                    System.out.print("Enter alternate email prefix : ");
                    String alt = sc.nextLine();
                    em.setEmail(alt + "@gmail.com");
                    System.out.println("Email updated successfully!");
                    break;
                case 3:
                    System.out.print("Enter the verification code : ");
                    String s = sc.nextLine();
                    if (s.equals(em.getVcode())) {
                        System.out.print("Enter new password : ");
                        String p = sc.nextLine();
                        em.setPassword(p);
                        System.out.println("Password updated successfully!");
                    } else {
                        System.out.println("Invalid verification code!");
                    }
                    break;
                case 4:
                    System.out.println("Password disclose warning !!!");
                    System.out.print("Enter the verification code : ");
                    String s1 = sc.nextLine();
                    if (s1.equals(em.getVcode())) {
                        System.out.println("Your password : " + em.getPassword());
                    } else {
                        System.out.println("Invalid verification code!");
                    }
                    break;
                case 5:
                    System.out.println("Have a great day ahead! BYE ");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}


