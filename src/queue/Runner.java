package queue;

public class Runner {
	public static void main(String[] args) {
		Queue q = new Queue();
		
		q.enQueue(5);
		q.enQueue(2);
		q.enQueue(5);
		q.enQueue(2);
		
		q.deQueue();

//		q.enQueue(5);
//		q.enQueue(2);
//		q.enQueue(2);
//		q.enQueue(5);
//		q.enQueue(2);
//		q.enQueue(2);
		
		q.show();
	}
}
