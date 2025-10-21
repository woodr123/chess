package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class KingMoveCalculator implements PieceMovesCalculator {

    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        int currentRow = myPosition.getRow();
        int currentColumn = myPosition.getColumn();
        List<ChessMove> moves = new ArrayList<>();

        //directions that a king can go. Up, Down, Left, Right, up-left, up-right, down-left, down-right. Only 1 space each.
        int[][] directions = {
                {1, -1}, {1, 0}, {1, 1},
                {0, -1}, {0, 1},
                {-1,-1}, {-1, 0}, {-1, 1}
        };
        for (int i=0; i <= 7; i++) {
            int[] rol_colDirection = directions[i];
            currentRow = myPosition.getRow() + rol_colDirection[0];
            currentColumn = myPosition.getColumn() + rol_colDirection[1];
            if (currentRow >= 1 && currentRow <= 8 && currentColumn >= 1 && currentColumn <= 8) {
                ChessPosition newPosition = new ChessPosition(currentRow, currentColumn);
                if (board.getPiece(newPosition) == null){
                    moves.add(new ChessMove(myPosition, newPosition, null));
                }
                else if (board.getPiece(newPosition).getTeamColor() == board.getPiece(myPosition).getTeamColor()) {
                    continue;
                }
                else if (board.getPiece(newPosition).getTeamColor() != board.getPiece(myPosition).getTeamColor()){
                    moves.add(new ChessMove(myPosition, newPosition, null));
                }
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
}