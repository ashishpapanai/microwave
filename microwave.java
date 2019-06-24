import java.io.*;
public class microwave
{ 
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static microwave mc=new microwave();
    public static void main() throws IOException
    {
        try
        { 
            System.out.println("****WELCOME TO MORPHY RICHARDS MICROWAVE OVEN-The world of possibilities****");
            System.out.println("                                               ");
            System.out.println("**Please enter your choice :-**");
            System.out.println("                                               ");
            System.out.println("1. *GRILL*");
            System.out.println("2. *BAKE*");
            System.out.println("3. *ROAST*");
            System.out.println("4. *AUTO COOK MENU*");
            System.out.println("5. *QUICK DEFROST*");
            System.out.println("6. *CHILD LOCK");
            System.out.println("7. *EXIT*");

            int choice=Integer.parseInt(br.readLine());
            switch(choice)
            { case 1:mc.grill();
                break;
                case 2:mc.bake();
                break;
                case 3:mc.roast();
                break;
                case 4:mc.autocook();
                break;
                case 5:mc.qckdefrost();
                break;
                case 6:mc.childlock();
                break;
                case 7:mc.exit();
            }}catch(Exception e)
        {
            System.out.println("****INVALID INPUT PLEASE TRY AGAIN****");
            mc.main();
        }}

    public void grill()throws IOException
    {try
        {
            System.out.println("**You opted to GRILL your food**");
            System.out.println("please enter the TEMPERATURE you want to set");
            int temp=Integer.parseInt(br.readLine());
            System.out.println("press 1 and enter if you want to preheat the oven");
            int ch=Integer.parseInt(br.readLine());
            if (ch==1)
            {
                System.out.println("oven set to preheat for 2 minutes");
                System.out.println("please enter the time to grill the food");
                int time=Integer.parseInt(br.readLine());
                System.out.println("THANK YOU your food will be ready in"+(time+2));
            }
            else
            {
                System.out.println("please enter the time to grill the food");
                System.out.println("please enter the time to grill the food");
                int time=Integer.parseInt(br.readLine());
                System.out.println("THANK YOU your food will be ready in"+time);
            }
            System.out.println("press 1 and enter if you wish to continue");
            System.out.println("press 2 and enter to continue with this menu");
            System.out.println("press 3 to exit");
            int choice =Integer.parseInt(br.readLine());
            switch (choice)
            { case 1:mc.main();
                break;
                case 2: mc.grill();
                break;
                case 3:mc.exit();
            }
        }
        catch (Exception e)
        {
            System.out.println("Invalid input please try again");
        }
    }

    public void roast()throws IOException 
    {try
        {
            System.out.println("You opted to ROAST your food");
            System.out.println("Please enter the temperature you want to set");
            int temp=Integer.parseInt(br.readLine());
            System.out.println("please press 1 if you want to preheat your oven & kindly press any other no.if you dont want to preheat it");
            int ch=Integer.parseInt(br.readLine());
            if (ch==1)
            {
                System.out.println("oven set to preheat for 2 minutes");
                System.out.println("Please enter the time to preheat the oven");
                int time=Integer.parseInt(br.readLine());
                System.out.println("THANK YOU your food will be ready in"+(time+2));
            }
            else 
            {
                System.out.println("please enter the time to roast the food");
                int time=Integer.parseInt(br.readLine());
                System.out.println("press 2 and enter to continue with this menu");
                System.out.println("press 3 to exit");
                int choice =Integer.parseInt(br.readLine());
                switch (choice)
                {case 1:mc.main();
                    break;
                    case 2:mc.roast();
                    break;
                    case 3:mc.exit();
                }
            }  
        }
        catch (Exception e) 
        {
            System.out.println("Invalid input please try again");
        }
    }

