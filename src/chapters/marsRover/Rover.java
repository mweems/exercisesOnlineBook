package chapters.marsRover;

public class Rover {

    private int XPosition;
    private int YPosition;
    private String direction;

    public String move(String startPosition, String movementInstructions) {
        String endPosition = "";
        setStart(startPosition);
        endPosition = doMovement(movementInstructions);
        return endPosition;
    }

    private String doMovement(String movementInstructions) {
        String endPosition = "";
        for(int i = 0; i < movementInstructions.length(); i++){
            if(movementInstructions.charAt(i) == 'L' || movementInstructions.charAt(i) == 'R'){
                turn(movementInstructions.charAt(i));
            } else if(movementInstructions.charAt(i) == 'M'){
            rollForward();
            } else {
                return "not a valid character";
            }
        }
            endPosition += XPosition;
            endPosition += YPosition;
            endPosition += direction;
            return endPosition;
    }

    private void turn(char movement) {
        if(movement == 'R'){
            char d = direction.charAt(0);
            switch (d){
                case 'N': direction = "E";
                    break;
                case 'E': direction = "S";
                    break;
                case 'S': direction = "W";
                    break;
                case 'W': direction = "N";
            }
        } else {
            char d = direction.charAt(0);
            switch (d){
                case 'N': direction = "W";
                    break;
                case 'W': direction = "S";
                    break;
                case 'S': direction = "E";
                    break;
                case 'E': direction = "N";
                    break;
            }
        }
    }

    private void rollForward() {
        char d = direction.charAt(0);
        switch (d){
            case 'N': YPosition += 1;
                break;
            case 'S': YPosition -= 1;
                break;
            case 'E': XPosition += 1;
                break;
            case 'W': XPosition -= 1;
        }
    }

    private void setStart(String startPosition) {
        String[] positionArray = startPosition.split(" ");
        XPosition = Integer.parseInt(positionArray[0]);
        YPosition = Integer.parseInt(positionArray[1]);
        direction = positionArray[2];
    }
}
