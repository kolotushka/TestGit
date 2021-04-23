package lesson6.homework6;

public class Dog extends Animal {

    private static int dogCount = 0;


    public Dog(String name) {
        super(name);
        runLimit = (int) (20 + Math.random() * 200);
        swimLimit = (int) (5 + Math.random() * 50);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println("Пес " + getName() + " пробежал " + distance + "м.");
        } else {
            System.out.println("Пес " + getName() + " не может пробежать столько!");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= runLimit) {
            System.out.println("Пес " + getName() + " проплыл " + distance + "м.");
        } else {
            System.out.println("Пес " + getName() + " не может плыть так долго!");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}
