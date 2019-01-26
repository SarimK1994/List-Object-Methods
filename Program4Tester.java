/**************************************************************************
*                                                                         *
*     Program Filename:  Program4Tester.java                              *
*     Author          :  John B. Student                                  *
*     Date Written    :  April 10, 2017                                   *
*     Purpose         :  To test our 2 new public List methods            *
*     Input from      :  none                                             *
*     Output to       :  none                                             *
*                                                                         *
**************************************************************************/
import java.util.Scanner;
import java.io.*;

public class Program4Tester
{

public static void main(String[] args)
{
   List<String> L1 = new List<String>();
   List<String> L2 = new List<String>();
   String S;
   int i, Length1, Length2;

   L1.InsertList("Louie");
   L1.InsertList("David");
   L1.InsertList("Homer");
   L1.InsertList("Kirby");
   L1.InsertList("Cooper");
   L1.InsertList("Evonne");
   L1.InsertList("Richard");
   L1.InsertList("Adam");                 

   L2.InsertList("Katie");
   L2.InsertList("Cooper");
   L2.InsertList("Susie");
   L2.InsertList("Claire");
   L2.InsertList("Evonne");
   L2.InsertList("Andrew");
   L2.InsertList("Kirby");

   Length1 = L1.LengthOfList();
   for (i = 1; i <= Length1; i++)
   {
      S = L1.ExtractFromList(i);
      System.out.println(S);
   }
   // end for

   System.out.println();

   Length2 = L2.LengthOfList();
   for (i = 1; i <= Length2; i++)
   {
      S = L2.ExtractFromList(i);
      System.out.println(S);
   }
   // end for

   L1.MergeLists(L2);
   System.out.println();

   Length1 = L1.LengthOfList();
   for (i = 1; i <= Length1; i++)
   {
      S = L1.ExtractFromList(i);
      System.out.println(S);
   }
   // end for

   System.out.println();

   Length2 = L2.LengthOfList();
   for (i = 1; i <= Length2; i++)
   {
      S = L2.ExtractFromList(i);
      System.out.println(S);
   }
   // end for
}
// end function main

}
// end class Program4Tester
