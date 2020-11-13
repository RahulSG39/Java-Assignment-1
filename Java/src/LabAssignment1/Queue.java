package LabAssignment1;

interface SixQueue {
    void enqueue(int element);
    void dequeue();
    Boolean isFull();
    Boolean isEmpty();
}

class Queue implements SixQueue {
    private int front, rear, capacity, count;
    private int[] arr;

    Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("OverFlow\nProgram Terminated");
            System.exit(1);
        }
        System.out.println("Inserting " + item);
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }
        System.out.println("Removing " + arr[front]);
        front = (front + 1) % capacity;
        count--;
    }

    public Boolean isEmpty() {
        return (count == 0);
    }

    public Boolean isFull()
    {
        return (count == capacity);
    }

    public void display(){
        int i;
        if(isEmpty()){
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }
        for (i = front; i <= rear; i++) {
            System.out.printf(" %d  ", arr[i]);
        }
    }

    public static void main (String[] args)
    {
        // create a queue of capacity 5
        Queue q = new Queue(10);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        System.out.println("After Enqueue operation, Queue : ");
        q.display();
        System.out.println();
        System.out.println("-------------------------");
        q.dequeue();
        q.dequeue();
        System.out.println("After Dequeue operation, Queue : ");
        q.display();
        System.out.println();
        System.out.println("-------------------------");
    }
}