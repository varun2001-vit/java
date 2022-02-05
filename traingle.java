public class traingle {
    public static void main( String[] args )
    {
        int n=3,i,j;
        for(i=0;i<n;i++){
                       for(j=0;j<=i;j++){
                            System.out.print("*");
                       }
                       for(j=i+1;j<n;j++){
                          System.out.print(" ");
                       }
                       for(j=0;j<n-i-1;j++){
                           System.out.print(" ");
                    }
                        for(j=0;j<=i;j++){
                        System.out.print("*");
                        }
                        System.out.println();
                    }
    for(i=1;i<n;i++){
                       for(j=0;j<=n-i-1;j++){
                            System.out.print("*");
                       }
                       for(j=n-i;j<n;j++){
                        System.out.print(" ");
                       }
                        for(j=0;j<i;j++){
                           System.out.print(" ");
                        }
                       for(j=0;j<=n-i-1;j++){
                        System.out.print("*");
                        }
                        System.out.println();
    }
    
}
}
