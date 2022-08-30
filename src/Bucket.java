import java.util.ArrayList;

public class Bucket {
    private final ArrayList<Fruit> fruits = new ArrayList<>();

    public void putFruit(Fruit fruit) {
        if (this.fruits.size() == 8) {
            System.out.println("Bucket is full");
            return;
        }

        this.fruits.add(fruit);
    }

    public void takeFruit(Fruit fruit) {
        this.fruits.remove(fruit);
    }

    public void showBucket() {
        System.out.println(this.fruits);
    }
}
