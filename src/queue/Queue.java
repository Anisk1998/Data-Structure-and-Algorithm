package queue;

public class Queue {
	
	int queue[] = new int[5];
	int front;
	int rear;
	int size;
	
	public void enQueue(int data) {
		if(!isFull()) {
		queue[rear] = data;
		rear = (rear + 1)%5;
		size++;
		}
		
		else {
			System.out.println("Queue is Full");
		}
	}
	
	public int deQueue() {
		int data = queue[front];
		
		if(!isEmpty()) {
		front = (front + 1)%5;
		size--;
		}
		
		else {
			System.out.println("Queue is Empty");
		}
		return data;
	}
	
	public int getSize() {
		
		return size;
	}
	
	public boolean isEmpty() {
		
		return getSize()==0;
	}
	
	public boolean isFull() {
		
		return getSize()==5;
	}
	
	public void show() {
		for(int i = 0; i < size; i++) {
			System.out.print(queue[(front+i)%5]+" ");
		}
	}
}
