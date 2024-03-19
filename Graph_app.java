public class Graph_app {
    public static void main(String[] args)
    {
        int[][] arr = {
            {0, 6, 0, 1, 0},
            {6, 0, 5, 2, 2},
            {0, 5, 0, 0, 5},
            {1, 2, 0, 0, 1},
            {0, 2, 5, 1, 0}
        };
        
        Graph T = new Graph();
        T.Run(arr);
        
    }
}
