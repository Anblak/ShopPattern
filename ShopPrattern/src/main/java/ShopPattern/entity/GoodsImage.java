package ShopPattern.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class GoodsImage {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String path;
    
    @ManyToOne
    private Goods goods;
    
    public GoodsImage() {
	}

	public GoodsImage(String path) {
		super();
		this.path = path;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	
    
    
	
}
