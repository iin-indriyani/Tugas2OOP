public class Method {
	public static void main (String[] args) { //program utama
		Method method = new Method();
		method.methodTampilkan(); //memanggil method
		System.out.println(method.kembalikanNilai());
	}
private void methodTampilkan(){
		System.out.println("Belajar Java Yuks 1");
}
private int kembalikanNilai(){
		return 1;
}
}