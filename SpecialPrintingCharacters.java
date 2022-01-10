class SpecialPrintingCharacters{

	public void print(){
		System.out.println("\nNamaste Bhaiyoo aur Bheeno");
		System.out.println("\tNamaste Bhaiyoo aur Bheeno");
		//System.out.print("\vNamaste Bhaiyoo aur Bheeno");
		System.out.println("\bNamaste \bBhaiyoo aur Bheeno");
		System.out.println("\\Namaste \\Bhaiyoo aur \\Bheeno");
		System.out.println("\"Namaste Bhaiyoo aur Bheeno\"");
		System.out.println("\rNamaste \rBhaiyoo aur Bheeno");

		


		
	}
	public static void main(String args[]){
		SpecialPrintingCharacters s=new SpecialPrintingCharacters();
		s.print();

	}
}