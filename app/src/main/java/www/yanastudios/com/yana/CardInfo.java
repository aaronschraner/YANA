package www.yanastudios.com.yana;
//CardInfo class
//Holds all the information that will appear on a card
public class CardInfo
{
  String myText; //text to put in the TextView 
  
  public CardInfo(String myText) //Constructor for card
  {
    this.myText=myText; //set the textView text for this equal to the argument passed (myText)
  }
  //the rest is just accessor methods.
  public String getText()
  {
    return myText;
  }
  public void setText(String myText)
  {
      this.myText=myText;
  }
}
