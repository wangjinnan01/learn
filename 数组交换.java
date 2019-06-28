class 数组交换 {
	public static void main(String[] args) {
		int [] arr = {12,1,3,46,34,445};
		数组遍历.PrintArr(arr);
		//int temp = arr[1];
		//arr[1]=arr[3];
		//arr[3]= temp;
	
        数组遍历.PrintArr(arr);
	}
	public static void swap(int [] arr , int a ,int b){
	
	int temp = arr[a];
		arr[a]=arr[b];
		arr[b]= temp;
	}
}
