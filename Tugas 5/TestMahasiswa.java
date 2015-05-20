class TestMahasiswa
{
	public static void main(String[] args) 
	{
		Mahasiswa mhs = new Mahasiswa("yusuf dwi f", 21);
		mhs.tampilkanBiodata();

		System.out.println();

		mhs.setUmur(21);
		mhs.tampilkanBiodata();		
	}	
}