package view;

public class Menu implements Display {
	public void display() {
		System.out.println("1.성적 입력  2.성적 확인  3.검색  4.수정  5.삭제  6.등수 확인 7.종료");
		System.out.println("옵션 선택 : ");
		data.no = scan.nextInt();

	}
}
