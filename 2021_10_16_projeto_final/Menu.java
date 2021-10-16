public class Menu {
    
    Inserir inserir = new Inserir();
    Editor editor = new Editor();
    Deletar deletar = new Deletar();
    Visualizar visualizar = new Visualizar();

    public void start(){
        int item;
        do {
            do {
                while (true) {
                    try {
                        System.out.print("1-INSERIR REGISTRO | 2-EDITAR REGISTRO | 3-EXCLUIR REGISTRO | 4-VISUALIZAR REGISTRO | 5-SAIR : ");
                        item = Integer.parseInt(Teclado.leia());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.print("COMANDO INVALIDO!\n");
                    }
                }
            } while (item != 1 & item != 2 & item != 3 & item != 4 & item != 5);
            switch (item) {
                case 1: if( Banco.check() != 0 ){ inserir.inserir(); } else { System.out.print("\nMEMORIA CHEIA! POR GENTILEZA EXCLUIR UM REGISTRO.\n\n"); } break;
                case 2: if( Banco.check() != Banco.l ){ editor.editor(); } else { System.out.print("\nNAO HA REGISTRO DISPONIVEL PARA EDITAR.\n\n"); } break;
                case 3: if( Banco.check() != Banco.l ){ deletar.deletar(); } else { System.out.print("\nNAO HA REGISTRO DISPONIVEL PARA EXCLUIR.\n\n"); } break;
                case 4: if( Banco.check() != Banco.l ){ visualizar.visualizar(); } else { System.out.print("\nNAO HA REGISTRO DISPONIVEL PARA VISUALIZAR! INSERE NOVO REGISTRO.\n\n"); } break;
                case 5: System.out.print("\nENCERRADO COM SUCESSO!\n\n"); break;
            }
        } while (item != 5);
    }
}