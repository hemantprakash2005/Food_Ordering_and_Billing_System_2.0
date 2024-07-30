import java.util.Scanner;
public class resturant
{
	Scanner sc=new Scanner(System.in);
    int total_cost=0;
    int cost_starter=0; int cost_main=0;
    int cost_bev=0; int cost_dessert=0;

    public void details() //input of the details of the customer
    {
    	System.out.println("***********************************************************");
        System.out.println("*              The Grand Central Restaurant               *");
        System.out.println("***********************************************************");
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Enter your phone number: ");
        String phone=sc.next();
    }
    public void main_menu() //choices regarding the type of food to be ordered
    {
        System.out.println("Press 1: Starters\nPress 2:Main Course\nPress 3: Desserts\nPress 4:Bevrages");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1: starters();
            break;
            case 2:mainCourse();
            break;
            case 3: dessert();
            break;
            case 4: beverages();
            break;
            default: System.out.println("Invalid choice");
        }
    }

    public void starters() //choices regarding starters (working on multiple selection of items and number of plates)
    {
        System.out.println("*************Welcome to the Starter section****************");
        System.out.println("Press 1: Vegetarian Starter\nPress 2: Non-veg Starter");
        int choice=sc.nextInt();
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
                System.out.println("Press the number before the item to order.....");
                System.out.println("Followed by enter the number of plates for the selected item");
                System.out.println("Press 0 when done with ordering from this section");
                
                // need to implement to all of the cases in each sections
                int choice1_item;
                do
                {
                    System.out.println();
                    System.out.print("Item number: ");
                    choice1_item=sc.nextInt();  //taking the input of the dish number
                    if(choice1_item==0)
                        break;
                    System.out.print("Plates: ");
                    int choice1_plates=sc.nextInt();    //taking the input of the number of plate of the item selected in choice1_item
                    System.out.println();
                    switch(choice1_item) 
                    {
                        case 1:cost_starter+=choice1_plates*250;   break;
                        case 2:cost_starter+=choice1_plates*30;   break;
                        case 3:cost_starter+=choice1_plates*180;   break;
                        case 4:cost_starter+=choice1_plates*150;   break;
                        case 5:cost_starter+=choice1_plates*220;   break;
                        case 6:cost_starter+=choice1_plates*120;   break;
                        case 7:cost_starter+=choice1_plates*180;   break;
                        case 8:cost_starter+=choice1_plates*80;    break;
                        case 9:cost_starter+=choice1_plates*150;   break;
                        case 10:cost_starter+=choice1_plates*180;   break;
                        default: System.out.println("Invalid choice");
                    }
                } while(choice1_item!=0);

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
                System.out.println("Followed by enter the number of plates for the selected item");
                System.out.println("Press 0 when done with ordering from this section");
                int choice2_item;
                do
                {
                    System.out.println();
                    System.out.print("Item number: ");
                    choice2_item=sc.nextInt();  //taking the input of the dish number
                    if(choice2_item==0)
                        break;
                    System.out.print("Plates: ");
                    int choice2_plates=sc.nextInt();    //taking the input of the number of plate of the item selected in choice1_item
                    System.out.println();
                    switch(choice2_item)
                    {
                        case 1:cost_starter+=choice2_plates*250;   break;
                        case 2:cost_starter+=choice2_plates*180;   break;
                        case 3:cost_starter+=choice2_plates*180;   break;
                        case 4:cost_starter+=choice2_plates*150;   break;
                        case 5:cost_starter+=choice2_plates*220;   break;
                        case 6:cost_starter+=choice2_plates*280;   break;
                        case 7:cost_starter+=choice2_plates*400;   break;
                        case 8:cost_starter+=choice2_plates*400;   break;
                        case 9:cost_starter+=choice2_plates*250;   break;
                        case 10:cost_starter+=choice2_plates*280;   break;
                        default:System.out.println("Invalid choice");
                    }
                } while(choice2_item!=0);
            break;
            default:System.out.println("Invalid choice"); 
        }
        total_cost+=cost_starter; //adding the cost of starters to the total cost
    }

    public void mainCourse()    //choices regarding main course dishes
    {
    	System.out.println("***********Welcome to the Main COurse section**************");
        System.out.println("Press 1: Vegetarian Main Course\nPress 2: Non-veg Main Course\nPress 3:For Breads");
        int choice=sc.nextInt();
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
                System.out.println("Followed by enter the number of plates for the selected item");
                System.out.println("Press 0 when done with ordering from this section");
                int choice1_item;
                do
                {
                    System.out.println();
                    System.out.print("Item number: ");
                    choice1_item=sc.nextInt();  //taking the input of the dish number
                    if(choice1_item==0)
                        break;
                    System.out.print("Plates: ");
                    int choice1_plates=sc.nextInt();    //taking the input of the number of plate of the item selected in choice1_item
                    System.out.println();
                    switch(choice1_item)
                    {
                        case 1:cost_main+=choice1_plates*300;   break;
                        case 2:cost_main+=choice1_plates*250;   break;
                        case 3:
                        case 4:cost_main+=choice1_plates*350;   break;
                        case 5:
                        case 7:
                        case 9:cost_main+=choice1_plates*150;   break;
                        case 6:cost_main+=choice1_plates*180;   break;
                        case 8:
                        case 10:cost_main+=choice1_plates*200;   break;
                        default: System.out.println("Invalid choice");
                    }
                } while(choice1_item!=0);
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
                System.out.println("Followed by enter the number of plates for the selected item");
                System.out.println("Press 0 when done with ordering from this section");
                int choice2_item;
                do
                {
                    System.out.println();
                    System.out.print("Item number: ");
                    choice2_item=sc.nextInt();  //taking the input of the dish number
                    if(choice2_item==0)
                        break;
                    System.out.print("Plates: ");
                    int choice2_plates=sc.nextInt();    //taking the input of the number of plate of the item selected in choice1_item
                    System.out.println();
                    switch(choice2_item)
                    {
                        case 1:cost_main+=choice2_plates*350;   break;
                        case 2:cost_main+=choice2_plates*280;   break;
                        case 3:
                        case 8:
                        case 9:cost_main+=choice2_plates*300;   break;
                        case 4:cost_main+=choice2_plates*350;   break;
                        case 5:cost_main+=choice2_plates*250;   break;
                        case 6:cost_main+=choice2_plates*380;   break;
                        case 7:cost_main+=choice2_plates*400;   break;
                        case 10:cost_main+=choice2_plates*500;   break;
                        default:System.out.println("Invalid choice");
                    }
                } while(choice2_item!=0);
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
                System.out.println("Followed by enter the number of piece for the selected item");
                System.out.println("Press 0 when done with ordering from this section");
                int choice3_item;
                do
                {
                    System.out.println();
                    System.out.print("Item number: ");
                    choice3_item=sc.nextInt();  //taking the input of the dish number
                    if(choice3_item==0)
                        break;
                    System.out.print("Piece: ");
                    int choice3_plates=sc.nextInt();    //taking the input of the number of plate of the item selected in choice1_item
                    System.out.println();
                    switch(choice3_item)
                    {
                        case 1:cost_main+=7;    break;
                        case 2:cost_main+=20;   break;
                        case 3:
                        case 4:
                        case 7:cost_main+=choice3_plates*30;   break;
                        case 5:cost_main+=choice3_plates*45;   break;
                        case 6:cost_main+=choice3_plates*35;   break;
                        case 8:cost_main+=choice3_plates*50;   break;
                        case 9:cost_main+=choice3_plates*100;  break;
                        case 10:cost_main+=choice3_plates*60;  break;
                        default:System.out.println("Invalid choice");
                    }
                } while(choice3_item!=0);
            break;
            default:System.out.println("Invalid choice");
        }
        total_cost+=cost_main; //adding the cost of main course to the total cost
    }
    
    public void dessert() //choices regarding the dessert
    {
    	System.out.println("**************Welcome to the Desserts section**************");
        System.out.println("Press 1: Ice Creams\nPress 2: Soft Desserts\nPress 3: Cakes\nPress 4: Mousses");
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
                System.out.println("6.Chocolate Ice Cream             30");
                System.out.println("7.Kulfi                           25");
                System.out.println("Press the number before Ice Cream to order.....");
                System.out.println("Followed by enter the number of plates for the selected item");
                System.out.println("Press 0 when done with ordering from this section");
                int choice1_item;
                do
                {
                    System.out.println();
                    System.out.print("Item number: ");
                    choice1_item=sc.nextInt();  //taking the input of the dish number
                    if(choice1_item==0)
                        break;
                    System.out.print("Plates: ");
                    int choice1_plates=sc.nextInt();    //taking the input of the number of plate of the item selected in choice1_item
                    System.out.println();
                    switch(choice1_item)
                    {
                        case 1:
                        case 3:
                        case 7:cost_dessert+=choice1_plates*25;   break;
                        case 2:cost_dessert+=choice1_plates*80;   break;
                        case 4:cost_dessert+=choice1_plates*45;   break;
                        case 5:cost_dessert+=choice1_plates*50;   break;
                        case 6:cost_dessert+=choice1_plates*30;   break;
                        default:System.out.println("Invalid choice");
                    }
                } while(choice1_item!=0);
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
                System.out.println("Followed by enter the number of plates for the selected item");
                System.out.println("Press 0 when done with ordering from this section");
                int choice2_item;
                do
                {
                    System.out.println();
                    System.out.print("Item number: ");
                    choice2_item=sc.nextInt();  //taking the input of the dish number
                    if(choice2_item==0)
                        break;
                    System.out.print("Plates: ");
                    int choice2_plates=sc.nextInt();    //taking the input of the number of plate of the item selected in choice1_item
                    System.out.println();
                    switch(choice2_item)
                    {
                        case 1:
                        case 3:
                        case 7:cost_dessert+=choice2_plates*30;   break;
                        case 2:cost_dessert+=choice2_plates*40;   break;
                        case 4:cost_dessert+=choice2_plates*50;   break;
                        case 5:cost_dessert+=choice2_plates*70;   break;
                        case 6:cost_dessert+=choice2_plates*80;   break;
                        case 8:cost_dessert+=choice2_plates*90;   break;
                        default:System.out.println("Invalid choice");
                    }
                } while(choice2_item!=0);
            break;
            case 3: //cakes
                System.out.println("List of Cakes: ");
                System.out.println("Cake(1 slice)                   Amount(in Rs.)");
                System.out.println("1.Red velvet Cake                 250");
                System.out.println("2.Vanilla Cake                    150");
                System.out.println("3.Chocolate Cake                  200");
                System.out.println("4.Rocky Road Cake                 230");
                System.out.println("5.Rocky Road Chocolate Cake       175");
                System.out.println("6.Rocky Road Vanilla Cake         450");
                System.out.println("7.Rocky Road Butterscotch Cake    250");
                System.out.println("Press the number before the cake to order.....");
                System.out.println("Followed by enter the number of slices for the selected item");
                System.out.println("Press 0 when done with ordering from this section");
                int choice3_item;
                do
                {
                    System.out.println();
                    System.out.print("Item number: ");
                    choice3_item=sc.nextInt();  //taking the input of the dish number
                    if(choice3_item==0)
                        break;
                    System.out.print("Slices: ");
                    int choice3_plates=sc.nextInt();    //taking the input of the number of plate of the item selected in choice1_item
                    System.out.println();
                    switch(choice3_item)
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
                } while(choice3_item!=0);
            break;
            case 4: //mousses
                System.out.println("List of Mousses:");
                System.out.println("Mousse                          Amount(in Rs.)");
                System.out.println("1.Rocky Road Chocolate Mousse      30");
                System.out.println("2.Rocky Road Butterscotch Mousse   30");
                System.out.println("3.Rocky Road Vanilla Mousse        30");
                System.out.println("4.Pistachio Mousse                180");
                System.out.println("5.Raspberry Mousses               150");
                System.out.println("6.Pineapple Mousse                180");
                System.out.println("Press the number before the mousse to order.....");
                System.out.println("Followed by enter the number of plates for the selected item");
                System.out.println("Press 0 when done with ordering from this section");
                int choice4_item;
                do
                {
                    System.out.println();
                    System.out.print("Item number: ");
                    choice4_item=sc.nextInt();  //taking the input of the dish number
                    if(choice4_item==0)
                        break;
                    System.out.print("Plates: ");
                    int choice4_plates=sc.nextInt();    //taking the input of the number of plate of the item selected in choice1_item
                    System.out.println();
                    switch(choice4_item)
                    {
                        case 1:
                        case 2:
                        case 3:cost_bev+=choice4_plates*30;    break;
                        case 4:
                        case 6:cost_bev+=choice4_plates*180;  break;
                        case 5:cost_bev+=choice4_plates*150;  break;
                    }
                } while(choice4_item!=0);
            break;
            default:System.out.println("Invalid choice");
        }
        total_cost+=cost_dessert;   //adding the cost of desserts to the total cost
    }

    public void beverages() //choices regarding the beverages
    {
    	System.out.println("**************Welcome to the Beverages section**************");
        System.out.println("Press 1: Soft Drinks\nPress 2: Juices\nPress 3:Tea & Coffee\nPress 4:Mocktails & Cocktails");
        int choice=sc.nextInt();
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
                System.out.println("Followed by enter the number of glasses for the selected item");
                System.out.println("Press 0 when done with ordering from this section");
                int choice1_item;
                do
                {
                    System.out.println();
                    System.out.print("Item number: ");
                    choice1_item=sc.nextInt();  //taking the input of the dish number
                    if(choice1_item==0)
                        break;
                    System.out.print("Glasses: ");
                    int choice1_plates=sc.nextInt();    //taking the input of the number of plate of the item selected in choice1_item
                    System.out.println();
                    switch(choice1_item)
                    {
                        case 1:
                        case 4:
                        case 5:
                        case 6:cost_bev+=choice1_plates*60;   break;
                        case 2:
                        case 7:cost_bev+=choice1_plates*40;   break;
                        case 3:cost_bev+=choice1_plates*50;    break;
                        default:System.out.println("INvalid choice");
                    }
                } while(choice1_item!=0);
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
                System.out.println("Followed by enter the number of glasses for the selected item");
                System.out.println("Press 0 when done with ordering from this section");
                int choice2_item;
                do
                {
                    System.out.println();
                    System.out.print("Item number: ");
                    choice2_item=sc.nextInt();  //taking the input of the dish number
                    if(choice2_item==0)
                        break;
                    System.out.print("Glasses: ");
                    int choice2_plates=sc.nextInt();    //taking the input of the number of plate of the item selected in choice1_item
                    System.out.println();
                    switch(choice2_item)
                    {
                        case 1:cost_bev+=choice2_plates*80;    break;
                        case 2:cost_bev+=choice2_plates*60;    break;
                        case 3:cost_bev+=choice2_plates*70;    break;
                        case 4:
                        case 7:cost_bev+=choice2_plates*40;    break;
                        case 5:cost_bev+=choice2_plates*90;    break;
                        case 6:cost_bev+=choice2_plates*50;    break;
                        default:System.out.println("Invalid choice");
                    }
                } while(choice2_item!=0);
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
                System.out.println("Followed by enter the number of glasses for the selected item");
                System.out.println("Press 0 when done with ordering from this section");
                int choice3_item;
                do
                {
                    System.out.println();
                    System.out.print("Item number: ");
                    choice3_item=sc.nextInt();  //taking the input of the dish number
                    if(choice3_item==0)
                        break;
                    System.out.print("Glasses: ");
                    int choice3_plates=sc.nextInt();    //taking the input of the number of plate of the item selected in choice1_item
                    System.out.println();
                    switch(choice3_item)
                    {
                        case 1:cost_bev+=80;    break;
                        case 2:cost_bev+=50;    break;
                        case 3:
                        case 5:
                        case 6:cost_bev+=100;    break;
                        case 4:cost_bev+=120;    break;
                        default:System.out.println("Invalid choice");
                    }
                } while(choice3_item!=0);
            break;
            case 4: //mocktails & cocktails
                System.out.println("List of Mocktails And Cocktails:");
                System.out.println("Drink(1 cup)                Amount(in Rs.)");
                System.out.println("1.Mojito                        150");
                System.out.println("2.Margarita                     200");
                System.out.println("3.Virgin Mojito                 180");
                System.out.println("4.Virgin Mary                   170");
                System.out.println("5.Fruit Punch                   180");
                System.out.println("Press the number before the mocktail or cocktail to order.....");
                System.out.println("Followed by enter the number of glasses for the selected item");
                System.out.println("Press 0 when done with ordering from this section");
                int choice4_item;
                do
                {
                    System.out.println();
                    System.out.print("Item number: ");
                    choice4_item=sc.nextInt();  //taking the input of the dish number
                    if(choice4_item==0)
                        break;
                    System.out.print("Glasses: ");
                    int choice4_plates=sc.nextInt();    //taking the input of the number of plate of the item selected in choice1_item
                    System.out.println();
                    switch(choice4_item)
                    {
                        case 1:cost_bev+=choice4_plates*150;    break;
                        case 2:cost_bev+=choice4_plates*200;    break;
                        case 3:
                        case 5:cost_bev+=choice4_plates*180;    break;
                        case 4:cost_bev+=choice4_plates*170;    break;
                        default:System.out.println("Invalid choice");
                    }
                } while(choice4_item!=0);
            break;
            default:System.out.println("Invalid choice");
        }
        total_cost+=cost_bev;   //adding the cost of beverages to the total cost
    }
    
    public void billing()   // to calculate the bill and print the bill 
    {
    	System.out.println("\n\n");
        float gst=(float)0.18*total_cost;
        System.out.println("***********************************************************");
        System.out.println("*              The Grand Central Restaurant               *");
        System.out.println("***********************************************************");
        System.out.println("         Amount for Starters =      Rs."+ cost_starter);
        System.out.println("         Amount for Main Course =   Rs."+cost_main);
        System.out.println("         Amount for Beverages =     Rs." +cost_bev);
        System.out.println("         Amount for Desserts =      Rs."+cost_dessert);
        System.out.println("***********************************************************");
        System.out.println("*        GST =                      Rs."+gst);
        System.out.println("***********************************************************");
        System.out.println("         Amount to be paid =        Rs."+(double)(gst+total_cost));
        System.out.println("***********************************************************");
        System.out.println("*                       Thank You                         *");
        System.out.println("*             We Hope for Your presence Again             *");
        System.out.println("***********************************************************");
    }
    
    public static void main(String[] args)
    {
        resturant obj=new resturant();  //class object
        obj.details();
        obj.main_menu();
        obj.billing(); 
    }
}

/*  solved
 	Need to add the features of choosing multiple items(dishes) and number of plates to be ordered: 
 	  To solve this issue, i may use an arrayList to store the dish number of the meals along with the number of plates of each dish to be ordered 
 	  in two separate ArrayLists taking the input in both of them at once.

        solved using a do-while loop for taking multiple entry and simultaneously calculating the sum of the prices upon multoply the number of plates with the 
        prices.
 */
// validation of the phone number
/* 
 	if any wrong dish number or choice is made then, how to deal with it. How to ask the user to re-enter the choice or other detail again even if the wrong entry
 	is done multiple times.
*/
/* 
    how to go back to the previous choice of the dishes, i.e. how to go back in the menu section.
        TO solve this issue, i may pust a case with a definite number and by that case i may call the main menu function so that i may use it to order a 
        different class of dish.(AS DONE IN THE STARTERS)
*/

