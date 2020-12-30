package factoryPattern;

public class ConcreteCreatorTwo extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductTwo();
    }
}
