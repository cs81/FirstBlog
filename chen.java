class Add {
	public void sum(int[] nums, int target) {
		
		// 获取传入数组中所有数值的下标
		for (int i = 0;i < nums.length;i++) {
			// 循环遍历两个值相加，并和target相比较
			for (int j = 0;j > i;j--) {
				
				if (nums[i] + nums[j] == target) {
					// 打印和target相等的两个值的下标
					System.out.println(i,j);
				}				
			}			
		}
		
	}
}

public class MyTest{
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		int b = 6;
		
		Add add = new Add();
		add.sum(a,b);
	}
}