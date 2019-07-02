class 强制转换 {
	public static void main(String[] args) {
		int  a = 2 ;
		long b = 9 ;
		int result1 = (int )( a + b  ) ;//强制转换成int 类型
		System.out.println(result1);
		
		byte d = 3 ;
		byte e = 127;
		byte result2 = (byte) ( d + e );//大于范围后就是负数,相当于星期日后是星期一
		System.out.println(result2);


	}
}
