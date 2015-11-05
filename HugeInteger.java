
public class HugeInteger 
{
	private LinkedList theNumber = new LinkedList();
	
	public HugeInteger(String s)
	{
		for(int i = 0; i < s.length(); i++)
		{
			this.theNumber.addEnd(Integer.parseInt("" + s.charAt(i)));
		}
	}

	public int size()
	{
		return this.theNumber.getCount();
	}
	
	public int getDigit(int index)
	{
		return this.theNumber.getAtIndex(index);
	}
	
	private void appendToFront(int digit)
	{
		this.theNumber.addFront(digit);
	}
	
	public HugeInteger add(HugeInteger hi)
	{
		HugeInteger answer = new HugeInteger("");
		HugeInteger bigNum = hi;
		HugeInteger smallNum = this;
		if(bigNum.size() < smallNum.size())
		{
			bigNum = this;
			smallNum = hi;
		}
		
		int num1;
		int num2;
		int carry = 0;
		int sum;
		int bigPos = bigNum.size()-1;
		int smallPos = smallNum.size()-1;
		
		for(int i = 0; i < bigNum.size(); i++)
		{
			num1 = bigNum.getDigit(bigPos) + carry;
			if(smallPos >= 0)
			{
				num2 = smallNum.getDigit(smallPos);
				sum = num1 + num2;
			}
			else
			{
				sum = num1;
			}
			
			bigPos--;
			smallPos--;
			
			if(sum >= 10)
			{
				carry = 1;
				sum -= 10;
			}
			else
			{
				carry = 0;
			}
			answer.appendToFront(sum);
		}
		if(carry == 1)
		{
			answer.appendToFront(carry);
		}
		return answer;
	}
	
	public void display()
	{
		this.theNumber.display();
	}
}
