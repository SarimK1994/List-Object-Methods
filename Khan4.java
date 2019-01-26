public class List<ListItem> 
{
   private class ListNode
   {
      Comparable  Content;
      ListNode    Link;
   }
   // end class ListNode

   private ListNode Head, Cursor, SearchPtr;

   public List()
   {
      Head      = new ListNode();
      Head.Link = Head;
      Cursor    = Head;
   }
   // end constructor

   public void ClearList()
   {
      Head.Link = Head;
      Cursor    = Head;
   }
   // end public method ClearList

   public boolean EmptyList()
   {
      if (Head == Head.Link)
         return true;
      else
         return false;
      // end if
   }
   // end public method EmptyList

   public void ResetList()
   {
      if (Head == Head.Link)
      {
         System.out.println("Reset Error: List is empty!");
         System.exit(0);
      }
      else
         Cursor = Head.Link;
      // end if
   }
   // end public method ResetList

   public ListItem GetList()
   {
      ListItem LI;
      LI = (ListItem) Cursor.Content;
      Cursor = Cursor.Link;
      return LI;
   }
   // end public method GetList

   public boolean EndOfList()
   {
      if (Cursor == Head)
         return true;
      else
         return false;
      // end if
   }
   // end public method EndOfList

   public void InsertList(ListItem LI)
   {
      ListNode P;

      if (FindList(LI))
      {
         System.out.println("Insert Error!");
         System.exit(0);
      }
      else
      {
         P = new ListNode();
         P.Content = (Comparable) LI;
         P.Link = SearchPtr.Link;
         SearchPtr.Link = P;
      }
      // end if
   }
   // end public method InsertList

   public void DeleteList(ListItem LI)
   {
      ListNode P;

      if (!FindList(LI))
      {
         System.out.println("Delete Error!");
         System.exit(0);
      }
      else
      {
         P = SearchPtr.Link;
         SearchPtr.Link = P.Link;
      }
      // end if
   }
   // end public method DeleteList

   public void UpdateList(ListItem LI)
   {
      if (!FindList(LI))
      {
         System.out.println("Update Error!");
         System.exit(0);
      }
      else
      {
         SearchPtr = SearchPtr.Link;
         SearchPtr.Content = (Comparable) LI;
      }
      // end if
   }
   // end public method UpdateList

   public ListItem SearchList(ListItem LI)
   {
      if (FindList(LI))
         return (ListItem) SearchPtr.Link.Content;
      else
         return null;
      // end if
   }
   // end public method SearchList

   public int LengthOfList()
   {
      ListNode P;
      int Counter=0;

      P = Head;
      while (P.Link != Head)
      {
         Counter++;
         P = P.Link;
      }
      // end while
      return Counter;
   }
   // end public method LengthOfList

   private boolean FindList(ListItem LI)
   {
      ListNode LookAheadPtr;
      Comparable X = (Comparable) LI;

      SearchPtr = Head;
      LookAheadPtr = SearchPtr.Link;

      while (LookAheadPtr != Head && X.compareTo(LookAheadPtr.Content) > 0)
      {
         SearchPtr = SearchPtr.Link;
         LookAheadPtr = LookAheadPtr.Link;
      }
      // end while

      if (LookAheadPtr != Head && X.compareTo(LookAheadPtr.Content) == 0)
         return true;
      else
         return false;
      // end if
   }
   // end private method FindList
   
   public ListItem ExtractFromList(int i)
   {
      ListItem LI; 
      ListNode Temp = Head.Link; 
      if (i<1 || i > LengthOfList())
      {
      System.out.println("List is too large or too small");  
      System.exit(0);  
      }
      
      ResetList(); 
      
      for (int j = 1; j <= i-1; j++)
      {
       Temp = Temp.Link; 
      }
      
      LI = (ListItem) Temp.Content; 
      return LI; 
   }
   
   public void MergeLists(List L2) 
   {

   ListItem LI, CheckList; 
   
   int Size = L2.LengthOfList(); 
   
      for (int i = 1; i<= (Size); i++)
      {
         LI = (ListItem) L2.ExtractFromList(i); 
         CheckList = SearchList(LI); 
         
         if(CheckList == null)
         {
            InsertList(LI);
         }
         
      }
      
      L2.ClearList(); 
   }         
   
}
// end class List
