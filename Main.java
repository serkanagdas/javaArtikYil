import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int year;
        System.out.print("Yıl Giriniz: ");
        year = inp.nextInt();

        if (year%400!=0){
            System.out.println(year + " Artık yıl değildir");
        }
        else {
            System.out.println(year + " Artık yıldır");
        }

    }
}