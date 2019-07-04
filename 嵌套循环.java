class Ç¶Ì×Ñ­»· {
	public static void main(String[] args) {
	for(int i = 1;i < 5;i++){
		for(int a = 1;a < 6;a++){
		System.out.print("*");
		}
		System.out.println();
	
	
	}
		System.out.println("-----");
	for(int i = 1;i < 6;i++){
		for(int a = 0;a < i;a++ ){
		
		System.out.print("*");

		}
		System.out.println();
	}
	System.out.println("---------");
	//¾Å¾Å³Ë·¨±í
	int sum = 0;
	for(int a = 1;a <  10;a++){
		for(int b = 1;b <= a;b++ ){
		sum = a * b;
		System.out.print(b+"*"+a+"="+sum+"\t");
		}
		System.out.println();
	
	}
	}
}
