package QueueWithLinkedList;

import QueueWithArray.QueueEmptyException;

public interface QueueWithLinkedListInterface {
	
	public void enqueue(Object element);
	public void dequeue() throws QueueEmptyException;
	public int size();
	public boolean isEmpty();
	public Object front() throws QueueEmptyException;
	public Object tail() throws QueueEmptyException;

}
