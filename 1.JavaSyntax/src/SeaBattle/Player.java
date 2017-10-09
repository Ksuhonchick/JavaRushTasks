package SeaBattle;

import java.util.Scanner;

public class Player {
    String name;
    int shoot;

    public void shoot (){
        Scanner scanner = new Scanner(System.in);
        shoot = scanner.nextInt();
    }

}
