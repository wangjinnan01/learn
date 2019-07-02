class day02作业1 {
	public static void main(String[] args) {
		//5、定义三个变量，实现三个变量的循环交换，例如，int a = 10; int b = 20; int c = 30;
		//交换之后，a = 30，b = 10, c = 20
     
    	int a = 10 ; 
		int b = 20 ;
		int c = 30 ;
		int temp = 0;
		temp = a;
		a = c ;
		c = b ;
		b = temp ;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);


	}
}
