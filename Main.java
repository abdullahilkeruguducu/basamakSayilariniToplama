import java.util.Scanner;
//Patika.dev linkim --> https://app.patika.dev/ailker
public class Main {
    public static void main(String[] args){
        int number, total=0, lastNum;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        number = input.nextInt();

        do{
            lastNum = number % 10;
            number = number/10;
            System.out.print(lastNum);
            if(number != 0){
                System.out.print(" + ");
            }
            total += lastNum;
        }while(number != 0);
        System.out.print(" = " + total);
    }
}