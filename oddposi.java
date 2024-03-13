public class Main
{
    public static void main(String[] args)
  {
        String text = "type here to search";
        boolean oddPosition = true;
        for (int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);
            if (ch != ' ') 
            {
                if (oddPosition) 
                {
                    System.out.print(ch + " ");
                }
                oddPosition = !oddPosition;
            }
        }
    }
}
