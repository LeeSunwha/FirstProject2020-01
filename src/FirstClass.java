import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner����� ����ϱ� ���� ��ü ����
        Scanner sc = new Scanner(System.in);
        
        // CompanyService Ŭ������ ����ϱ� ���� ��ü ����
        CompanyService cs = new CompanyService();
        
        //while�� Ż��뵵�� ����� boolean ����
        boolean bo = true;
        
        // �������� ���α׷��� ���������� �ݺ� ���� ��Ű�� ���� while�� ���
        while(bo)
        {
            System.out.println("1. ���");
            System.out.println("2. ���");
            System.out.println("3. ����");
            System.out.println("4. �˻�");
            System.out.println("5. ����");
            System.out.print(">>> ");
            
            // switch-case���� ����ϱ� ���� key�� �Է¹ޱ�
            int key = sc.nextInt();
            
            // ���ϴ� case���� ����ϱ� ���� �Է¹��� key�� �־��ֱ�
            switch(key)
            {
            case 1: // ���
                cs.saveWorker();
                break;
                
            case 2: // ���
                cs.output();
                break;
                
            case 3: // ����
                cs.modify();
                break;
                
            case 4: // �˻�
                cs.search();
                break;
                
            case 5: // ����
                System.out.println("���α׷� ����");
                bo = false;
                break;
            }
        }
    }
}

