public class Car {
    final String producer;
    final String model;
    Double millage;

    String color;

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", millage=" + millage +
                ", color='" + color + '\'' +
                '}';
    }
}
