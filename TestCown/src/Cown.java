import java.util.LinkedList;

public class Cown {
	private int age=4;
	private static LinkedList<Cown> llc=new LinkedList<Cown>();
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public static LinkedList<Cown> getLlc() {
		return llc;
	}
	public static void setLlc(LinkedList<Cown> llc) {
		Cown.llc = llc;
	}
	public void born(){
		LittleCown lc=new LittleCown();
		lc.setAge(1);
		LittleCown.getLllc().add(lc);
		
		
	}

}
