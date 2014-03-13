public class Software extends Product
{
    private String version;

    public Software()
    {
        super();
        version = "";
        addCount();
    }

    public void setVersion(String version)
    {
        this.version = version;
    }

    public String getVersion()
    {
        return version;
    }

    public String toString()
    {
        return super.toString() +
            "Version:     " + version + "\n";
    }
    
    public void displayContent()
    {
    	System.out.println("Version:     " + version + "\n");
    }
}