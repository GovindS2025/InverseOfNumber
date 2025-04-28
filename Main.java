import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//Hi we will complete this Inverse number program.
//After taking a number through Scanner we will work and understand the fuctioning with Dibuging

        var invs =0;
        var orgPlace =1;
        while (num !=0)
        {
            var orgDgt = num % 10; // it will give us a remainder

            var invDgt = orgPlace;
            var invPos = orgDgt;

            invs = invs + invDgt * (int)Math.pow(10,invPos-1);
            
            num =num/10;

            orgPlace++;

        }

        System.out.println(invs);
    }
}