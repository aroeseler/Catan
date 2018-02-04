package Catan;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tile newTile = new Tile(0,2,3,false);
		System.out.println(newTile);
		RandomGenerator dice = new RandomGenerator(6,6);
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		int ten = 0;
		int eleven = 0;
		int twelve = 0;
		for(int i = 0; i <1000; i++) {
			int number = dice.getRandom();
			if(number == 2) {
				two++;
			}
			if(number == 3) {
				three++;
			}
			if(number == 4) {
				four++;
			}
			if(number == 5) {
				five++;
			}
			if(number == 6) {
				six++;
			}
			if(number == 7) {
				seven++;
			}
			if(number == 8) {
				eight++;
			}
			if(number == 9) {
				nine++;
			}
			if(number == 10) {
				ten++;
			}
			if(number == 11) {
				eleven++;
			}
			if(number == 12) {
				twelve++;
			}
		}
		System.out.println("Two " + two);
		System.out.println("Three " + three);
		System.out.println("Four " + four);
		System.out.println("Five " + five);
		System.out.println("Six " + six);
		System.out.println("Seven " + seven);
		System.out.println("Eight " + eight);
		System.out.println("Nine " + nine);
		System.out.println("Ten " + ten);
		System.out.println("Eleven " + eleven);
		System.out.println("Twelve " + twelve);
	}

}
