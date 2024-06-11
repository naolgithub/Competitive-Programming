class Solution {
    public int findCenter(int[][] edges) {
        // if(edges[0][0]==edges[1][0])return edges[0][0];
        // else if(edges[0][0]==edges[1][1])return edges[0][0];
        // else if(edges[0][1]==edges[1][0])return edges[0][1];
        // else return edges[0][1];
        HashSet<Integer> outEdgesFound=new HashSet();
        for(int[] edge: edges){
            //if the set has this vertex already, return the vertex immediately
            if(outEdgesFound.contains(edge[0])){
                return edge[0];
            }
            //otherwise, add to set
            outEdgesFound.add(edge[0]);
            //do the same thing for other node/vertex
            if(outEdgesFound.contains(edge[1])){
                return edge[1];
            }
            outEdgesFound.add(edge[1]);
        }
        return -1;
    }
}