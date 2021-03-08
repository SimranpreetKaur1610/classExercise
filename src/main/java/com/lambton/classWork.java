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
        for (int i = myArray.length - 1 ; i >= 0 ; i-- )
        {
            System.out.print(myArray[i] + "  ");
        }

        System.out.println("\n\nAfter Sorting array in ascending order:");
        for(int i = 0 ; i < myArray.length ; i++)
        {
            for(int j = 0 ; j < i ; j++)
            {
                if(myArray[i] < myArray[j])
                {
                    int a = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = a;
                }
            }
        }
        for (int x : myArray) {
            System.out.print(x + "  ");
        }

        System.out.println("\n\nAfter sorting array in descending order:");
        for(int i = 0 ; i < myArray.length ; i++){
            for(int j = 0 ; j < i ; j++){
                if(myArray[i] > myArray[j]){
                    int x = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = x;
                }
            }
        }
        for (int x : myArray) {
            System.out.print(x + "  ");
        }
        System.out.println("\n\nOdd elements in the Array : ");
        for(int x: myArray){
            if(x % 2 != 0){
                System.out.println(x);
            }
        }

        System.out.println("\nEven elements in Array:");
        for(int x: myArray)
        {
            if(x % 2 == 0)
            {
                System.out.println(x);
            }
        }
        System.out.print("\nSum of all elements in Array: ");
        int sum = 0;
        for(int x: myArray){
            sum += x;
        }
        System.out.println(sum);

    }
}
