package model;

import resource.Data;
import static resource.R.*;

public class Dao {
	private int top = 0;
	private int seq = 1;
	private GradeList[] gArr = new GradeList[MAX];

	{
		gArr[top++] = new GradeList(seq++, "KIM", 100, 100, 100);
		gArr[top++] = new GradeList(seq++, "LEE", 89, 63, 59);
		gArr[top++] = new GradeList(seq++, "YANG", 90, 77, 80);
		gArr[top++] = new GradeList(seq++, "PARK", 70, 79, 68);
		gArr[top++] = new GradeList(seq++, "LEE", 98, 99, 57);
		gArr[top++] = new GradeList(seq++, "KIM", 98, 99, 57);
	}

	public Dao() {
	}

	private static Dao instance;

	public static Dao getInstance() {
		if (instance == null) {
			instance = new Dao();
		}
		return instance;
	}

	public void insert(GradeList gradelist) {

		gradelist.setIdx(seq++);
		gArr[top++] = gradelist;

	}

	public GradeList[] select() {
		GradeList[] arr = new GradeList[top];
		for (int i = 0; i < arr.length; i++) {
			GradeList gl = new GradeList();
			gl.setIdx(gArr[i].getIdx());
			gl.setName(gArr[i].getName());
			gl.setKorean(gArr[i].getKorean());
			gl.setEnglish(gArr[i].getEnglish());
			gl.setMath(gArr[i].getMath());
			gl.setSum();
			gl.setAvg();
			gl.setGrade();
			arr[i] = gl;
		}
		return arr;

	}

	public GradeList[] select(GradeList gradelist) {
		GradeList[] tmp = new GradeList[top];
		int cnt = 0;
		for (int i = 0; i < top; i++) {
			if (gradelist.getName().toUpperCase().equals(gArr[i].getName().toUpperCase())) {
				GradeList GL = new GradeList();
				GL.setName(gArr[i].getName());
				GL.setIdx(gArr[i].getIdx());
				GL.setKorean(gArr[i].getKorean());
				GL.setEnglish(gArr[i].getEnglish());
				GL.setMath(gArr[i].getMath());
				GL.setSum();
				GL.setAvg();
				GL.setGrade();
				tmp[cnt++] = GL;
			}
		}
		GradeList[] arr = new GradeList[cnt];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = tmp[i];
		}

		return arr;
	}

	public void modify(GradeList GL) {
		for (int i = 0; i < gArr.length; i++) {
			if (GL.getIdx() == gArr[i].getIdx()) {
				gArr[i] = GL;
				System.out.println("수정 완료");
				return;
			}
		}
		System.out.println("수정 실패");
		return;
	}

	public void delete(GradeList GL) {
		for (int i = 0; i < top; i++) {
			if (GL.getIdx() == gArr[i].getIdx()) {
				for (int j = i; j < top - 1; j++) {
					gArr[j] = gArr[j + 1];
				}
				top--;
				break;

			}
		}
	}

}
