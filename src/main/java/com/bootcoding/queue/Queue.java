package com.bootcoding.queue;

public class Queue {
    int SIZE = 5;
    int items[] = new int[SIZE];
    int front, rear;

    Queue() {
        front = -1;
        rear = -1;
    }

    // [10, 20, 30, 40, 50]
    // front = 0
    // rear = 4 (n-1)
    boolean isFull() {
        if (rear == SIZE - 1) {
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if (front == -1 && rear == -1)
            return true;
        else
            return false;
    }

    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1 && rear == -1) {
                front = rear = 0;
                items[rear] = element;
            } else {
                rear++;
                items[rear] = element;
                System.out.println("Inserted " + element);
            }
        }
    }

    // [10, 20, 30, 40, 50]
    // front = 0
    // rear = 4 (n-1)
    // deque() -> 10, front = 1, rear = 4
    // deque() -> 20, front = 2, rear = 4
    // deque() -> 30, front = 3, rear = 4
    // enque() -> 100, rear + 1 = rear = 5 (ArrayIndexOutOfBound)
    // deque() -> 40, front = 4, rear = 4
    // deque() -> 50, front = -1, rear = -1
    // deque() -> Queue is Empty

    // Circular Queue
    // enque() -> 100, rear + 1 = rear = 5 (ArrayIndexOutOfBound)
    // enque() -> 100, rear + 1 = rear = 0 (4 + 1 = 5%SIZE) - > % = 0

    // 1 % 5 = 1
    // 2 % 5 = 2
    // 3 % 5 = 3
    // 4 % 5 = 4
    // 5 % 5 = 0

    int deQueue() {
        int element = 0;
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            element = peak(); // gives you first element
            if (front == rear) {
                front = rear = -1;
            }
            front++;

            System.out.println("Deleted -> " + element);
            return (element);
        }
        return -1;
    }

    void display() {
        /* Function to display elements of Queue */
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index-> " + front);
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + "  ");

            System.out.println("\nRear index-> " + rear);
        }
    }
    int peak(){
        return items[front];
    }


    public static void main(String[] args) {
        Queue q = new Queue();

        // deQueue is not possible on empty queue
        q.deQueue();

        // enQueue 5 elements
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        q.deQueue();
        // 6th element can't be added to because the queue is full
        q.enQueue(6);

        q.display();

        // deQueue removes element entered first i.e. 1
        q.deQueue();

        // Now we have just 4 elements
        q.display();

    }
}
