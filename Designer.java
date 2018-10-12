public class Designer extends Karyawan{

	// method Overriding
	public void setGaji(int gaji){
		if(gaji<=70){
			System.out.println("kerja anda bagus maka anda menerima gaji sebanyak =" +gaji);
			}
		else{
			System.out.println("Gaji anda sudah dalam batas standarisasi");
		}
	}

}