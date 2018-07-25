package org.softnovo.seckill.exception;

public class RedisException extends RuntimeException {
	private static final long serialVersionUID = 7500621589526600575L;

	public RedisException(String message) {
		super(message);
	}

	public RedisException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public RedisException(Throwable cause) {
		super(cause);
	}
}
