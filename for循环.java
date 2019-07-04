class for循环 {
	public static void main(String[] args) {
		for (int i = 1;i < 6; i++) {
		System.out.println(i);

		}
		System.out.println("-------");
		for (int a = 5; a > 0;a--){
		System.out.println(a);

		}
		System.out.println("------------");
		int sum = 0;
		for(int b = 1;b < 101;b++ ){
		sum+=b;
		}
		System.out.println("1到100的值为:"+sum);
		System.out.println("-----------");

		int  he = 0 ;
		for(int c =2;c < 101;c++){
		if(c % 2 ==0){
		he += c;
		}
		}
		System.out.println("1-100的偶数和为:"+he);
		System.out.println("--------------");
		System.out.println("所有的五角星如下:");
		for(int m = 10000;m < 100000;m++){
		int g = (m % 10)*(m % 10)*(m % 10)*(m % 10)*(m % 10);
		int s = (m / 10 % 10)*(m / 10 % 10)*(m / 10 % 10)*(m / 10 % 10)*(m / 10 % 10);
		int b = (m / 100 % 10)*(m / 100 % 10)*(m / 100 % 10)*(m / 100 % 10)*(m / 100 % 10);
		int q = (m / 1000 % 10)*(m / 1000 % 10)*(m / 1000 % 10)*(m / 1000 % 10)*(m / 1000 % 10);
		int w = (m / 10000)*(m / 10000)*(m / 10000)*(m / 10000)*(m / 10000);
		int j = g + s + b + q + w;
		
		if(j == m){
		System.out.println(m);
		}
		
		}
	}
}
