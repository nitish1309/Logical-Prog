
public class PalimD {

	public static void main(String[] args) {
	int a=121,r,b=0;
	int t=a;
	
	while(a>0){
		r=a%10;
		a=a/10;
		b=b*10+r;
	}
System.out.println(b);
if(t==b){
	System.out.println("its a plaindrome number");
}
else{
	System.out.println("its not a plandrome number");
}
}
}