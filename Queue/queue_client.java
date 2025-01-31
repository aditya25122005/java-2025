package Queue;

public class queue_client {
    public static void main(String[] args) throws Exception {
        queue_java q=new queue_java();
        q.Equeue(10);
        q.Equeue(20);
        q.Equeue(30);
        q.Equeue(40);
        q.display();
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
        q.Equeue(50);
        q.Equeue(60);
        q.display();

    }
}
