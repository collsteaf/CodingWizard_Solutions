
public class Qn4 {
static boolean check_automorphic(int n) {

	
	int s=(int)Math.pow(n,2);
	
	
	 while(n>0) {
		if(n%10!=s%10)  {
			return false;
			}	
		
		n=n/10;
		s=s/10;
	 }
	 return true;
	}
	
	public static void main(String[] args) {
		int n=77;
		
	if (check_automorphic(n)) {
		System.out.println("The number "+n+" is automorphic");
	}
	else {
		System.out.println("The number "+n+" is not automorphic");
	}

	}

}
