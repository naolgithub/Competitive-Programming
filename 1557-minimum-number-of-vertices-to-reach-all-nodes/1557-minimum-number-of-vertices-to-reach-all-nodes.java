class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> uniqueSolution=new ArrayList();
        boolean[] incomingDegree=new boolean[n];
        for(int i=0;i<edges.size();i++){
            incomingDegree[edges.get(i).get(1)]=true;
        }
        for(int i=0;i<n;i++){
            if(!incomingDegree[i]){
                uniqueSolution.add(i);
            }
        }
        return uniqueSolution;
    }
}