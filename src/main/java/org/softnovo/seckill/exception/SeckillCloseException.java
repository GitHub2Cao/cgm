package org.softnovo.seckill.exception;

/**
 * 秒杀关闭异常.
 * 
 * @author cgm
 */
public class SeckillCloseException extends SeckillException {
	private static final long serialVersionUID = 4729183259031263223L;

	public SeckillCloseException(String message) {
		super(message);
	}

	public SeckillCloseException(String message, Throwable cause) {
		super(message, cause);
	}
}
