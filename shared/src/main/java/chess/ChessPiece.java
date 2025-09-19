package chess;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

/**
 * Represents a single chess piece
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessPiece{

    public  ChessGame.TeamColor pieceColor;
    private final PieceType type;
    private PieceMovesCalculator calculator;

    public ChessPiece(ChessGame.TeamColor pieceColor, ChessPiece.PieceType type) {
        this.pieceColor = pieceColor;
        this.type = type;
        if (type==PieceType.BISHOP) {
            this.calculator = new BishopMoveCalculator();
        }
        else if (type==PieceType.KNIGHT) {
            this.calculator = new KnightMoveCalculator();
        }
        else if (type==PieceType.QUEEN) {
            this.calculator = new QueenMoveCalculator();
        }
        else if (type==PieceType.ROOK) {
            this.calculator = new RookMoveCalculator();
        }
        else if (type==PieceType.KING) {
            this.calculator = new KingMoveCalculator();
        }
        else if (type==PieceType.PAWN) {
            this.calculator = new PawnMoveCalculator();
        }
    }

    /**
     * The various different chess piece options
     */
    public enum PieceType {
        KING,
        QUEEN,
        BISHOP,
        KNIGHT,
        ROOK,
        PAWN
    }

    /**
     * @return Which team this chess piece belongs to
     */
    public ChessGame.TeamColor getTeamColor() {
       return pieceColor;
    }

    /**
     * @return which type of chess piece this piece is
     */
    public PieceType getPieceType() {
        return  type;
    }

    /**
     * Calculates all the positions a chess piece can move to
     * Does not take into account moves that are illegal due to leaving the king in
     * danger
     *
     * @return Collection of valid moves
     */
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        return this.calculator.pieceMoves(board, myPosition);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChessPiece that = (ChessPiece) o;
        return pieceColor == that.pieceColor && type == that.type && Objects.equals(calculator, that.calculator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pieceColor, type, calculator);
    }
}
