public class Main {
    public static void main(String args[]){
        System.out.println("BlackJack Simulator");
        Game blackjack = new Game();
        System.out.println(Suit.CLUB);
        System.out.println(Rank.ACE.name + Rank.ACE.value);

        Card c = new Card(Suit.SPADE,Rank.ACE);
        System.out.println(c.toString());
        
    }
    
}
