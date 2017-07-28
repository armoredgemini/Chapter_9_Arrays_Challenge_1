import java.util.Scanner;

/**
 * Created by ac003588 on 7/28/2017.
 */
public class ArrayTest {

    //int[] array1 = getIntegers(5);
    private static Scanner reader = new Scanner(System.in);



    private int[] getIntegers(int capacity) {
        int[] array = new int[capacity];

        for(int i = 0; i<array.length; i++) {

            System.out.printf("Please enter number: ");
            array[i] = reader.nextInt();
        }
        return array;
    }

    public void printArray(int[] array){
        for (int i = 0; i<array.length; i++)

        System.out.print("Element " + i + " contents" + array[i]);
    }


    public void sortArray(int capacity) {
        int[] array = getIntegers(capacity);
     //   System.out.println("Array is " + array);
        int[] sortedArray = new int[array.length];
        // copy passed array
        for(int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }

        }

        for(int i=0; i < sortedArray.length; i++) {
            System.out.printf(sortedArray[i] + ",");
        }
    }

}
