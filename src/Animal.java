public class Animal {

    private static final Double DEFAULT_DOG_WEIGHT = 12.0;
    private static final Double DEFAULT_ELEPHANT_WEIGHT = 1500.0;
    private static final Double DEFAULT_CAT_WEIGHT = 3.2;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    String specie;
    String name;
    Boolean isAlive;
    Double weight;

    public Animal(String specie, String name) {
        this.specie = specie;
        this.name = name;
        this.isAlive = true;
        switch (this.specie) {
            case "dog" -> this.weight = DEFAULT_DOG_WEIGHT;
            case "elephant" -> this.weight = DEFAULT_ELEPHANT_WEIGHT;
            case "cat" -> this.weight = DEFAULT_CAT_WEIGHT;
            default -> this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }
    public void feed(){
        if(this.isAlive){
            this.weight += 0.5;
            System.out.println("Dzieki za zarcie");
        }else{
            System.out.println("Czy wszystko dobrze z glowa?");
        }
    }
    public void takeForAWalk(){
        if(this.isAlive) {
            this.weight -= 0.5;
            System.out.println("dzieki za spacer");
            if(this.weight <= 0){
                this.isAlive = false;
            }
        }else{
            System.out.println("dzwonie na policje");
        }
    }
}
