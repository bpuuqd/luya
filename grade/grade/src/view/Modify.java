package view;

import model.GradeList;

public class Modify implements Display {

	public void display() {
		System.out.println("���� ��� ");
		System.out.println("���� �� �л��� index��ȣ�� �Է��� �ּ���");
		int num = scan.nextInt();

		for (int i = 0; i < data.gradeArr.length; i++) {
			if (num == data.gradeArr[i].getIdx()) {
				System.out.println("������ �����͸� ã�ҽ��ϴ�");
				GradeList GL = new GradeList();
				GL.setIdx(num);
				System.out.print("�� �̸� �Է� : ");
				GL.setName(scan.next());
				System.out.print("�� ���� ���� �Է� : ");
				GL.setKorean(scan.nextInt());
				System.out.print("�� ���� ���� �Է� : ");
				GL.setEnglish(scan.nextInt());
				System.out.print("�� ���� ���� �Է� : ");
				GL.setMath(scan.nextInt());
				data.gradelist = GL;
				return;
			}

		}
		System.out.println("��ġ�ϴ� �����Ͱ� �����ϴ�.");
		display();

	}
}