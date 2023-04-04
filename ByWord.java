
//Reverse by word to word
public class ByWord {
public static void main(String[] args) {
	String str= "Hello Welcome How are You";
	String Str1=" ";
	
	String a[]= str.split(Str1);
	for(int i=a.length-1;i>=0;i--){
		System.out.print(a[i]+ Str1 );
	
	}
	
}
}
