public class Board {
    Piece[][] board;

    public Board() {
        this.board = new Piece[8][8];
    }

    public static int[] toCoordinates(String square) {
        if (square.length()!=2) {
            throw new IllegalArgumentException("Not a valid square.");
        }

        char column = square.toUpperCase().charAt(0);
        int line = (square.charAt(1))-'0';

        if (column < 'A' || column > 'H') {
            throw new IllegalArgumentException("Not a valid square. (Invalid column)");
        } else if (line < 1 || line > 8) {
            throw new IllegalArgumentException("Not a valid square. (Invalid line)");
        }

        int[] coordinates = new int[2];

        coordinates[0] = Math.abs(line-8);
        coordinates[1] = column-'A';
        
        return coordinates;
    }

    //private boolean isLegal(int[] from, int[] to) {}

    public void move(String from, String to) {
        int[] iFrom = toCoordinates(from);
        int[] iTo = toCoordinates(to);

        //if (this.board.isLegal(iFrom,iTo)) {
        this.board[iTo[0]][iTo[1]] = this.board[iFrom[0]][iFrom[1]];
        this.board[iFrom[0]][iFrom[1]] = null; 
        //}
    }
}

