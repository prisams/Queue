package QueueWithArray;

public class QueueFullException extends Exception {
	public QueueFullException(String message){
		System.out.println("The Queue is full");
	}
}
