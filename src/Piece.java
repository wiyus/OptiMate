public class Piece {
    public enum Type {
        KING, QUEEN, ROOK, BISHOP, KNIGHT, PAWN
    }

    public enum Color {
        WHITE, BLACK
    }

    private Type piece;
    private Color color;

    public Piece(Type piece, Color color) {
        this.piece = piece;
        this.color = color;
    }

    public Type getType() {
        return this.piece;
    }

    public Color getColor() {
        return this.color;
    }

    public void promote() {
        if (this.piece == Type.PAWN) {
            this.piece = Type.QUEEN;
        }
    }
}
