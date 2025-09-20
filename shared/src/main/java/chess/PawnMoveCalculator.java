package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PawnMoveCalculator implements PieceMovesCalculator {

    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        int currentRow = myPosition.getRow();
        int currentColumn = myPosition.getColumn();
        List<ChessMove> moves = new ArrayList<>();

        int[][] BdiagDirections = {
                {-1, -1}, {-1, 1},};
        int[][] BtravelDirections = {{-1, 0}, {-2, 0}};
        int[][] oneStepDirection = {{-1, 0}};

        //BLACK PAWN PIECES//
        if (board.getPiece(myPosition).getTeamColor() == ChessGame.TeamColor.BLACK) {
            currentRow = myPosition.getRow();
            currentColumn = myPosition.getColumn();

            if (currentRow == 7) {
                int[] moveTwo = BtravelDirections[1];
                currentRow += moveTwo[0];
                currentColumn += moveTwo[1];
                ChessPosition newPosition = new ChessPosition(currentRow, currentColumn);
                if (board.getPiece(newPosition) == null) {
                    moves.add(new ChessMove(myPosition, newPosition, null));
                }
            }

            for (int i = 0; i < 1; i++) {
                int[] row_colDirection = BdiagDirections[i];
                currentRow += row_colDirection[0];
                currentColumn += row_colDirection[1];
                if (currentRow < 1 || currentRow > 8 || currentColumn < 1 || currentColumn > 8) {
                    break;
                }
                ChessPosition newPostion = new ChessPosition(currentRow, currentColumn);
                if (board.getPiece(newPostion) != null) {
                    if (board.getPiece(newPostion).getTeamColor() != board.getPiece(myPosition).getTeamColor()) {
                        moves.add(new ChessMove(myPosition, newPostion, null));
                    }
                } else {
                    break;
                }
            }

            for (int i = 0; i < 1; i++) {
                int[] row_colDirection = oneStepDirection[i];
                currentRow = myPosition.getRow() + row_colDirection[0];
                currentColumn = myPosition.getColumn() + row_colDirection[1];
                if (currentRow < 1 || currentRow > 8 || currentColumn < 1 || currentColumn > 8) {
                    break;
                }
                ChessPosition newPostion = new ChessPosition(currentRow, currentColumn);
                if (board.getPiece(newPostion) == null) {
                    if (newPostion.getRow() == 1) {
                        moves.add(new ChessMove(myPosition, newPostion, null));
                        moves.add(new ChessMove(myPosition, newPostion, null));
                        moves.add(new ChessMove(myPosition, newPostion, null));
                    }
                    moves.add(new ChessMove(myPosition, newPostion, null));
                } else {
                    break;
                }

            }
        }


        //WHITE PAWN PIECE//
        int[][] WdiagDirections = {
                {1, -1}, {1, 1},};
        int[][] WtravelDirections = {{1, 0}, {2, 0}};
        int[][] WoneStepDirection = {{1, 0}};


        if (board.getPiece(myPosition).getTeamColor() == ChessGame.TeamColor.WHITE) {
            currentRow = myPosition.getRow();
            currentColumn = myPosition.getColumn();

            if (currentRow == 2) {
                int[] moveTwo = WtravelDirections[1];
                currentRow += moveTwo[0];
                currentColumn += moveTwo[1];
                ChessPosition newPosition = new ChessPosition(currentRow, currentColumn);
                if (board.getPiece(newPosition) == null) {
                    moves.add(new ChessMove(myPosition, newPosition, null));
                }
            }

            for (int i = 0; i < 1; i++) {
                int[] row_colDirection = WdiagDirections[i];
                currentRow += row_colDirection[0];
                currentColumn += row_colDirection[1];
                if (currentRow < 1 || currentRow > 8 || currentColumn < 1 || currentColumn > 8) {
                    break;
                }
                ChessPosition newPostion = new ChessPosition(currentRow, currentColumn);
                if (board.getPiece(newPostion) != null) {
                    if (board.getPiece(newPostion).getTeamColor() != board.getPiece(myPosition).getTeamColor()) {
                        moves.add(new ChessMove(myPosition, newPostion, null));
                    }
                } else {
                    break;
                }
            }

            for (int i = 0; i < 1; i++) {
                int[] row_colDirection = WoneStepDirection[i];
                currentRow = myPosition.getRow() + row_colDirection[0];
                currentColumn = myPosition.getColumn() + row_colDirection[1];
                if (currentRow < 1 || currentRow > 8 || currentColumn < 1 || currentColumn > 8) {
                    break;
                }
                ChessPosition newPostion = new ChessPosition(currentRow, currentColumn);
                if (board.getPiece(newPostion) == null) {
                    if (newPostion.getRow() == 8) {
                        moves.add(new ChessMove(myPosition, newPostion, null));
                        moves.add(new ChessMove(myPosition, newPostion, null));
                        moves.add(new ChessMove(myPosition, newPostion, null));
                    }
                    moves.add(new ChessMove(myPosition, newPostion, null));
                } else {
                    break;
                }

            }

        }
        return moves;


    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}






