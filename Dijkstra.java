import java.util.*;
class dijk{
    void Dijkfn(int g[][],int V,int n)
    {
        int d[]=new int[n];
        int spt[]=new int[n];
        for(int i=0;i<n;i++)
        {
            d[i]=999;
            spt[i]=0;
        }
        d[V]=0;
        for(int c=0;c<n-1;c++)
        {
            int u=minimum(d,spt,n);
            spt[u]=1;
            for(int j=0;j<n;j++)
            {
                if(spt[j]!=1&&g[u][v]!=0&&d[u]!=999&&d[u]+g[u][v]<d[v])
                d[v]=d[u]+g[u][v];
            }
        }
        printsolution(d,n);
    }
    void printsolution(int d[],int n)
    {
      System.out.println("vertex distance from source");
      for(i=0;i<n;i++)
      {
          System.out.println(i+"tt"+d[i]);
      }
    }
    int mimimum(int d[],int spt[],int n)
    {
        int min=999 , min_index=-1;
        for(int v=0;v<n;v++)
        {
            if(spt[v]!=1&&d[v]<=min)
            min=d[v];
            min_index=v;
        }
        return min_index;
    }
    public static void main(String[] args)
    {
        int V,n;
        Dijkstra t=new Dijkstra();
        int g[][]=new int[50][50];
        Scanner in = new Scanner;
        System.out.println("enter the no of vertices");
        n=in.nextInt();
        system.out.println("enter the source vertex");
        V=in.nextInt();
        sytem.out.println("enter the graph");
        for(i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                g[i][j]=in.nextInt();
            }
        }
        t.Dijkfn(g,V,n);
        
    }
}
