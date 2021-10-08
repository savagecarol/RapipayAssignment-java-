package dayxtask3;

public interface Addressable {

	public String getState();
	public String getCity();
	default String fullAddress(){return null;}

}
