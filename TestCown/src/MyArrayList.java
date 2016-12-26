
public class MyArrayList {
	private Object[] o=new Object[10];
	private int index=0;
	public void add(Object obj){
		if(index==o.length){
			Object[] objects=new Object[o.length*2];
			System.arraycopy(o, 0, objects, 0, o.length);
            o=objects;
		}
		o[index++]=obj;
	}
	public int size(){
		return index;
	}

}
