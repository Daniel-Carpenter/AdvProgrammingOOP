import java.util.LinkedList;
import java.util.Deque;

public class CardDeck {
   public static void main (String[] args) {
      Deque<String> cards = new LinkedList<String>();

      cards.addFirst("3_hearts");
      cards.addLast("6_spades");
      cards.addLast("queen_clubs");
      cards.addFirst("8_hearts");
      cards.addFirst("7_spades");

      System.out.println(cards.peekLast());
      System.out.println(cards.getLast());
      System.out.println(cards.getFirst());
      System.out.println(cards.peekFirst());
  }
}