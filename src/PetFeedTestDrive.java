public class PetFeedTestDrive {
    public static void main(String[] args) {

        PetFeed item = new PetFeed();

        item.setFoodGrams(500);
        item.setFoodGrams(2500);

        if (item.getFoodGrams() == 500) {
            System.out.println("ТЕСТ 1: OK");
        } else {
            System.out.println("ТЕСТ 1: ҚАТЕ");
        }
        item.setFoodGrams(500);
        item.setFoodGrams(-10);

        if (item.getFoodGrams() == 500) {
            System.out.println("ТЕСТ 2: OK");
        } else {
            System.out.println("ТЕСТ 2: ҚАТЕ");
        }
    }
}