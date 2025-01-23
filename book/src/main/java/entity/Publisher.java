package entity;

public class Publisher {
	private int Publisherid;
	private String PublisherName;
	public int getPublisherid() {
		return Publisherid;
	}
	public void setPublisherid(int publisherid) {
		Publisherid = publisherid;
	}
	public String getPublisherName() {
		return PublisherName;
	}
	public void setPublisherName(String publisherName) {
		PublisherName = publisherName;
		
		
	}
	@Override
	public String toString() {
		return "Publisher [Publisherid=" + Publisherid + ", PublisherName=" + PublisherName + ", getPublisherid()="
				+ getPublisherid() + ", getPublisherName()=" + getPublisherName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
