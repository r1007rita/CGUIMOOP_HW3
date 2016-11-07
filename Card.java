public enum Suit{Club,Diamoond,Heart,Spade};
public class Card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suit thisCardSuit = Suit.Club;
	}
	
		private int thisCardSuit; 
		private int rank; 
		public Card(int suit,int rank){
			suit = thisCardSuit;
			rank=r;
					
				}
			
			
		
		public void printCard(){
			System.out.println(thisCardSuit+","+rank);
			}
		
		
		public int getSuit(){
			return suit;
		}
		public int getRank(){
			return thisCardSuit;
		}
}
