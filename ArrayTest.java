import java.util.Scanner;

public class ArrayTest {

    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        int l= input.nextInt();
        int []array= new int [l];
        for(int i=0;i<l;i++)
        {
            array[i] = input.nextInt();

        }
        DifferenceValue value = new DifferenceValue();
        int finalvalue=value.sumwintoutoutSmallest(array);
        System.out.println(finalvalue);


    }
}
