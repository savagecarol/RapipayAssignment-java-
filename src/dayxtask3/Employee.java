package dayxtask3;

public class Employee implements Addressable 
{
		private String state;
		private String city;
		
		public Employee(String state, String city) {
			super();
			this.state = state;
			this.city = city;
		}
		
		@Override
		public String getState() {
			return state;
		}
		
		public void setState(String state) {
			this.state = state;
		}
		
		@Override
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		
		@Override
		public String fullAddress() {
			return this.state + " "+ this.city;
		}
}
