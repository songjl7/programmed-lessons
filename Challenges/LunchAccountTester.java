public class LunchAccountTester {
    public static void main(String[] args){
        System.out.println("Menu: ");
        System.out.println("Pizza - $2.50\tSandwich - $3.00\tFruit - $0.50\tDrink - $1.00\tCaviar - $999.00");

        LunchAccount bruh = new LunchAccount();
        System.out.println(bruh);
        bruh.addMoney(2.00);
        System.out.println(bruh.getBalance());
        System.out.println(bruh.buyLunch("Caviar"));

        LunchAccount huh = new LunchAccount(2.00);
        System.out.println(huh.toString());
        huh.addMoney(1.00);
        System.out.println(huh);
        System.out.println(huh.buyLunch("Pizza"));
        System.out.println(huh.toString());

    }
}