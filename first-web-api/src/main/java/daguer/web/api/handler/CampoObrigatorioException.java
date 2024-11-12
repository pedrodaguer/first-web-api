package daguer.web.api.handler;

public class CampoObrigatorioException extends BusinessException {

    public CampoObrigatorioException(String campo) {
        super("O campo %s é obrigatório", campo);
    }

    public CampoObrigatorioException(String message, Object... params) {
        super(String.format(message, params));
    }
}
