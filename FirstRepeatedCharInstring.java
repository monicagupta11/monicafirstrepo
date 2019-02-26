import java.util.HashSet;


public class FirstRepeatedCharInstring {
	
	public static void main(String[] args) {
		
		String s="abcadfc";
		System.out.println(s);
		
		HashSet<Character> set = new HashSet<Character>();
		boolean found;
		
		for(int i=0;i<=s.length()-1 ;i++){
			
			char c = s.charAt(i);
			System.out.println("char is " + c);
			if(set.contains(c)){
				found=true;
				System.out.println("repeat cha is " + c);
				break;
			}else{
				System.out.println("addings");
				set.add(c);
			}
			
		}
		
		
	}

}
