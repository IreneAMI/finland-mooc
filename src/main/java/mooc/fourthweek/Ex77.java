package mooc.fourthweek;

public class Ex77 {
    public static void main(String[] args) {
        LyyraCard card = new LyyraCard(10);
       /* System.out.println(card);

        card.payGourmet();
        System.out.println(card);

        card.payGourmet();
        System.out.println(card);

        */
        //75.4
        /*System.out.println(card);

        card.loadMoney(15);
        System.out.println(card);

        card.loadMoney(10);
        System.out.println(card);

        card.loadMoney(200);
        System.out.println(card);

         *///75.5
        /*System.out.println("Pekka: " + card);
        card.loadMoney(-15);
        System.out.println("Pekka: " + card);

         */
        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);
        cardPekka.payGourmet();
        cardBrian.payEconomical();
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

        cardPekka.loadMoney(20.0);
        cardBrian.payGourmet();

        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50.0);

        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
    }
}
