package rotate;
/*
program to left rotate an array by n elements

Here we using the tempArray then copying the numbers
to temp array then adding the numbers to rotated to end of array
 */
public class RotateByNElements {

    private static int[] rotateArrayByNElements(int[] array,int rotationFactor)
    {
        if(array== null || (array!=null && rotationFactor>array.length))
            return null;

        int[] tempArray=new int[array.length];
        int index=0;
        for(int i=rotationFactor;i<array.length;i++){
            tempArray[index]=array[i];
            index++;
        }

        for (int i=0;i<rotationFactor;i++){
            tempArray[index]=array[i];
            index++;
        }
        return tempArray;
    }

    public static void main(String[] args){
        int[] array=new int[] {1,2,3,4,5,6,7,8,9,10};
        printArray(rotateArrayByNElements(array,8));

    }

    private static void printArray(int[] array) {
        if(array==null || (array!=null && array.length==0)) return;
        System.out.print("Rotated array is: ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+", ");
        }
    }
}
