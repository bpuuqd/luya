package controller;

import static resource.R.*;

import model.GradeList;

public class Controller {
	public void search() {
		search.display();
		data.gradeArr = dao.select(data.gradelist);
		search.display(data.gradeArr);
	}

	public void service() {

		if (data.no == 0) {

			menu.display();

		}
		switch (data.no) {
		case 1:
			input.display();
			dao.insert(data.gradelist);
			break;

		case 2:
			data.gradeArr = dao.select();
			output.display();
			break;
		case 3:
			search();
			break;
		case 4:
			search();
			modify.display();
			dao.modify(data.gradelist);
			break;
		case 5 : 
			search();
			delete.display();
			dao.delete(data.gradelist);
			break;
		case 6 :
		case 7 : 
			System.out.println("�ý����� �����մϴ�");
				System.exit(0);
		
		default:
			System.out.println("�غ���� ���� �ɼ��Դϴ�");
		}
		data.no = 0;
		service();
	}
}
