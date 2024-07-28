import java.util.Scanner;
public class resturant
{
    int total_cost=0;
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
        System.out.println("Total cost of starters orderd: Rs. "+cost_starter);
        total_cost+=cost_starter; //add the cost of starters to the total cost
    }

    public void mainCourse()    //choices regarding main course dishes
    {
        System.out.println("********Welcome to the Main Course section********");
        System.out.println("Press 1: Vegetarian Main Course\nPress 2: Non-veg Main Course");
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
            default:System.out.println("Invalid choice");
        }
        System.out.println("Total cost of main course orderd: Rs. "+cost_main);
        total_cost+=cost_main; //add the cost of main course to the total cost
    }

    public void beverages() //choices regarding the beverages
    {
        System.out.println("Welcome to the Beverage Section: ");
        System.out.println("Press 1: Soft Drinks\nPress 2: Juices\nPress 3:Ice-Creams\nPress 4:Tea & Coffee\n Press 5:Mocktails & Cocktails");
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
            case 3: //ice-creams
                System.out.println("List of Ice-Creams: ");
                System.out.println("Ice-Cream(250 mL)          Amount(in Rs.)");
                System.out.println("1.Vanilla Ice-Cream              100");
                System.out.println("2.Strawberry Ice-Cream           120");
                System.out.println("3.Rocky Road Ice-Cream           140");
                System.out.println("4.Mint Chocolate Ice-Cream       130");
                System.out.println("5.Rocky Road Ice-Cream           140");
                System.out.println("6.Rocky Road Ice-Cream           140");
                System.out.println("Press the number before the ice-cream to order.....");
                int choice3=sc.nextInt;
                switch(choice3)
                {
                    case 1:cost_bev+=100;    break;
                    case 2:cost_bev+=120;    break;
                    case 3:
                    case 5:
                    case 6:cost_bev+=140;    break;
                    case 4:cost_bev+=130;    break;
                    default:System.out.println("Invalid choice");
                }
            break;
            case 4: //tea & coffee
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
            case 5: //mocktails & cocktails
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
        System.out.println("Total cost of bevrerages orderd: Rs."+cost_bev);
        total_cost+=cost_bev;   //adding the cost of beverages to the total cost
    }
    public static void main(String[] args)
    {
        resturant obj=new resturant();  //class object
        
    }
}