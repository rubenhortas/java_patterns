package listenerPattern;

public class Listener implements IListener {
	public Listener() {
		System.out.println("(Listener) I'm the listener");
	}

	@Override
	public void notify(String msg) {
		System.out.println("(Listener) I've a new notification: " + msg);
	}
}
