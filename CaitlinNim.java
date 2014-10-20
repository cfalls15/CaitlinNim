
public class CaitlinNim
{
  public int play(int pieces) 
  {
     if (pieces == 3)
     {
      return 2;
     }
     
    if (pieces == 4)
    {
      return 1;
    }
    
    if (pieces % 3 == 0) //if the number of available pieces is divisible by 3
      {
      return 2; //the computer takes 2 pieces        
      }
    
    if (pieces % 3 == 2) //if the remainder when pieces is divided by 3 is 2,
      {
      return 1;   //the computer takes 1 piece      
      }
    
    else return 1;
  }
}


