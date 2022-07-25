import java.util.LinkedList;
import java.util.Queue;

class Solution {

    
    public int solution(int[][] maps) {
        int answer = 0;
        int N = maps.length;
        int M = maps[0].length; 
        boolean visit[][] = new boolean[N][M];
        int init_r = 0;
        int init_c = 0;
        int step = 1;
            bfs(maps, init_r,init_c, visit,N,M, step);
            if(k==10000){
                answer = -1;
            }
            else{
                answer = k;
            }
        return answer;
    }
    
    
    
    public int k=10000;
    int dx[] = {-1,1,0,0};
    int dy[] = {0,0,-1,1};
    
    
    public void bfs(int maps[][], int r,int c, boolean visit[][], int N,int M, int step){
        int[] coord = new int[3];
        Queue<int[]> q = new LinkedList<int[]>();
        coord[0] = r;
        coord[1] = c;
        coord[2] = step;
        q.add(coord);
        visit[r][c] = true;
        
        
        while(!q.isEmpty()){
            coord = q.poll();
            r = coord[0];
            c = coord[1];
            step= coord[2];
            
            if(r==N-1 && c==M-1){
                k= step;
                break;
            }
            for(int i=0;i<4;i++){
                int nr = r+dy[i];
                int nc = c+dx[i];
                if(0<=nr && nr<N && 0<=nc && nc<M){
                    if(!visit[nr][nc]){
                        if(maps[nr][nc]==1){
                            visit[nr][nc] = true;
                            int[] tmp = {nr,nc,step+1};
                            q.add(tmp);
                        }
                    }
                }
            }
        }
        
    }
    
    public void dfs(int maps[][], int r, int c, boolean visit[][], int N, int M, int step){
        visit[r][c] = true;
        if(r==N-1 && c==M-1){
            k = Integer.min(step,k);
        }
        for(int i =0 ;i<4;i++){
            int nr = r+dy[i];
            int nc = c+dx[i];
            if(0<=nr && nr<N && 0<=nc && nc<M){
                if(! visit[nr][nc]){
                    if(maps[nr][nc]==1){
                        visit[nr][nc] =true;
                        dfs(maps,nr,nc, visit,N,M, step+1);
                        visit[nr][nc] =false;
                    }
                }
            }
        }
    }
}
