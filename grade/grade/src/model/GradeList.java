package model;

import resource.R;

public class GradeList implements R {

	private int idx;
	private String name;
	private int Korean;
	private int English;
	private int Math;
	private int Sum = Korean + English + Math;
	private int Avg = Sum / 3;
	private String grade;
	private int Rank;

	public GradeList(int idx, String name, int korean, int english, int math) {
		this.idx = idx;
		this.name = name;
		Korean = korean;
		English = english;
		Math = math;

	}

	public GradeList() {
		// TODO Auto-generated constructor stub
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return Korean;
	}

	public void setKorean(int korean) {
		Korean = korean;
	}

	public int getEnglish() {
		return English;
	}

	public void setEnglish(int english) {
		English = english;
	}

	public int getMath() {
		return Math;
	}

	public void setMath(int math) {
		Math = math;
	}

	public int getSum() {
		return Sum;
	}

	public void setSum() {
		this.Sum = this.Korean + this.English + this.Math;
	}

	public int getAvg() {
		return Avg;
	}

	public void setAvg() {
		Avg = this.Sum / 3;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade() {
		switch (this.Avg / 10) {
		case 10:
			this.grade = "A";
			break;
		case 9:
			this.grade = "B";
			break;
		case 8:
			this.grade = "C";
			break;
		case 7:
			this.grade = "D";
			break;
		default:
			this.grade = "F";
		}

	}

	public int getRank() {
		return Rank;
	}

	public void setRank(int rank) {
		Rank = rank;
	}

	@Override
	public String toString() {
		return "성적 [index : " + idx + ", 이름 : " + name + ", 국어 : " + Korean + ", 영어 : " + English + ", 수학 : " + Math
				+ ", 총점 : " + Sum + " 평균 : " + Avg + " 학점 : " + grade + "]";
	}
}
