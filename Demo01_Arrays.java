import java.util.Arrays;
class Demo01_Arrays {
	public static void main(String[] args) {
		//���ֲ���
		int[] arr1 = {10, 22, 33, 66, 88, 333, 888};
		int index = Arrays.binarySearch(arr1, 333);
		System.out.println(index);
		//�Ƚ����������Ƿ����
		int[] arr2 = {10, 22, 33, 66, 88, 333, 888};
		System.out.println(Arrays.equals(arr1, arr2));
		//�滻���
		System.out.println(Arrays.toString(arr2));
		Arrays.fill(arr2, 666);
		System.out.println(Arrays.toString(arr2));
		
		//����
		int[] arr3 =  {12, 23, -66, 6, 88, 53, 99, -888};
		System.out.println(Arrays.toString(arr3));
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));

	}
}
