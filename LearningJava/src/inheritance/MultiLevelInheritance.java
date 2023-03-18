package inheritance;


public class MultiLevelInheritance {
    public void eat() {
        // Code to make animal eat
    }
}

public class Test extends MultiLevelInheritance {
    public void run() {
        // Code to make mammal run
    }
}

public class Dog extends Mammal {
    public void bark() {
        // Code to make dog bark
    }
}