package pojo;


import javax.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;
import annotataion.Amount;
import group.GroupA;

public class Goods {

	// 产品名
	@NotEmpty(message="请输入产品名")
	@Length(min=5,max=10,message="请输入5-10位文字",groups={GroupA.class})
	private String gname;
	
	// 描述
	@NotEmpty(message="请输入描述")
	private String gdescription;
	
	// 价格
	@Amount(message="价格入力不正")
	private String gprice;
	
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGdescription() {
		return gdescription;
	}
	public void setGdescription(String gdescription) {
		this.gdescription = gdescription;
	}
	public String getGprice() {
		return gprice;
	}
	public void setGprice(String gprice) {
		this.gprice = gprice;
	}
}
