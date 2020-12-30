package factoryPattern;

public class Example {
    public static void main(String[] args) {
        Creator creatorOne;
        Creator creatorTwo;

        creatorOne = new ConcreteCreatorOne();
        Product productOne = creatorOne.factoryMethod();
        productOne.operation();

        creatorTwo = new ConcreteCreatorTwo();
        Product productTwo = creatorTwo.factoryMethod();
        productTwo.operation();
    }
}
