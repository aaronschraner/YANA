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
  
  List<CardInfo> cards = new ArrayList<CardInfo>();
  //list of cards to display
  
  ArrayAdapter cardAdapter;
  //adapter for cards
  public void initializeCards()
  {
    cards.add(new CardInfo("Test 1"));
    cards.add(new CardInfo("Test 2"));
    cards.add(new CardInfo("Test 3"));
    //plug in some test data for our cards
  }
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
    //boilerplate stuff
    initializeCards();
    cardListView = (ListView) findViewById(R.id.listview); 
    //get a reference to the card listview
    
    cardAdapter = new CardAdapter(this,cards);
    //actually initialize the card adapter
    
    cardListView.setAdapter(cardAdapter);
    //attach the cardAdapter to the cardListView 
    
  }
}
