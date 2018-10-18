class generic
 {
	public static <E> void printArray(E[] inputArray) 
	{
		for (E element : inputArray)
		System.out.println(element);
		System.out.println();
	}

	public static void main(String[] args) 
	{
		Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
		Double[] doubleArray = { 1.1, 1.2, 1.3, 1.4, 1.5, 1.6,1.7 };
		Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("Array integerArray contains:");
		printArray(integerArray);
		System.out.println("Array doubleArray contains:");
		printArray(doubleArray);
		System.out.println("Array characterArray contains:");
		printArray(characterArray);
	}
}