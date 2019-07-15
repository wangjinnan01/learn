class Demo04_USB接口案例 {
	public static void main(String[] args) {
		Computer c = new Computer();
		Mouse m = new Mouse();
		KeyBoard k = new KeyBoard();
		c.start();

		c.useUSB(m);
		c.useUSB(k);
		c.useUSB(new DFS());

		c.close();
	}
}

//定义电脑类型，操作鼠标、操作键盘等外接设备
//定义鼠标、键盘等外界设备类型
//在测试类中，使用电脑对象，控制键盘、鼠标
class Computer {
	//开机功能
	public void start() {
		System.out.println("电脑开机");
	}

	//关机功能
	public void close() {
		System.out.println("电脑关机");
	}

	public void useUSB(USB u) {
		u.use();
	}
}

interface USB {
	public abstract void use();
}

class Mouse implements USB{
	public void use() {
		System.out.println("鼠标移动");
	}
}

class KeyBoard implements USB {
	public void use() {
		System.out.println("录入键盘内容");
	}
}

class DFS implements USB {
	public void use() {
		System.out.println("电风扇转动");
	}
}
