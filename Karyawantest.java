public class Karyawantest{
	public static void main(String[] args) {
		System.out.println("----------------------------");
		System.out.println("----Jabatan Designer---");
		Designer d = new Designer();
		d.setNama ("Saji");
		d.setAlamat ("Dukuh jeruk"); 
		d.setGaji(55);


		System.out.println("----------------------------");
		System.out.println("---Jabatan Programmer--- "); 
		Programmer p = new Programmer();
		p.setNama ("Ronaldo");
		p.setAlamat ("Portugal");
		p.setGaji(65);

		System.out.println("----------------------------");
		System.out.println("---Jabatan Project Manager--"); 
		Pm pm = new Pm();
		pm.setNama ("Zidane");
		pm.setAlamat ("Perancis");
		pm.setGaji(95);
	



	}
}