    public void bake()throws IOException
    {try
        {
            System.out.println("You opted to BAKE your food");
            System.out.println("Please enter the temperature you want to set");
            int temp=Integer.parseInt(br.readLine());
            System.out.println("please press 1 if you want to preheat your oven & kindly press any other no.if you dont want to preheat it");
            int ch=Integer.parseInt(br.readLine());
            if (ch==1)
            {
                System.out.println("oven set to preheat for 2 minutes");
                System.out.println("Please enter the time to preheat the oven");
                int time=Integer.parseInt(br.readLine());
                System.out.println("THANK YOU your food will be ready in"+(time+2));
            }
            else 
            {
                System.out.println("please enter the time to bake the food");
                int time=Integer.parseInt(br.readLine());
                System.out.println("press 2 and enter to continue with this menu");
                System.out.println("press 3 to exit");
                int choice =Integer.parseInt(br.readLine());
                switch (choice)
                {case 1:mc.main();
                    break;
                    case 2:mc.bake();
                    break;
                    case 3:mc.exit();
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Invalid input please try again");
        }
    }

    public void autocook()throws IOException
    {try
        {
            System.out.println("***WELCOME TO AUTOCOOK MENU***");
            System.out.println("PLEASE SELECT THE DESIRED OPTION : ");
            System.out.println("1. *PIZZA*");
            System.out.println("2. *MEAT*");
            System.out.println("3. *FISH*");
            System.out.println("4. *PASTA*");
            System.out.println("5. *POP CORN*");
            System.out.println("6. *VEGETABLES*");
            int ch=Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1:System.out.println("****You opted to cook a PIZZA****");
                System.out.println("....Oven ready to preheat....");
                System.out.println("............");
                System.out.println("please insert the pizza");
                System.out.println("............");
                System.out.println("Your pizza is ready");
                System.out.println("press 1 and enter if you wish to continue main menu");
                System.out.println("press 2 and enter if you wish to continue auto cook menu");
                System.out.println("press 3 to exit");
                int choice=Integer.parseInt(br.readLine());
                switch(choice)
                {
                    case 1 :mc.main();
                    break;
                    case 2 :mc.autocook();
                    break;
                }
                break;
                case 2:System.out.println("You opted to cook meat");
                System.out.println("....oven ready to preheat....");
                System.out.println("....please insert the meat....");
                System.out.println("food will take 15 minutes to cook");
                System.out.println("please wait");
                System.out.println("meat is ready please take it out");
                System.out.println("Press 1 and enter if you wish to continue");
                System.out.println("Press 2 to exit");
                int ch1=Integer.parseInt(br.readLine());
                switch(ch1)
                {
                    case 1:mc.main();
                    break;
                    case 2:mc.autocook();
                    break;
                    default :System.out.println("Invalid input please try again");
                    mc.autocook();
                }
                break;

                case 3:System.out.println("You opted to cook MEAT");
                System.out.println("....oven ready to preheat....");
                System.out.println("....please insert the fish....");
                System.out.println("food will take 7 minutes to cook");
                System.out.println("please wait");
                System.out.println("Fish is ready please take it out");
                System.out.println("Press 1 and enter if you wish to continue");
                System.out.println("Press 2 to exit");
                int ch2=Integer.parseInt(br.readLine());
                switch(ch2)
                {
                    case 1:mc.main();
                    break;
                    case 2:mc.autocook();
                    break;
                    default :System.out.println("Invalid input please try again");
                    mc.autocook();
                }
                break;
                case 4:System.out.println("You opted to cook PASTA");
                System.out.println("....oven ready to preheat....");
                System.out.println("....please insert the pasta....");
                System.out.println("food will take 12 minutes to cook");
                System.out.println("please wait");
                System.out.println("pasta is ready please take it out");
                System.out.println("Press 1 and enter if you wish to continue");
                System.out.println("Press 2 to exit");
                int ch3=Integer.parseInt(br.readLine());
                switch(ch3) 
                {
                    case 1:mc.main();
                    break;
                    case 2:mc.autocook();
                    break;
                    default :System.out.println("Invalid input please try again");
                    mc.autocook();
                }
                break;
                case 5:System.out.println("You opted to cook POP CORN");
                System.out.println("....oven ready to preheat....");
                System.out.println("....please insert the ingredients....");
                System.out.println("food will take 5 minutes to cook");
                System.out.println("please wait");
                System.out.println("pasta is ready please take it out");
                System.out.println("Press 1 and enter if you wish to continue");
                System.out.println("Press 2 to exit");
                int ch4=Integer.parseInt(br.readLine());
                switch(ch4)
                {
                    case 1:mc.main();
                    break;
                    case 2:mc.autocook();
                    break;
                    default :System.out.println("Invalid input please try again");
                    mc.autocook();
                }
                break;
                case 6:System.out.println("You opted to heat vegetables");
                System.out.println("....oven ready to preheat....");
                System.out.println("....please insert the vegetables....");
                System.out.println("enter the time to heat the vegetables");
                int time =Integer.parseInt(br.readLine());
                System.out.println("please wait");
                System.out.println("vegetable is heated please take it out");
                System.out.println("Press 1 and enter if you wish to continue");
                System.out.println("Press 2 to exit");
                int ch5=Integer.parseInt(br.readLine());
                switch(ch5)
                {
                    case 1:mc.main();
                    break;
                    case 2:mc.autocook();
                    break;
                    default :System.out.println("Invalid input please try again");
                    mc.autocook();
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Invalid input please try again");
        }
    }

    public void childlock()throws IOException
    {try
        {
            System.out.println("you opted to lock the microwave");
            System.out.println("press 1 and enter if you want to set the password");
            System.out.println("press 2 and enter if you want to change the password");
            int ch=Integer.parseInt(br.readLine());
            if(ch==1)
            {
                System.out.println("please enter the password [ONLY NUMBERS ACCEPTED]");
                int password=Integer.parseInt(br.readLine());
                System.out.println("password is set successfully");
            }
            else if(ch==2)
            {
                System.out.println("please enter the new password");
                int pass2=Integer.parseInt(br.readLine());
                System.out.println("password is successfully changed");
                System.out.println("Press 1 and enter if you wish to continue");
                System.out.println("Press 2 to continue with this menu");
                System.out.println("Press 3 to exit");
                int choice=Integer.parseInt(br.readLine());
                switch(choice)
                {
                    case 1:mc.main();
                    break;
                    case 2:mc.childlock();
                    break;
                    case 3:mc.exit();
                    default :System.out.println("Invalid input please try again");
                    mc.childlock();
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Invalid input please try again");
        }
    }

    public void qckdefrost()throws IOException
    {try
        {
            System.out.println("You opted to defrost the microwave");
            System.out.println("Press 1 and enter to confirm");
            System.out.println("Press 2 and enter if you want to go back to the main menu");
            int ch=Integer.parseInt(br.readLine());
            if (ch==1)
            {
                System.out.println(".....Please wait.....");
                System.out .println("Successfully defrosted");
                System.out .println("Press 1 and enter if you wish to continue");
                System.out .println("Press 2 and enter if you wish to continue with this menu");
                System.out .println("Press 3 to exit");
                int choice=Integer.parseInt(br.readLine());
                switch(choice)
                {
                    case 1:mc.main();
                    break;
                    case 2:mc.qckdefrost();
                    break;
                    case 3:mc.exit();
                    default :System.out.println("Invalid input please try again");
                    mc.qckdefrost();
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Invalid input please try again");
        }
    }

    public void exit()throws IOException
    {try
        {
            System.out.println("*********************");
            System.out.println("Thank You for using MORPHY RICHARDS MICROWAVE OVEN");
            System.out.println("*********************");
        }

        catch (Exception e)
        {
            System.out.println("Invalid input please try again");
        }
    }
}
 