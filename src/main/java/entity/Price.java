package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
public class Price {
	@Id
	@Column(name = "price_key")
	@GeneratedValue(generator="pricekey_id_seq")
	private int priceKey;
	
	@Column(length = 35)
	private int price;

	@OneToOne
	@JoinColumn(name = "menu_code")
	private Menu menu;

	public Price(int price, Menu menu) {
		this.price = price;
		this.menu = menu;
	}

	public Price() {
	}
}
