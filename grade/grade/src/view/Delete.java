package view;

import model.GradeList;

public class Delete implements Display{
	public void display() {
		System.out.println("삭제 기능");
		System.out.println("삭제 할 학생의 index 번호를 입력 해 주세요");
		int num = scan.nextInt();
		
		for (int i = 0; i < data.gradeArr.length; i++) {
			if (num == data.gradeArr[i].getIdx()) {
				System.out.println("삭제할 데이터를 찾았습니다");
				data.gradelist = new GradeList(num,"",0,0,0);
			
			}
			}System.out.println("삭제 할 데이터가 없습니다");
			return;
		
	}
}
