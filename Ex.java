public class Ex{
	public int id=1;
	public int id2=2;
	public String name="anu";
	public Ex(){
		
	}
	public Ex(int a,int c, String b){
		this.id=a;
		this.name=b;
		this.id2=c;
		
	}
	public int getId(){
		
		return id+id2;
	}
	public String getName(){
		return name;
	}
}