package primitiveDataType;

/**
 * 
 * byte is a primitive data type and takes 8 bits(1 byte) of memory
 * Its value-range lies between -128 to 127 (inclusive)
 * Its minimum value is -128 and maximum value is 127
 * Its default value is 0 
 *
 */
public class BytePrimitiveDataType {

	public static void main(String[] args) {
		byte byteVariable=127;
		System.out.println(byteVariable);
		byteVariable='p';
		System.out.println((char)byteVariable);
	}
}
