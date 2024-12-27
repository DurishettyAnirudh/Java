package UnionFind;

public class WtQckUnionPathCompression{
    int[] id, sz;
    int N;
    public WtQckUnionPathCompression(int N){
        this.N = N;
        id = new int[N];
        sz = new int[N];
        for(int i =0; i<N; i++){
            id[i] = i;
            sz[i] = 0;
        }
    }
    
    public int root(int a){
        id[a] = id[id[a]];    // this line compresses path in the weighted quick union significantly reducing the height of the tree
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
        if(a == b) return;
        if(sz[a] <= sz[b]){id[a] = id[b]; sz[b] += sz[a];}
        else {id[b] = id[a]; sz[a] += sz[b];}
    }
}


// The time complexity for this weighted quick-union algorithm with path compression is:
// Initialization   Union       Find
//  O(N)            O(log* N)    O(log* N)