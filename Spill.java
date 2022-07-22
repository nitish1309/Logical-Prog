
public class Spill {
	
	static void SpStr(String str){
	StringBuffer all= new StringBuffer(), spl= new StringBuffer(), num= new StringBuffer();
    for(int i=0; i<str.length(); i++){
        if(Character.isDigit(str.charAt(i)))
        num.append(str.charAt(i));
        else if(Character.isAlphabetic(str.charAt(i)))
        all.append(str.charAt(i));
        else
        spl.append(str.charAt(i));
    }
        System.out.println(num);
        System.out.println(spl);
        System.out.println(all);
    
	}
	
	public static void main(String[] args){
    String str= "You12Are*&^^&Save"; 
    SpStr(str);
}

}
