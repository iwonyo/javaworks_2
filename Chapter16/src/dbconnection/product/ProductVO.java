package dbconnection.product;

public class ProductVO {
	private String prodCode;
	private String prodName;
	private String prodColor;
	private int prodQty;
	
	public ProductVO() {
		this("x20200001", "스마트폰", "white", 100);
	}
	
	public ProductVO(String prodCode, String prodName, String prodColor, int prodQty) {
		super();
		this.prodCode = prodCode;
		this.prodName = prodName;
		this.prodColor = prodColor;
		this.prodQty = prodQty;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdColor() {
		return prodColor;
	}

	public void setProdColor(String prodColor) {
		this.prodColor = prodColor;
	}

	public int getProdQty() {
		return prodQty;
	}

	public void setProdQty(int prodQty) {
		this.prodQty = prodQty;
	}
}
