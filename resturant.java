import java.util.Scanner;
public class resturant
{
	Scanner sc=new Scanner(System.in);
    int total_cost=0;
    int cost_starter=0; int cost_main=0;
    int cost_bev=0; int cost_dessert=0;
    String name,phone;

    public String details() //input of the details of the customer
    {
    	System.out.println("***********************************************************");
        System.out.println("*              The Grand Central Restaurant               *");
        System.out.println("***********************************************************");
        System.out.println("Enter your name: ");
        name=sc.nextLine();
        System.out.println("Enter your phone number(Indian only): ");
        phone=sc.next();
        return phone;
    }
    
    boolean check_phono(String phono)	//to check for the validity of the phone numbers 
    {
    	if(phono.length()!=10)	//must have 10 digits
    		return false;
    	for(int i=0;i<phono.length();i++)	//all the characters must be numerals
    	{
    		char digit=phono.charAt(i);
    		if(!Character.isDigit(digit))
    			return false;
    	}
    	return true;
    }
    
    public void main_menu() //choices regarding the type of food to be ordered
    {
    	for(int i=1;;i++) 
    	{
    		System.out.println();
    		System.out.println("Press 1:Starters\nPress 2:Main Course\nPress 3:Desserts\nPress 4:Bevrages");
    		System.out.println("Press 0 to get the bill");
    		int choice=sc.nextInt();
    		switch(choice)
    		{
            	case 1:starters();		break;
            	case 2:mainCourse();	break;
            	case 3:dessert();		break;
            	case 4:beverages();		break;
            	case 0:billing();		break;
            	default: System.out.println("Invalid choice");
    		}
    		break;
    	}
    }

