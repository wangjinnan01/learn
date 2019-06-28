class 数组初始化 {
	public static void main(String[] args) {
		int []  arr = new int[5];
		arr[1]= 9;
		arr[3]=666;
		for (int i = 0;i<arr.length;i++){
		System.out.println(arr[i]);
		}

System.out.println("-----------------");

		int []  b = {28,34,56,67,7,65};
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		System.out.println(b[4]);
		System.out.println(b[5]);
	}
}
