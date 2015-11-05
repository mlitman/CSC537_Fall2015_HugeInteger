
public class Driver 
{
	public static void main(String[] args)
	{
		HugeInteger hi1 = new HugeInteger("599");
		HugeInteger hi2 = new HugeInteger("603");
		hi1.display();
		hi2.display();
		hi1.add(hi2).display();;
	}
}
