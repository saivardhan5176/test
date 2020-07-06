package customcollection;
public class CustomCollectionList<E> {
	 private Object[] objArr=new Object[10];
	 private int elementcount=0;
	 public CustomCollectionList()
	 {
		 objArr=new Object[10];
	 }
	 public String toString()
	 {
		 StringBuilder s=new StringBuilder();
		 s.append("[");
		 for(int i=0;i<size();i++)
		 {
			s.append(objArr[i].toString());
			if(i<size()-1)
			{
				s.append(",");
			}
		 }
		 s.append(']');
		 return s.toString();
	 }
	 public void add(Object obj)
	 {
		 if(elementcount==objArr.length)
		 {
			 increaseCapacity();
		 }
		 objArr[elementcount]=obj;
		 elementcount++;
	 }
	public void increaseCapacity() {
		int newCapacity=objArr.length*2;
		Object[] nextArray=new Object[newCapacity];
		for(int i=0;i<objArr.length;i++)
		{
			nextArray[i]=objArr[i];
		}
		objArr=nextArray;
	}
	public Object get(int index)
	{
		if(index<0 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		return objArr[index];
	}
	public int size()
	{
		return elementcount;
	}
	public void remove(int index)
	{
		if(index<0 || index>=size())
		{
			throw new ArrayIndexOutOfBoundsException(" "+index);
		}
		while(index<size()-1)
		{
			objArr[index]=objArr[index+1];
			index++;
		}
		objArr[index]=null;
		elementcount--;
	}
	
}
