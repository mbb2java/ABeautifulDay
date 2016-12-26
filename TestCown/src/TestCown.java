import java.util.LinkedList;
public class TestCown {
	public static void main(String[] args) {
		Cown c=new Cown();
		Cown.getLlc().add(c);
		int k=0;
		LinkedList<LittleCown> llcRem=new LinkedList<>();
		for(int i=0;i<10;i++){
			int num_Null=0;
			for(LittleCown lc1:LittleCown.getLllc()){
				if(lc1!=null){
					lc1.setAge(lc1.getAge()+1);
					//System.out.println(lc1.getAge()+"---");
					if(lc1.getAge()>=5){
						lc1.GrowUP();
					}
				}else{
					llcRem.add(lc1);
				}
			}
			for(Cown c1:Cown.getLlc()){
				c1.born();
			}
			for(LittleCown lc:LittleCown.getLllc()){
				if(lc!=null){
					num_Null++;
				}
		    }
			System.out.println(num_Null+Cown.getLlc().size());
		}
		for(LittleCown lc:LittleCown.getLllc()){
			if(lc!=null){
				k++;
			}
		}
		
		System.out.println("ALL---"+(k+Cown.getLlc().size()));
		
				int[] count=new int[21];
				count[0]=1;
				for(int i=1;i<=20;i++){
					if(i>=4){
						count[i]=count[i-1]+count[i-4];
					}else{
						count[i]=count[i-1]+1;
					}
				}
				for(int j=0;j<=10;j++){
					System.out.println(count[j]);
				}
				// TODO Auto-generated method stub
			}


		// TODO Auto-generated method stub

}
