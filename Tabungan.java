package Praktikum8;

/**
 *
 * @author marsheila
 */
public class Tabungan {
    int saldo;

    Tabungan(int initsaldo) {
        this.saldo= initsaldo;
    }
    
    public void ambilUang(int jumlah){
        this.saldo = (saldo-jumlah);
    }
    
    
}
