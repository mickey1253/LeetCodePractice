package code.lint.four.breadthFirstSearch;

/*
*
* Given n nodes labeled from 0 to n - 1 and a list of undirected edges (each edge is a pair of nodes),
* write a function to check whether these edges make up a valid tree.

 Notice

You can assume that no duplicate edges will appear in edges.
Since all edges are undirected, [0, 1] is the same as [1, 0] and thus will not appear together in edges.

Have you met this question in a real interview? Yes
Example
Given n = 5 and edges = [[0, 1], [0, 2], [0, 3], [1, 4]], return true.

Given n = 5 and edges = [[0, 1], [1, 2], [2, 3], [1, 3], [1, 4]], return false.

图是否是树

给出 n 个节点，标号分别从 0 到 n - 1 并且给出一个 无向 边的列表 (给出每条边的两个顶点),
写一个函数去判断这张｀无向｀图是否是一棵树




*
* */

import java.util.*;

public class GraphValidTree {

    /*
     * @param n: An integer
     * @param edges: a list of undirected edges
     * @return: true if it's a valid tree, or false
     */
    public boolean validTree(int n, int[][] edges) {
        // write your code here

        if(n == 0){
            return false;
        }

        if(edges.length != n - 1){
            return false;
        }

        Map<Integer, Set<Integer>> graph = initializeGraph(n, edges);
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> hash = new HashSet<>();

        queue.offer(0);
        hash.add(0);
        while(!queue.isEmpty()){
            int node = queue.poll();
            for(Integer neighbor : graph.get(node)) {
                if(hash.contains(neighbor)){
                    continue;
                }

                hash.add(neighbor);
                queue.offer(neighbor);
            }
        }

        return hash.size() == n;

    }

    public Map<Integer, Set<Integer>> initializeGraph(int n, int[][] edges){
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for(int i = 0; i < n; i++){
            graph.put(i, new HashSet<>());
        }

        for(int i = 0; i < edges.length; i++){
            int x = edges[i][0];
            int y = edges[i][1];

            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        return graph;
    }

    // Jiu Zhang's Answer
    // version 1: BFS
    /*
    *
    *  public boolean validTree(int n, int[][] edges) {
        if (n == 0) {
            return false;
        }

        if (edges.length != n - 1) {
            return false;
        }

        Map<Integer, Set<Integer>> graph = initializeGraph(n, edges);

        // bfs
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> hash = new HashSet<>();

        queue.offer(0);
        hash.add(0);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (Integer neighbor : graph.get(node)) {
                if (hash.contains(neighbor)) {
                    continue;
                }
                hash.add(neighbor);
                queue.offer(neighbor);
            }
        }

        return (hash.size() == n);
    }

    private Map<Integer, Set<Integer>> initializeGraph(int n, int[][] edges) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new HashSet<Integer>());
        }

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        return graph;
    }

    // version 2: Union Find

    class UnionFind{
        HashMap<Integer, Integer> father = new HashMap<Integer, Integer>();
        UnionFind(int n){
            for(int i = 0 ; i < n; i++) {
                father.put(i, i);
            }
        }
        int compressed_find(int x){
            int parent =  father.get(x);
            while(parent!=father.get(parent)) {
                parent = father.get(parent);
            }
            int temp = -1;
            int fa = father.get(x);
            while(fa!=father.get(fa)) {
                temp = father.get(fa);
                father.put(fa, parent) ;
                fa = temp;
            }
            return parent;

        }

        void union(int x, int y){
            int fa_x = compressed_find(x);
            int fa_y = compressed_find(y);
            if(fa_x != fa_y)
                father.put(fa_x, fa_y);
        }

        public boolean validTree(int n, int[][] edges) {
        // tree should have n nodes with n-1 edges
        if (n - 1 != edges.length) {
            return false;
        }

        UnionFind uf = new UnionFind(n);

        for (int i = 0; i < edges.length; i++) {
            if (uf.compressed_find(edges[i][0]) == uf.compressed_find(edges[i][1])) {
                return false;
            }
            uf.union(edges[i][0], edges[i][1]);
        }
        return true;
    }

    *
    * */


    // Shuo Chang's Answer
    /*

    // Version 1.

     public boolean validTree(int n, int[][] edges) {
        int size = edges.length;

        if (n - 1 != size){
            return false;
        }

        Map<Integer, Set<Integer>> graph = buildGraph(n, edges);
        Queue<Integer> queue = new LinkedList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        queue.offer(0);
        set.add(0);

        while (!queue.isEmpty()){
            int head = queue.poll();

                for (Integer node : graph.get(head)){
                    if (set.contains(node)){
                        continue;
                    }
                    queue.offer(node);
                    set.add(node);
                }

        }

        if (set.size() == n){
            return true;
        }
        return false;
    }

    public Map<Integer, Set<Integer>> buildGraph(int n, int[][] edges){
        Map<Integer, Set<Integer>> result = new HashMap<Integer, Set<Integer>>();
        for (int i = 0; i < n; i++){
            result.put(i, new HashSet<Integer>());
        }

        for (int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            result.get(u).add(v);
            result.get(v).add(u);
        }
        return result;
    }

    // Version 2.

    //用unionfind 来看是否所有点联通 可以用count来检查是否只有一个set.
    class UnionFind{
    int[] father = null;
    int count = 0;

    public UnionFind(int n){
        father = new int[n];
        for (int i = 0; i < n; i++){
            father[i] = i;
        }
        count = n;
    }
    public int find (int a){
        if (father[a] == a){
            return a;
        }
        return father[a] = find(father[a]);
    }
    public void union (int a, int b){
        int root_a = find(a);
        int root_b = find(b);
        if (root_a != root_b){
            father[root_a] = root_b;
            count--;
        }
    }
}

public boolean validTree(int n, int[][] edges) {
        if (edges == null || n < 1){
            return false;
        }
        if (n != edges.length + 1){
            return false;
        }
        UnionFind unionfind = new UnionFind(n);
        for (int[] edge: edges){
            unionfind.union (edge[0], edge[1]);
        }

        if (unionfind.count != 1){
            return false;
        }
        return true;
    }

    *
    * */
}
