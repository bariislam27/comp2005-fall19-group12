import java.awt.Color;

public class Piece {
	public static final int SHAPE_SIZE = 7;
	
	
	// Types of error during put the piece on the board.
	public static final String OFF_BOARD_ERROR = "Piece must be placed entirely on the board.";
	public static final String ADJACENCY_ERROR = "Pieces of the same color cannot share edges with one another.";
	public static final String OVERLAP_ERROR = "Pieces cannot overlap.";
	public static final String START_ERROR = "Starting peice must occupy the player's respective corner.";
	public static final String CORNER_ERROR = "Pieces must be connected to at least one other piece of the the same color by the corner.";
    
	
	// This function makes different shape of pieces.
    public static int[][][] getAllShapes(){
    	int[][][] shapes = new int[21][SHAPE_SIZE][SHAPE_SIZE];
        int i = 0;
        
        // * * * * *
        shapes[i++] = new int[][] { 
           {0, 0, 0, 0, 0, 0, 0},
           {0, 0, 0, 0, 0, 0, 0},
           {1, 2, 2, 2, 2, 2, 1},
           {2, 3, 3, 3, 3, 3, 2},
           {1, 2, 2, 2, 2, 2, 1},
           {0, 0, 0, 0, 0, 0, 0},
           {0, 0, 0, 0, 0, 0, 0}
        };
        
        //*
        //* * * *
        shapes[i++] = new int[][] { 
           {0, 0, 0, 0, 0, 0, 0}, 
           {0, 1, 2, 1, 0, 0, 0},
           {0, 2, 3, 2, 2, 2, 1},
           {0, 2, 3, 3, 3, 3, 2},
           {0, 1, 2, 2, 2, 2, 1},
           {0, 0, 0, 0, 0, 0, 0},
           {0, 0, 0, 0, 0, 0, 0}
        };
        
        //*
        //*
        //* *
        //  *
        shapes[i++] = new int[][] { 
           {0, 0, 1, 2, 1, 0, 0},   
           {0, 0, 2, 3, 2, 0, 0},
           {0, 0, 2, 3, 2, 1, 0},
           {0, 0, 2, 3, 3, 2, 0},
           {0, 0, 1, 2, 3, 2, 0},
           {0, 0, 0, 1, 2, 1, 0},
           {0, 0, 0, 0, 0, 0, 0}
        };
        
        
        //   *
        // * * * *
        shapes[i++] = new int[][] { 
           {0, 0, 0, 0, 0, 0, 0}, 
           {0, 0, 1, 2, 1, 0, 0},
           {0, 1, 2, 3, 2, 2, 1},
           {0, 2, 3, 3, 3, 3, 2},
           {0, 1, 2, 2, 2, 2, 1},
           {0, 0, 0, 0, 0, 0, 0},
           {0, 0, 0, 0, 0, 0, 0}
        };
        
        //  *
        //* * *
        //    *
        shapes[i++] = new int[][] { 
           {0, 0, 0, 0, 0, 0, 0}, 
           {0, 0, 1, 2, 1, 0, 0}, 
           {0, 1, 2, 3, 2, 1, 0},
           {0, 2, 3, 3, 3, 2, 0},
           {0, 1, 2, 2, 3, 2, 0},
           {0, 0, 0, 1, 2, 1, 0},
           {0, 0, 0, 0, 0, 0, 0}
        };
        
        //   *
        // * * *
        //   *
        shapes[i++] = new int[][] { 
           {0, 0, 0, 0, 0, 0, 0}, 
           {0, 0, 1, 2, 1, 0, 0}, 
           {0, 1, 2, 3, 2, 1, 0},
           {0, 2, 3, 3, 3, 2, 0},
           {0, 1, 2, 3, 2, 1, 0},
           {0, 0, 1, 2, 1, 0, 0},
           {0, 0, 0, 0, 0, 0, 0}
        };
        
        // * * *
        // *   *
        shapes[i++] = new int[][] {
           {0, 0, 0, 0, 0, 0, 0},   
           {0, 0, 0, 0, 0, 0, 0},
           {0, 1, 2, 2, 2, 1, 0},
           {0, 2, 3, 3, 3, 2, 0},
           {0, 2, 3, 2, 3, 2, 0},
           {0, 1, 2, 1, 2, 1, 0},
           {0, 0, 0, 0, 0, 0, 0}
        };
        
        // * * *
        //   * *
        shapes[i++] = new int[][] {
           {0, 0, 0, 0, 0, 0, 0}, 
           {0, 0, 0, 0, 0, 0, 0},
           {0, 1, 2, 2, 2, 1, 0},
           {0, 2, 3, 3, 3, 2, 0},
           {0, 1, 2, 3, 3, 2, 0},
           {0, 0, 1, 2, 2, 1, 0},
           {0, 0, 0, 0, 0, 0, 0}
        };
        
        //     *
        //   * *
        // * *
        shapes[i++] = new int[][] {
           {0, 0, 0, 0, 0, 0, 0}, 
           {0, 0, 0, 1, 2, 1, 0},
           {0, 0, 1, 2, 3, 2, 0},
           {0, 1, 2, 3, 3, 2, 0},
           {0, 2, 3, 3, 2, 1, 0},
           {0, 1, 2, 2, 1, 0, 0},
           {0, 0, 0, 0, 0, 0, 0}
        };
        
        //  *
        //  *
        //* * *
        shapes[i++] = new int[][] { 
           {0, 0, 0, 0, 0, 0, 0},   
           {0, 0, 1, 2, 1, 0, 0},   
           {0, 0, 2, 3, 2, 0, 0},
           {0, 1, 2, 3, 2, 1, 0},
           {0, 2, 3, 3, 3, 2, 0},
           {0, 1, 2, 2, 2, 1, 0},
           {0, 0, 0, 0, 0, 0, 0}
        };
        
        // *
        // *
        // * * *
        shapes[i++] = new int[][] { 
           {0, 0, 1, 2, 1, 0, 0},   
           {0, 0, 2, 3, 2, 0, 0},   
           {0, 0, 2, 3, 2, 2, 1},
           {0, 0, 2, 3, 3, 3, 2},
           {0, 0, 1, 2, 2, 2, 1},
           {0, 0, 0, 0, 0, 0, 0},
           {0, 0, 0, 0, 0, 0, 0}
        };
        
        //  * *
        //  *
        //* *
        shapes[i++] = new int[][] { 
           {0, 0, 0, 0, 0, 0, 0},   
           {0, 0, 1, 2, 2, 1, 0},   
           {0, 0, 2, 3, 3, 2, 0},
           {0, 1, 2, 3, 2, 1, 0},
           {0, 2, 3, 3, 2, 0, 0},
           {0, 1, 2, 2, 1, 0, 0},
           {0, 0, 0, 0, 0, 0, 0}
        };
        
        //  *
        //  *
        //  *
        //  *
        shapes[i++] = new int[][] { 
           {0, 0, 1, 2, 1, 0, 0},  
           {0, 0, 2, 3, 2, 0, 0},
           {0, 0, 2, 3, 2, 0, 0},
           {0, 0, 2, 3, 2, 0, 0},
           {0, 0, 2, 3, 2, 0, 0},
           {0, 0, 1, 2, 1, 0, 0},
           {0, 0, 0, 0, 0, 0, 0}
        };
        
        //  * *
        //* *
        shapes[i++] = new int[][] { 
           {0, 0, 0, 0, 0, 0, 0},  
           {0, 0, 1, 2, 2, 1, 0},
           {0, 1, 2, 3, 3, 2, 0},
           {0, 2, 3, 3, 2, 1, 0},
           {0, 1, 2, 2, 1, 0, 0},
           {0, 0, 0, 0, 0, 0, 0},
           {0, 0, 0, 0, 0, 0, 0}
        };
        
        //* *
        //* *
        shapes[i++] = new int[][] {
           {0, 0, 0, 0, 0, 0, 0}, 
           {0, 1, 2, 2, 1, 0, 0},
           {0, 2, 3, 3, 2, 0, 0},
           {0, 2, 3, 3, 2, 0, 0},
           {0, 1, 2, 2, 1, 0, 0},
           {0, 0, 0, 0, 0, 0, 0},
           {0, 0, 0, 0, 0, 0, 0}
        };
        
        //   *
        // * * *
        shapes[i++] = new int[][] { 
           {0, 0, 0, 0, 0, 0, 0},
           {0, 0, 1, 2, 1, 0, 0},
           {0, 1, 2, 3, 2, 1, 0},
           {0, 2, 3, 3, 3, 2, 0},
           {0, 1, 2, 2, 2, 1, 0},
           {0, 0, 0, 0, 0, 0, 0},
           {0, 0, 0, 0, 0, 0, 0}
        };
        
        // * * *
        //     *
        shapes[i++] = new int[][] { 
           {0, 0, 0, 0, 0, 0, 0}, 
           {0, 0, 0, 0, 0, 0, 0},
           {0, 1, 2, 2, 2, 2, 0},
           {0, 2, 3, 3, 3, 2, 0},
           {0, 1, 2, 2, 3, 2, 0},
           {0, 0, 0, 1, 2, 1, 0},
           {0, 0, 0, 0, 0, 0, 0}
        };
        
        // * * *
        shapes[i++] = new int[][] {  
           {0, 0, 0, 0, 0, 0, 0},   
           {0, 0, 0, 0, 0, 0, 0},
           {0, 1, 2, 2, 2, 1, 0},
           {0, 2, 3, 3, 3, 2, 0},
           {0, 1, 2, 2, 2, 1, 0},
           {0, 0, 0, 0, 0, 0, 0},
           {0, 0, 0, 0, 0, 0, 0}
        };
        
        // *
        // * *
        shapes[i++] = new int[][] { 
           {0, 0, 0, 0, 0, 0, 0},   
           {0, 0, 1, 2, 1, 0, 0},
           {0, 0, 2, 3, 2, 1, 0},
           {0, 0, 2, 3, 3, 2, 0},
           {0, 0, 1, 2, 2, 1, 0},
           {0, 0, 0, 0, 0, 0, 0},
           {0, 0, 0, 0, 0, 0, 0}
        };
        
        // *
        // *
        shapes[i++] = new int[][] { 
           {0, 0, 0, 0, 0, 0, 0},   
           {0, 0, 1, 2, 1, 0, 0},
           {0, 0, 2, 3, 2, 0, 0},
           {0, 0, 2, 3, 2, 0, 0},
           {0, 0, 1, 2, 1, 0, 0},
           {0, 0, 0, 0, 0, 0, 0},
           {0, 0, 0, 0, 0, 0, 0}
        };
        
        // *
        shapes[i++] = new int[][] { 
           {0, 0, 0, 0, 0, 0, 0},   
           {0, 0, 0, 0, 0, 0, 0},
           {0, 0, 1, 2, 1, 0, 0},
           {0, 0, 2, 3, 2, 0, 0},
           {0, 0, 1, 2, 1, 0, 0},
           {0, 0, 0, 0, 0, 0, 0},
           {0, 0, 0, 0, 0, 0, 0}
        };
    	return shapes;
    }










}
