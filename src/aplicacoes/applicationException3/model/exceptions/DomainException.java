package aplicacoes.applicationException3.model.exceptions;

public class DomainException extends RuntimeException{
    // A classe Exception obriga você tratar o erro
    // A classe RuntimeException, não obriga você a tratar o erro
    private static final long serialVersionUID = 1L;
    public DomainException (String msg) {
        super(msg);
    }



}
