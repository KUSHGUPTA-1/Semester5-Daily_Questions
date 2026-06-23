public class Minimum_Lights_To_Illuminate_A_Road{
    public int minLights(int[] lights) {
        int n=lights.length;
        int arr[]=new int[n+1];
        for(int i=0;i<n;i++){
            int num=lights[i];
            if(num==0) continue;
            int l=Math.max(0,i-num);
            int r=Math.min(n-1,i+num);
            arr[l]++;
            arr[r+1]--;
        }
        int currs=0;
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            currs+=arr[i];
            vis[i]=currs>0;
        }
        int ans=0;
        int i=0;
        while(i<n){
            if(vis[i]){
                i++;
                continue;
            }
            int p=Math.min(i+1,n-1);
            ans++;
            int cred=Math.min(n-1,p+1);
            i=cred+1;
        }
        return ans; 
    }
}
