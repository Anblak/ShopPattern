package ShopPattern.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class Buy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private LocalDate dateOfPublic;
	
	@ManyToOne
	private User user;
	
	@ManyToMany
	@JoinTable(name="buy_goods",
	joinColumns= @JoinColumn(name="id_buy"),
	inverseJoinColumns=@JoinColumn(name="id_goods"))
	private List<Goods>goods;
	
	public Buy() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDateOfPublic() {
		return dateOfPublic;
	}

	public void setDateOfPublic(LocalDate dateOfPublic) {
		this.dateOfPublic = dateOfPublic;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Goods> getGoods() {
		return goods;
	}

	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}
	
	
}