    public void starters() //choices regarding starters 
    {
    	System.out.println();
        System.out.println("*************Welcome to the Starter section****************");
        System.out.println("Press 1: Vegetarian Starter\nPress 2: Non-veg Starter");
        System.out.println("Press 0: Main Menu");
        int choice=sc.nextInt();
        System.out.println();
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
                int choice1_item; // kept here so that it can be used in do while
                do
                {
                    System.out.println();
                    System.out.print("Item number: ");
                    choice1_item=sc.nextInt();  //taking the input of the dish number
                    if(choice1_item<0 || choice1_item>10)
                    {
                	    System.out.println("Invalid input");
                	    continue;
                    }
                    int choice1_plates=0;
                    if(choice1_item!=0)
                    {
                    	System.out.print("Plates: ");
                    	choice1_plates=sc.nextInt();    //taking the input of the number of plate of the item selected in choice1_item
                    }
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
                        case 0:starters();	break;
                    }
                    total_cost+=cost_starter;
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
                    if(choice2_item<0 || choice2_item>10)
                    {
                    	System.out.println("Invalid input");
                    	continue;
                    }
                    int choice2_plates=0;
                    if(choice2_item!=0)
                    {
                    	System.out.print("Plates: ");
                    	choice2_plates=sc.nextInt();    //taking the input of the number of plate of the item selected in choice2_item
                    }
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
                        case 0:starters();	break;
                    }
                    total_cost+=cost_starter;
                } while(choice2_item!=0);
            break;
            case 0:main_menu();
            break;
            default:System.out.println("Invalid choice"); 
            }
        total_cost+=cost_starter; //adding the cost of starters to the total cost
        return;
    }

    public void mainCourse()	//choices regarding main course dishes 
    {
    	System.out.println("***********Welcome to the Main Course section**************");
        System.out.println("Press 1: Vegetarian Main Course\nPress 2: Non-veg Main Course\nPress 3:For Breads");
        System.out.println("Press 0: Main Menu");
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
                    if(choice1_item<0 || choice1_item>10)
                    {
                    	System.out.println("Invalid input");
                    	continue;
                    }
                    int choice1_plates=0;
                    if(choice1_item!=0)
                    {
                    	System.out.print("Plates: ");
                    	choice1_plates=sc.nextInt();    //taking the input of the number of plate of the item selected in choice1_item
                    }
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
                        case 0:mainCourse();	break;
                    }
                    total_cost+=cost_main;
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
                    if(choice2_item<0 || choice2_item>10)
                    {
                    	System.out.println("Invalid input");
                    	continue;
                    }
                    int choice2_plates=0;
                    if(choice2_item!=0)
                    {
                    	System.out.print("Plates: ");
                    	choice2_plates=sc.nextInt();    //taking the input of the number of plate of the item selected in choice2_item
                    }
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
                        case 0:mainCourse();	break;
                    }
                    total_cost+=cost_main;
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
                    if(choice3_item<0 || choice3_item>10)
                    {
                    	System.out.println("Invalid input");
                    	continue;
                    }
                    int choice3_plates=0;
                    if(choice3_item!=0)
                    {
                    	System.out.print("Pieces: ");
                    	choice3_plates=sc.nextInt();    //taking the input of the number of plate of the item selected in choice3_item
                    }
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
                        case 0:mainCourse();	break;
                    }
                    total_cost+=cost_main;
                } while(choice3_item!=0);
            break;
            case 0:main_menu();	
            break;
            default:System.out.println("Invalid choice");
        }
        total_cost+=cost_main; //adding the cost of main course to the total cost
  
        return;
    }
    
    public void dessert() //choices regarding the dessert 
    {
    	System.out.println("**************Welcome to the Desserts section**************");
        System.out.println("Press 1: Ice Creams\nPress 2: Soft Desserts\nPress 3: Cakes\nPress 4: Mousses");
        System.out.println("Press 0: Main Menu");
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
                    if(choice1_item<0 || choice1_item>10)
                    {
                    	System.out.println("Invalid input");
                    	continue;
                    }
                    int choice1_plates=0;
                    if(choice1_item!=0)
                    {
                    	System.out.print("Plates: ");
                    	choice1_plates=sc.nextInt();    //taking the input of the number of plate of the item selected in choice1_item
                    }
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
                        case 0:dessert();	break;
                    }
                    total_cost+=cost_dessert;
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
                    if(choice2_item<0 || choice2_item>10)
                    {
                    	System.out.println("Invalid input");
                    	continue;
                    }
                    int choice2_plates=0;
                    if(choice2_item!=0)
                    {
                    	System.out.print("Plates: ");
                    	choice2_plates=sc.nextInt();    //taking the input of the number of plate of the item selected in choice2_item
                    }
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
                        case 0:dessert();	break;
                    }
                    total_cost+=cost_dessert;
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
                    if(choice3_item<0 || choice3_item>10)
                    {
                    	System.out.println("Invalid input");
                    	continue;
                    }
                    int choice3_plates=0;
                    if(choice3_item!=0)
                    {
                    	System.out.print("Slices: ");
                    	choice3_plates=sc.nextInt();    //taking the input of the number of plate of the item selected in choice3_item
                    }
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
                        case 0:dessert();	break;
                    }
                    total_cost+=cost_dessert;
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
                    if(choice4_item<0 || choice4_item>10)
                    {
                    	System.out.println("Invalid input");
                    	continue;
                    }
                    int choice4_plates=0;
                    if(choice4_item!=0)
                    {
                    	System.out.print("Plates: ");
                    	choice4_plates=sc.nextInt();    //taking the input of the number of plate of the item selected in choice4_item
                    }
                    System.out.println();
                    switch(choice4_item)
                    {
                        case 1:
                        case 2:
                        case 3:cost_bev+=choice4_plates*30;    break;
                        case 4:
                        case 6:cost_bev+=choice4_plates*180;  break;
                        case 5:cost_bev+=choice4_plates*150;  break;
                        case 0:dessert();	break;
                    }
                    total_cost+=cost_dessert;
                } while(choice4_item!=0);
            break;
            case 0:main_menu();	
            break;
            default:System.out.println("Invalid choice");
        }
        total_cost+=cost_dessert;   //adding the cost of desserts to the total cost
        
        return;
    }

    public void beverages() //choices regarding the beverages 
    {
    	System.out.println();
    	System.out.println("**************Welcome to the Beverages section**************");
        System.out.println("Press 1: Soft Drinks\nPress 2: Juices\nPress 3:Tea & Coffee\nPress 4:Mocktails & Cocktails");
        System.out.println("Press 0: Main Menu");
        int choice=sc.nextInt();
        System.out.println();
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
                    if(choice1_item<0 || choice1_item>10)
                    {
                    	System.out.println("Invalid input");
                    	continue;
                    }
                    int choice1_plates=0;
                    if(choice1_item!=0)
                    {
                    	System.out.print("Glasses: ");
                    	choice1_plates=sc.nextInt();    //taking the input of the number of plate of the item selected in choice1_item
                    }
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
                        case 0:beverages();	break;
                    }
                    total_cost+=cost_bev;
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
                    if(choice2_item<0 || choice2_item>10)
                    {
                    	System.out.println("Invalid input");
                    	continue;
                    }
                    int choice2_plates=0;
                    if(choice2_item!=0)
                    {
                    	System.out.print("Glasses: ");
                    	choice2_plates=sc.nextInt();    //taking the input of the number of plate of the item selected in choice2_item
                    }
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
                        case 0:beverages();	break;
                    }
                    total_cost+=cost_bev;
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
                    if(choice3_item<0 || choice3_item>10)
                    {
                    	System.out.println("Invalid input");
                    	continue;
                    }
                    int choice3_plates=0;
                    if(choice3_item!=0)
                    {
                    	System.out.print("Glasses: ");
                    	choice3_plates=sc.nextInt();    //taking the input of the number of plate of the item selected in choice3_item
                    }
                    System.out.println();
                    switch(choice3_item)
                    {
                        case 1:cost_bev+=80;    break;
                        case 2:cost_bev+=50;    break;
                        case 3:
                        case 5:
                        case 6:cost_bev+=100;    break;
                        case 4:cost_bev+=120;    break;
                        case 0:beverages();		break;
                    }
                    total_cost+=cost_bev;
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
                    if(choice4_item<0 || choice4_item>10)
                    {
                    	System.out.println("Invalid input");
                    	continue;
                    }
                    int choice4_plates=0;
                    if(choice4_item!=0)
                    {
                    	System.out.print("Glasses: ");
                    	choice4_plates=sc.nextInt();    //taking the input of the number of plate of the item selected in choice4_item
                    }
                    System.out.println();
                    switch(choice4_item)
                    {
                        case 1:cost_bev+=choice4_plates*150;    break;
                        case 2:cost_bev+=choice4_plates*200;    break;
                        case 3:
                        case 5:cost_bev+=choice4_plates*180;    break;
                        case 4:cost_bev+=choice4_plates*170;    break;
                        case 0:beverages();	break;
                    }
                    total_cost+=cost_bev;
                } while(choice4_item!=0);
            break;
            case 0:main_menu();	break;
            default:System.out.println("Invalid choice");
        }
        total_cost+=cost_bev;   //adding the cost of beverages to the total cost
        
        return;
    }
    
    public void billing()   // to calculate the bill and print the bill 
    {
    	System.out.println("\n\n");
        float gst=(float)0.18*total_cost;
        System.out.println("***********************************************************");
        System.out.println("*              The Grand Central Restaurant               *");
        System.out.println("***********************************************************");
        System.out.println("         Name of the customer:      "+name);
        System.out.println("         Phone Number:              +91 "+phone);
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
        
        return;
    }
    
    public static void main(String[] args) 
    {
    	System.out.println();
    	Scanner sc=new Scanner(System.in);
        resturant obj=new resturant();  //class object
        String phono=obj.details();	//gets the phone number
        if(obj.check_phono(phono))
        	obj.main_menu();	//runs only when the phone number is valid
        else
        {
        	String str[]=new String[1];
        	System.out.println();
        	System.out.println("Invalid Phone number entered !!! ");
        	System.out.println("Press 0 to re-entr the details or any other number to end ordering");
        	int in=sc.nextInt();
        	if(in==0)
        		main(str);
        }
    }
}

// ----------------------------------------------------     THE END     ------------------------------------------