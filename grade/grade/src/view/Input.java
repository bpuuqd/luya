package view;

import model.GradeList;
public class Input implements Display{

	public void display(){
		GradeList gradelist = new GradeList();
		System.out.println("���� �Է�");
		System.out.print("�̸� �Է� : ");
		gradelist.setName(scan.next());
		System.out.print("���� ���� : ");
		gradelist.setKorean(scan.nextInt());
		System.out.print("���� ���� : ");
		gradelist.setEnglish(scan.nextInt());
		System.out.print("���� ���� : ");
		gradelist.setMath(scan.nextInt());
		
		data.gradelist=gradelist;
		System.out.println("���� �Է� �Ϸ�");
		
		
	}
}
