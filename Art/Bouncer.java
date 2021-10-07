public class Bouncer {
    public static void main(String[] args) {
        int game_width = 5;

        // Start position of the ball
        int ball_position = 2;

    /* The start direction of the ball
    /   false = left, true = right
    */
        boolean ball_direction = false;

        String lines = "";

        while (true) {
            // Add a "wall" to the left
            String new_line = "|";

            // Make the "game" area based on the preconfigured width
            for (int i = 0; i <= game_width; i++) {
                if (i == ball_position) {
                    // If the current position is the position of the ball, draw the ball
                    new_line += "*";
                } else {
                    // If the current position is not the ball, draw a space
                    new_line += " ";
                }
            }

            // Add a "wall" to the right
            new_line += "|";

            // Print the line
            System.out.println(new_line);


            if (!ball_direction && ball_position == 0) {
                // If the ball is going left and hit the left wall: change direction
                ball_direction = !ball_direction;
            } else if (ball_direction && ball_position >= game_width) {
                // if the ball is going right and hit the right wall: change direction
                ball_direction = !ball_direction;
            }

            // Move ball
            if (ball_direction) {
                // Move ball position one step to the right
                ball_position++;
            } else {
                // Move ball position one step to the left
                ball_position--;
            }

            // "Thread.sleep()" requires try/catch
            try {
                // Wait for 250 milliseconds (a quarter of a second)
                Thread.sleep(250);
            } catch (Exception e) {
                System.out.println("Exception for Thread.sleep(): " + e);
            }

        }
    }
}
