package view;

import model.GradeList;

public class Output implements Display {

	public void display() {

		if (data.gradeArr == null) {
			System.out.println("데이터가 없습니다");
			return;
		}
		System.out.println("성적 출력");
		for (int i = 0; i < data.gradeArr.length; i++) {
			System.out.println(data.gradeArr[i]);
		}
	}
}
