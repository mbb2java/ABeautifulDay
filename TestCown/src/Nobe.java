
public class Nobe {
	
	public Nobe(Object o, Nobe next) {
		this.o = o;
		this.next = next;
	}
	private Object o=null;
	private Nobe next=null;
	public Object getO() {
		return o;
	}
	public void setO(Object o) {
		this.o = o;
	}
	public Nobe getNext() {
		return next;
	}
	public void setNext(Nobe next) {
		this.next = next;
	}
	

}
