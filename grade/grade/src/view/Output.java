package view;

import model.GradeList;

public class Output implements Display {

	public void display() {

		if (data.gradeArr == null) {
			System.out.println("�����Ͱ� �����ϴ�");
			return;
		}
		System.out.println("���� ���");
		for (int i = 0; i < data.gradeArr.length; i++) {
			System.out.println(data.gradeArr[i]);
		}
	}
}
