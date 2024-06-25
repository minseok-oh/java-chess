package chess.pieces;

import java.util.Objects;

public class Piece {
    private final Color color;
    private final Type type;

    private Piece(final Color color, final Type type) {
        this.color = color;
        this.type = type;
    }

    private static Piece createWhite(final Type type) { return new Piece(Color.WHITE, type); }
    private static Piece createBlack(final Type type) { return new Piece(Color.BLACK, type); }

    public static Piece createWhitePawn() {
        return createWhite(Type.PAWN);
    }

    public static Piece createBlackPawn() { return createBlack(Type.PAWN); }

    public static Piece createWhiteKnight() {
        return createWhite(Type.KNIGHT);
    }

    public static Piece createBlackKnight() {
        return createBlack(Type.KNIGHT);
    }

    public static Piece createWhiteRook() {
        return createWhite(Type.ROOK);
    }

    public static Piece createBlackRook() {
        return createBlack(Type.ROOK);
    }

    public static Piece createWhiteBishop() {
        return createWhite(Type.BISHOP);
    }

    public static Piece createBlackBishop() {
        return createBlack(Type.BISHOP);
    }

    public static Piece createWhiteQueen() {
        return createWhite(Type.QUEEN);
    }

    public static Piece createBlackQueen() {
        return createBlack(Type.QUEEN);
    }

    public static Piece createWhiteKing() {
        return createWhite(Type.KING);
    }

    public static Piece createBlackKing() {
        return createBlack(Type.KING);
    }

    public static Piece createBlank() { return new Piece(Color.NO_COLOR, Type.NO_PIECE); }

    public Color getColor() {
        return this.color;
    }

    public Type getType() {
        return this.type;
    }

    public boolean isWhite() { return Objects.equals(this.color, Color.WHITE); }

    public boolean isBlack() { return Objects.equals(this.color, Color.BLACK); }
}