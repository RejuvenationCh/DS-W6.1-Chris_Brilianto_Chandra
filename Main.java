import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input number: ");
        String inputString = sc.nextLine();  

        if (inputString.isEmpty()) {
            System.out.println("Input is empty");
        } else {
            String[] ageInput = inputString.split("\\s+"); 
            ageBouncer(ageInput);
        }
        sc.close();
    }

    public static void ageBouncer(String[] ageInput) {
        Queue<Integer> firstQueue = new PriorityQueue<>();
        Queue<Integer> secondQueue = new PriorityQueue<>();
        Queue<Integer> accQueue = new PriorityQueue<>();

        int[] ages = new int[ageInput.length];

    for (int i = 0; i < ageInput.length; i++) {
        ages[i] = Integer.parseInt(ageInput[i]); 
    }
     for (int j : ages){
        firstQueue.add(j);
     }
    
    Iterator<Integer> iterator = firstQueue.iterator();
    Iterator<Integer> secondIterator = secondQueue.iterator();
    Iterator<Integer> accIterator = accQueue.iterator();

    while (iterator.hasNext()) {
        int currentAgeCheck = firstQueue.poll();
        if (currentAgeCheck > 118 | currentAgeCheck < 28) {
            secondQueue.add(currentAgeCheck);
        } else accQueue.add(currentAgeCheck);
    }
    if (accIterator.hasNext()) {
           while (accIterator.hasNext()) {
        System.out.println(accQueue);
        break;

    }
    }
 if (secondIterator.hasNext()){
     while (secondIterator.hasNext()) {
        System.out.println(secondQueue);
        break;
        
    }

 }
   

    }
}
