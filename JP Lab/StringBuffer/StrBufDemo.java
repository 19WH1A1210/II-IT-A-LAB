class StrBufDemo
{
	public static void main(String[] args)
	{
		StringBuffer name=new StringBuffer("welcome");
		System.out.println("Name: " +name);		

		System.out.println("Length: " +name.length());
		System.out.println("Capacity: " +name.capacity());
		
		System.out.println("Insert: " +name.insert(3, "age"));
		System.out.println("Delete: " +name.delete(3,6));
		System.out.println("Append: " +name.append(" to java"));
		System.out.println("DeleteCharAt: " +name.deleteCharAt(2));
		System.out.println("Replace: " +name.replace(0,2,"hi"));
		System.out.println("CharAt(3): " +name.charAt(3));
		System.out.println("IndexOf(a): " +name.indexOf("a"));
		System.out.println("LastIndexOf(a): : " +name.lastIndexOf("a"));
		System.out.println("SubString: " +name.substring(4,7));
		System.out.println("Reverse: " +name.reverse());

	}
}