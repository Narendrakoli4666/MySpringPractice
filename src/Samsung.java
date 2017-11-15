
public class Samsung implements Mobile {
	
	OperatingSystem os;
	
	public Samsung(OperatingSystem os)
	{
		this.os = os;
	}
	@Override
	public void getAndroidVersion()
	{
		System.out.println("Operating System : "+os.osname+" Version :"+os.version);
	}

}
