package array;

public class ArrayList {

	public static void main(String[] args) {
		System.out.println("test");
		
		int intList[] = new int[5];
		for(int i=0;i<=4;i++) {
			intList[i]=i;
		}
		try {
			for(int i=0;i<=6;i++) {
				System.out.println(intList[i]);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
