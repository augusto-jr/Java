public class Visualizar {
    public void visualizar(){
        System.out.print("\n");       
        for (int i = 0; i < Banco.l; i++){
            if (Banco.dados[i][0] != null){
                for (int j = 0; j < Banco.c; j++){
                    System.out.print(Info.funcao[j]+": "+Banco.dados[i][j]+"\t\t ");
                }
                System.out.print("\n");
            }
        };
        System.out.print("\n");
    }
}