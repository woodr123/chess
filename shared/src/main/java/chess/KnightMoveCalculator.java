package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class KnightMoveCalculator implements PieceMovesCalculator {

    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        int currentRow = myPosition.getRow();
        int currentColumn = myPosition.getColumn();
        List<ChessMove> moves = new ArrayList<>();

        int[][] directions = {
                {2, -1}, {2, 1}, {1, 2},
                {-1, 2}, {-2, 1}, {-2, -1},
                {-1, -2}, {1, -2}
        };
        for (int i = 0; i < 8; i++) {
            int[] row_colDirection = directions[i];
            currentRow = myPosition.getRow() + row_colDirection[0];
            currentColumn = myPosition.getColumn() + row_colDirection[1];
            if (currentRow >= 1 && currentRow <= 8 && currentColumn >= 1 && currentColumn <= 8) {
                ChessPosition newPosition = new ChessPosition(currentRow, currentColumn);
                if (board.getPiece(newPosition) == null) {
                    moves.add(new ChessMove(myPosition, newPosition, null));
                } else if (board.getPiece(newPosition).getTeamColor() == board.getPiece(myPosition).getTeamColor()) {
                    continue;
                } else if (board.getPiece(newPosition).getTeamColor() != board.getPiece(myPosition).getTeamColor()) {
                    moves.add(new ChessMove(myPosition, newPosition, null));
                }
            }
        }

        return moves;
    }
}