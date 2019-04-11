package rotate;
/*
program to left rotate an array by n elements

Here we using the tempArray then copying the numbers
to temp array then adding the numbers to rotated to end of array
 */

public class JugglingRotation {

    /*
    This API will first pick one element and starts shifting leftmost element by
    rotation factor towards end of the array and intermediate elements left shifted
     */
    private static int[] rotateArrayByNElements(int[] array,int rotationFactor,int gcd) {
           // int phase=1;
        for(int i=0;i<gcd;i++){
            int temp=array[i];
            int j=i;

            while(true){
                int k=j+rotationFactor;
                if(k>=array.length){
                    k=k-array.length;
                }
                if(k==i)
                    break;
                array[j]=array[k];
                array[k]=temp;
                j=k;
                printArray(array);
                System.out.println("");
            }
        }
        return array;
    }

    private static int calcGCD(int length, int rotationFactor) {
        {
            // Everything divides 0
            if (length == 0 || rotationFactor == 0)
                return 0;

            // base case
            if (length == rotationFactor)
                return length;

            // a is greater
            if (length > rotationFactor)
                return calcGCD(length-rotationFactor, rotationFactor);
            return calcGCD(length, rotationFactor-length);
        }

    }

    public static void main(String[] args){
        int[] array=new int[] {1,2,3,4,5,6,7,8,9,10};
        int rotationFactor=10;
        int gcd=calcGCD(array.length,rotationFactor);
        System.out.println("GCD is:"+gcd);
        printArray(rotateArrayByNElements(array,rotationFactor,gcd));
        //printArray(rotateArrayByNElements(array,8));

    }



    private static void printArray(int[] array) {
        if(array==null || (array!=null && array.length==0)) return;
        System.out.print("Jugging Rotated array is: ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+", ");
        }
    }
}
