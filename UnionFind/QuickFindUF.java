package UnionFind;
// In this we have used very expensive union method


// import java.util.Scanner;

public class QuickFindUF{
    private int[] id;
    int N;
    public QuickFindUF(int N){
        id = new int[N];
        this.N = N;
        for(int i = 0 ; i < N ; i++){
            id[i] = i;
        } 
    }

    public boolean connected(int a, int b){
        return id[a] == id[b];
    }

    public void union(int a, int b){
        int aid = id[a];
        int bid = id[b];
        for(int i = 0 ; i < N ; i++){
            if(id[i]== aid){
                id[i] = bid;
            }
        }

    }
}

// public class QuickFind{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter no of nodes: ");
//         int N = scanner.nextInt();

//         QuickFindUF unionFind = new QuickFindUF(N);
//         System.out.println("Enter the no of connections: ");

//         int n = scanner.nextInt();
//         System.out.println("Enter the Elements with unions:");
//         int a;
//         int b;
//         for(int i = 0 ; i < n ; i++){
//             a = scanner.nextInt();
//             b = scanner.nextInt();
//             unionFind.union(a, b);
//         }

//        while(true){
//         System.out.println("Enter the numbers to find union: ");
//         a = scanner.nextInt();
//         b = scanner.nextInt();
//         System.out.println(unionFind.connected(a,b));
//        }
//     }
// }