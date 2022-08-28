import java.util.InputMismatchException;
import java.util.Scanner;

public class BirthM{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Person a = new Person();

        System.out.println("""
                Hi, there!

                I am Miss-fairy QQ !  Nice to meet you!     (press enter to continue.)""");

        System.out.println("May I have your name please ?");

        a.name = sc.next();
        a.sayName();

        boolean IsaNumber = false;
        int b = 0;
        while(!IsaNumber) {
            try {
                System.out.println("(enter a number from 1 to 12)"+"\n");
                b=sc.nextInt();
                IsaNumber = true;

                while(b < 1 || b > 12) {
                    try {
                        throw new InvalidNumberException();
                    }
                    catch(InvalidNumberException e){
                        System.out.println(e.getMessage());
                        b=sc.nextInt();
                    }
                }
            }
            catch(InputMismatchException e) {
                String str = sc.nextLine();
                System.out.println("It should be a number, not" + "'"+ str  + "'"+" , try again!" );
                b=sc.nextInt();
            }
        }

        System.out.print("Okay...let me check for you... " + "" + "" + "");

        switch (b) {
            case 1 -> System.out.println("""
                    Your birth month is January

                    Your birth flower is: Carnation Snowdrop

                    Means: Admiration, Love, Hope, Rebirth.""");
            case 2 -> System.out.println("""
                    Your birth month is February

                    Your birth flower is: Violet Primrose

                    Means: Admiration, Modesty, Faithfulness, Young Love.""");
            case 3 -> System.out.println("""
                    Your birth month is March

                    Your birth flower is: Daffodil

                    Means: New Beginnings, Prosperity.""");
            case 4 -> System.out.println("""
                    Your birth month is April

                    Your birth flower is: Daisy Sweet pea

                    Means: Purity, Innocence, Blissful Pleasure.""");
            case 5 -> System.out.println("""
                    Your birth month is May

                    Your birth flower is: Lily of the valley Hawthorn

                    Means: Sweetness, Motherhood, Hope.""");
            case 6 -> System.out.println("""
                    Your birth month is June

                    Your birth flower is: Rose Honeysuckle

                    Means: Romance, Happiness.""");
            case 7 -> System.out.println("""
                    Your birth month is July

                    Your birth flower is: Larkspur Water lily

                    Means: Positivity, Dignity, Purity.""");
            case 8 -> System.out.println("""
                    Your birth month is August

                    Your birth flower is: Gladiolus Poppy

                    Means: Strength of Character, Imagination.""");
            case 9 -> System.out.println("""
                    Your birth month is September

                    Your birth flower is: Aster Morning glory

                    Means: Love, Affection, Unrequited Love.""");
            case 10 -> System.out.println("""
                    Your birth month is October

                    Your birth flower is: Marigold Cosmos

                    Means: Creativity, Passion, Peace, Tranquility.""");
            case 11 -> System.out.println("""
                    Your birth month is November

                    Your birth flower is: Chrysanthemum

                    Means: Loyalty, Honesty.""");
            case 12 -> {
                System.out.println("""
                    Your birth month is December

                    Your birth flower is: Narcissus Holly

                    Means: Hope, Wealth, Protection, Defense.""");
                sc.close();
            }
        }
    }
}