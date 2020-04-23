public class WoessListMain 
{
	public static void main(String[] args) 
	{
		List woess = new List(5);
		woess.addElement(4);
		woess.addElement(3);
		woess.addElement(2);
		woess.deleteElement(2);
		woess.writeList();
	}

}
