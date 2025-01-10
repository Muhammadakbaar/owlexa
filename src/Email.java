/**
 * Created by IntelliJ IDEA.
 * Project : Default (Template) Project
 * User: Muhammad Akbar
 * GitHub: muhammadakbaar
 * Date: 1/10/25
 * Time: 9:04 AM
 * To change this template use File | Settings | File Templates.
 */
public class Email {
    public static String email(String email){
        int index = email.indexOf('@');

        if (index== -1){
            return email;
        }

        String emailDepan = email.substring(0, index);
        String emailBelakang = email.substring(index);

        String tambah = email.charAt(0) + "*".repeat(emailDepan.length()-1);
        return tambah + emailBelakang;

    }
    public static void main(String[] args) {
        System.out.println(email("akbar@gmail.com"));
        System.out.println(email("muhammad@gmail.com"));
        System.out.println(email("ananda@gmail.com"));

    }
}