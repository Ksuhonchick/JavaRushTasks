package SeaBattle;

import java.util.Random;

public class Field {

  char [][] field = new char[10][10];
  boolean isNotGameOver = true;

  public void fullfield() {
      int i = 0;
      int j = 0;
      for (j = i; i < 10; i++) {

          field[i][j]= '.';
      }
      System.out.println(field);
    }

    public void setShip (Ship ship) {
      Random random = new Random();
      ship.position = random.nextInt(10);
  }

  public void doShoot (Player player, Ship ship) {
      if (player.shoot == ship.position) {
          ship.condition = false;
          isNotGameOver = false;
          System.out.println("Game over");
      }
      else {
          System.out.println("Try again");
      }

  }




}
