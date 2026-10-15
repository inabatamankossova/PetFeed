public class PetFeedLog {

    private PetFeed[] items = new PetFeed[30];
    private int count = 0;

    public boolean addRecord(String date, String pet,
                             int foodGrams, int walkMinutes) {

        if (count >= items.length) {
            return false;
        }

        if (date == null || date.trim().isEmpty()
                || pet == null || pet.trim().isEmpty()
                || foodGrams < 0 || foodGrams > 2000
                || walkMinutes < 0 || walkMinutes > 600) {
            return false;
        }

        PetFeed record = new PetFeed();

        record.setDate(date);
        record.setPet(pet);
        record.setFoodGrams(foodGrams);
        record.setWalkMinutes(walkMinutes);

        items[count] = record;
        count++;

        return true;
    }

    public int getCount() {
        return count;
    }

    public int getTotal() {
        int total = 0;
        int i = 0;

        while (i < count) {
            total += items[i].getFoodGrams();
            i++;
        }

        return total;
    }

    public int getAverage() {
        if (count == 0) {
            return 0;
        }

        return getTotal() / count;
    }

    public PetFeed findMax() {
        if (count == 0) {
            return null;
        }

        PetFeed max = items[0];
        int i = 1;

        while (i < count) {
            if (items[i].getFoodGrams() > max.getFoodGrams()) {
                max = items[i];
            }
            i++;
        }

        return max;
    }

    public int countMatches() {
        int matches = 0;
        int i = 0;

        while (i < count) {
            if (items[i].isActive()) {
                matches++;
            }
            i++;
        }

        return matches;
    }

    public void printAll() {
        int i = 0;

        while (i < count) {
            System.out.print((i + 1) + ". ");
            items[i].printInfo();
            i++;
        }
    }

    public void printByCategory(String value) {
        int i = 0;
        boolean found = false;

        while (i < count) {
            if (items[i].getPet().equals(value)) {
                items[i].printInfo();
                found = true;
            }
            i++;
        }

        if (!found) {
            System.out.println("Мұндай жазба табылмады");
        }
    }

    public int getTotalWalk() {
        int total = 0;
        int i = 0;

        while (i < count) {
            total += items[i].getWalkMinutes();
            i++;
        }

        return total;
    }

    public double getAverageByPet(String pet) {
        int total = 0;
        int petCount = 0;
        int i = 0;

        while (i < count) {
            if (items[i].getPet().equals(pet)) {
                total += items[i].getFoodGrams();
                petCount++;
            }
            i++;
        }

        if (petCount == 0) {
            return 0;
        }

        return (double) total / petCount;
    }
}
