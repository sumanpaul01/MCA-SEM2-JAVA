public class Queue {
  private int maxSize;
  private int[] queueArray;
  private int front;
  private int rear;
  private int size;

  public Queue(int size) {
      maxSize = size;
      queueArray = new int[maxSize];
      front = 0;
      rear = -1;
      size = 0;
  }

  public void enqueue(int value) {
      if (isFull()) {
          System.out.println("Queue is full. Cannot enqueue element.");
          return;
      }
      rear = (rear + 1) % maxSize;
      queueArray[rear] = value;
      size++;
  }

  public int dequeue() {
      if (isEmpty()) {
          System.out.println("Queue is empty. Cannot dequeue element.");
          return -1;
      }
      int dequeuedValue = queueArray[front];
      front = (front + 1) % maxSize;
      size--;
      return dequeuedValue;
  }

  public int peek() {
      if (isEmpty()) {
          System.out.println("Queue is empty. Cannot peek element.");
          return -1;
      }
      return queueArray[front];
  }

  public boolean isEmpty() {
      return size == 0;
  }

  public boolean isFull() {
      return size == maxSize;
  }

  public static void main(String[] args) {
      Queue queue = new Queue(5);
      queue.enqueue(1);
      queue.enqueue(2);
      queue.enqueue(3);
      queue.enqueue(4);
      queue.enqueue(5);

      System.out.println("Queue peek: " + queue.peek());
      System.out.println("Queue dequeue: " + queue.dequeue());
      System.out.println("Queue peek after dequeue: " + queue.peek());
  }
}