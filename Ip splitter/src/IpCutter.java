public class IpCutter {
    public static int[] getIps(String stringToSplit){
        String[] st= stringToSplit.split("[.]") ;

        int[] res= new int[st.length];
        for (int i = 0; i < st.length; i++) {
            res[i]=Integer.parseInt(st[i]);
        }
        return res;
    }
}
