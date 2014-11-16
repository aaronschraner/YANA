package www.yanastudios.com.yana

//definitely needs some more importing.
import android.widget.ListView;
import android.app.Activity;
import android.os.Bundle;

public class HomeActivity extends Activity
{
  //extends Activity because it is an Activity
  
  ListView cardListView; 
  //listView for cards
  
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
    //boilerplate stuff
    
    cardListView = (ListView) findViewById(R.id.listview); 
    //get a reference to the card listview
    
  }
}
