package view;

import model.GradeList;

public class Search implements Display{
	public void display() {
		System.out.println("검색기능");
		System.out.print("이름 입력 : " );
		GradeList GL = new GradeList();
		GL.setName(scan.next());
		data.gradelist = GL;
	}
	
	public void display(GradeList[] gArr) {
		System.out.println("검색 결과");
		if(gArr.length == 0) {
			System.out.println("일치하는 결과가 없습니다");
			controller.search();
		}
		for(int i = 0; i< gArr.length; i++) {
		System.out.println(gArr[i]);
		}
	}
}
