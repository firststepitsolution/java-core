package primitiveDataType;

/**
 * 
 * short is a primitive data type and takes 16 bits(2 byte) of memory
 * Its value-range lies between -32,768 to 32,767 (inclusive).
 * Its minimum value is -32,768 and maximum value is 32,767. Its default value is 0. 
 *
 */
public class ShortPrimitiveDataType {

	public static void main(String[] args) {
		//It will accept only max value 32767
		short shortVariable=32767;
		System.out.println(shortVariable);
		shortVariable=-32768;
		System.out.println(shortVariable);
		
	}
}
