package dio.myfirstwebapi.handler;

public class CampoObrigatorioException extends BusinessException {
	public CampoObrigatorioException(String campo) {
		super("O campo %s é obrigatório",campo);
	}
}
