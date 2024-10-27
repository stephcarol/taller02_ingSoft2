package labcodeinspection;

import java.io.Serializable;
import java.util.Locale;

public class Email implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String m_firstName;
    private final String m_lastName;
    private String password;
    private String department;
    private final int defaultPasswordLength = 8;
    private String email;

    public Email(String firstName, String lastName) {
        this.m_firstName = firstName;
        this.m_lastName = lastName;
    }

    public void showInfo() {
        System.out.println("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName);
        System.out.println("DEPARTMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
    }

    public void setDeparment(int depChoice) {
        switch (depChoice) {
            case 1:
                this.department = "sales";
                break;
            case 2:
                this.department = "dev";
                break;
            case 3:
                this.department = "acct";
                break;
            default:
                this.department = ""; // Valor predeterminado si el código es inválido
                break;
        }
    }

    private String randomPassword(int length) {
        String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * set.length());
            password[i] = set.charAt(rand);
        }
        return new String(password);
    }

    public void generateEmail() {
        this.password = this.randomPassword(this.defaultPasswordLength);
        this.email = this.m_firstName.toLowerCase(Locale.ENGLISH) + 
                     this.m_lastName.toLowerCase(Locale.ENGLISH) + "@" + 
                     this.department + ".espol.edu.ec";
    }
}
