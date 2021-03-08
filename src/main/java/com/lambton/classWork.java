package com.lambton;

public class classWork
{
    public static void main(String[] args)
    {
        int[] myArray = {5, 89, 65, 14, 40, 30, 60, 27, 10, 50};
        System.out.println("Array :");
        for (int x : myArray)
        {
            System.out.print(x + "  ");
        }
        System.out.println("\n\nArray in reverse order:");
        for (int i = myArray.length - 1 ; i >= 0 ; i-- )  {
            System.out.print(myArray[i] + "  ");
        }
    }
}
