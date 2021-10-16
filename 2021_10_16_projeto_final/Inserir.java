public class Inserir {
    public void inserir(){
        String valor, prox;
        do {
            System.out.print("\n");
            for (int i = 0; i < Banco.l ; i++){
                if (Banco.dados[i][0] == null){
                    for (int j = 0; j < Banco.c; j++){
                        System.out.print(Info.entrada[j]+": ");
                        valor = Teclado.leia();
						do {
							if (Validacao.requisito(valor,j) == false){
                                System.out.print(Info.erros[j]+"\n"+Info.entrada[j]+": ");
                                valor = Teclado.leia();
							}
						} while (Validacao.requisito(valor,j) == false);
                        if (j != 3){
                            Banco.dados[i][j] = valor;
                        } else {
                            switch (Integer.parseInt(valor)) {
                                case 1: Banco.dados[i][j] = "MASCULINO"; break;
                                case 2: Banco.dados[i][j] = "FEMININO"; break;
                            }
						}
					}
					break;
				}
			}
            System.out.print("\nINSERIDO COM SUCESSO!\n\nDESEJA INSERIR REGISTRO NOVAMENTE? (S/N): ");
            prox = Teclado.leia();
            if (Banco.check() != 0) {
                do {
                    if (!prox.equals("N") & !prox.equals("n") & !prox.equals("S") & !prox.equals("s")){
                        System.out.print("COMANDO INVÁLIDO!\nDESEJA INSERIR REGISTRO NOVAMENTE? (S/N): ");
						prox = Teclado.leia();
					}
                } while (!prox.equals("N") & !prox.equals("n") & !prox.equals("S") & !prox.equals("s"));
            } else {
                System.out.print("\nMEMORIA CHEIA! POR GENTILEZA EXCLUIR UM REGISTRO.\n");
                prox = "N";
            }
        } while (!prox.equals("N") & !prox.equals("n"));
        System.out.print("\n");
    }
}