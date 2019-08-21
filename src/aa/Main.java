package aa;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		int n = scan.nextInt();//楼层数
		for(int i = 1; i <= n; i++) {
			//楼的高度
			int value = scan.nextInt();
			hashMap.put(i, value);
		}
		
		int[] arr = new int[n];
		for (int i = 1; i <= n; i++) {
			int num = 1;
			Integer value = hashMap.get(i);
			//向后找
			if (i < n) {
				int j = i + 1;
				Integer value2 = hashMap.get(j);
				if (value < value2) {//紧贴着后面楼比较高的情况下
					num++;
					value = value2;
					for (int k = j + 1; k <= n; k++) {
						value2 = hashMap.get(k);
						if (value < value2) {
							value = value2;
							num++;
						}
					}
				} else {//紧贴着后面楼比较低
					num++;
					value = value2;
					for (int k = j + 1; k <= n; k++) {
						value2 = hashMap.get(k);
						if (value < value2) {
							value = value2;
							num++;
						}
					}
				}
			}
			
			value = hashMap.get(i);
			//向前找
			if (i > 1) {
				int j = i - 1;
				Integer value2 = hashMap.get(j);
				if (value < value2) {//紧贴着前面楼比较高的情况下
					num++;
					value = value2;
					for (int k = j - 1; k >= 1; k--) {
						value2 = hashMap.get(k);
						if (value < value2) {
							value = value2;
							num++;
						}
					}
				} else {//紧贴着前面楼比较低
					num++;
					value = value2;
					for (int k = j - 1; k >= 1; k--) {
						value2 = hashMap.get(k);
						if (value < value2) {
							value = value2;
							num++;
						}
					}
				}
			}
			System.out.print(num + " ");
		}
	}
}
