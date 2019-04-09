public class Months{
	public static void main(String[] args){
	String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
	String searchStr = "r";
	boolean found = false;

	for(int i = 0; i < months.length; i++){
		if(months[i].contains(searchStr)){
		System.out.println(months[i]);
		}
	}
	Index.main(null);
	}
}
