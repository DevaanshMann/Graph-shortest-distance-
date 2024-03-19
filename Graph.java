// Devaansh Mann
// Week 11 - Graph project
// April 9, 2023

import tools.*;
import tools.Colors;


class item {

public char vertex;
public int ShortestDist;
public int vertexFrom;
public boolean marked;

};

public class Graph {

    int []visited = {0,0,0,0,0};

    item[] TabularDepiction = new item[5];

    void displayDFS(int[][] arr, int nodeNum)
    {
        visited[nodeNum] = 1;
        
        if(nodeNum == 0)
        {
            Draw_A(); 

            try {
                Thread.sleep(300);
            } catch (Exception e) {

            }
            
            Draw_B(); 

            try {
                Thread.sleep(300);
            } catch (Exception e) {

            }
            
            Draw_C(); 

            try {
                Thread.sleep(300);
            } catch (Exception e) {

            }
            
            Draw_D();
            
            try {
                Thread.sleep(300);
            } catch (Exception e) {

            }
            
            Draw_E();

            try {
                Thread.sleep(300);
            } catch (Exception e) {

            }
        }
       
        for(int i = 0; i < 5; i++)
        {
            if(arr[nodeNum][i] != 0 && (visited[i] != 1))
            {
                Connections(i, i);
            }
        }
    }

    void Connections(int nodeNum, int i) 
    {
        if (nodeNum == i) 
        {
            ConnectingAtoB();

            try {
                Thread.sleep(300);
            } catch (Exception e) {

            }
            
            ConnectingAtoC();

            try {
                Thread.sleep(300);
            } catch (Exception e) {

            }

            ConnectingAtoD();

            try {
                Thread.sleep(300);
            } catch (Exception e) {

            }

            ConnectingAtoE();

            try {
                Thread.sleep(300);
            } catch (Exception e) {

            }

            ConnectingBtoC();

            try {
                Thread.sleep(300);
            } catch (Exception e) {

            }

            ConnectingBtoD();

            try {
                Thread.sleep(300);
            } catch (Exception e) {

            }
            
            ConnectingBtoE();

            try {
                Thread.sleep(300);
            } catch (Exception e) {

            }

            ConnectingCtoD();

            try {
                Thread.sleep(300);
            } catch (Exception e) {

            }
            
            ConnectingEtoD();

            System.err.println("\n\n\n");
            
        }
    }

    void PrintInfo(int[][] arr)
    {
        displayDFS(arr, 0);        
    }
    
    void Draw_A()
    {
        Controls.Box(48, 20, 7, 4, 91, Colors.BLUE, Colors.WHITE_BACKGROUND);
        Controls.printxy(51, 21, "A");
    }

    void Draw_B()
    {    
        Controls.Box(20, 10, 7, 4, 91, Colors.GREEN, Colors.WHITE_BACKGROUND);
        Controls.printxy(23, 11, "B");
    }

    void Draw_C()
    {
        Controls.Box(80, 10, 7, 4, 91, Colors.PURPLE, Colors.WHITE_BACKGROUND);
        Controls.printxy(83, 11, "C");
    }

    void Draw_D()
    {
        Controls.Box(20, 30, 7, 4, 91, Colors.RED, Colors.WHITE_BACKGROUND);
        Controls.printxy(23, 31, "D");
    }

    void Draw_E()
    {
        Controls.Box(80, 30, 7, 4, 91, Colors.YELLOW, Colors.WHITE_BACKGROUND);
        Controls.printxy(83, 31, "E");
    }

    
    void ConnectingAtoB()
    {
        for(int i = 27; i < 49; i++)
        {
            Controls.printxy(i, 11, "--");
        }
        for(int i = 11; i < 20; i++)
        {
            Controls.printxy(49, i, "|");
        }
    }


    void ConnectingAtoC()
    {
        for(int i = 52; i < 79; i++)
        {
            Controls.printxy(i, 11, "--");
        }
        for(int i = 12; i < 20; i++)
        {
            Controls.printxy(52, i, "|");
        }
    }



