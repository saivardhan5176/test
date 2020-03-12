package maven.Command;
public class App 
{
    public static void main( String[] args )
    {
    	 Document doc = new Document();  
         
         ActionListener clickOpen = new ActionOpen(doc);  
         ActionListener clickSave = new ActionSave(doc);  
           
         MenuOptions menu = new MenuOptions(clickOpen,clickSave);  
           
         menu.clickOpen();  
         menu.clickSave(); 
    }
}
