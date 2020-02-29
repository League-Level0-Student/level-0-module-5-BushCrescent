package _06_for_loop_gauntlet;

import javax.swing.JOptionPane;

public class for_loop_gaunlet {
	public static void main(String[] args) {

		// 1. for (int i = 0; i < 3; i++) {
		// for (int x = 0; x < 3; x++) {
		// System.out.println(i+0 +" "+ x);

		// 2. for (int i = 1; i < 4; i++) {
		// System.out.println ("");
		// for (int x = -2; x < 1; x++) {
		// System.out.print(x+3*i + " ");
		// }
		// }

		// 3. for (int i = 0; i < 10; i++) {
		// System.out.println();
		// for (int x = 1; x < 11; x++) {
//System.out.print(x+10*i + " ");
		// }
		// }

		// 4. for (int i = 5; i > -1; i--) {

		// System.out.println();
		// for (int x = 1; x < 7-i; x++) {
		// System.out.print("* ");
		// }
		// }
		for (int i = 0; i < 1; i++) {
			System.out.println();
			for (int x = 100; x > -1; x--) {
				System.out.print(i+x + " ");
			}
		}
	}
}