package mob;

import java.util.*;

public class DeviceUi {

	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {

		ArrayList<Device> devices = new ArrayList<Device>();
		HashSet<Device> hashDev = new HashSet<Device>();
		LinkedHashSet<Device> linkHashDev = new LinkedHashSet<Device>();

		while (true) {
			System.out.println("********** HR *************");
			System.out.println("Add a new Device : press 1");
			System.out.println("search device based on model number : press 2 ");
			System.out.println("print all devices : press 3");
			System.out.println("print devices within price range : press 4");
			System.out.println("exit : press 5");
			System.out.println("iterate by the help of collection  and print hashset : press 6");
			System.out.println("iterate by the help of collection  and print link hash set : press 6");
			System.out.println("\nChoose the following options : ");

			int option = Integer.parseInt(sc.nextLine());

			switch (option) {
			case 1:

				String d = sc.nextLine();
				String c = sc.nextLine();
				String a = sc.nextLine();
				String b = sc.nextLine();
				Device dev = DeviceControl.addDevice(d, c, a, b);
				devices.add(dev);
				hashDev.add(dev);
				linkHashDev.add(dev);
				break; // done

			case 2:
				String m = sc.nextLine();
				DeviceControl.searchByModelNumber(devices, m);
				break; // done

			case 3:
				DeviceControl.printAllDevices(devices);
				break; // done

			case 4:
				String start = sc.nextLine();
				String end = sc.nextLine();
				DeviceControl.printDevicesinRange(devices, start, end);
				break;

			case 5:
				System.exit(0);

			case 6:
				DeviceControl.printAllGen(hashDev);
				break;

			case 7:
				DeviceControl.printAllGen(linkHashDev);
				break;

			default:
				System.exit(0);

			}

		}
	}

}
