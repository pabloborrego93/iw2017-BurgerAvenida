package com.pd.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity(name = "orderline")
@Table(name = "orderline")
public class OrderLine implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2394408194092400146L;

	@EmbeddedId
	private OrderLinePK id;
	
	private Integer amount;

	@MapsId("OrderId")
    @JoinColumn(name="order_id", insertable = false, updatable = false, nullable = false)
    @ManyToOne 
    private Order order;
	
	@MapsId("ProductId")
    @JoinColumn(name="product_id", insertable = false, updatable = false, nullable = false)
    @ManyToOne 
    private Product product;
	
	public OrderLine() {
		super();
	}

	public OrderLine(Order order, Product product, Integer amount) {
		super();
		this.order = order;
		this.product = product;
		this.id = new OrderLinePK(order.getId(), product.getId());
		this.amount = amount;
	}
	
	public OrderLine(Order order, Product product) {
		super();
		this.order = order;
		this.product = product;
		this.id = new OrderLinePK(order.getId(), product.getId());
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Order getOrder() {
		return order;
	}

	public Product getProduct() {
		return product;
	}

	public OrderLinePK getId() {
		return id;
	}
	
}
