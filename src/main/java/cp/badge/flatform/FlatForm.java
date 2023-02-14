package cp.badge.flatform;

public abstract class FlatForm {
    protected String name;
    protected String handle;
    protected String rating;
    protected String color;
    public String getHandle(){ return this.handle;}
    public String getRating(){ return this.rating;}
    public String getColor(){ return this.color;}
    public String getName(){ return this.name;}
}
