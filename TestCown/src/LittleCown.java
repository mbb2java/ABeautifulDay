import java.util.LinkedList;

public class LittleCown {
	private int age=0;
	private static LinkedList<LittleCown> lllc=new LinkedList<LittleCown>();
	public void GrowUP(){
		LittleCown.getLllc().set(LittleCown.getLllc().indexOf(this),null);
		Cown.getLlc().add(new Cown());
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static LinkedList<LittleCown> getLllc() {
		return lllc;
	}
	public static void setLllc(LinkedList<LittleCown> lllc) {
		LittleCown.lllc = lllc;
	}
}
