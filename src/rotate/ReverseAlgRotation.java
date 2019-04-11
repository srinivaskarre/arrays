package rotate;

public class ReverseAlgRotation {



    public static void main(String[] args){
        int[] array=new int[] {1,2,3,4,5,6,7,8,9,10};
        int rotationFactor=3;
        array=reverseArrayByNElements(array,0,rotationFactor-1);
        System.out.println("After first part reverse");
        printArray(array);
        array=reverseArrayByNElements(array,rotationFactor,array.length-1);
        System.out.println("After Second part reverse");
        printArray(array);
       array=reverseArrayByNElements(array,0,array.length-1);
        System.out.println("Final array:");
        printArray(array);
    }

    private static int[] reverseArrayByNElements(int[] array, int startIndex,int reverseFactor) {
        int temp=0; int tempReverseFactor=reverseFactor; int i=startIndex;
        while (true){
            if(i==tempReverseFactor || i==array.length)
            {
                break;
            }
            temp=array[i];
            array[i]=array[tempReverseFactor];
            array[tempReverseFactor]=temp;
            tempReverseFactor--;
            i++;
        }
    return array;
    }


    private static void printArray(int[] array) {
        if(array==null || (array!=null && array.length==0)) return;
        System.out.print("Jugging Rotated array is: ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+", ");
        }
    }
}
