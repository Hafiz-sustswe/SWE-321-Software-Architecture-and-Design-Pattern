
public class Burger {
    private final String size;
    private final int cheese;
    private final int pepperoni;
    private final int mushrooms;
    private final int onions;

    private Burger(BurgerBuilder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.mushrooms = builder.mushrooms;
        this.onions = builder.onions;
    }

    // getters for all fields


    public String getSize() {
        return size ;
    }

    public int Cheese() {
        return cheese;
    }

    public int Pepperoni() {
        return pepperoni;
    }

    public int Mushrooms() {
        return mushrooms;
    }

    public int Onions() {
        return onions;
    }

    public static class BurgerBuilder {
        private final String size;
        private int cheese = 0;
        private int  pepperoni = 0;
        private int mushrooms = 0;
        private int onions = 0;

        public BurgerBuilder(String size) {
            this.size = size;
        }

        public BurgerBuilder cheese(int cheese) {
            this.cheese += cheese; // Counting here no matter how many times the client calls this method 
            return this;
        }

        public BurgerBuilder pepperoni(int pepperoni) {
            this.pepperoni += pepperoni; // same here
            return this;
        }

        public BurgerBuilder mushrooms(int mushrooms) {
            this.mushrooms += mushrooms;
            return this;
        }

        public BurgerBuilder onions(int onions) {
            this.onions += onions;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}