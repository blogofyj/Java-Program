package GoogleSource;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        // �Ӽ��̽�������
 
        // next��ʽ�����ַ���
        System.out.println("next��ʽ���գ�");
        // �ж��Ƿ�������
        if (scan.hasNext()) {
            String str1 = scan.next();
            System.out.println("���������Ϊ��" + str1);
        }
        scan.close();
        
        
        //�Ǿ�̬�������
        ScannerDemo test = new ScannerDemo();
        test.scannerTest();
        
        //��������
        new ScannerDemo().scannerTest();
	}
	
	
	
	public void scannerTest() {
		
		Scanner scan = new Scanner(System.in);
        // �Ӽ��̽�������
        int i = 0;
        float f = 0.0f;
        System.out.print("����������");
        if (scan.hasNextInt()) {
            // �ж�������Ƿ�������
            i = scan.nextInt();
            // ��������
            System.out.println("�������ݣ�" + i);
        } else {
            // ����������Ϣ
            System.out.println("����Ĳ���������");
        }
        System.out.print("����С����");
        if (scan.hasNextFloat()) {
            // �ж�������Ƿ���С��
            f = scan.nextFloat();
            // ����С��
            System.out.println("С�����ݣ�" + f);
        } else {
            // ����������Ϣ
            System.out.println("����Ĳ���С����");
        }
        scan.close();
	}

}
