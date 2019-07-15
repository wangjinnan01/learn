class Demo04_USB�ӿڰ��� {
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

//����������ͣ�������ꡢ�������̵�����豸
//������ꡢ���̵�����豸����
//�ڲ������У�ʹ�õ��Զ��󣬿��Ƽ��̡����
class Computer {
	//��������
	public void start() {
		System.out.println("���Կ���");
	}

	//�ػ�����
	public void close() {
		System.out.println("���Թػ�");
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
		System.out.println("����ƶ�");
	}
}

class KeyBoard implements USB {
	public void use() {
		System.out.println("¼���������");
	}
}

class DFS implements USB {
	public void use() {
		System.out.println("�����ת��");
	}
}
