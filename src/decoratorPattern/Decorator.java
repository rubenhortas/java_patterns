package decoratorPattern;

public class Decorator extends Basic {
	protected final Basic basic;

	public Decorator(Basic basic) {
		this.basic = basic;
	}

	@SuppressWarnings("unused")
	public void set(String val) {
		basic.set(val);
	}

	@SuppressWarnings("unused")
	public String get() {
		return basic.get();
	}
}
