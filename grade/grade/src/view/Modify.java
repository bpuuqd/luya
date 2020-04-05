package view;

import model.GradeList;

public class Modify implements Display {

	public void display() {
		System.out.println("수정 기능 ");
		System.out.println("수정 할 학생의 index번호를 입력해 주세요");
		int num = scan.nextInt();

		for (int i = 0; i < data.gradeArr.length; i++) {
			if (num == data.gradeArr[i].getIdx()) {
				System.out.println("수정할 데이터를 찾았습니다");
				GradeList GL = new GradeList();
				GL.setIdx(num);
				System.out.print("새 이름 입력 : ");
				GL.setName(scan.next());
				System.out.print("새 국어 점수 입력 : ");
				GL.setKorean(scan.nextInt());
				System.out.print("새 영어 점수 입력 : ");
				GL.setEnglish(scan.nextInt());
				System.out.print("새 수학 점수 입력 : ");
				GL.setMath(scan.nextInt());
				data.gradelist = GL;
				return;
			}

		}
		System.out.println("일치하는 데이터가 없습니다.");
		display();

	}
}