public class Nbentier{
	private int val;

	public Nbentier(){
		this.val =0;
	}

	public Nbentier(int val){
		this.val=val;
	}

	public int setValue(int newVal){
		int oldVal=this.val;
		this.val=newVal;
		return oldVal;
	}

	public int getValue(){
		return this.val;
	}

}
public class Permutation{
	public static void permute(Nbentier a,Nbentier b){
		int temp =a.getValue();
		a.setValue(temp);
	}
}
public static void main(String[] args){
	Nbentier a=new Nbentier(5);
	Nbentier b=new Nbentier(10);

	System.out.println("Nbentier contient:"+a.getValue() +","+b.getValue());
	permute (a,b);
	System.out.println("Nbentier countient:"+a.getValue() +","+b.getValue());
}
