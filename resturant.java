import java.util.Scanner;
public class resturant
{
    int total_cost=0;
    int cost_starter=0; int cost_main=0;
    int cost_bev=0; int cost_dessert=0;

    public void input() //choices regarding the type of meal to be ordered 
    {
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Enter your phone number: ");
        String phone=sc.next();

        System.out.println("Press 1: Starters\nPress 2:Main Course\nPress 3: Desserts\nPress 4:Bevrages")
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1: starters();
            break;
            case 2 mainCourse();
            break;
            case 3: desserts();
            break;
            case 4: beverages();
            break;
            default: System.out.println("Invalid choice");
        }
    }

    public void starters() //choices regarding starters 
    {
        System.out.println("********Welcome to the Starter section********");
        System.out.println("Press 1: Vegetarian Starter\nPress 2: Non-veg Starter");
        int choice=sc.nextInt();
        int cost_starter=0; //calculate cost of the starters
        switch(choice)
        {
            case 1: //veg starters 
                System.out.println("List of Vegetarian starters: ");
                System.out.println("Dish                    Amount(in Rs.)");
                System.out.println("1.Paneer Tikka                250");
                System.out.println("2.Vegetable Samosa(2pcs)       30");
                System.out.println("3.Hara Bhara Kebab            180");
                System.out.println("4.Aloo Tikki                  150");
                System.out.println("5.Chilli Paneer               220");
                System.out.println("6.Dahi Puri                   120");
                System.out.println("7.Vegetable Spring Rolls      180");
                System.out.println("8.Masala Papad                 80");
                System.out.println("9.Vegeiee Dumplings           150");
                System.out.println("10.Fried Mozarella Sticks     180");
                System.out.println("Press the number before the dissh to order.....");
                int choice1=sc.nextInt();
                switch(choice1)
                {
                    case 1:cost_starter+=250;   break;
                    case 2:cost_starter+=30;   break;
                    case 3:cost_starter+=180;   break;
                    case 4:cost_starter+=150;   break;
                    case 5:cost_starter+=220;   break;
                    case 6:cost_starter+=120;   break;
                    case 7:cost_starter+=180;   break;
                    case 8:cost_starter+=80;    break;
                    case 9:cost_starter+=150;   break;
                    case 10:cost_starter+=180;   break;
                    default:System.out.println("Invalid choice");
                }
            break;
            case 2: // non-veg starters 
                System.out.println("List of Non-Veg starters: ");
                System.out.println("Dish                    Amount(in Rs.)");
                System.out.println("1.Chicken Tikka                250");
                System.out.println("2.Chicken Kebab                180");
                System.out.println("3.Chicken Spring Rolls         180");
                System.out.println("4.Chicken Aloo Tikka           150");
                System.out.println("5.Chicken Chilli Paneer        220");
                System.out.println("6.Fish Fingers                 280");
                System.out.println("7.Lamb Kofta                   400");
                System.out.println("8.Crab Cakes                   400");
                System.out.println("9.Grilled Chicken              250");
                System.out.println("10.Meat Balls                  280");
                System.out.println("Press the number before the dish to order.....");
                int choice2=sc.nextInt();
                switch(choice2)
                {
                    case 1:cost_starter+=250;   break;
                    case 2:cost_starter+=180;   break;
                    case 3:cost_starter+=180;   break;
                    case 4:cost_starter+=150;   break;
                    case 5:cost_starter+=220;   break;
                    case 6:cost_starter+=280;   break;
                    case 7:cost_starter+=400;   break;
                    case 8:cost_starter+=400;   break;
                    case 9:cost_starter+=250;   break;
                    case 10:cost_starter+=280;   break;
                    default:System.out.println("Invalid choice");
                }
            break;
            default:System.out.println("Invalid choice");
        }
        total_cost+=cost_starter; //adding the cost of starters to the total cost
    }

    public void mainCourse()    //choices regarding main course dishes
    {
        System.out.println("********Welcome to the Main Course section********");
        System.out.println("Press 1: Vegetarian Main Course\nPress 2: Non-veg Main Course\nPress 3:For Breads");
        int choice=sc.nextInt();
        int cost_main=0; //calculate cost of the main course
        switch(choice)
        {
            case 1: //veg main course
                System.out.println("List of Vegetarian main course: ");
                System.out.println("Dish                    Amount(in Rs.)");
                System.out.println("1.Vegetable Manchurian        300");
                System.out.println("2.Vegetable Fried Rice        250");
                System.out.println("3.Vegetable Kofta             350");
                System.out.println("4.Vegetable Biryani           350");
                System.out.println("5.Chana Masala                150");
                System.out.println("6.Palak Paneer                180");
                System.out.println("7.Saag Allo                   150");
                System.out.println("8.Mattar Paneer               200");
                System.out.println("9.Gobhi Allo                  150");
                System.out.println("10.Tofu Tikka Masala          200");
                System.out.println("Press the number before the dish to order.....");
                int choice1=sc.nextInt();
                switch(choice1)
                {
                    case 1:cost_main+=300;   break;
                    case 2:cost_main+=250;   break;
                    case 3:
                    case 4:cost_main+=350;   break;
                    case 5:
                    case 7:
                    case 9:cost_main+=150;   break;
                    case 6:cost_main+=180;   break;
                    case 8:
                    case 10:cost_main+=200;   break;
                    default:System.out.println("Invalid choice");
                }
            break;
            case 2: // non-veg main course
                System.out.println("List of Nonveg main course: ");
                System.out.println("Dish                    Amount(in Rs.)");
                System.out.println("1.Chicken Tikka Masala        350");
                System.out.println("2.Butter Chicken              280");
                System.out.println("3.Fish Curry                  300");
                System.out.println("4.Mutton Rogan Josh           350");
                System.out.println("5.Chicken Biryani             250");
                System.out.println("6.Prawn Masala                380");
                System.out.println("7.Lamb Vindaloo               400");
                System.out.println("8.Chicken Saagwala            300");
                System.out.println("9.Chicken Bhuna Masala        300");
                System.out.println("10.Crab Masala                500");
                System.out.println("Press the number before the dish to order.....");
                int choice2=sc.nextInt();
                switch(choice2)
                {
                    case 1:cost_main+=350;   break;
                    case 2:cost_main+=280;   break;
                    case 3:
                    case 8:
                    case 9:cost_main+=300;   break;
                    case 4:cost_main+=350;   break;
                    case 5:cost_main+=250;   break;
                    case 6:cost_main+=380;   break;
                    case 7:cost_main+=400;   break;
                    case 10:cost_main+=500;   break;
                    default:System.out.println("Invalid choice");
                }
            break;
            case 3: // for breads
                System.out.println("List of Breads: ");
                System.out.println("Bread(1 pc)              Amount(in Rs.)");
                System.out.println("1.Tawa Roti                    7");
                System.out.println("2.Naan                        20");
                System.out.println("3.Garlic Naan                 30");
                System.out.println("4.Butter Naan                 30");
                System.out.println("5.Gluten-Free Bread           45");
                System.out.println("6.Tandoori Roti               35");
                System.out.println("7.Roomali Roti                30");
                System.out.println("8.Peshawari Naan              50");   
                System.out.println("9. Spinach and Cheese Naan   100");
                System.out.println("10.Amritsari Kulcha           60");
                System.out.println("Press the number before Bread to order.....");
                int choice3=sc.nextInt();
                switch(choice3)
                {
                    case 1:cost_main+=7;    break;
                    case 2:cost_main+=20;   break;
                    case 3:
                    case 4:
                    case 7:cost_main+=30;   break;
                    case 5:cost_main+=45;   break;
                    case 6:cost_main+=35;   break;
                    case 8:cost_main+=50;   break;
                    case 9:cost_main+=100;  break;
                    case 10:cost_main+=60;  break;
                    default:System.out.println("Invalid choice");
                }
            break;
            default:System.out.println("Invalid choice");
        }
        total_cost+=cost_main; //adding the cost of main course to the total cost
    }
    
    public void dessert() //choices regarding the dessert
    {
        System.out.println("Welcome to the Dessert Section: ");
        System.out.println("Press 1: Ice Creams\nPress 2: Soft Desserts\nPress 3: Cakes\nPress 4: Bakes\nPress 5: Mousses");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1: //ice creams
                System.out.println("List of Ice Creams: ");
                System.out.println("Ice Cream                     Amount(in Rs.)");
                System.out.println("1.Vanilla Ice Cream               25");
                System.out.println("2.Strawberry Ice Cream            80");
                System.out.println("3.Rocky Road Ice Cream            25");
                System.out.println("4.Pineapple Ice cream             45");
                System.out.println("5.Mango Ice cream                 50");
                System.out.pritnln("6.Chocolate Ice Cream             30");
                System.out.println("7.Kulfi                           25");
                System.out.println("Press the number before Ice Cream to order.....");
                int choice1=sc.nextInt();
                switch(choice1)
                {
                    case 1:
                    case 3:
                    case 7:cost_dessert+=25;   break;
                    case 2:cost_dessert+=80;   break;
                    case 4:cost_dessert+=45;   break;
                    case 5:cost_dessert+=50;   break;
                    case 6:cost_dessert+=30;   break;
                    default:System.out.println("Invalid choice");
                }
            break;
            case 2: //soft desserts
                System.out.println("List of Soft Desserts: ");
                System.out.println("Soft Dessert                     Amount(in Rs.)");
                System.out.println("1.Gulab Jamun(2pc)                   30");
                System.out.println("2.Ras Malai(2pc)                     40");
                System.out.println("3.Jalebi(2pc)                        30");
                System.out.println("4.Falooda(1 glass)                   50");
                System.out.println("5.Shrikhand                          70");
                System.out.println("6.Gulab Jamun with Rabri             80");
                System.out.println("7.Rabri                              30");
                System.out.println("8.Falooda with Kulfi                 90");
                System.out.println("Press the number before the Dessert to order....");
                int choice2=sc.nextInt();
                switch(choice2)
                {
                    case 1:
                    case 3:
                    case 7:cost_dessert+=30;   break;
                    case 2:cost_dessert+=40;   break;
                    case 4:cost_dessert+=50;   break;
                    case 5:cost_dessert+=70;   break;
                    case 6:cost_dessert+=80;   break;
                    case 8:cost_dessert+=90;   break;
                    default:System.out.println("Invalid choice");
                }
            break;
            case 3: //cakes
                System.out.println("List of Cakes: ");
                System.out.println("Cake                          Amount(in Rs.)");
                System.out.println("1.Red velvet Cake                 250");
                System.out.println("2.Vanilla Cake                    150");
                System.out.println("3.Chocolate Cake                  200");
                System.out.println("4.Rocky Road Cake                 230");
                System.out.println("5.Rocky Road Chocolate Cake       175");
                System.out.println("6.Rocky Road Vanilla Cake         450");
                System.out.println("7.Rocky Road Butterscotch Cake    250");
                System.out.println("Press the number before the cake to order.....");
                int choice3=sc.nextInt();
                switch(choice3)
                {
                    case 1:
                    case 7:cost_dessert+=250;   break;
                    case 2:cost_dessert+=150;   break;
                    case 3:cost_dessert+=200;   break;
                    case 4:cost_dessert+=230;   break;
                    case 5:cost_dessert+=175;   break;
                    case 6:cost_dessert+=450;   break;
                    default:System.out.println("Invalid choice");
                }
            break;
            case 4: //mousses
                System.out.pritnln("List of Mousses:");
                System.out.println("Mousse                          Amount(in Rs.)");
                System.out.println("1.Rocky Road Chocolate Mousse      30");
                System.out.println("2.Rocky Road Butterscotch Mousse   30");
                System.out.println("3.Rocky Road Vanilla Mousse        30");
                System.out.println("4.Pistachio Mousse                180");
                System.out.println("5.Raspberry Mousses               150");
                System.out.println("6.Pineapple Mousse                180");
                System.out.println("Press the number before the mousse to order.....");
                int choice4=sc.nextInt();
                switch(choice4)
                {
                    case 1:
                    case 2:
                    case 3:cost_bev+=30;    break;
                    case 4:
                    case 6:cost_bev+=180;  break;
                    case 5:cost_bev+=150;  break;
                    default:System.out.println("Invalid choice");
                }
            break;
            default:System.out.println("Invalid choice");
        }
        total_cost+=cost_dessert;   //adding the cost of desserts to the total cost
    }

    public void beverages() //choices regarding the beverages
    {
        System.out.println("Welcome to the Beverage Section: ");
        System.out.println("Press 1: Soft Drinks\nPress 2: Juices\nPress 3:Tea & Coffee\n Press 4:Mocktails & Cocktails");
        int choice=sc.nextInt();
        int cost_bev=0; //calculate cost of beverages
        switch(choice)
        {
            case 1: //soft drinks
                System.out.println("List of Soft Drinks: ");
                System.out.println("Drink(250 mL)            Amount(in Rs.)");
                System.out.println("1.Coca Cola                    60");
                System.out.println("2.Pepsi                        40");
                System.out.println("3.Sprite                       50");
                System.out.println("4.Fanta                        60");
                System.out.println("5.Mountain Dew                 60");
                System.out.println("6.Limca                        60");
                System.out.println("7.Thumbs Up                    40");
                System.out.println("Press the number before the drink to order.....");
                int choice1=sc.nextInt();
                switch(choice1)
                {
                    case 1:
                    case 4:
                    case 5:
                    case 6:cost_bev+=60;   break;
                    case 2:
                    case 7:cost_bev+=40;   break;
                    case 3:cost_bev+=50; break;
                    default:System.out.println("Invalid choice");
                }
            break;
            case 2: //juices
                System.out.println("List of Juices: ");
                System.out.println("Juice(250 mL)             Amount(in Rs.)");
                System.out.println("1.Apple Juice                80");
                System.out.println("2.Mango Juice                60");
                System.out.println("3.Pineapple Juice            70");
                System.out.println("4.Lemon Juice                40");
                System.out.println("5.Strawberry Juice           90");
                System.out.println("6.Watermelon Juice           50");
                System.out.println("7.Oragne Juice               40");
                System.out.println("Press the number before the juice to order.....");
                int choice2=sc.nextInt();
                switch(choice2)
                {
                    case 1:cost_bev+=80;    break;
                    case 2:cost_bev+=60;    break;
                    case 3:cost_bev+=70;    break;
                    case 4:
                    case 7:cost_bev+=40;    break;
                    case 5:cost_bev+=90;    break;
                    case 6:cost_bev+=50;    break;
                    default:System.out.println("Invalid choice");
                }
            break;
            case 3: //tea & coffee
                System.out.println("List of Tea & Coffee: ");
                System.out.println("Tea(1 cup)                 Amount(in Rs.)");
                System.out.println("1.Black Tea                      80");
                System.out.println("2.Green Tea                      50");
                System.out.println("3.Hot Chocolate                 100");
                System.out.println("4.Cappuccino                    120");
                System.out.println("5.Hot Chocolate                 100");
                System.out.println("6.Hot Chocolate                 100");
                System.out.println("Press the number before the tea or coffee to order.....");
                int choice4=sc.nextInt();
                switch(choice4)
                {
                    case 1:cost_bev+=80;    break;
                    case 2:cost_bev+=50;    break;
                    case 3:
                    case 5:
                    case 6:cost_bev+=100;    break;
                    case 4:cost_bev+=120;    break;
                    default:System.out.println("Invalid choice");
                }
            break;
            case 4: //mocktails & cocktails
                System.out.println("List of Mocktails And Cocktails"):
                System.out.println("Drink(1 cup)                Amount(in Rs.)");
                System.out.println("1.Mojito                        150");
                System.out.println("2.Margarita                     200");
                System.out.println("3.Virgin Mojito                 180");
                System.out.println("4.Virgin Mary                   170");
                System.out.println("5.Fruit Punch                   180");
                System.out.println("Press the number before the mocktail or cocktail to order.....");
                int choice5=sc.nextInt();
                switch(choice5)
                {
                    case 1:cost_bev+=150;    break;
                    case 2:cost_bev+=200;    break;
                    case 3:
                    case 5:cost_bev+=180;    break;
                    case 4:cost_bev+=170;    break;
                    default:System.out.println("Invalid choice");
                }
            break;
            default:System.out.println("Invalid choice");
        }
        total_cost+=cost_bev;   //adding the cost of beverages to the total cost
    }
    
    public void billing()   // to calculate the bill and print the reciept 
    {
        float gst=0.18*total_cost;
        System.out.println("***********************************************************");
        System.out.println("*          Welcome to the Grand Central Restaurant        *");
        System.out.println("***********************************************************");
        System.out.println("*   Amount for Starters =      Rs."+ cost_starter+"                   *" );
        System.out.println("*   Amount for Main Course =   Rs."+cost_main+"                   *");
        System.out.println("*   Amount for Beverages =     Rs."+cost_bev+"                   *");
        System.out.println("*   Amount for Desserts =      Rs"+cost_desserts+".                   *");
        System.out.println("***********************************************************");
        System.out.println("*   GST =                      Rs.                        *"+gst);
        System.out.println("***********************************************************");
        System.out.println("*   Amount to be paid =        Rs."+(double)(gst+total_cost)+"                        *");
        System.out.println("***********************************************************");
        SYstem.out.println("*                    Thank You                            *");
        System.out.println("*             We Hope for Your presence Again             *")
        System.out.println("***********************************************************");
    }
    public static void main(String[] args)
    {
        resturant obj=new resturant();  //class object
        obj.input();
        obj.billing(); 
    }
}