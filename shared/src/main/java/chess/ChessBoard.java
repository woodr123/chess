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
    public static ChessBoard resetBoard() {

        ChessPiece wRook = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.ROOK);
        ChessPiece wKnight = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.KNIGHT);
        ChessPiece wBishop = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.BISHOP);
        ChessPiece wQueen = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.QUEEN);
        ChessPiece wKing = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.KING);
        ChessPiece wPawn = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.PAWN);

        ChessPiece bRook = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.ROOK);
        ChessPiece bKnight = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.KNIGHT);
        ChessPiece bBishop = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.BISHOP);
        ChessPiece bQueen = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.QUEEN);
        ChessPiece bKing = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.KING);
        ChessPiece bPawn = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.PAWN);
        //NewBoard Created
        ChessBoard newBoard = new ChessBoard();

        //Player White
        newBoard.addPiece(new ChessPosition(1,1), wRook);
        newBoard.addPiece(new ChessPosition(1,2), wKnight);
        newBoard.addPiece(new ChessPosition(1,3), wBishop);
        newBoard.addPiece(new ChessPosition(1,4), wQueen);
        newBoard.addPiece(new ChessPosition(1,5), wKing);
        newBoard.addPiece(new ChessPosition(1,6), wBishop);
        newBoard.addPiece(new ChessPosition(1,7), wKnight);
        newBoard.addPiece(new ChessPosition(1,8), wRook);
        newBoard.addPiece(new ChessPosition(2,1), wPawn);
        newBoard.addPiece(new ChessPosition(2,2), wPawn);
        newBoard.addPiece(new ChessPosition(2,3), wPawn);
        newBoard.addPiece(new ChessPosition(2,4), wPawn);
        newBoard.addPiece(new ChessPosition(2,5), wPawn);
        newBoard.addPiece(new ChessPosition(2,6), wPawn);
        newBoard.addPiece(new ChessPosition(2,7), wPawn);
        newBoard.addPiece(new ChessPosition(2,8), wPawn);

        //Player Black
        newBoard.addPiece(new ChessPosition(8,1), bRook);
        newBoard.addPiece(new ChessPosition(8,2), bKnight);
        newBoard.addPiece(new ChessPosition(8,3), bBishop);
        newBoard.addPiece(new ChessPosition(8,4), bQueen);
        newBoard.addPiece(new ChessPosition(8,5), bKing);
        newBoard.addPiece(new ChessPosition(8,6), bBishop);
        newBoard.addPiece(new ChessPosition(8,7), bKnight);
        newBoard.addPiece(new ChessPosition(8,8), bRook);
        newBoard.addPiece(new ChessPosition(7,1), bPawn);
        newBoard.addPiece(new ChessPosition(7,2), bPawn);
        newBoard.addPiece(new ChessPosition(7,3), bPawn);
        newBoard.addPiece(new ChessPosition(7,4), bPawn);
        newBoard.addPiece(new ChessPosition(7,5), bPawn);
        newBoard.addPiece(new ChessPosition(7,6), bPawn);
        newBoard.addPiece(new ChessPosition(7,7), bPawn);
        newBoard.addPiece(new ChessPosition(7,8), bPawn);

//        newBoard.addPiece(new ChessPosition(3,1), null);
//        newBoard.addPiece(new ChessPosition(3,2), null);
//        newBoard.addPiece(new ChessPosition(3,3), null);
//        newBoard.addPiece(new ChessPosition(3,4), null);
//        newBoard.addPiece(new ChessPosition(3,5), null);
//        newBoard.addPiece(new ChessPosition(3,6), null);
//        newBoard.addPiece(new ChessPosition(3,7), null);
//        newBoard.addPiece(new ChessPosition(3,8), null);
//
//        newBoard.addPiece(new ChessPosition(4,1), null);
//        newBoard.addPiece(new ChessPosition(4,2), null);
//        newBoard.addPiece(new ChessPosition(4,3), null);
//        newBoard.addPiece(new ChessPosition(4,4), null);
//        newBoard.addPiece(new ChessPosition(4,5), null);
//        newBoard.addPiece(new ChessPosition(4,6), null);
//        newBoard.addPiece(new ChessPosition(4,7), null);
//        newBoard.addPiece(new ChessPosition(4,8), null);
//
//        newBoard.addPiece(new ChessPosition(5,1), null);
//        newBoard.addPiece(new ChessPosition(5,2), null);
//        newBoard.addPiece(new ChessPosition(5,3), null);
//        newBoard.addPiece(new ChessPosition(5,4), null);
//        newBoard.addPiece(new ChessPosition(5,5), null);
//        newBoard.addPiece(new ChessPosition(5,6), null);
//        newBoard.addPiece(new ChessPosition(5,7), null);
//        newBoard.addPiece(new ChessPosition(5,8), null);
//
//        newBoard.addPiece(new ChessPosition(6,1), null);
//        newBoard.addPiece(new ChessPosition(6,2), null);
//        newBoard.addPiece(new ChessPosition(6,3), null);
//        newBoard.addPiece(new ChessPosition(6,4), null);
//        newBoard.addPiece(new ChessPosition(6,5), null);
//        newBoard.addPiece(new ChessPosition(6,6), null);
//        newBoard.addPiece(new ChessPosition(6,7), null);
//        newBoard.addPiece(new ChessPosition(6,8), null);

        return newBoard;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true; }
        if (!(obj instanceof ChessBoard)) {
            return false;
        }
        ChessBoard other = (ChessBoard) obj;

        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 7; j++) {
                ChessPiece thisPiece = this.getPiece(new ChessPosition(i, j));
                ChessPiece otherPiece = other.getPiece(new ChessPosition(i, j));
                if (thisPiece == null && otherPiece == null) {
                    continue;
                }
                if (thisPiece == null || otherPiece == null) {
                    return false;
                }
                if (!this.getPiece(new ChessPosition(i, j)).equals(other.getPiece(new ChessPosition(i,j)))) {
                    return false;
                }
            }
        }
        return true;
    }


    @Override
    public int hashCode() {

        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


