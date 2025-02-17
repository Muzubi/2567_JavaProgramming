
public class Theater extends Movie{
 private int teaterNo;
 
 Theater(String id,String name,Director director,int teaterNo){
	 super(id,name,director);
	 this.teaterNo=teaterNo;
 }
 Theater(int teaterNo){
	 this.teaterNo=0;
 }
 public String getTheaterName() {
	 if(teaterNo>0&&teaterNo<12)return"Basic Theater";
	 else if(teaterNo>11&&teaterNo<15)return"Sweet Theater";
	 else if(teaterNo==15)return"Premium Theater";
	 else return "null";
 }
 public String toString() {
	 return super.toString();
 }
 
}
