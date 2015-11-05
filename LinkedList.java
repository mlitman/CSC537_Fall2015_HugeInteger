
public class LinkedList 
{
	private Node head;
	private int count;
	
	public LinkedList()
	{
		head = null;
		count = 0;
	}
	
	
	public int getCount() {
		return count;
	}


	public int getAtIndex(int index)
	{
		Node currNode = head;
		for(int i = 0; i < index; i++)
		{
			currNode = currNode.getNextNode();
		}
		return currNode.getPayload();
	}
	
	public void addFront(int value)
	{
		Node n = new Node(value);
		count++;
		if(head == null)
		{
			head = n;
		}
		else
		{
			n.setNextNode(head);
			head = n;
		}
	}
	
	public void addEnd(int value)
	{
		Node n = new Node(value);
		count++;
		if(head == null)
		{
			head = n;
		}
		else
		{
			Node currNode = head;
			while(currNode.getNextNode() != null)
			{
				currNode = currNode.getNextNode();
			}
			currNode.setNextNode(n);
		}
	}
	
	public void display()
	{
		if(head == null)
		{
			System.out.println("Empty List");
		}
		else
		{
			this.head.display();
		}
		System.out.println("");
	}
}
