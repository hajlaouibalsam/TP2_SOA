package service;

public class Principal {
    public static void main(String[] args) {
        BanqueService banque = new BanqueService();
        banque.conversion(111);
        System.out.println(banque.getCompte());
        System.out.println(banque.getComptes());
    }
}