
public class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject) {
	
		this.subject=subject;
		this.subject.attach(this);
		// TODO Auto-generated constructor stub
	}
	public void update()
	{
		System.out.println("Binary String: "+Integer.toBinaryString(subject.getState()));
	}
}
