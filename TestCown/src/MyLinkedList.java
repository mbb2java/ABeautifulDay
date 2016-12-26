
public class MyLinkedList {
	int size;
	Nobe head=null;
	Nobe tail=null;
    public void add(Object object){
    	Nobe n=new Nobe(object,null);
        if(head==null){
        	head=n;
        	tail=n;
        }else{
             tail.setNext(n);
             tail=n;
        }
        size++;
    }
    public int size(){
		return size;
    	   
    }
    		   
       

}
