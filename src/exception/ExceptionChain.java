package exception;

/**
 * 异常链
 * @author huanghu
 *
 */
public class ExceptionChain {
	public static void main(String[] args){
		try {
			try {
				throw new NullPointerException();
			} catch (Exception e) {
//				e.initCause(new RuntimeException());
//				throw e;
				throw new RuntimeException(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

/*
 * java.lang.RuntimeException: java.lang.NullPointerException
	at exception.ExceptionChain.main(ExceptionChain.java:16)
Caused by: java.lang.NullPointerException
	at exception.ExceptionChain.main(ExceptionChain.java:12)
 */

/*
 * java.lang.NullPointerException
	at exception.ExceptionChain.main(ExceptionChain.java:12)
Caused by: java.lang.RuntimeException
	at exception.ExceptionChain.main(ExceptionChain.java:14)
 */
