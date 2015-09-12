package QueueWithLinkedList;

import QueueWithArray.QueueEmptyException;

public class QueueWithLinkedListMethods implements QueueWithLinkedListInterface {
		Node head,tail;
		int size=0;
	
	public QueueWithLinkedListMethods() {
		head=null;
		tail=null;
	}
	public void enqueue(Object element){
		//System.out.println("Enqueued");
		Node newNode = new Node(element,null);
		if(size()>0){
			tail.next=newNode;
			tail=newNode;
		}
		else{
			head=newNode;
			tail=newNode;
		}
		size++;
	}
	@Override
	public void dequeue() throws QueueEmptyException{
		if (size==0){
			throw new QueueEmptyException("message");
		}
		else {
			Node temp=head;
			head=head.next;
			temp.next=null;
		}
		size--;
		//System.out.println("Dequeued");
		
	}
	public int size() {
		return size;
	}
	@Override
	public boolean isEmpty() {
		return (size==0);
	}
	@Override
	public Object front() throws QueueEmptyException {
		if (size>0){
			return (head.element);
		}
		else {
			throw new QueueEmptyException("message");
		}
		
	}
	
	public Object tail() throws QueueEmptyException {
		if (size>0){
			return (tail.element);
		}
		else {
			throw new QueueEmptyException("message");
		}
	}
	
	public void print() throws QueueEmptyException{
		while(size()!=0){
			System.out.print(front() + " ");
			dequeue();
		}
	}
}
