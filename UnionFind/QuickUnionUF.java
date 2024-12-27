package UnionFind;
// import java.util.Scanner;

public class QuickUnionUF {
    int[] id;
    int N;
    public QuickUnionUF(int N){
        id = new int[N];
        this.N = N;
        for(int i = 0; i<N; i++){
            id[i] = i;
        }
    }

    public boolean connected(int a, int b){
        if (id[a]==a && id[b]==b){
            return id[a] == id[b];
        }
        return connected(id[a], id[b]);
        
    }

    public void union(int a, int b){
        id[b] = a;
    }

    public void printID(){
        for(int i=0; i<id.length; i++){
        System.out.print(id[i]+" ");
        }
    }
}

// public class QuickUnion{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter no of nodes: ");
//         int N = scanner.nextInt();
//         QuickUnionUF tree = new QuickUnionUF(N);
//         System.out.print("Enter no of connections: ");
//         int n = scanner.nextInt();
//         System.out.println("Enter connections: ");
//         for(int i = 0; i < n; i++){
//             int a = scanner.nextInt();
//             int b = scanner.nextInt();
//             tree.union(a, b);
//         }
//         tree.printID();
        
//         while(true){
//             System.out.print("Enter nodes to verify connection: ");
//             int a = scanner.nextInt();
//             int b = scanner.nextInt();
//             System.out.println(tree.connected(a, b));
//         }
//     }
// }
