package com.senacrs.agenda;

public class Principal {

	public static void main(String[] args) {
		ListaDinamica teste = new ListaDinamica();
		teste.add("Ana" ,"5555-1234");
		teste.add("Mário" ,"5955-1134");
		teste.add("Paulo" ,"6555-1934");
		teste.add("Sérgio ","5855-1284");
		teste.add("Maria ", "7455-8254");
		teste.add("Vilma ", "9955-1754");
		teste.add("Frederico ", "9895-1582");
		teste.add("Neca ", "8735-9999");
		teste.add("Vanessa ", "8794-1415");
		teste.add("Noeli ", "9835-0790");
		teste.add("Pedro ", "8574-1985");
		teste.add("Lucas ", "7459-2222");
		teste.add("Rebecca ","3043-5555");
		teste.add("João ", "2222-4357");
		teste.add("Renata ", "3681-1825");
		teste.add("José ", "4528-1759");
		teste.add("Izabel ", "9999-8858");
		teste.add("Caleb ", "9425-7412");
		teste.add("Jaqueline ", "3225-7935");
		teste.add("Roberto", "9247-3901");
		
		teste.removeItem("José ", "4528-1759");
		teste.imprimeLista();
		
		
		

	}

}
