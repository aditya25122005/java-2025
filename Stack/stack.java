package Stack;
public class stack{
    private int [] arr;
    private int idx=-1;

    public stack(){
        arr=new int[5];
    }
    public stack(int n){
        arr=new int[n];
    }
    //O(1)
    public boolean isEmpty(){
        return idx==-1;  
    }
    //O(1)

    public void push(int item) throws Exception{
        if(isFull()){
            throw new Exception("Bklol Stack full hai");
        }
        idx++;
        arr[idx]=item;
    }
    //O(1)
    public int size(){
        return idx+1;
    }
    //O(1)
    public boolean isFull(){
        return idx==arr.length-1;
    }
    //O(1)
    public int pop() throws Exception{    //underflow
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        int val=arr[idx];
        idx--;
        return val;
    }
    //O(1)
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        int val=arr[idx];
        return val;
    }
    public void display(){
        for(int i=0;i<=idx;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }



}


