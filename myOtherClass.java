import java.util.*;
public class myOtherClass{
    
    //Simple method that returns a sorted array using the Arrays class.
    public static String[] sort(String[] array){
        Arrays.sort(array);
        return array;
    }
    
    //Test run.
    public static void main(String args[]) {
        
        //Array initalized with words.
        String[] animals = {"cat", "monkey", "dog", "rabbit", "frog", "dolphin", "bird", "penguin"};
        boolean sorted=false;
        
        //"sort" method called.
        animals=sort(animals);
        for(int i=0; i<animals.length; i++){
            System.out.print(animals[i]+" ");
        }
        //check if array is properly sorted.
        for(int j=0; j<animals.length-1; j++){
            if(animals[j].compareTo(animals[j+1]) < 0){
                sorted=true;
            }
            else{
                sorted=false;
            }
        }
        System.out.println("\nSorted: " + sorted);
    }
}
//This is a comment!
