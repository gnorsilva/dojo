/**
 * Holds information about a property on a Java Bean. 
 */

public class BeanProperty {

	private String name;
	private Class type;
	private boolean readonly;
	
	/**
	 * constructs a new Bean Property.
	 * @param name the name of the property.
	 * @param readonly true if the bean is readonly (ie only a getter is available).
	 * @param type the type of the bean.
	 */
	public BeanProperty(String name,boolean readonly,Class type) { 
		this.name=name;
		this.readonly=readonly;
		this.type=type;
	}

	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	public boolean isReadonly() { return readonly; }

	public void setReadonly(boolean readonly) { this.readonly = readonly; }

	public Class getType() { return type; }

	public void setType(Class type) { this.type = type; }
	
	public boolean equals(Object o) {
		if (o instanceof BeanProperty) {
			BeanProperty bp=(BeanProperty)o;
			return name.equals(bp.name)&&readonly==bp.readonly&&type.equals(bp.type);
		} else return super.equals(o);
	}
	
	public int hashCode() {
		return readonly?1:0+name.hashCode()+type.hashCode();
	}
	
	public String toString() {
		return "BeanProperty(name="+name+",readonly="+readonly+",type="+type+")";
	}
	
}
