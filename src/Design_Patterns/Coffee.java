package Design_Patterns;

interface Coffee {
    int cost();
}

class SimpleCoffee implements Coffee {
    public int cost() {
        return 50;
    }
}

class MilkDecorator implements Coffee {

    Coffee coffee;

    MilkDecorator(Coffee c) {
        coffee = c;
    }

    public int cost() {
        return coffee.cost() + 20;   // add feature
    }
}

class DecoratorDemo {
    public static void main(String[] args) {
        Coffee c = new MilkDecorator(new SimpleCoffee());
        System.out.println(c.cost());
    }
}