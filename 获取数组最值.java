class ��ȡ������ֵ {
	public static void main(String[] args) {
		int [] arr = {12,45,3,46,34,445};//����һ������
		/*int max = arr[0];//����һ�����������洢��ֵ
	for(int i = 1; i <arr.length;i++){//��������
	if(max<arr[i]){
	max= arr[i];//�ȽϹ������ֵ����max
	}
	
	}
	System.out.println(max);//��ӡ����ֵ
*/
     System.out.println(getMax(arr));//�������飬������ֵ
	}
	public static int getMax(int [] arr){//����һ����ȡ���ֵ�ķ���
	int max = arr[0];//��ʼ�����ֵΪ�����һ��Ԫ��
	for(int i = 1;i< arr.length;i++){
	if (max < arr[i]){//�Ƚ�max��arr[]�Ĵ�С
	max = arr[i];//�����߽ϴ�ĸ���max
	}
	}
	return max;//����max��ֵ
	}
}
