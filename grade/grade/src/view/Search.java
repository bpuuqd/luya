package view;

import model.GradeList;

public class Search implements Display{
	public void display() {
		System.out.println("�˻����");
		System.out.print("�̸� �Է� : " );
		GradeList GL = new GradeList();
		GL.setName(scan.next());
		data.gradelist = GL;
	}
	
	public void display(GradeList[] gArr) {
		System.out.println("�˻� ���");
		if(gArr.length == 0) {
			System.out.println("��ġ�ϴ� ����� �����ϴ�");
			controller.search();
		}
		for(int i = 0; i< gArr.length; i++) {
		System.out.println(gArr[i]);
		}
	}
}
