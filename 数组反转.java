class 数组反转 {
	public static void main(String[] args) {
		int [] arr = {27,4,5,6,3,40};
	数组遍历.PrintArr(arr);//反转之前先把数组输出
		reverse(arr);
		数组遍历.PrintArr(arr);//反转之后输出数组
	}
	public static void reverse(int [] arr){
	for(int i = 0,j=arr.length-1;i<j;i++,j--){
		数组交换.swap(arr,i,j);//数组交换
		}
	
	}
}
