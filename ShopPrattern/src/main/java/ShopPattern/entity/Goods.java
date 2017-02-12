package ShopPattern.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Goods {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String description;
	private float price;
	
	@ManyToOne
	private Category category;
	
	@ManyToMany
	@JoinTable(name="buy_goods",
	joinColumns= @JoinColumn(name="id_goods"),
	inverseJoinColumns=@JoinColumn(name="id_buy"))
	private List<Buy>buy;
	
	@OneToMany(mappedBy="goods")
	private List<GoodsImage> goodsImages;
	
	public Goods() {
		
	}

	public Goods(String name, String description, float price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Buy> getBuy() {
		return buy;
	}

	public void setBuy(List<Buy> buy) {
		this.buy = buy;
	}

	public List<GoodsImage> getGoodsImages() {
		return goodsImages;
	}

	public void setGoodsImages(List<GoodsImage> goodsImages) {
		this.goodsImages = goodsImages;
	}
	
	
	
	
	
}
