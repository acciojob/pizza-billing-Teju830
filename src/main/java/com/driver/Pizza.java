package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isBill =false;
    private  int cheese = -1;
    private  int toppings = -1;
    private int takeaway = -1;

   final private int priceofveg = 300;
    final private int priceofnonveg = 400;
    final private int extracheeseprice = 80;
    final private int extratoppingsforveg = 70;
    final private int extratoppingsfornonveg = 120;
    final private int papercover=20;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price= priceofveg;
        }else{
            this.price = priceofnonveg;
        }
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(cheese==-1){
            this.price+=extracheeseprice;
            cheese=extracheeseprice;
            return;
        }
      return;
    }

    public void addExtraToppings(){
        // your code goes here
        if(toppings == -1){
            if(this.isVeg == true){
                this.price+=extratoppingsforveg;
                toppings = extratoppingsforveg;
                return;
            }
            this.price += extratoppingsfornonveg;
            toppings = extratoppingsfornonveg;
            return;
        }
        return;
    }

    public void addTakeaway(){
        // your code goes here
        if(takeaway==-1){
            this.price += papercover;
            takeaway = papercover;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBill == false){
            if(isVeg == true)
                bill +="Base Price Of The Pizza: "+priceofveg +"\n";
            else
                bill +="Base Price Of The Pizza: "+priceofnonveg +"\n";
            if(cheese !=-1)
                bill += "Extra Cheese Added: "+ cheese +"\n";
            if(toppings !=-1)
                bill +="Extra Toppings Added: "+toppings +"\n";
            if(takeaway != -1)
                bill+="Paperbag Added: " + papercover +"\n";
            bill += "Total Price: "+ price + "\n";
            isBill = true;
        }
        return this.bill;
    }
}
