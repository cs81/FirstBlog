class Add {
	public void sum(int[] nums, int target) {
		
		// ��ȡ����������������ֵ���±�
		for (int i = 0;i < nums.length;i++) {
			// ѭ����������ֵ��ӣ�����target��Ƚ�
			for (int j = 0;j > i;j--) {
				
				if (nums[i] + nums[j] == target) {
					// ��ӡ��target��ȵ�����ֵ���±�
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