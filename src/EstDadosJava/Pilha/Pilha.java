package EstDadosJava.Pilha;

public class Pilha {

    private No refNoEntradaPilha = null;


    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop(){
        if (!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return  null;
    }

    public No top(){
        return refNoEntradaPilha;
    }
    public boolean isEmpty(){
        if (refNoEntradaPilha == null){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        String stringRetorno = "--------------\n";
        stringRetorno += "       Pilha\n";
        stringRetorno += "--------------\n";

        No noAuxililiar = refNoEntradaPilha;

            while (true){
                if (noAuxililiar != null){
                        stringRetorno += "[No{dado=" + noAuxililiar.getDado() +"}]\n";
                        noAuxililiar = noAuxililiar.getRefNo();
                }else {
                    break;
                }
            }
            stringRetorno += "===========\n";
            return stringRetorno;
    }

}
