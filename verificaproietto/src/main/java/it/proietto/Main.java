package it.proietto;

public class Main {
    public static void main(String[] args) {
        ContoBancario conto = new ContoBancario("IT60X0542811101000000123456", 1000.0);
        System.out.println("IBAN: " + conto.getIban());
        System.out.println("Saldo iniziale: " + conto.getSaldo());

        conto.deposita(500.0);
        System.out.println("Saldo dopo deposito: " + conto.getSaldo());

        conto.preleva(200.0);
        System.out.println("Saldo dopo prelievo: " + conto.getSaldo());
        //otteniamo gli ultimi movimenti del conto bancario
        System.out.println("Movimenti del conto bancario:");
        System.out.println(conto.getUltimiMovimenti(1));
        System.out.println(conto.getMovimenti());
    }
}