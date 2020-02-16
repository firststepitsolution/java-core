package primitiveDataType;

/**
 * 
 * short is a primitive data type and takes 32 bits(4 byte) of memory
 * Its value range lies between - 2,147,483,648  to 2,147,483,647  (inclusive)
 * Its minimum value is -32,768 and maximum value is 32,767
 * Its default value is 0
 *
 */
public class IntPrimitiveDataType {

	public static void main(String[] args) {
		/**
		 * It will accept only max value 2,147,483,647, 
		 * if you will try to put above the mentioned range it will throw error
		 */
		int intVariable=2147483647;
		System.out.println("Max acceptable value is "+intVariable);
		intVariable=-2147483648;
		System.out.println("Min acceptable value is :"+intVariable);
		
	}
}
