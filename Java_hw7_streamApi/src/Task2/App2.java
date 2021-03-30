package Task2;

import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<Projector> projectors = new ArrayList<>();
        projectors.add(new Projector("Mini Projector UFTVP1 Yellow (VP1)", 2999L, 2019, "UFT"));
        projectors.add(new Projector("PANOPLUS SMILE L", 2295L, 2020, "XPRO"));
        projectors.add(new Projector("FullHD XPRO PANOPLUS MMX с WiFi", 9320L, 2020, "XPRO"));
        projectors.add(new Projector("HD LED Проектор Everycom M7 (android version)", 3749L, 2020, "Everycom"));
        projectors.add(new Projector("Led Projector LEJIADA YG400", 2178L, 2021, "LEJIADA "));

        System.out.println("---------- *** Show all projectors *** ----------");
        projectors.stream().forEach(s -> System.out.println(s));
        System.out.println();
        System.out.println("---------- *** Show all with manufacture: \"XPRO\" *** ----------");
        projectors.stream().filter(a -> a.getManufacturer().equals("XPRO")).forEach(System.out::println);
        System.out.println();
        System.out.println("---------- *** Show all with current year *** ----------");
        projectors.stream().filter(a -> a.getYear() == (Year.now().getValue())).forEach(System.out::println);
        System.out.println();
        System.out.println("---------- *** Show all more expensive then 3000 *** ----------");
        projectors.stream().filter(a -> a.getPrice() > 3000).forEach(System.out::println);
        System.out.println();
        System.out.println("---------- *** All sorted by price ASC *** ----------");
        projectors.stream().sorted(Comparator.comparing(Projector::getPrice)).forEach(System.out::println);
        System.out.println();
        System.out.println("---------- *** All sorted by price DESC *** ----------");
        projectors.stream().sorted(Comparator.comparing(Projector::getPrice).reversed()).forEach(System.out::println);
        System.out.println();
        System.out.println("---------- *** All sorted by year ASC *** ----------");
        projectors.stream().sorted(Comparator.comparing(Projector::getYear)).forEach(System.out::println);
        System.out.println();
        System.out.println("---------- *** All sorted by year DESC *** ----------");
        projectors.stream().sorted(Comparator.comparing(Projector::getYear).reversed()).forEach(System.out::println);
    }
}
