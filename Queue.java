package QueueWithArray;
import java.util.*;

public class Queue {
	public static void main(String args[]){
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the queue capacity:");
		int capacity = scan.nextInt();
		QueueMethods qm = new QueueMethods(capacity);
		try {
			qm.enqueue(100);
			System.out.println("Size: "+ qm.size());
			qm.enqueue(1000);
			System.out.println("Size: "+ qm.size());
			qm.enqueue(2000);
			System.out.println("Size: "+ qm.size());
			qm.enqueue("Priyanka");
			System.out.println("Size: "+ qm.size());
			qm.enqueue(5);
			System.out.println("Size: "+ qm.size());
			
			System.out.println("Front-> "+ qm.front());
			System.out.println("Size: "+ qm.size());
			qm.dequeue();
			System.out.println("Size: "+ qm.size());
			System.out.println("Front-> "+ qm.front());	
			
			System.out.println("Is empty: " +qm.isEmpty());
			qm.dequeue();qm.dequeue();qm.dequeue();qm.dequeue();
			System.out.println("Is empty now: " +qm.isEmpty());
			qm.dequeue();
		}
		catch(Exception e){	
		}
		scan.close();
	}
}
