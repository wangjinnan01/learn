class 数组遍历 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5}; 
		for (int i = 0 ; i < arr.length;i++){
		System.out.println(arr[i]);
		}
		PrintArr(arr);
		}

		public static void PrintArr(int [] arr ){//定义一个方法，遍历数组

		for(int c = 0;c<arr.length;c++){
		System.out.print(arr[c] + " ");
		}
		System.out.println();
	}
}
