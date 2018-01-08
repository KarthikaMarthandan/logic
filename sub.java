package override;

public class sub extends Super{
int y;
	sub(int x,int y) {
		super(x);
		this.y=y;
	}
	void display()
	{
		System.out.println("SUPER="+x);
		System.out.println("SUB="+y);
	}

}
