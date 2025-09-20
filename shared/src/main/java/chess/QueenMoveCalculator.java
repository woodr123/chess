package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class QueenMoveCalculator implements PieceMovesCalculator {

    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        List<ChessMove> moves = new ArrayList<>();
        int currentRow = myPosition.getRow();
        int currentColumn = myPosition.getColumn();

        int[][] directions = {
                {1, 0}, {0, 1},
                {-1, 0}, {0, -1},
                {1, -1}, {1, 1},
                {-1, -1}, {-1, 1}
        };

        for (int i = 0; i < 8; i++) {
            int[] row_colDirection = directions[i];
            currentRow = myPosition.getRow();
            currentColumn = myPosition.getColumn();
            while (true) {
                currentRow += row_colDirection[0];
                currentColumn += row_colDirection[1];
                if (currentRow < 1 || currentRow > 8 || currentColumn < 1 || currentColumn > 8) {
                    break;
                }
                ChessPosition newPosition = new ChessPosition(currentRow, currentColumn);
                if (board.getPiece(newPosition) == null) {
                    moves.add(new ChessMove(myPosition, newPosition, null));
                }
                else if (board.getPiece(newPosition).getTeamColor() == board.getPiece(myPosition).getTeamColor()) {
                    break;
                }
                else if ((board.getPiece(newPosition).getTeamColor() != board.getPiece(myPosition).getTeamColor())) {
                    moves.add(new ChessMove(myPosition, newPosition,null ));
                    break;
                }
            }
        }

        return moves;
    }
}