//import java.util.Queue;
//import java.util.LinkedList;
import java.util.Scanner;

public class  Simulation {
	public static void run_simul() {
	
		//Queue<Visitor> row = new LinkedList<>();
		//
		//Visitor v1 = new Visitor();
		//Visitor v2 = new Visitor();
		//Visitor v3 = new Visitor();
		//Visitor v4 = new Visitor();
		//
		//row.add(v1);
		//row.add(v2);
		//row.add(v3);
		//row.add(v4);
		
		Hotel hotel = new Hotel();
		BaggagePorterSt bg = new BaggagePorterSt("Daniil");
		ReceptionStaff rs = new ReceptionStaff("Steve");
		CleanerStaff cs = new CleanerStaff("John");
		Table table = new Table();
		Chev chev = new Chev("Boris");
		Cook cook = new Cook("Abdul");
		Barman barman = new Barman("Yurii");

		Cashier cashier = new Cashier("Lena");
		Waiter waiter = new Waiter("Maria");

		//while(!row.isEmpty()) {
			Visitor v = new Visitor(true,true);
			Room r = new Room();
			
			System.out.println();
			hotel.open();
			System.out.println();

			System.out.println("INITIAL VISITOR ENTERED THE HOTEL");

			rs.assignRoom(r, v);
			cs.setCleaned(true);
			bg.moveBaggage(r, v.b);
			table.occupy(v);
			chev.setNation();
			cook.servFood(v);
			barman.servDrink(v);
			cashier.payment();
			waiter.service();

			System.out.println();
		//}
			String[] scenarios = {"Hungry visitor", "Tired visitor", "Hungry and tired visitor"};
					
			System.out.println("Introduce one of the scenarios available:");
        for (int i = 1; i <= scenarios.length; i++) {
            System.out.println(i + " " + scenarios[i - 1] + " comes to the hotel");
        }
        System.out.println();
		
		Scanner scann = new Scanner(System.in);
        int scenario = scann.nextInt();

		switch(scenario){
            case 1:
                v = new Visitor(true,false); 
                break;
            case 2: 
                v = new Visitor(false,true); 
                break;
            case 3:
                v = new Visitor(true,true);
                break;
            default:
                throw new IllegalArgumentException("No such scenario available!");
        }

		System.out.println();
		if (scenario == 1) {
			table.occupy(v);
			chev.setNation();
			cook.servFood(v);
			barman.servDrink(v);
			cashier.payment();
			waiter.service();
		} else if (scenario == 2){
			rs.assignRoom(r, v);
			cs.setCleaned(true);
			bg.moveBaggage(r, v.b);
		} else{
			rs.assignRoom(r, v);
			cs.setCleaned(true);
			bg.moveBaggage(r, v.b);
			table.occupy(v);
			chev.setNation();
			cook.servFood(v);
			barman.servDrink(v);
			cashier.payment();
			waiter.service();
		}

		System.out.println();

		hotel.close();
		

	}
	
	
	
}
