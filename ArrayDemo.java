import java.util.Random;
import java.util.Scanner;


public class ArrayDemo {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random rd = new Random();
        final int L=10;
        int []array =new int[L];
        for(int i=0;i<L;i++)
        {
            array[i] = rd.nextInt(50);

        }
        System.out.println( );
        for(int i=0;i<L;i=i+2)
        {
            System.out.print(array[i]+" "  );

        }
        System.out.println( );
        for(int i=0;i<L;i++)
        {
            if(array[i]%2==0) {
                System.out.print(array[i] +" " );
            }
        }
        System.out.println( );
        for(int i=L-1;i>=0;i--)
        {
            System.out.print(array[i]+" "  );

        }
        System.out.println( );
        System.out.print(array[0]+ " " +array[L-1]);



    }
}
