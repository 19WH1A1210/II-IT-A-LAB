public class PowNum{
    public static void main(String[] args) {
        int n = 2, p = 5;
        long ans = 1;
        
        int i = p;
        for (;i != 0; --i)
        {
            ans *= n;
        }
        
        System.out.println(n+"^"+p+" = "+ans);
    }
}