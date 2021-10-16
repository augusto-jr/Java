public class Deletar {
    public void deletar(){
		String prox,id;
		do {
			System.out.print("\n");
		
			for (int i = 0; i < Banco.l; i++){
				if (Banco.dados[i][0] != null){
					System.out.print("ID: "+(i+1)+"\t\t NOME: "+Banco.dados[i][0]+"\n");
				}
			}
	
			do {
				System.out.print("\nQUAL REGISTRO DESEJA EXCLUIR? (ID): ");
				id = Teclado.leia();
				if (Validacao.validacao(id) == true){

                }
                if (Validacao.validacao(id) == false | Integer.parseInt(id) == 0 | (Integer.parseInt(id)-1) >= Banco.l | Banco.dados[Integer.parseInt(id)-1][0] == null){
					System.out.print("COMANDO INVÁLIDO!");
				}
			} while (Validacao.validacao(id) == false | Integer.parseInt(id) == 0 | (Integer.parseInt(id)-1) >= Banco.l | Banco.dados[Integer.parseInt(id)-1][0] == null);
			for (int i = 0; i < Banco.c; i++){
				Banco.dados[Integer.parseInt(id)-1][i] = null;
			}
            System.out.print("\nEXCLUIDO COM SUCESSO!\n\nDESEJA EXCLUIR REGISTRO NOVAMENTE? (S/N): ");
			prox = Teclado.leia();
			if (Banco.check() != Banco.l){
				do {
					if (!prox.equals("N") & !prox.equals("n") & !prox.equals("S") & !prox.equals("s")){
						System.out.print("COMANDO INVÁLIDO !!!\nDESEJA EXCLUIR REGISTRO NOVAMENTE? (S/N): ");
						prox = Teclado.leia();
                    }
				} while (!prox.equals("N") & !prox.equals("n") & !prox.equals("S") & !prox.equals("s"));
			} else {
				System.out.print("\nNÃO HÁ REGISTRO DISPONÍVEL PARA EXCLUIR.\n");
				prox = "N";
			}
		} while (!prox.equals("N") & !prox.equals("n"));
		System.out.print("\n");
	}
}
