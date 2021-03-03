public class App5 {
    public static void main(String[] args) {
        Violin violin = new Violin("1658 Baroque violin by Jacob Stainer", "Broad lower back; " +
                "pronounced higher arching of the belly than the back;", "Stainer's production can be" +
                " divided into three distinct periods: the first, including the stay in Italy, " +
                "from the beginning until 1620, the second until 1667 and the third until his death. " +
                "The first and the third periods are considered the best, especially for the quality" +
                " of the instruments produced.");
        violin.Sound();
        violin.Show();
        violin.Desc();
        violin.History();
        System.out.println("--------------------");
        Trombone trombone = new Trombone(" Tenor trombone", " a musical instrument in the brass family.",
                "\"Trombone\" comes from the Italian word tromba (trumpet) plus the suffix -one" +
                        " (big), meaning \"big trumpet\".");
        trombone.Sound();
        trombone.Show();
        trombone.Desc();
        trombone.History();
        System.out.println("--------------------");
        Ukulele ukulele = new Ukulele("Martin 3K Ukulele", "The ukulele is a small guitar-like instrument," +
                " which was introduced to Hawaii by Portuguese immigrants from Madeira.",
                "Developed in the 1880s, the ukulele is based on several small guitar-like instruments of " +
                        "Portuguese origin, the machete,[6] the cavaquinho, the timple, and the rajão," +
                        " introduced to the Hawaiian Islands by Portuguese immigrants from Madeira and Cape Verde.");
        ukulele.Sound();
        ukulele.Show();
        ukulele.Desc();
        ukulele.History();
        System.out.println("--------------------");
        Violoncello violoncello = new Violoncello("A baroque cello strung with gut strings",
                "The cello  or violoncello is a bowed (and occasionally plucked) string instrument of the violin family. ",
                "The violin family, including cello-sized instruments, emerged c. 1500 as a family of instruments " +
                        "distinct from the viola da gamba family. The earliest depictions of the violin family, " +
                        "from northern Italy c. 1530, show three sizes of instruments, roughly corresponding to what " +
                        "we now call violins, violas, and cellos.");
        violoncello.Sound();
        violoncello.Show();
        violoncello.Desc();
        violoncello.History();
        System.out.println("--------------------");
    }
}
