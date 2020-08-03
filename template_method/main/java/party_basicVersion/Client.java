package party_basicVersion;

public class Client {
    public static void main(String[] args) {
        People host = new Host();
        People cousin = new Cousin();
        People guest = new Guest();

        host.action("HOST","치킨","물");

        cousin.action("COUSIN","피자","이온음료");

        guest.action("GUEST","부침개","막걸리");
    }
}
