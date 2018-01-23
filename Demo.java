package thread;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread mainThread=Thread.currentThread();
		System.out.println("MAIN THREAD NAME  :"+mainThread.getName());
		System.out.println("MAIN THREAD PRIORITY   :"+mainThread.getPriority());
		mainThread.setName("IMP THREAD");
		mainThread.setPriority(1);
		
	}

}
