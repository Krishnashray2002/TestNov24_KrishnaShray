package practice;

public class Demo4 {
	
	int[] getReverseArray(int[] num) {
		int[] output = new int[num.length-1];
		for(int i = num.length-1;i>=0;i--) {
			for(int j = 0;j<num.length;j++) {
				output[j] = num[i];
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[] num = {44,45,22,25,21,29};
		int[] output = new Demo4().getReverseArray(num);
		for(int i =0;i<output.length;i++) {
			System.out.println(i + " -> " + output[i]);
		}
	}
}