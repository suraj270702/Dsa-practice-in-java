long smallest=a[0];
        long ssmallest=Long.MAX_VALUE;
        
        for(int i=1;i<n;i++){
            if(a[i]<smallest){
                ssmallest=smallest;
                smallest=a[i];
            }
            else if(a[i]!=smallest && a[i] < ssmallest){
                ssmallest=a[i];
            }
        }
        long[] arr={smallest,ssmallest};
        long[] notFound={-1,-1};
        if(n==1){
            return notFound;
        }
        for(int i=1;i<n-1;i++){
            if(a[i-1]==a[i] && a[i]==a[i+1]){
                return notFound;
            }
        }
        return arr;