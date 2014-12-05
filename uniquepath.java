package uniquepath;

public class uniquepath {

	  public static int uniquePaths(int m, int n) {
	        double a=1,b=1;
	        int k=m+n-2;
	        if(m<n)
	        {
	            int pp=m;
	            m=n;
	            n=pp;
	        }
	        for(int i=0;i<n-1;i++)
	        {a=k*a;
	        System.out.println("a:"+a+"   k:"+k);
	         k=k-1;
	     
	        }
	        System.out.println(a);
	        k=1;
	                for(int i=0;i<n-1;i++)
	        {b=k*b;
	         k=k+1;
	        }
	                System.out.println(b);
	        int res=(int) (a/b);
	        return res;
	    }
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(uniquePaths(10,10));
	}

}
