class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        //Initialize adjacency lists
        List<HashSet<Integer>> graph=new ArrayList();
        for(int i=0;i<n;i++){
            graph.add(new HashSet());
        }
        //Fill the adjacency lists
        for(int[] road : roads){
            int a=road[0];
            int b=road[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        int maximumNetworkRank=Integer.MIN_VALUE;
        //Iterate through all pairs of nodes
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                //calculate the network rank
                int currentNetworkRank=graph.get(i).size()+graph.get(j).size();
                //if there's a direct road b/n i and j, subtract 1
                if(graph.get(i).contains(j)){
                    currentNetworkRank-=1;
                }
                maximumNetworkRank=Math.max(maximumNetworkRank,currentNetworkRank);
            }
        }
        return maximumNetworkRank;
    }
}