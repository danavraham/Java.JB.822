package exercises;

public class ExerciseFunctions2 {

	public static void main(String[] args) {
		System.out.println( absolute(-9) );
		System.out.println( isPrimary(-4) );
	}
	
	// method for absolute value
	public static int absolute(int number){
		if(number < 0){
			number = -number;
		} 
		return number;
	}
	
	// method to check primary number
	public static boolean isPrimary(int number){
		number = absolute(number);
		for(int i = 2; i <= number / 2; i++){
			if(number % i == 0){
				return false;
			}
		}
		
		return true;
	}
}











