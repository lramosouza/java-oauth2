package br.com.oauth2.business.exception;

public class EnderecoException extends Exception{
	
		private static final long serialVersionUID = 1L;

		public EnderecoException() {
			super();
		}

		public EnderecoException(String pMensagem) {
			super(pMensagem);
		}

		public EnderecoException(Throwable pException) {
			super(pException);
		}

		public EnderecoException(String pMensagem, Throwable pException) {
			super(pMensagem, pException);
		}
}
