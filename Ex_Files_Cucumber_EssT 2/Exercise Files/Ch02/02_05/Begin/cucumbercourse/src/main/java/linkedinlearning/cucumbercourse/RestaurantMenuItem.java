package linkedinlearning.cucumbercourse;

public class RestaurantMenuItem {
    private String ItemName;
    private String Description;
    private Integer Price;

    public RestaurantMenuItem(String itemName, String description, int price){
        ItemName = itemName;
        Description = description;
        Price = price;
    }


    public String getItemName() {
        return ItemName;
    }


    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }
}
