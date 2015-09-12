package QueueWithLinkedList;

import QueueWithArray.QueueEmptyException;


public class Merge2sortedList {
	static QueueWithLinkedListMethods dllm1 = 
			new QueueWithLinkedListMethods();
		static QueueWithLinkedListMethods dllm2 = 
				new QueueWithLinkedListMethods();
		static QueueWithLinkedListMethods dllm3 = 
				new QueueWithLinkedListMethods();
	public static void main(String args[]) throws QueueEmptyException{
		System.out.println("Creating first list");
		try{
		dllm1.enqueue(10);
		dllm1.enqueue(20);
		dllm1.enqueue(30);
		//dllm1.enqueue(40);
	//	dllm1.print();
		System.out.println();
		System.out.println("Size1: " + dllm1.size());
		System.out.println("Creating second list");
		dllm2.enqueue(7);
		dllm2.enqueue(21);
		//dllm2.enqueue(33);
		//dllm2.enqueue(39);
		//dllm2.print();
		System.out.println("Size2: " + dllm2.size());
		System.out.println();
		}
		catch(Exception e){
			
		}
		mergelist();
		
	}
	public static void mergelist() throws QueueEmptyException{
		int dim=(dllm1.size()+dllm2.size());
		while(dllm3.size()<dim ){
			if( (dllm1.isEmpty()) && (!dllm2.isEmpty())) {
				dllm3.enqueue(dllm2.front());
				dllm2.dequeue();
			}
			else if(dllm2.isEmpty() && (!dllm1.isEmpty())){
				dllm3.enqueue(dllm1.front());
				dllm1.dequeue();
			}
			else if ( ((Integer)dllm1.front()).intValue() <
			((Integer)dllm2.front()).intValue() ){
				dllm3.enqueue(dllm1.front());
				dllm1.dequeue();
			}
			else if((dllm1.isEmpty()) ||
					( ((Integer)dllm1.front()).intValue() >=
					((Integer)dllm2.front()).intValue() )
					){
				dllm3.enqueue(dllm2.front());
				dllm2.dequeue();
			}
			//System.out.println("Tail: " + dllm3.tail());
		}
		System.out.println("Size of new : " + dllm3.size());
		dllm3.print();
	}
}
