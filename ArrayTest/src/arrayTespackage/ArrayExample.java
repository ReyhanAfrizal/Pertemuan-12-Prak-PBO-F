package arrayTespackage;
public class ArrayExample 
{
	public static void main(String[]args)
	{
		String[] dataProdi = new String[10];
		dataProdi[0]="Administrasi";
		dataProdi[1]="Agroteknologi";
		dataProdi[2]="Teknik Elektro";
		dataProdi[3]="Bahasa Arab";
		dataProdi[4]="Bahasa Inggris";
		dataProdi[5]="Teknik Informatika";
		dataProdi[6]="Fisika";
		dataProdi[7]="Kimia";
		dataProdi[8]="Biologi";
		dataProdi[9]="Managemen";
		
		System.out.println("Tampilkan Data 1,3 dan 5");
		System.out.println("Data ke-1 "+dataProdi[1]);
		System.out.println("Data ke-3 "+dataProdi[3]);
		System.out.println("Data ke-5 "+dataProdi[5]);
		
		System.out.println("\nTampilkan Semua Data Kecuali Data Ke-3");
		for(int i=0; i<10;i++)
		{
			if(dataProdi[i].equals("Bahasa Arab"))
				continue;
			System.out.println("Data ke-"+i+" "+dataProdi[i]);
		}
	}
}
