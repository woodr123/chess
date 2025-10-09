package chess;

/**
 * This class stores all the uncaptured pieces in a Game.
 * It needs to support adding and removing pieces for testing, as well as a resetBoard()
 * method that sets the standard Chess starting configuration.
 */


import java.util.Arrays;
import java.util.Objects;

/**
 * A chessboard that can hold and rearrange chess pieces.
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessBoard {

    ChessPiece[][] squares = new ChessPiece[8][8];
    public ChessBoard() {
        
    }

    /**
     * Adds a chess piece to the chessboard
     *
     * @param position where to add the piece to
     * @param piece    the piece to add
     */
    public void addPiece(ChessPosition position, ChessPiece piece) {
        squares[position.getRow()-1][position.getColumn()-1] = piece;
    }



    /**
     * Gets a chess piece on the chessboard
     *
     * @param position The position to get the piece from
     * @return Either the piece at the position, or null if no piece is at that
     * position
     */
    public ChessPiece getPiece(ChessPosition position) {
        return squares[position.getRow()-1][position.getColumn()-1];
    }

    /**
     * Sets the board to the default starting board
     * (How the game of chess normally starts)
     */
    public void resetBoard() {

        for (int row = 1; row <= 8; row++) {
            for (int col = 1; col <= 8; col++) {
                addPiece(new ChessPosition(row, col), null);
            }
        }


        ChessPiece wRook = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.ROOK);
        ChessPiece w2Rook = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.ROOK);
        ChessPiece wKnight = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.KNIGHT);
        ChessPiece w2Knight = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.KNIGHT);
        ChessPiece wBishop = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.BISHOP);
        ChessPiece w2Bishop = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.BISHOP);
        ChessPiece wQueen = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.QUEEN);
        ChessPiece wKing = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.KING);
        ChessPiece w1Pawn = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.PAWN);
        ChessPiece w2Pawn = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.PAWN);
        ChessPiece w3Pawn = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.PAWN);
        ChessPiece w4Pawn = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.PAWN);
        ChessPiece w5Pawn = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.PAWN);
        ChessPiece w6Pawn = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.PAWN);
        ChessPiece w7Pawn = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.PAWN);
        ChessPiece w8Pawn = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.PAWN);

        ChessPiece bRook = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.ROOK);
        ChessPiece b2Rook = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.ROOK);
        ChessPiece bKnight = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.KNIGHT);
        ChessPiece b2Knight = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.KNIGHT);
        ChessPiece bBishop = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.BISHOP);
        ChessPiece b2Bishop = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.BISHOP);
        ChessPiece bQueen = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.QUEEN);
        ChessPiece bKing = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.KING);
        ChessPiece b1Pawn = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.PAWN);
        ChessPiece b2Pawn = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.PAWN);
        ChessPiece b3Pawn = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.PAWN);
        ChessPiece b4Pawn = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.PAWN);
        ChessPiece b5Pawn = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.PAWN);
        ChessPiece b6Pawn = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.PAWN);
        ChessPiece b7Pawn = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.PAWN);
        ChessPiece b8Pawn = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.PAWN);
        //NewBoard Created


        //Player White
        addPiece(new ChessPosition(1,1), wRook);
        addPiece(new ChessPosition(1,2), wKnight);
        addPiece(new ChessPosition(1,3), wBishop);
        addPiece(new ChessPosition(1,4), wQueen);
        addPiece(new ChessPosition(1,5), wKing);
        addPiece(new ChessPosition(1,6), w2Bishop);
        addPiece(new ChessPosition(1,7), w2Knight);
        addPiece(new ChessPosition(1,8), w2Rook);
        addPiece(new ChessPosition(2,1), w1Pawn);
        addPiece(new ChessPosition(2,2), w2Pawn);
        addPiece(new ChessPosition(2,3), w3Pawn);
        addPiece(new ChessPosition(2,4), w4Pawn);
        addPiece(new ChessPosition(2,5), w5Pawn);
        addPiece(new ChessPosition(2,6), w6Pawn);
        addPiece(new ChessPosition(2,7), w7Pawn);
        addPiece(new ChessPosition(2,8), w8Pawn);

        //Player Black
        addPiece(new ChessPosition(8,1), bRook);
        addPiece(new ChessPosition(8,2), bKnight);
        addPiece(new ChessPosition(8,3), bBishop);
        addPiece(new ChessPosition(8,4), bQueen);
        addPiece(new ChessPosition(8,5), bKing);
        addPiece(new ChessPosition(8,6), b2Bishop);
        addPiece(new ChessPosition(8,7), b2Knight);
        addPiece(new ChessPosition(8,8), b2Rook);
        addPiece(new ChessPosition(7,1), b1Pawn);
        addPiece(new ChessPosition(7,2), b2Pawn);
        addPiece(new ChessPosition(7,3), b3Pawn);
        addPiece(new ChessPosition(7,4), b4Pawn);
        addPiece(new ChessPosition(7,5), b5Pawn);
        addPiece(new ChessPosition(7,6), b6Pawn);
        addPiece(new ChessPosition(7,7), b7Pawn);
        addPiece(new ChessPosition(7,8), b8Pawn);

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChessBoard that = (ChessBoard) o;
        return Objects.deepEquals(squares, that.squares);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(squares);
    }


}


