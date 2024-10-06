import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        String userName,password;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz : " );
        userName = input.nextLine();

        System.out.print("Şifrenizi giriniz : ");
        password = input.nextLine();

        if(userName.equals("mem1n") && password.equals("java123")){
            System.out.println("Giriş Yaptınız !");
        }else {
            System.out.println("Bilgileriniz yanlış lütfen tekrar giriş yapınız ! ");

        }
    }
}

