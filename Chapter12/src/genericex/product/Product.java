package genericex.product;

public class Product<T> {
	private T Kind;   //제품의 종류
	
	public T getKind() {
		return Kind;
	}
	public void setKind(T kind) {
		this.Kind = kind;
	}
}
