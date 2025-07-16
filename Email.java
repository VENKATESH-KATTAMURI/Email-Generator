import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int defaultPasswordLength = 8;
    private int codelen = 5;
    private String Vcode;
    private String company = "gmail.com";
    private String name;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Kindly! Enter department for email creation dear " + this.firstName + " " + this.lastName);
        this.department = setDepartment();
        System.out.println("Department: " + department);
        this.password = randomPass(defaultPasswordLength);
        System.out.println("New Password : " + password);
        this.name = firstName + lastName;
        this.Vcode = vcode(codelen);
        System.out.println("Your verification code : " + Vcode);
        this.email = name.toLowerCase() + "." + department + "@" + company;
        System.out.println("Official mail : " + email);
    }

    private String setDepartment() {
        System.out.println("Enter the department Id\nSales : 1\nDevelopment : 2\nAccounting : 3");
        Scanner in = new Scanner(System.in);
        int dep = in.nextInt();
        if (dep == 1) {
            return "sales";
        } else if (dep == 2) {
            return "dev";
        } else if (dep == 3) {
            return "acc";
        }
        return "";
    }

    private String randomPass(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
        char[] pass = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            pass[i] = passwordSet.charAt(rand);
        }
        return new String(pass);
    }

    private String vcode(int codelen) {
        String digits = "1234567890";
        char[] code = new char[codelen];
        for (int i = 0; i < codelen; i++) {
            int c = (int) (Math.random() * digits.length());
            code[i] = digits.charAt(c);
        }
        return new String(code);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVcode() {
        return Vcode;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String getDept(String dep) {
        if (dep.equals("dev")) {
            return "Developers";
        } else if (dep.equals("acc")) {
            return "Accounts";
        } else if (dep.equals("sales")) {
            return "Sales";
        }
        return "";
    }

    public String showInfo() {
        return "Name : " + name + "\nOfficial email : " + email + "\nDepartment : " + getDept(department);
    }
}
