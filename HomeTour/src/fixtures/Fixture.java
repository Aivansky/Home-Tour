package fixtures;

public abstract class Fixture {
	public String nameR;
	public String descriptionS;
	public String descriptionL;
	
public Fixture(String name, String shortDescription, String longDescription) {
		this.nameR=name;
		this.descriptionS=shortDescription;
		this.descriptionL=longDescription;
	}

public String getName() {
	return nameR;
}

public void setName(String name) {
	this.nameR=name;
}

public String getShortDescription() {
	return descriptionS;
}

public void setShortDescrpition(String shortDescription) {
	this.descriptionS=shortDescription;
}

public String getLongDescription() {
	return descriptionL;
}

public void setLongDescrpition(String longDescription) {
	this.descriptionL=longDescription;
}

public void pln(String str) {
	System.out.println(str);
}

@Override
public String toString() {
	return nameR +"\n"+ descriptionS + "\n" + descriptionL + "";
}

}
