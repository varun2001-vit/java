package exception;

import java.util.Scanner;

public class userexception3 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String user,pass,conf;
        System.out.println("****20BDS0150*****");
        System.out.println("enter the user and pass");
        try{
        user = sc.nextLine();
        pass= sc.nextLine();
        if(user.length()<8 || pass.length()<8)
        {
             throw new lenghtexception("invalid lenght");
        }
        if(user.contains(" ") || pass.contains(" "))
        {
            throw new spacesException("cannot have space");
        }
        System.out.println("enter the confirm password");
        conf= sc.nextLine();
        if(pass.equals(conf)==false)
        {
            throw new equalsException("password and confirm password not match");
        }
        // if(pass.contains(user))
        // {
        //     throw new userpass("username can't be in password");

        // }
        for(int i=0; i<user.length()-2; i++)
        {
            if(pass.contains(user.substring(i,i+3)))
            {
                throw new userpass("username can't be in password");
            }
        }
        }
        catch(userpass e)
        {
            System.out.println(e.getMessage());
        }
        catch (lenghtexception e)
        {
            System.out.println(e.getMessage());
        }
        catch(spacesException e)
        {
            System.out.println(e.getMessage());
        }
        catch(equalsException e)
        {
            System.out.println(e.getMessage());
        }
        
    }
    
}
class lenghtexception extends Exception {
    lenghtexception(String S)
    {
        super(S);
    }
}
class spacesException extends Exception {
    spacesException(String S)
    {
        super(S);
    }
}
class equalsException extends Exception {
    equalsException(String S)
    {
        super(S);
    }
}
class userpass extends Exception {
    userpass(String S)
    {
        super(S);
    }
}

