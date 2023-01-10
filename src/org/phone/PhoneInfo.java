package org.phone;

public class PhoneInfo {
	private void phoneName() {
		System.out.println("Samsung");
    }
	private void phoneMieiNumber() {
		System.out.println("0159874563210");
	}
	private void camera() {
		System.out.println("Front= 32 MP, Rear= 64 MP");
	}
	private void storage() {
		System.out.println("8 GB RAM, 128 GB ROM");
	}
	private void osName() {
		System.out.println("Snapdragon 640");
	}
	public static void main(String[] args) {
		PhoneInfo PhoneInfo = new PhoneInfo();
		PhoneInfo.phoneName();
		PhoneInfo.phoneMieiNumber();
		PhoneInfo.camera();
		PhoneInfo.storage();
		PhoneInfo.osName();
	}
}

