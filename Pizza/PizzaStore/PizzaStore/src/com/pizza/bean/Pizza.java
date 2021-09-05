package com.pizza.bean;

import java.util.Date;

public class Pizza implements Comparable<Pizza>{
	
	  private String pizzaName; 
	  private int sizeInCms; 
	  private String majorIngredientOne; 
	  private String majorIngredientTwo; 
	  private String majorIngredientThree; 
	  private float weight; 
	  private float price;
	  private Date insertionDate;

	  /**
	 * @return the pizzaName
	 */
	public String getPizzaName() {
		return pizzaName;
	}


	/**
	 * @return the sizeInCms
	 */
	public int getSizeInCms() {
		return sizeInCms;
	}


	/**
	 * @return the majorIngredientOne
	 */
	public String getMajorIngredientOne() {
		return majorIngredientOne;
	}


	/**
	 * @return the majorIngredientTwo
	 */
	public String getMajorIngredientTwo() {
		return majorIngredientTwo;
	}


	/**
	 * @return the majorIngredientThree
	 */
	public String getMajorIngredientThree() {
		return majorIngredientThree;
	}


	/**
	 * @return the weight
	 */
	public float getWeight() {
		return weight;
	}


	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}


	/**
	 * @param pizzaName the pizzaName to set
	 */
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}


	/**
	 * @param sizeInCms the sizeInCms to set
	 */
	public void setSizeInCms(int sizeInCms) {
		this.sizeInCms = sizeInCms;
	}


	/**
	 * @param majorIngredientOne the majorIngredientOne to set
	 */
	public void setMajorIngredientOne(String majorIngredientOne) {
		this.majorIngredientOne = majorIngredientOne;
	}


	/**
	 * @param majorIngredientTwo the majorIngredientTwo to set
	 */
	public void setMajorIngredientTwo(String majorIngredientTwo) {
		this.majorIngredientTwo = majorIngredientTwo;
	}


	/**
	 * @param majorIngredientThree the majorIngredientThree to set
	 */
	public void setMajorIngredientThree(String majorIngredientThree) {
		this.majorIngredientThree = majorIngredientThree;
	}


	/**
	 * @param weight the weight to set
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	
	

	/**
	 * @return the insertionDate
	 */
	public Date getInsertionDate() {
		return insertionDate;
	}


	/**
	 * @param insertionDate the insertionDate to set
	 */
	public void setInsertionDate(Date insertionDate) {
		this.insertionDate = insertionDate;
	}


	public void preparation() { 
		  
		  
	  }


	public Pizza(String pizzaName, int sizeInCms, String majorIngredientOne, String majorIngredientTwo,
			String majorIngredientThree, float weight, float price) {
		super();
		this.pizzaName = pizzaName;
		this.sizeInCms = sizeInCms;
		this.majorIngredientOne = majorIngredientOne;
		this.majorIngredientTwo = majorIngredientTwo;
		this.majorIngredientThree = majorIngredientThree;
		this.weight = weight;
		this.price = price;
	}


	public Pizza() {
		// TODO Auto-generated constructor stub
	}
	
	
	


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((insertionDate == null) ? 0 : insertionDate.hashCode());
		result = prime * result + ((majorIngredientOne == null) ? 0 : majorIngredientOne.hashCode());
		result = prime * result + ((majorIngredientThree == null) ? 0 : majorIngredientThree.hashCode());
		result = prime * result + ((majorIngredientTwo == null) ? 0 : majorIngredientTwo.hashCode());
		result = prime * result + ((pizzaName == null) ? 0 : pizzaName.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + sizeInCms;
		result = prime * result + Float.floatToIntBits(weight);
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pizza other = (Pizza) obj;
		if (insertionDate == null) {
			if (other.insertionDate != null)
				return false;
		} else if (!insertionDate.equals(other.insertionDate))
			return false;
		if (majorIngredientOne == null) {
			if (other.majorIngredientOne != null)
				return false;
		} else if (!majorIngredientOne.equals(other.majorIngredientOne))
			return false;
		if (majorIngredientThree == null) {
			if (other.majorIngredientThree != null)
				return false;
		} else if (!majorIngredientThree.equals(other.majorIngredientThree))
			return false;
		if (majorIngredientTwo == null) {
			if (other.majorIngredientTwo != null)
				return false;
		} else if (!majorIngredientTwo.equals(other.majorIngredientTwo))
			return false;
		if (pizzaName == null) {
			if (other.pizzaName != null)
				return false;
		} else if (!pizzaName.equals(other.pizzaName))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (sizeInCms != other.sizeInCms)
			return false;
		if (Float.floatToIntBits(weight) != Float.floatToIntBits(other.weight))
			return false;
		return true;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pizza [pizzaName=" + pizzaName + ", sizeInCms=" + sizeInCms + ", majorIngredientOne="
				+ majorIngredientOne + ", majorIngredientTwo=" + majorIngredientTwo + ", majorIngredientThree="
				+ majorIngredientThree + ", weight=" + weight + ", price=" + price + ", insertionDate=" + insertionDate
				+ "]";
	}


	@Override
	public int compareTo(Pizza o) {
		// TODO Auto-generated method stub
		return this.getPizzaName().compareTo(o.getPizzaName());
	}



	
	


}
