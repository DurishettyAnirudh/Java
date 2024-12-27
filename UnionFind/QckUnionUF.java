package UnionFind;

// import java.util.Scanner;

public class QckUnionUF{
    int[] id;
    int N;
    public QckUnionUF(int N){
        this.N = N;
        id = new int[N];
        for(int i =0; i<N; i++){
            id[i] = i;
        }
    }
    
    public int root(int a){
        if(a == id[a]){
            return a;
        }
        return root(id[a]);
    }

    public boolean connected(int a, int b){
        return root(a) == root(b);
    }

    public void union(int a, int b){
        a = root(a);
        b = root(b);
        id[b] = a;
    }
}

// public class QckUnion{
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter no of nodes: ");
//         int N = scanner.nextInt();
//         QckUnionUF tree = new QckUnionUF(N);
//         System.out.print("Enter no of connections: ");
//         int n = scanner.nextInt();
//         System.out.println("Enter connections: ");
//         for(int i = 0; i < n; i++){
//             int a = scanner.nextInt();
//             int b = scanner.nextInt();
//             tree.union(a, b);
//         }
        
//         while(true){
//             System.out.print("Enter nodes to verify connection: ");
//             int a = scanner.nextInt();
//             int b = scanner.nextInt();
//             System.out.println(tree.connected(a, b));
//         }
//     }
// }