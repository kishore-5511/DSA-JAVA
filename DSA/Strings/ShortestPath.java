package DSA.Strings;

public class ShortestPath {

    public static float GetShortestPath(String direction) {
        int x = 0, y = 0;
        for (int i = 0; i < direction.length(); i++) {
            if(direction.charAt(i) == 'N') {
                y++;  // North
            } else if(direction.charAt(i) == 'S') {
                y--;  // South
            } else if(direction.charAt(i) == 'W') {
                x--;  // West
            } else {
                x++;  // East
            }
        }
        // sqrt((x2-x1)^2 + (y2-y1)^2)
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }

    public static void main(String args[]) {
        String direction = "WNEENESENNN";
        System.out.println(GetShortestPath(direction));
    }
}
