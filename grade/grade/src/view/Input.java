package view;

import model.GradeList;
public class Input implements Display{

	public void display(){
		GradeList gradelist = new GradeList();
		System.out.println("성적 입력");
		System.out.print("이름 입력 : ");
		gradelist.setName(scan.next());
		System.out.print("국어 점수 : ");
		gradelist.setKorean(scan.nextInt());
		System.out.print("영어 점수 : ");
		gradelist.setEnglish(scan.nextInt());
		System.out.print("수학 점수 : ");
		gradelist.setMath(scan.nextInt());
		
		data.gradelist=gradelist;
		System.out.println("성적 입력 완료");
		
		
	}
}
