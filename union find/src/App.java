public class App {

    public static class unionFind
    {
            private int[] id;
            public unionFind(int n)
            {
                id=new int[n];
                for(int i=0;i<n;i++)
                {
                    id[i]=i;
                }

            }

            public boolean connected(int p,int q)
            {
                return id[p]==id[q];
            }

            public void union(int p, int q)
            {
                for(int i=0;i<id.length;i++)
                {
                    if (id[i]==id[p])
                    {
                        id[i]=id[q];
                    }
                }
            }
    }
    public static void main(String[] args) throws Exception 
    {
        unionFind uf = new unionFind(10);
        uf.union(2, 3);
        uf.union(3, 9);
        System.out.print(uf.connected(2, 9));




    }
}
