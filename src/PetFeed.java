
public class PetFeed {

    private String date;
    private String pet;
    private int foodGrams;
    private int walkMinutes;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        if (date != null && !date.trim().isEmpty()) {
            this.date = date;
        }
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        if (pet != null && !pet.trim().isEmpty()) {
            this.pet = pet;
        }
    }

    public int getFoodGrams() {
        return foodGrams;
    }

    public void setFoodGrams(int foodGrams) {
        if (foodGrams >= 0 && foodGrams <= 2000) {
            this.foodGrams = foodGrams;
        }
    }

    public int getWalkMinutes() {
        return walkMinutes;
    }

    public void setWalkMinutes(int walkMinutes) {
        if (walkMinutes >= 0 && walkMinutes <= 600) {
            this.walkMinutes = walkMinutes;
        }
    }

    public boolean isActive() {
        return walkMinutes >= 45;
    }

    public void printInfo() {
        System.out.println(
                "Күні: " + date +
                        " | Жануар: " + pet +
                        " | Жем: " + foodGrams + " г" +
                        " | Серуен: " + walkMinutes + " мин" +
                        " | Белсенді: " + isActive()
        );
    }
}