    void ConnectingAtoD()
    {
        for(int i = 27; i < 49; i++)
        {
            Controls.printxy(i, 31, "--");
        }
        for(int i = 24; i < 31; i++)
        {
            Controls.printxy(49, i, "|");
        }
    }



    void ConnectingAtoE()
    {
        for(int i = 52; i < 79; i++)
        {
            Controls.printxy(i, 31, "--");
        }
        for(int i = 24; i < 31; i++)
        {
            Controls.printxy(52, i, "|");
        }
    }

    

    void ConnectingBtoC()
    {
        for(int i = 23; i < 82; i++)
        {
            Controls.printxy(i, 7, "--");
        }
        for(int i = 7; i < 10; i++)
        {
            Controls.printxy(83, i, "|");
        }
        for(int i = 7; i < 10; i++)
        {
            Controls.printxy(23, i, "|");
        }
    }



    void ConnectingBtoD()
    {
        for(int i = 45; i < 49; i++)
        {
            Controls.printxy(i, 11, "--");
        }
        for(int i = 14; i < 30; i++)
        {
            Controls.printxy(23, i, "|");
        }
    }

    

    void ConnectingBtoE()
    {
        for(int i = 7; i < 19; i++)
        {
            Controls.printxy(i, 11, "--");
        }
        for(int i = 12; i < 41; i++)
        {
            Controls.printxy(7, i, "|");
        }
        for(int i =7; i < 93; i++)
        {
            Controls.printxy(i, 40, "--");
        }
        for(int i = 32; i < 40; i++)
        {
            Controls.printxy(93, i, "|");
        }
        for(int i = 87; i < 93; i++)
        {
            Controls.printxy(i, 31, "--");
        }
    }



    void ConnectingCtoD()
    {
        for(int i = 87; i < 90; i++)
        {
            Controls.printxy(i, 11, "--");
        }
        for(int i = 4; i < 11; i++)
        {
            Controls.printxy(90, i, "|");
        }
        for(int i = 16; i < 90; i++)
        {
            Controls.printxy(i, 3, "--");
        }
        for(int i = 4; i < 32; i++)
        {
            Controls.printxy(16, i, "|");
        }
        for(int i = 16; i < 19; i++)
        {
            Controls.printxy(i, 31, "--");
        }
    }



    void ConnectingEtoD()
    {
        
        for(int i = 24; i < 83; i++)
        {
            Controls.printxy(i, 36, "--");
        }
        for(int i = 34; i < 37; i++)
        {
            Controls.printxy(23, i, "|");
        }
        for(int i = 34; i < 37; i++)
        {
            Controls.printxy(83, i, "|");
        }
    }



    void nodeDistance(int [][] arr)
    {
        // A to B
        for(int i = 35; i < 36; i++)
        {
            Controls.printxy(i, 12, arr[0][1]);
        }

        try {
            Thread.sleep(200);
        } catch (Exception e) {

        }

        // A to C
        for(int i = 68; i < 69; i++)
        {
            Controls.printxy(i, 12, arr[0][2]);
        }

        try {
            Thread.sleep(200);
        } catch (Exception e) {

        }

        // A to D
        for(int i = 35; i < 36; i++)
        {
            Controls.printxy(i, 30, arr[0][3]);
        }

        try {
            Thread.sleep(200);
        } catch (Exception e) {

        }

        // A to E
        for(int i = 68; i < 69; i++)
        {
            Controls.printxy(i, 30, arr[0][4]);
        }

        try {
            Thread.sleep(200);
        } catch (Exception e) {

        }

        // B to C
        for(int i = 50; i < 51; i++)
        {
            Controls.printxy(i, 8, arr[1][0]);
        }

        try {
            Thread.sleep(200);
        } catch (Exception e) {

        }

        // B to D
        for(int i = 19; i < 20; i++)
        {
            Controls.printxy(22, i, arr[1][1]);
        }

        try {
            Thread.sleep(200);
        } catch (Exception e) {

        }

        // B to E
        for(int i =50; i < 51; i++)
        {
            Controls.printxy(i, 41, arr[1][2]);
        }

        try {
            Thread.sleep(200);
        } catch (Exception e) {

        }

        // C to D
        for(int i = 50; i < 51; i++)
        {
            Controls.printxy(i, 2, arr[1][3]);
        }

        try {
            Thread.sleep(200);
        } catch (Exception e) {

        }

        // D to E
        for(int i = 50; i < 51; i++)
        {
            Controls.printxy(i, 37, arr[1][4]);
        }

    }


