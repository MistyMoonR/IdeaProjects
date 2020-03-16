package com.company;

import java.util.Stack;

public class DFS {
    Stack<Integer> st;
    int vFirst;
    int[][] adjMatrix;
    int[] isVisited = new int[6];

    public DFS(int[][] adjMatrix) {
    }


    //Param args
    public static void main(String[] args) {
        int[][] adjMatrix = {
                //S, A, B, C, D, G,
                {0, 1, 0, 1, 0, 0},
                {1, 0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1},
                {0, 0, 1, 0, 1, 0},
        };

        new DFS(adjMatrix);
    }

    public void depthFirst(int vFirst, int n) {
        int v, i;
        char out = ' ';
        st.push(vFirst);

        while (!st.isEmpty()) {
            v = st.pop();
            if(v==0) out = 'S';
            else if(v==1) out = 'A';
            else if(v==2) out = 'B';
            else if(v==3) out = 'C';
            else if(v==4) out = 'D';
            else if(v==5) out = 'G';

            if (isVisited[v] == 0) {
                System.out.println("\n" + out);
            }

            for (i = 0; i < n; i++) {
                if ((adjMatrix[v][i] == 1 && (isVisited[i] == 0))) {
                    st.push(v);
                    isVisited[i] = 1;
                    if(i==0) out = 'S';
                    else if(i==1) out = 'A';
                    else if(i==2) out = 'B';
                    else if(i==3) out = 'C';
                    else if(i==4) out = 'D';
                    else if(i==5) out = 'G';
                    System.out.println("->" + out);
                    v = i;
                }
            }


        }
    }

}
