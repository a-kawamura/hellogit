package hoge;

public class ExceptionThrowTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			try {
				throw new Exception("1");
				
			} catch (Exception e) {
				System.out.println("1 catched");
				throw e;
			}finally {

				try {
					System.out.println("1 finally");
					throw new Exception("2");
					
				} catch (Exception e2) {
					System.out.println("2 catched");
					System.out.println(e2.getMessage());
//					throw e2;
				}
			}
			
		} catch (Exception e) {
			System.out.println("last catch");
			System.out.println(e.getMessage());

		}
		
		

	}

}
