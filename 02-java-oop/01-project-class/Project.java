class Project{
    private String name;
    private String description;

    public Project (){
        this.name = "newproj";
        this.description = "desc";
    }
    public Project(String name){
        this.name = name;
        this.description = "desc";
    }
    public Project(Strinf name, String description){
        this.name=name;
        this.description = description;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name; 
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(){
        this.description=description;
    }
}