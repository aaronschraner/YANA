package www.yanastudios.com.yana;
//Adapter to go from CardInfo (with card data) to Card View (with same data)
public class CardAdapter extends ArrayAdapter<CardInfo>
{
  public CardAdapter(Context context, List<CardInfo> objects)
  {
    super(context,0,objects); //???
  }
  
  @Override
  public View getView(int position, View convertView, ViewGroup parent) //used to populate card views
  {
    if(convertView == null) //if card view has not been initialized
    {
      LayoutInflater inflater=LayoutInflater.from(getContext());
      convertView=inflater.inflate(R.layout.list_item_card, parent, false);
      //initialize it.
    }
    
    CardInfo currentCard = getItem(position); //Get a CardInfo object that corresponds to this view's card
    TextView textView = (TextView) convertView.findViewById(R.id.card_text_view); //get a reference to the card text view
    textView.setText(currentCard.getText()); //set the card text view to that myText variable from CardInfo
    return convertView; //return the adapted thingy
  }
  
}
