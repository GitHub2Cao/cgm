package org.softnovo.seckill.exception;

/**
 * 重复秒杀异常（运行期异常）
 * 
 * @author cgm
 */
public class RepeatKillException extends SeckillException {
	private static final long serialVersionUID = -951643640375495356L;

	public RepeatKillException(String message) {
		super(message);
	}

	public RepeatKillException(String message, Throwable cause) {
		super(message, cause);
	}
}
