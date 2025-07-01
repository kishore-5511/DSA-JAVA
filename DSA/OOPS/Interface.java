package DSA.OOPS;

public class Interface {
    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPawns {
    void moves();
}

class Queen implements ChessPawns {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (in all directions)");
    }
}

class Rook implements ChessPawns {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPawns {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (by 1 step)");
    }
}

// Multiple Inheritance
interface Herbivore {

}

interface Carnivore {

}

class Bear implements Herbivore, Carnivore {

}