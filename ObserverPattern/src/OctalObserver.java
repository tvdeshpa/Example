
public class OctalObserver extends Observer {

	public OctalObserver(Subject subject) {
		// TODO Auto-generated constructor stub
		this.subject=subject;
		this.subject.attach(this);
	}
	
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Octal String: "+Integer.toOctalString(subject.getState()));
		
	}

}
