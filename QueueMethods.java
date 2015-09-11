package QueueWithArray;

public class QueueMethods implements QueueInteface {
	private int capacity,f,r;
	public Object Q[];
	
	public QueueMethods(int capacity){
		this.capacity=capacity+1;
		Q=new Object[this.capacity];
		f=0;
		r=0;
	}
	
	@Override
	public void enqueue(Object elemenet)throws QueueFullException {
		System.out.println("Enqueued");
		if (size()== capacity-1){
			throw new QueueFullException("message");
		}
		else{
			Q[r]=elemenet;
			r=(r+1)%capacity;
		}
		
	}

	@Override
	public void dequeue() throws QueueEmptyException {
		System.out.println("Dequeued");
		if(size()==0){
			throw new QueueEmptyException("message");
		}
		else{
			Q[f]=null;
			f=(f+1)%capacity;
		}
		
	}

	@Override
	public int size() {
		return (capacity- (f-r))% capacity;
	}

	@Override
	public boolean isEmpty() {
		if (size()==0){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public Object front() throws QueueEmptyException {
		if (size()==0){
			throw new QueueEmptyException("message");
		}
		else{
			return Q[f];
		}
	}
	
}
