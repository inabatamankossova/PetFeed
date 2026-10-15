public class PetFeedTestDrive {

    public static void main(String[] args) {

        PetFeed pet = new PetFeed();

        pet.setFoodGrams(2500);

        if (pet.getFoodGrams() == 0) {
            System.out.println("ТЕСТ 1: OK");
        } else {
            System.out.println("ТЕСТ 1: ҚАТЕ");
        }

        pet.setFoodGrams(-10);

        if (pet.getFoodGrams() == 0) {
            System.out.println("ТЕСТ 2: OK");
        } else {
            System.out.println("ТЕСТ 2: ҚАТЕ");
        }

        PetFeedLog log = new PetFeedLog();

        log.addRecord("14.10", "Мысық", 100, 20);
        log.addRecord("14.10", "Ит", 200, 40);
        log.addRecord("15.10", "Мысық", 150, 50);

        if (log.getTotal() == 450) {
            System.out.println("ТЕСТ 3: OK");
        } else {
            System.out.println("ТЕСТ 3: ҚАТЕ");
        }

        PetFeed max = log.findMax();

        if (max != null && max.getFoodGrams() == 200) {
            System.out.println("ТЕСТ 4: OK");
        } else {
            System.out.println("ТЕСТ 4: ҚАТЕ");
        }

        if (log.countMatches() == 1) {
            System.out.println("ТЕСТ 5: OK");
        } else {
            System.out.println("ТЕСТ 5: ҚАТЕ");
        }

        System.out.println("--------------------");

        System.out.println("Барлық жазба: " + log.getCount());
        System.out.println("Орташа жем: " + log.getAverage());
        System.out.println("Барлық серуен: " + log.getTotalWalk());

        System.out.println(
                "Мысықтың орташа жемі: "
                        + log.getAverageByPet("Мысық")
        );

        System.out.println("--------------------");

        log.printAll();
    }
}
