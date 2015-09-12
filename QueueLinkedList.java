package QueueWithLinkedList;

public class QueueLinkedList {
	public static void main(String args[]){
		QueueWithLinkedListMethods qlm =
				new QueueWithLinkedListMethods();
		try{
			System.out.println("Size: " + qlm.size());
			qlm.enqueue(100);qlm.enqueue(200);qlm.enqueue(500);
			System.out.println("Size: " + qlm.size());
			System.out.println("Front:" + qlm.front());
			System.out.println("Tail:" + qlm.tail());
			qlm.dequeue();
			qlm.dequeue();
			System.out.println("Is Empty: " + qlm.isEmpty());
			qlm.enqueue("Priyanka");
			System.out.println("Is Empty: " + qlm.isEmpty());
			System.out.println("Size: " + qlm.size());
			System.out.println("Front:" + qlm.front());
			System.out.println("Tail:" + qlm.tail());
		}
		catch(Exception e){
			
		}
	}
	
}
