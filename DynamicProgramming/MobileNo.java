public class MobileNo {
    public long getCount(int n)
	{
		long ans=(long)(4*Math.pow(3, n-1)+3*Math.pow(4, n-1)+2*Math.pow(5, n-1)+Math.pow(2, n-1));
        return ans;
	}
}
