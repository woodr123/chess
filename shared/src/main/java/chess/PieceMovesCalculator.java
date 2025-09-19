package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public interface PieceMovesCalculator {

    Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition);
}
