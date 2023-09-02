public class pizza {

    public int BasePrize;
    public int ExtraTopings;
    public int ExtraCheese;
    public int TakeAwayBags;
    public int size;
    public Boolean isExtraToppings;
    public Boolean isExtraCheese;
    public Boolean isTakeAwayBags;

    public int total;
    public String Bill;
    public Boolean isVeg;
    public pizza (Boolean isVeg, int size)
    {
        this.isVeg=isVeg;
        this.size=size;
        if(isVeg)
        {
            switch(size)
            {
                case 0:small(isVeg);
                break;
                case 1:medium(isVeg);
                break;
                case 2:large(isVeg);
                break;
            }
            this.ExtraTopings=50;
        }
        else {
            switch(size)
            {
                case 0:small(isVeg);
                break;
                case 1:medium(isVeg);
                break;
                case 2:large(isVeg);
                break;
            }
            this.ExtraTopings=80;
        }
        this.ExtraCheese=30;
        this.TakeAwayBags=15;

        this.isExtraToppings=false;
        this.isExtraCheese=false;
        this.isTakeAwayBags=false;

    }

    private void large(Boolean isVeg) {
        if(isVeg) {
            this.BasePrize = 400;
        }
        else {
            this.BasePrize=600;
        }
    }

    private void medium(Boolean isVeg) {
        if(isVeg) {
            this.BasePrize = 300;
        }
        else {
            this.BasePrize=500;
        }
    }

    private void small(Boolean isVeg)
    {
        if(isVeg) {
            this.BasePrize = 300;
        }
        else {
            this.BasePrize=400;
        }
    }
    public int getExtraCheese()
    {
        return ExtraCheese;
    }
    public void addExtraCheese()
    {
        if(!isExtraCheese)
        {
            isExtraCheese=true;
        }
    }

    public int getExtraTopings()
    {
        return ExtraTopings;
    }
    public void addExtraTopings()
    {
        if(!isExtraToppings)
        {
            isExtraToppings=true;
        }
    }

    public int getTakeAwayBags(){
        return TakeAwayBags;
    }
    public void addTakeAwayBags()
    {
        if(!isTakeAwayBags)
        {
            isTakeAwayBags=true;
        }
    }

    public String getBill() {
        if (isVeg)
        {
            Bill="Your Veg";
        }
        else {
            Bill="Your Non-Veg";
        }
            switch (size) {
                case 0: Bill+="Small Pizza Prize "+this.BasePrize+"/-"+"\n";
                break;
                case 1: Bill+="Medium Pizza Prize "+this.BasePrize+"/-"+"\n";
                break;
                case 2: Bill+="Large Pizza Prize "+this.BasePrize+"/-"+"\n";
                break;
            }
        this.total=this.BasePrize;
        if(isExtraCheese)
        {
            Bill+="Prize for ExtraCheese "+this.ExtraCheese+"-/"+"\n";
            this.total+=this.ExtraCheese;
        }
        if(isExtraToppings)
        {
            Bill+="Prize for ExtraToppings "+this.ExtraTopings+"-/"+"\n";
            this.total+=this.ExtraTopings;
        }
        if(isTakeAwayBags)
        {
            Bill+="Prize for Bags "+this.TakeAwayBags+"-/"+"\n";
            this.total+=this.TakeAwayBags;
        }


        Bill+="Your final prize for this pizza "+this.total+"/-"+"\n";
        return Bill;
    }
    public int gettotal()
    {
        return this.total;
    }

}
