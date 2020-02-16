package primitiveDataType;

/**
 * 
 * short is a primitive data type and takes 64 bits(8 byte) of memory
 * Its value range lies between -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807(inclusive)
 * Its minimum value is -9,223,372,036,854,775,808 and maximum value is 9,223,372,036,854,775,807
 * Its default value is 0L 
 *
 */
public class LongPrimitiveDataType {

	public static void main(String[] args) {
		/**
		 * It will accept only max value 9,223,372,036,854,775,807, 
		 * if you will try to put above the mentioned range it will throw error
		 * All literal numbers in java are by default ints,
		 * which has range -2147483648 to 2147483647 inclusive.
		 * Your literals are outside this range, 
		 * so to make this compile you need to indicate they're
		 * long literals (ie suffix with L):
		 * You must use L to say to the compiler that it is a long literal.
		 */
		long longVariable=9223372036854775807L;
		System.out.println("Max acceptable value is "+longVariable);
		longVariable=-9223372036854775808L;
		System.out.println("Min acceptable value is :"+longVariable);
		
	}
}
