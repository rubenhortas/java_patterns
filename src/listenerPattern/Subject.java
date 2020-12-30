package listenerPattern;

public class Subject {
	@SuppressWarnings("FieldCanBeLocal")
	private Listener listener = null;
	
	public static void main(String[] args) {
		Subject subject = new Subject();
		subject.doNotification();
	}
	
	public Subject() {
		System.out.println("(Subject) I'm the subject");
	}
	
	private void doNotification() {
		this.listener = new Listener();
		System.out.println("(Subject) I'll notify my listener");
		listener.notify("Very important message!");
	}
}
