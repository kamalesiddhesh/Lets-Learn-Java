package jaava;

public class SlideRotator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			System.out.println("Slide-"+i);
			try {
			Thread.sleep(5000);
			}
			catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
