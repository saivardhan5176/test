package customcollection;

public class MyList {
	public static void main(String Args[])
	{
		CustomCollectionList<String> c=new CustomCollectionList<String>();
		c.add("C");
		c.add("C++");
		c.add("Java");
		c.add("Python");
		c.add("JavaScript");
		c.add("php");
		c.add("C#");
		c.add("sql");
		c.add("Java");
		c.add("perl");
		c.add("ruby");
		c.add("matlab");
		System.out.println(c.size());
		System.out.println(c.get(5));
		System.out.println(c);
		c.remove(2);
		System.out.println(c.size());
		System.out.println(c.get(5));
		System.out.println(c);
	}
}

