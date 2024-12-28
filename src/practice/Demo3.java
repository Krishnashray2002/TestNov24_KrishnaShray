package practice;

public class Demo3 {
	
	int getDivisibleNumbersSum(int[] num) {
		int maxNumber = num[0];
		for(int i =1;i<num.length;i++) {
			if(num[i]>maxNumber) {
				maxNumber = num[i];
			}
		}
		return maxNumber;
	}
	
	public static void main(String[] args) {
		int[] num = {44,45,22,25,21,29};
		System.out.println(new Demo3().getDivisibleNumbersSum(num));
	}
}
