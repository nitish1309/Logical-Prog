
//reverse by word to word
public class RevEach {

	public static void main(String[] args) {
		String inp = "roor hello world";
		String oup= "";
		String[] wrs = inp.split(" ");
		System.out.print(inp+"\n");
		for(String wr:wrs){
			String rewr="";
			for(int i= wr.length()-1; i>=0; i--){
				rewr=rewr+wr.charAt(i);
			}
			oup=oup + rewr + " ";
		}
System.out.println(oup);

	}

}
