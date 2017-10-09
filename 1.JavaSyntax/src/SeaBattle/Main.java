package SeaBattle;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Ship ship = new Ship();
        Field field = new Field();

       field.fullfield();
       field.setShip(ship);
       System.out.println("Start game");

        do {
            player.shoot();
            field.doShoot(player, ship);

        } while (field.isNotGameOver);
    }
}