    public void CalculatingShortestDistance(int[][] adjMatrix, int nodeName) 
    {
        for (int i = 0; i < 5; i++) 
        {
            if ((adjMatrix[nodeName][i] != 0) && (!TabularDepiction[i].marked)) 
            {
                if ((TabularDepiction[nodeName].ShortestDist + adjMatrix[nodeName][i]) < TabularDepiction[i].ShortestDist) 
                {
                    TabularDepiction[i].ShortestDist = TabularDepiction[nodeName].ShortestDist + adjMatrix[nodeName][i];
                    TabularDepiction[i].vertexFrom = (char) (nodeName+1) ;    // this gets corresponding numeric values of the nodes.
                }
            }    
        }

        TabularDepiction[nodeName].marked = true;
        int smallestValue = 1000;
        int smallestIndex = -1;
       
        for (int i = 0; i < 5; i++) 
        {
            if (!TabularDepiction[i].marked) 
            {
                if (TabularDepiction[i].ShortestDist < smallestValue) 
                {
                    smallestValue = TabularDepiction[i].ShortestDist;
                    smallestIndex = i;     
                } 
            }
        }

        if (smallestIndex > -1) 
        {
            CalculatingShortestDistance(adjMatrix, smallestIndex);    
        }
    }


    void Run(int[][] arr)
    {
        Controls.cls();

        System.out.print("\u001B[40m"); 

        displayDFS(arr, 0);

        nodeDistance(arr);

        System.out.println("\n\n\n\n\n\n");

        TabularDepiction[0] = new item();
        TabularDepiction[0].vertex = 'A';
        TabularDepiction[0].ShortestDist = 0;
        TabularDepiction[0].vertexFrom = 0;
        TabularDepiction[0].marked = false;

        TabularDepiction[1] = new item();
        TabularDepiction[1].vertex = 'B';
        TabularDepiction[1].ShortestDist = 100;
        TabularDepiction[1].vertexFrom = 0;
        TabularDepiction[1].marked = false;

        TabularDepiction[2] = new item();
        TabularDepiction[2].vertex = 'C';
        TabularDepiction[2].ShortestDist = 100;
        TabularDepiction[2].vertexFrom = 0;
        TabularDepiction[2].marked = false;

        TabularDepiction[3] = new item();
        TabularDepiction[3].vertex = 'D';
        TabularDepiction[3].ShortestDist = 100;
        TabularDepiction[3].vertexFrom = 0;
        TabularDepiction[3].marked = false;

        TabularDepiction[4] = new item();
        TabularDepiction[4].vertex = 'E';
        TabularDepiction[4].ShortestDist = 100;
        TabularDepiction[4].vertexFrom = 0;
        TabularDepiction[4].marked = false;

        CalculatingShortestDistance(arr, 0);


        System.out.println("Awaiting results for the shortest path calculations...\n\n" );


        try 
        {
            Thread.sleep(500);
        } catch (Exception e) 
        {

        }

        System.out.println("  Vertex" + "     Shortest Distance " + "     Previous Vertex  ");

        try 
        {
            Thread.sleep(300);
        } catch (Exception e) 
        {

        }

        System.out.println("-----------------------------------------------------");


        try 
        {
            Thread.sleep(300);
        } catch (Exception e) 
        {

        }

        for (int i = 0; i < 5; i++) 
        {
            try 
            {
                Thread.sleep(400);
            } 
            catch (Exception e) 
            {

            }
        
            System.out.println("     " + TabularDepiction[i].vertex + "              " + TabularDepiction[i].ShortestDist + "                     " + TabularDepiction[i].vertexFrom + "          ");    
        }

     }

    
}
