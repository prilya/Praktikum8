package Praktikum8;

/**
 *
 * @author marsheila
 */
public class TestTabungan {
    public static void main(String[] agrs){
        Tabungan tabungan = new Tabungan(5000);
        System.out.println("Saldo awal : "+tabungan.saldo);
        tabungan.ambilUang(2300);
        System.out.println("Jumlah uang yang diambil : 2300");
        System.out.println("Saldo sekarang : "+tabungan.saldo);
    }
}
