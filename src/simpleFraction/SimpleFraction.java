package simpleFraction;

public class SimpleFraction {
	int numerateur;
	int denominateur;
	
	SimpleFraction(int num, int denom){
		this.numerateur=num;
		this.denominateur=denom;
	}

	public String toString() {
		return numerateur+"/"+denominateur+" ";
	}
	
	public static void main(String[] args) {
		
		System.out.println("Test_Affichage");
		
		SimpleFraction x1= new SimpleFraction(1,4);
		System.out.println(x1);

	}

}
