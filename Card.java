public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }
    public Rank getRank(){
        return this.rank;
    }
    public Suit getSuit(){
        return this.suit;
    }
    public int getValue(){
        return this.rank.value;
    }

    public String toString(){
        return this.rank.name+ "   " + this.suit.suit;
    }
    
}
