package view;

import model.GradeList;

public class Delete implements Display{
	public void display() {
		System.out.println("���� ���");
		System.out.println("���� �� �л��� index ��ȣ�� �Է� �� �ּ���");
		int num = scan.nextInt();
		
		for (int i = 0; i < data.gradeArr.length; i++) {
			if (num == data.gradeArr[i].getIdx()) {
				System.out.println("������ �����͸� ã�ҽ��ϴ�");
				data.gradelist = new GradeList(num,"",0,0,0);
			
			}
			}System.out.println("���� �� �����Ͱ� �����ϴ�");
			return;
		
	}
}
