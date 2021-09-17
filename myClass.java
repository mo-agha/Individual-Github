import java.util.*;
public class myClass{
    
    //Simple method that returns a sorted array using the Arrays class.
    public static int[] sort(int[] array){
        Arrays.sort(array);
        return array;
    }
    
    //Test run.
    public static void main(String args[]) {
        
        //Array initalized with random integers.
        int[] numbers = new int[10];
        boolean sorted=false;
        for (int i=0; i<numbers.length; i++){
            numbers[i]=(int)(Math.random()*100);
        }
        
        //"sort" method called.
        numbers=sort(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        //check if array is properly sorted.
        for(int j=0; j<numbers.length-1; j++){
            if(numbers[j]>numbers[j+1]){
                sorted=false;
            }
            else{
                sorted=true;
            }
        }
        System.out.println("\nSorted: " + sorted);
    }
}
//This is a comment!
