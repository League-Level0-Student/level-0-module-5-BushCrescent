package _02_fibonacci;

import javax.swing.JOptionPane;

public class fibonacci {
	public static void main(String[] args) {
		int x = 0;
		int y = 1;
		int z = y+x;
		int temp = x;
		x = y;
		y = temp;
		for (int i = 0; i < 12; i++) {
System.out.println(z);
z = x + y;
x = y;
y = z;

		}
	}
}
