package Creational_Patterns.Builder.Pizza;

public class Pizza {
    private String size;
    private boolean cheese;
    private boolean periperi;
    private boolean mushrooms;
    private boolean onions;
    // Builder
    public  Pizza(PizzaBuilder pizzaBuilder)
    {
        this.size = pizzaBuilder.size;
        this.cheese = pizzaBuilder.cheese;
        this.periperi = pizzaBuilder.periperi;
        this.mushrooms = pizzaBuilder.mushrooms;
        this.onions = pizzaBuilder.onions;
    }

    // getter
    public String getSize() {
        return size;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isPeriperi() {
        return periperi;
    }

    public boolean isMushrooms() {
        return mushrooms;
    }

    public boolean isOnions() {
        return onions;
    }
    public  static class  PizzaBuilder {
        private String size;
        private boolean cheese;
        private boolean periperi;
        private boolean mushrooms;
        private boolean onions;

        public PizzaBuilder (String size)
        {
            this.size = size;

        }
        public  PizzaBuilder addCheese(boolean cheese)
        {
            this.cheese = cheese;
            return this;
        }
        public PizzaBuilder addPeriperi(boolean periperi)
        {
            this.periperi = periperi;
            return  this;

        }
        public PizzaBuilder addMushrooms(boolean mushrooms)
        {
            this.periperi = mushrooms;
            return this;
        }
        public PizzaBuilder addOnins(boolean onions)
        {
            this.onions = onions;
            return this;
        }

        public Pizza build()
        {
            return new Pizza(this);
        }

    }

}
