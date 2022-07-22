
public class Demo {
	public static void main(String[] args){
		String nms= "Nitish57657847Shrivastav";
		StringBuffer dig= new StringBuffer(), all= new StringBuffer();
		for(int i=0; i<nms.length(); i++){
		 if (Character.isDigit(nms.charAt(i)))
		dig.append(nms.charAt(i));
		else
		all.append(nms.charAt(i));
		}
		System.out.println(all+ " ");
		System.out.println(dig);
		}
}
