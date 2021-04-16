public class App {

    public static class unionFind
    {
            private int[] idc;
            private int[] sz;

            public unionFind(int n)
            {
                idc=new int[n];
                sz=new int[n];

                for(int i=0;i<n;i++)
                {
                    idc[i]=i;
                   	sz[i]=1;
                }

            }

            private int root(int i)
            {
            	while (i!=idc[i])
            	{
            		i=idc[i];
            	}
            	return i;
            }

            public boolean connected(int p,int q)
            {
                return root(p)==root(q);
            }

            public void union(int p, int q)
            {
                int i=root(p);
                int j=root(q);
                if (sz[i]<sz[j])
                	{
                		idc[i]=j;
                		sz[j]+=sz[i];
                	}
                else{
                	idc[j]=i;
                	sz[i]+=sz[j];
                }
            }
    }
    public static void main(String[] args) throws Exception 
    {
        unionFind uf = new unionFind(10);
        uf.union(2, 3);
        uf.union(3, 9);
        uf.union(1,0);
        uf.union(0,2);

        System.out.print(uf.connected(1, 3));

    }
}
