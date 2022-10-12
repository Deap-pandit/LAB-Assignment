public class DifferenceValue {



    public int sumwintoutoutSmallest(int []array)
    {
        int sum=0;

        int min= array[0];
        for(int i=0;i<array.length;i++)
        {
            if(min>array[i])
            {
                min=array[i];
            }
            sum=sum+array[i];


        }

        return sum-min;

    }
}
