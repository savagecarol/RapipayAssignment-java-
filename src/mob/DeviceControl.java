package mob;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

// action // controller
public class DeviceControl {
	static Scanner sc = new Scanner(System.in);

	public static Device addDevice(String d, String c, String a, String b) {
		Device genDevice = new Device(d, c, a, b);
		return genDevice;
	}

	public static void printAllDevices(ArrayList<Device> devices) {
		for (int i = 0; i < devices.size(); i++) {
			Device device = devices.get(i);
			prints(device);
		}
	}

	public static void searchByModelNumber(ArrayList<Device> devices, String m) {

		for (int i = 0; i < devices.size(); i++) {
			Device device = devices.get(i);
			if (device.getModelNumber().equals(m)) {
				prints(device);
				return;
			}
		}
		System.out.println("Device Not found");
	}

	public static void printDevicesinRange(ArrayList<Device> devices, String start, String end) {

		for (int i = 0; i < devices.size(); i++) {
			Device device = devices.get(i);
			if (Integer.parseInt(device.getCost()) >= Integer.parseInt(start)
					&& Integer.parseInt(device.getCost()) <= Integer.parseInt(end)) {
				prints(device);
			}
		}
	}

	public static void prints(Device d) {
		System.out.println(d.getDeviceName());
		System.out.println(d.getCost());
		System.out.println(d.getAvgRating());
		System.out.println(d.getBrandName());
		System.out.println(d.getModelNumber());
	}

	public static void printAllGen(Collection<?> arr) {
		for (Object a : arr) {
			prints((Device) a);
		}
	}
}
