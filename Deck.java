import java.util.ArrayList;

public class Deck {

	
		private ArrayList<Card> cards;
		
		public Deck(int nDeck){
			cards=new ArrayList<Card>();
			for(int k = 1;k <=nDeck;k++){
			for(int x = 1;x <= 4;x++){
				for(int y = 1;y <= 13;y++){	
					Card card =new Card(x,y);
					cards.add(card);
					}
				}
			}
		}
		
		public void printDeck(){
			//Hint: print all items in ArrayList<Card> cards, 
			//please implement and reuse printCard method in Card class
			  for(Card xx:cards){
					
					xx.printCard();
		}
		}
		public ArrayList<Card> getAllCards(){
			return cards;
		}
	}

