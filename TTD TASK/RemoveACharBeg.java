package epamTask.tddJunitDemo;

public class RemoveACharBeg {

	public String remove(String string) {
		
		String result=string;
		if(string.length()>0)
		{
			if(string.charAt(0)=='A')
			{
				if(string.charAt(1)=='A')
				{
					result=string.substring(2,string.length());
				}
				else
				{
					result=string.substring(1,string.length());
				}
			}
			else if(string.charAt(1)=='A')
			{
				result=string.substring(0,1)+string.substring(2,string.length());
			}
		}
		return result;
	}

}
