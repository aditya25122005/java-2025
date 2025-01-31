package Queue;
public class queue_java{
    private int [] arr;
    private int front=0;
    private int size=0;  //element kaha pe add hoga and size


    public queue_java(){
        arr=new int[5];
    }
    public queue_java(int n){
        arr=new int[n];
    }

    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==arr.length;
    }
    public void Equeue(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }
        arr[(front+size)%arr.length]=item;
        size++;
    }
    public int size(){
        return size;
    }
    public int getfront(){
        return arr[front];
    }
    public int Dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int val=arr[front];
        front=(front+1)%arr.length;
        size--;
        return val;
    }
    public void display(){
        for(int i=0;i<size;i++){
        System.out.print(arr[(front+i)%arr.length]+ " ");      
        
        }
        System.out.println();
    }






}