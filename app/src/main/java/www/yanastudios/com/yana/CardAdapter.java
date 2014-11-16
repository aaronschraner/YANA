public class CardAdapter extends ArrayAdapter<CardInfo>
{
  public CardAdapter(Context context, List<CardInfo> objects)
  {
    super(context,0,objects);
  }
  @Override
  public View getView(int position, View convertView, ViewGroup parent)
  {
    if(convertView == null)
    {
      LayoutInflater inflater=LayoutInflater.from(getContext());
      convertView=inflater.inflate(R.layout.list_item_card, parent, false);
    }
    CardInfo currentCard = getItem(position);
    TextView textView = (TextView) convertView.findViewById(R.id.card_text_view);
    textView.setText(currentCard.getText());
    return convertView;
  }
}
