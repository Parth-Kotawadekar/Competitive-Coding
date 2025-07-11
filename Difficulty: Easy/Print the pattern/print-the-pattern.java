// User function Template for Java

class Solution {
    static List<String> pattern(int n) {
        // code here
    List<String> b=new ArrayList<>();
    int k=1;
    int n1=n;
    int n2=n;
    int i,j;
    int l=(n*n)+1;
    for(int u=0;u<n;u++){
        StringBuilder s=new StringBuilder("");
        for(int o=0;o<u*2;o++){
            s.append("-");
        }
        for(i=k;i<=n2;i++){
            s.append(Integer.toString(i)+"*");
        }
        s.delete(s.length()-1,s.length());
        for(j=l;j<l+n1;j++){
            s.append("*"+Integer.toString(j));
        }
        String s1=s.toString();
        b.add(s1);
        l=l+k-n2;
        k+=n1;
        n1-=1;
        n2+=n1;
    }
    return b;
    }
}