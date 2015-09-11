package QueueWithArray;

public interface QueueInteface {
	public void enqueue(Object elemenet) throws QueueFullException;
	public void dequeue() throws QueueEmptyException;
	public int size();
	public boolean isEmpty();
	public Object front() throws QueueEmptyException;
}
