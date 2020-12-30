package factoryPattern;

public class ConcreteCreatorOne extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductOne();
    }
}
