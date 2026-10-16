public class PetFeedApp {

    public static void main(String[] args) {

        PetFeedLog log = new PetFeedLog();

        log.addRecord("12.10", "Мысық", 120, 20);
        log.addRecord("13.10", "Ит", 350, 60);
        log.addRecord("14.10", "Мысық", 150, 30);
        log.addRecord("15.10", "Ит", 400, 75);
        log.addRecord("16.10", "Қоян", 100, 15);

        System.out.println("=== PETFEED ЖУРНАЛЫ ===");

        log.printAll();

        System.out.println("----------------------");

        System.out.println("Жазбалар саны: " + log.getCount());
        System.out.println("Барлық жем: " + log.getTotal() + " г");
        System.out.println("Орташа жем: " + log.getAverage() + " г");

        System.out.println("Белсенді жазбалар: " + log.countMatches());

        System.out.println("Жалпы серуен: " + log.getTotalWalk() + " минут");

    }
}

