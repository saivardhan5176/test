package maven.Iterator;

public class CollectionNames implements Container
{
	public String name[]={"Akanksha", "Bhagyesh","Koushik","Pragathi","Diya"};     
	    public Iterator getIterator()
	    {  
	        return new CollectionofNamesIterate() ;  
	    }  
	    private class CollectionofNamesIterate implements Iterator
	    {  
	        int i;   
	        public boolean hasNext()
	        {  
	            if (i<name.length)
	            {  
	                return true;  
	            }  
	            return false;  
	        } 
	        public Object next() 
	        {  
	            if(this.hasNext())
	            {  
	                return name[i++];  
	            }  
	            return null;      
	        }  
	    }  
	}  

