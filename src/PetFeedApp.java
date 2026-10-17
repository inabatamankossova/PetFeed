import java.util.Scanner;

public class PetFeedApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PetFeedLog log = new PetFeedLog();

        log.addRecord("08.10", "Мысық", 120, 20);
        log.addRecord("09.10", "Ит", 350, 60);
        log.addRecord("10.10", "Қоян", 100, 15);
        log.addRecord("11.10", "Мысық", 150, 45);
        log.addRecord("12.10", "Ит", 400, 75);
        log.addRecord("13.10", "Тотықұс", 50, 0);
        log.addRecord("14.10", "Мысық", 180, 30);
        log.addRecord("15.10", "Ит", 380, 90);
        log.addRecord("16.10", "Қоян", 110, 20);
        log.addRecord("17.10", "Мысық", 160, 50);

        boolean running = true;

        while (running) {

            System.out.println("\n===== PETFEED МӘЗІРІ =====");
            System.out.println("1. Жаңа жазба қосу");
            System.out.println("2. Барлық жазбаларды көрсету");
            System.out.println("3. Статистика");
            System.out.println("4. Белсенді жазбалар саны");
            System.out.println("5. Жануар бойынша іздеу");
            System.out.println("6. Жануардың орташа жем мөлшері");
            System.out.println("7. Жалпы серуен уақыты");
            System.out.println("0. Шығу");
            System.out.print("Таңдауыңыз: ");

            String choice = scanner.nextLine();

            switch (choice) {

                case "1":
                    System.out.print("Күні (ДД.ММ): ");
                    String date = scanner.nextLine();

                    System.out.print("Жануардың аты: ");
                    String pet = scanner.nextLine();

                    try {
                        System.out.print("Жем мөлшері (г): ");
                        int food = Integer.parseInt(scanner.nextLine());

                        System.out.print("Серуен уақыты (мин): ");
                        int walk = Integer.parseInt(scanner.nextLine());

                        boolean added = log.addRecord(
                                date, pet, food, walk);

                        if (added) {
                            System.out.println("Жазба қосылды!");
                        } else {
                            System.out.println("Жазба қосылмады!");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Қате! Сан енгізіңіз.");
                    }
                    break;

                case "2":
                    System.out.println("\n=== БАРЛЫҚ ЖАЗБАЛАР ===");
                    log.printAll();
                    break;

                case "3":
                    System.out.println("\n=== СТАТИСТИКА ===");

                    System.out.println(
                            "Жазбалар саны: " + log.getCount());

                    System.out.println(
                            "Барлық жем: " + log.getTotal() + " г");

                    System.out.println(
                            "Орташа жем: " + log.getAverage() + " г");

                    PetFeed max = log.findMax();

                    if (max != null) {
                        System.out.println("Ең көп жем берілген жазба:");
                        max.printInfo();
                    }
                    break;

                case "4":
                    System.out.println(
                            "Белсенді жазбалар саны: "
                                    + log.countMatches());
                    break;

                case "5":
                    System.out.print("Жануардың атын енгізіңіз: ");
                    String searchPet = scanner.nextLine();

                    log.printByCategory(searchPet);
                    break;

                case "6":
                    System.out.print("Жануардың атын енгізіңіз: ");
                    String averagePet = scanner.nextLine();

                    System.out.println(
                            "Орташа жем мөлшері: "
                                    + log.getAverageByPet(averagePet)
                                    + " г");
                    break;

                case "7":
                    System.out.println(
                            "Жалпы серуен уақыты: "
                                    + log.getTotalWalk()
                                    + " минут");
                    break;

                case "0":
                    running = false;
                    System.out.println("Бағдарлама аяқталды.");
                    break;

                default:
                    System.out.println("Қате таңдау!");
            }
        }

        scanner.close();
    }
}


