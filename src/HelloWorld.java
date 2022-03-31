import java.util.Scanner;

public class HelloWorld {

    //Doing some work here (you can type anything you want)
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("How are you ?");
        String words= scan.next();
        if(words.equals("fine")){
            System.out.println("Hava a nice day");
        }
    }

}
