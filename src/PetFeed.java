public class PetFeed {

    private String date;
    private String pet;
    private int foodGrams;
    private int walkMinutes;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        if (date != null && !date.equals("")) {
            this.date = date;
        } else {
            System.out.println("Қате: күн бос болмауы керек");
        }
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        if (pet != null && !pet.equals("")) {
            this.pet = pet;
        } else {
            System.out.println("Қате: жануардың аты бос болмауы керек");
        }
    }

    public int getFoodGrams() {
        return foodGrams;
    }

    public void setFoodGrams(int grams) {
        if (grams >= 0 && grams <= 2000) {
            foodGrams = grams;
        } else {
            System.out.println("Қате: жем мөлшері 0..2000 аралығында болуы керек");
        }
    }

    public int getWalkMinutes() {
        return walkMinutes;
    }

    public void setWalkMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 600) {
            walkMinutes = minutes;
        } else {
            System.out.println("Қате: серуен уақыты 0..600 аралығында болуы керек");
        }
    }

    public boolean isActive() {
        return walkMinutes >= 30;
    }

    public void printInfo() {
        System.out.println(date + " | " + pet + " | "
                + foodGrams + " г | " + walkMinutes + " мин");
    }
}