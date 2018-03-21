class Example {
    public static void main(String[] args) {
        Bottle sam;
        sam = new Bottle();
        System.out.println(Bottle.speech);
    }
}

class Bottle {
    public static String speech = "I am groot";
    String color;
    double capacity;

    Bottle() {

    }

    public double getCapacity() {
        return this.capacity;
    }

    public void setCapacity(double value) {
        this.capacity = value;
    }
}