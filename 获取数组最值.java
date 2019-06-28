class 获取数组最值 {
	public static void main(String[] args) {
		int [] arr = {12,45,3,46,34,445};//定义一个数组
		/*int max = arr[0];//定义一个变量用来存储最值
	for(int i = 1; i <arr.length;i++){//遍历数组
	if(max<arr[i]){
	max= arr[i];//比较过后把最值赋给max
	}
	
	}
	System.out.println(max);//打印出最值
*/
     System.out.println(getMax(arr));//传入数组，输出最大值
	}
	public static int getMax(int [] arr){//定义一个获取最大值的方法
	int max = arr[0];//初始化最大值为数组第一个元素
	for(int i = 1;i< arr.length;i++){
	if (max < arr[i]){//比较max和arr[]的大小
	max = arr[i];//把两者较大的赋给max
	}
	}
	return max;//返回max的值
	}
}
