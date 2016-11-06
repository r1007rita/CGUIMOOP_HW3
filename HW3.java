import java.util.ArrayList; 
import java.util.Random;
 import java.util.HashMap; 
 import java.util.Scanner; 
 public class HW3 { 
 	public static void main(String[] args) { 
 		Scanner sc = new Scanner(System.in); //¿é¤J
 		System.out.println("input N(deck of cards):"); 
 		Random randomNumbers = new Random();
 		String testn= sc.nextLine();  
 		int nDeck=1; 
 		Deck deck=new Deck(nDeck); 
 		//TODO: please check your output, make sure that you print newCard and newCard2 on your screen 
 		Card newCard= deck.getOneCard(); 
 		newCard.printCard(); 
 		Card newCard2=deck.getOneCard(); 
 		newCard2.printCard(); 
 		deck.shuffle(); 
 		if(isAllCardsCorrect(deck.getAllCards(),nDeck)){ 
 			if(!isShuffleWorking(deck,newCard,newCard2)){ 
 				System.out.println("All Card: Well done! But shufller is not working"); 
 			}else{ 
 				System.out.println("Well done!"); 
 			} 
 			 
 		}else{ 
 			System.out.println("All Card: Error, please check your sourse code"); 
 		} 
 
 
 	} 
 	/* 
 	 *  	 * This method is used for checking your result, not a part of your HW3 
 	 */
 	class Deck{
 		public static final int nUsed = 0;
		public ArrayList<Card> cards;
 		
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

		public ArrayList<Card> getAllCards() {
			// TODO Auto-generated method stub
			return null;
		}

		public Card getOneCard() {
			// TODO Auto-generated method stub
			return null;
		}
 	}
 	public static boolean isShuffleWorking(Deck deck,Card newCard,Card newCard2){ 
 		deck.shuffle(); 
 		boolean isCorrect=true; 
 		if(newCard.getSuit().equals(newCard2.getSuit())&& 
 				newCard.getRank()==newCard2.getRank()){
 			        isCorrect=false; 	
 					return isCorrect; 
 		} 
 		for(int i=0;i<53;i++){ 
 			deck.getOneCard(); 
 		
 		} 
 		if(deck.nUsed!=1){ 
 			isCorrect=false; 
 		} 
 		return isCorrect; 
 	} 
 	 
 	public static boolean isAllCardsCorrect(ArrayList<Card> allCards,int nDeck){ 
 		//check the output 
 		ArrayList<Card> cards = new ArrayList<Card>();
 		cards.add(new Card(1,1));
 		boolean isCorrect=true;; 
 		HashMap <String,Integer> checkHash=new HashMap<String,Integer>(); 
 		for(Card card:allCards){ 
 			int suit= card.getSuit(); 
 			int rank = card.getRank(); 
 			if(rank>13||rank<1){ 
 				isCorrect=false; 
 				break; 
 			} 
 			if(checkHash.containsKey(suit+","+rank)){ 
 				checkHash.put(suit+","+rank,  
 						checkHash.get(suit+","+rank)+1); 
 			}else{ 
 				checkHash.put(suit+","+rank, 1); 
 			} 
 
 
		} 
 		if(checkHash.keySet().size()==52){ 
			for(int value:checkHash.values()){ 
 				if(value!=nDeck){ 
 					isCorrect=false; 
 					break; 
 				} 
 			} 
 		}else{ 
 			isCorrect=false; 
 		} 
 		return isCorrect; 
 	}
			  
 	
 } 
