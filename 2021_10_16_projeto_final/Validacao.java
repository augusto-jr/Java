public class Validacao {

    static boolean validacao(String valor){
        while (true) {
            try {
                Long.parseLong(valor);
                return true;
            } catch (NumberFormatException e) {
            }
        }
    }

    static boolean requisito(String valor,int codigo){
        boolean resultado = false;
        switch (codigo) {
            case 0: if(valor.length() >= 2){ resultado = true; } else { resultado = false; }  break;
            case 1: if(valor.length() >= 10 & valor.length() <= 11 & Validacao.validacao(valor) == true){ resultado = true; } else { resultado = false; }  break;
            case 2: if(valor.length() >= 10){ resultado = true; } else { resultado = false; }  break;
            case 3: if(Validacao.validacao(valor) == true){ if(Integer.parseInt(valor) == 1 | Integer.parseInt(valor) == 2){ resultado = true; } else { resultado = false; } } else { resultado = false; }  break;
        }
        return resultado;
    }
}