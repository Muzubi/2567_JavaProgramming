
public class Student {

	private String studentName;
	private int studentScore;
public void setName(String stdName) {
	studentName = stdName;
}
public String getName() {
	return studentName;
}
public void setScore(int stdScore) {
	studentScore = stdScore;
}
public int getScore() {
	return studentScore;
}
//if the score is within the valid range(0-100)
public boolean checkScore() {
	return getScore()>=0&&getScore()<=100;
}
public boolean isPass() {
	return getScore()>=50;
}




}