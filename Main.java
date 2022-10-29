import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int i,j,k,sayi;
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        sayi = input.nextInt();

        for (i=0;i<=sayi;i++){
            for(j=0;j<(sayi-i);j++){
                System.out.print(" ");
            }
            for(k=1;k<=(2*i+1);k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (i=0;i<=sayi;i++){
            for(j=0;j<i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=(2*sayi-(2*i-1));k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
