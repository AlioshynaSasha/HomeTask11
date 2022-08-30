public class Main {
    public static void main(String[] args) {
        Bucket bucket = new Bucket();
        Fruit orange = new Orange();

        bucket.putFruit(new Apple());
        bucket.putFruit(orange);
        bucket.putFruit(new Orange());
        bucket.putFruit(new Apple());
        bucket.putFruit(new Banana());
        bucket.putFruit(new Apple());
        bucket.putFruit(new Banana());
        bucket.putFruit(new Apple());
        bucket.putFruit(new Banana());
        bucket.showBucket();
        bucket.takeFruit(orange);
        bucket.showBucket();
    }
}
