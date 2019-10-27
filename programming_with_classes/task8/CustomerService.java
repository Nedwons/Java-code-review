package by.etc.java_online.programming_with_classes.task8;

public class CustomerService {
	
	public CustomerService() {
		
		lineup[0] = new Customer(247319, "Smith","Michael","Addy","724 Davis Court", 123, 7897 );
		lineup[1] = new Customer(247320, "Bonner","Leonardo","Kellina","1397 Rainbow Drive", 245, 7456 );
		lineup[2] = new Customer(247321, "Wilkening","Decanio","Barde","63 Hayhurst Lane", 756, 2567 );
		lineup[3] = new Customer(247322, "Wathelet","Shelley","Anna-maria","3985 Railroad Street", 418, 6735 );
		lineup[4] = new Customer(247323, "Austen","Renaldo","Tammy","3705 Mudlick Road", 835, 4867 );
		lineup[5] = new Customer(247324, "Cote","Riannon","Sherwin","888 Abia Martin Drive", 745, 3764 );
	
	}
	
	
	Customer lineup[] = new Customer[6];
	
	@Override
	public String toString() {
		String str = "\t Last name First name Middle name   ID          address        credit card №  Bank account № \n";
		return str + toString( lineup );
		
	}
	
	public String toString(Customer[] lineup) {
		
		String str = "";
		int i = 1;
		
		for(Customer iterator: lineup ) {
			
			str = str + i++ + ") " + iterator.toString();
		}
		
		return str;
	}
	
	public void sortCustomerByAlfabet() {
		
		int comparisionResult = 0;
		
		for(int i = lineup.length - 1; i > 0; i--) {
			
			for(int j = 0; j < i; j++) {
				
				comparisionResult = lineup[j].getLastName().compareToIgnoreCase(lineup[j + 1].getLastName());
				
				if( comparisionResult > 0  ) { 
					
					Customer temp = lineup[j];
					lineup[j] = lineup[j + 1];
					lineup[j + 1] = temp;
					
				}		
			}
		}
	}
	
	public Customer[] filterCustomerByCreditCardNumber(int startOfInterval, int endOfInterval) {
		
		Customer[] tempLineup = new Customer[ lineup.length ];
		
		int properCustomerCounter = 0;
		
		for(int i = 0 ; i < lineup.length; i++) {
			
			if( lineup[i].getCreditCardNumber() >= startOfInterval &&
					lineup[i].getCreditCardNumber() <= endOfInterval ) {
				
				tempLineup[ properCustomerCounter ] = lineup[ i ];
				properCustomerCounter++;
			}
		}
		
		Customer[] filteredLineup = new Customer[ properCustomerCounter ];
		
		for(int i = 0; i < properCustomerCounter; i++ ) {
			
			filteredLineup[ i ] = tempLineup[ i ];
			
		}
		
		return filteredLineup;
	}
}
