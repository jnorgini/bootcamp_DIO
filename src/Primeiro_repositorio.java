import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Primeiro_repositorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		
		
		System.out.println("Digite 5 tipos de veículos");
		String v1 = sc.nextLine();
		String v2 = sc.nextLine();
		String v3 = sc.nextLine();
		String v4 = sc.nextLine();
		String v5 = sc.nextLine();
		
		list.add(v1);
		list.add(v2);
		list.add(v3);
		list.add(v4);
		list.add(v5);
		
		String tipos;
		
		for(String veiculos : list) {
			tipos = veiculos;
			
			System.out.print(tipos + " | ");
		}
		
		sc.close();

	}

}
