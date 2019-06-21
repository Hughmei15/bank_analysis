package pojo;


import javax.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;
import annotataion.Amount;
import group.GroupA;

public class Goods {

	// ��Ʒ��
	@NotEmpty(message="�������Ʒ��")
	@Length(min=5,max=10,message="������5-10λ����",groups={GroupA.class})
	private String gname;
	
	// ����
	@NotEmpty(message="����������")
	private String gdescription;
	
	// �۸�
	@Amount(message="�۸���������")
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
