package org.softnovo.seckill.exception;

public class SeckillException extends RuntimeException {
	private static final long serialVersionUID = -4816482675881479530L;

	public SeckillException(String message) {
		super(message);
	}

	public SeckillException(String message, Throwable cause) {
		super(message, cause);
	}
}
