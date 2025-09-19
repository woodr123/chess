package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BishopMoveCalculator implements PieceMovesCalculator {
    // Bishop moves diagonally in every direction
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        List moves = List.of(myPosition);
        int currentRow = myPosition.getRow();
        int currentColumn = myPosition.getColumn();

        int[][] directions = {
                {1, -1}, {1, 1}, //up-left, and up-right (diagnals)
                {-1, -1}, {-1, 1} //down-left, and down-right
        };
        for (int i = 0; i<= 4; i++) {
            int[] row_colDirection = directions[i];
            while (currentRow > 1 && currentRow < 8 && currentColumn < 8 && currentColumn > 1) {
                currentRow += row_colDirection[0];
                currentColumn += row_colDirection[1];

            }
        }

        return moves;
    }
}
// .getPiece to find out if there is a piece there, and wether it's enemy or not. (enemy or not would be .color or somethin)