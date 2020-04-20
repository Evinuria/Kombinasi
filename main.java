import java.util.Arrays;
import java.util.Scanner ;
class main{
    public static void main(String args[]){
    int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Scanner input = new Scanner (System.in);
        System.out.println("HELLO");
        System.out.println("MY NAME IS EVINURIA FILUYUNISTIARA");
        System.out.println("Today we are going to learn about");
        System.out.println("COMBINATION");
        Kombinasi main;
        main = new Kombinasi();
        System.out.println("banyaknya bola yang berwarna dalam box =  ");
        main.n=input.nextInt();
        System.out.println("bola berwarna yang ingin diambil = ");
        main.r = input.nextInt();
        main.kombinasi();
    }
}