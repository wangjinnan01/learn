class ���鷴ת {
	public static void main(String[] args) {
		int [] arr = {27,4,5,6,3,40};
	�������.PrintArr(arr);//��ת֮ǰ�Ȱ��������
		reverse(arr);
		�������.PrintArr(arr);//��ת֮���������
	}
	public static void reverse(int [] arr){
	for(int i = 0,j=arr.length-1;i<j;i++,j--){
		���齻��.swap(arr,i,j);//���齻��
		}
	
	}
}
