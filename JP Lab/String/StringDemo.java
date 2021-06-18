class StringDemo
{
	public static void main(String[] args)
	{
		String s1=new String("hello");
		String s2=new String("HELLO");
		System.out.println("String 1: " +s1);
		System.out.println("String 2: " +s2);
		
		String con=s1.concat(s2);
		System.out.println("Concat method: " +con);
		
		int len=s1.length();
		System.out.println("Length of String: " +len);
		
		char ch=s1.charAt(3);
		System.out.println("charAt(3) method: "+ch);
		
		int n=s1.compareTo(s2);
		System.out.println("compareTo method: "+n);
		
		boolean e=s1.equals(s2);
		System.out.println("equals method: "+e);
		System.out.println("IgnoreCase method: "+s1.equalsIgnoreCase(s2));

		boolean fl=s1.startsWith("e");
		System.out.println("S1 startsWith(e) method: " +fl);
		
		boolean ll=s1.endsWith("lo");
		System.out.println("S1 endsWith(lo) method: " +ll);

		int i=s1.indexOf("l");
		int li=s1.lastIndexOf("l");
		System.out.println("indexOf(l) method: "+i);
		System.out.println("lastIndexOf(l) method: "+li);

		String ss=s1.substring(0,3);
		System.out.println("substring method: " +ss);

		System.out.println("S1 toUpperCase method: "+s1.toUpperCase());
		System.out.println("S2 toLowerCase method: "+s2.toLowerCase());

		String s3=new String("    Welcome");
		System.out.println("String 3: " +s3);
		System.out.println("S3 trim method: " +s3.trim());

		
		String a[]=s1.split("");
		System.out.println("S1 split method: ");
			for(String x:a){
				System.out.println(x);
			}

		System.out.println("replace(h) method: " +s1.replace('h','c'));
	}
}