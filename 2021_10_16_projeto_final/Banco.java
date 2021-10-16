public class Banco {
    
    public static int l = 10;
    public static int c = 4;
    public static String dados[][] = new String[l][c];

    public static int check(){
        int cache = 0;
        for (int i = 0; i < l; i++) {
            if( dados[i][0] == null){
                cache += 1;
            }
        }
        return cache;
    }
}
