package QueueWithArray;

public class QueueEmptyException extends Exception{
	public  QueueEmptyException(String message){
		System.out.println("The Queue is empty");
	}
}
