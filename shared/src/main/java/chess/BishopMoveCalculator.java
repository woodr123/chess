package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BishopMoveCalculator implements PieceMovesCalculator {
    // Bishop moves diagonally in every direction
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        List<ChessMove> moves = new ArrayList<>();
        int currentRow = myPosition.getRow();
        int currentColumn = myPosition.getColumn();

        int[][] directions = {
                {1, -1}, {1, 1}, //up-left, and up-right (diagonals)
                {-1, -1}, {-1, 1} //down-left, and down-right
        };
        for (int i = 0; i <= 3; i++) {
            int[] row_colDirection = directions[i];
            currentRow = myPosition.getRow();
            currentColumn = myPosition.getColumn();
            while (currentRow > 1 && currentRow < 8 && currentColumn < 8 && currentColumn > 1) {
                currentRow += row_colDirection[0];
                currentColumn += row_colDirection[1];
                ChessPosition newPosition = new ChessPosition(currentRow, currentColumn);
                if (board.getPiece(newPosition) == null){
                    moves.add(new ChessMove(myPosition, new ChessPosition(currentRow, currentColumn), null));
                }
                else if (board.getPiece(newPosition).getTeamColor() == board.getPiece(myPosition).getTeamColor()){
                    break;
                    }
                else if (board.getPiece(newPosition).getTeamColor() != board.getPiece(myPosition).getTeamColor()) {
                    moves.add(new ChessMove(myPosition, newPosition, null));
                    break;
                } //It's finally working correctly! Now, I just need to fix this else if ^ to start testing if
                // the piece that we find is an enemy or a friend.

            }
        }

        return moves;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
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
// .getPiece to find out if there is a piece there, and wether it's enemy or not. (enemy or not would be .color or somethin)