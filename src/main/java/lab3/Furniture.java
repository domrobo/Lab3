package lab3;



public class Furniture {
    /**
     * Type/name of furniture
     */
    private String name;

    /**
     * Material what furniture is made of
     */
    private String material;

    /**
     *Price of furniture
     */
    private double price;

    /**
     * Weight of furniture
     */
    private int weight;

    /**
     * Color of furniture
     */
    private String color;

    /**
     * Class constructor for getting sample data
     * @param name receive and set name of furniture
     * @param price receive and set how much a sample cost
     * @param material receive what is furniture made of
     * @param weight receive weight of object
     * @param color receive color of product
     */
    public Furniture(String name,
                     String material,
                     double price,
                     int weight,
                     String color){
            this.name = name;
            this.material = material;
            this.price = price;
            this.weight = weight;
            this.color = color;
    }

    /**
     * Standard toString method override
     * @return better for this class String representation
     */
    @Override
    public String toString(){
        return "Name: "+ this.name + ";\n" + 
        "Material: "+ this.material + ";\n" + 
        "Price: " + this.price + ";\n" + 
        "Weight: "+ this.weight + ";\n" + 
        "Color: "+ this.color + ";\n";
    }

    /**
     *Override standard equals method
     * @param obj needed Object type variable for comparison objects
     * @return true if object equals to another
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Furniture other)) return false;
        
        return weight == other.weight
                && price == other.price
                && name.equals(other.name)
                && material.equals(other.material)
                && color.equals(other.color);
    }

    /**
     * Getter for name
     * @return name of sample
     */
    public String getName(){
        return this.name;
    }

    /**
     * Setter for name
     * @param name receive new name for object
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Getter for material
     * @return material of sample
     */
    public String getMaterial(){
        return this.material;
    }
    /**
     * Setter for material
     * @param material receive new material type for object
     */
    public void setMaterial(String material){
        this.material = material;
    }

    /**
     * Getter for price
     * @return price of sample
     */
    public double getPrice(){
        return this.price;
    }
    /**
     * Setter for price
     * @param price receive new price for object
     */
    public void setPrice(double price){
        this.price = price;
    }

    /**
     * Getter for weight
     * @return weight of sample
     */
    public int getWeight(){
        return this.weight;
    }
    /**
     * Setter for weight
     * @param weight receive new weight for object
     */
    public void setWeight(int weight){
        this.weight = weight;
    }

    /**
     * Getter for color
     * @return color of sample
     */
    public String getColor(){
        return this.color;
    }
    /**
     * Setter for color
     * @param color receive new color for object
     */
    public void setColor(String color){
        this.color = color;
    }
}
