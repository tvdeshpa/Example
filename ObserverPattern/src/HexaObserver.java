
public class HexaObserver extends  Observer {

	public HexaObserver(Subject subject)
	{
		this.subject=subject;
		this.subject.attach(this);
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Hexa String: "+Integer.toHexString(subject.getState()));
	}
	

}
