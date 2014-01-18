public class string1
{
public static void main(String[] args)
{
  String str;
  
  
  
  str="hello world";          //using varaible WITHOUT INITIALISING ERROR
  System.out.println(str);
  
  String str1="hello",str2="world";
  String temp;
  System.out.println("in order " + str1 + str2);
  temp=str1;
  str1=str2;
  str2=temp;
  System.out.println("in order " + str1 + str2);
  
  
  str1+=str2;         //CONCATENATION AFFECTS THE STRINGS STORED
  System.out.println("concatenation " + str1+ "SECOND "+str2 ); 
  
  
  /**************** to CHECK ASSOCIATIVITY OF PLUS + SIGN IN CONCATENATION AS IT
          IS GOING TO BE FROM LEFT TO RIGHT**************************/
          
  
  int a=5;
  System.out.println(str1+a);    // + associates left to right so string is 
                                // concatenated to give string result
                                
  System.out.println(5+a+str1);  /******** here first 5 adds to integer so 
                                integer addition yeilds int value which when 
                                added to string type then concatenates to give 
                                a string   */
                                
 /******** ANALYSE AS A RULE--- THE ARITHMATIC OPERATIONS CAN BE DONE ONLY ON SAME
           TYPES OF DATA AND THE ASSOCIATIVITY OF + IS L-R ,,,, ALSO THE RESULT
           IS OF THE SAME TYPE AS OPERANDS.... SO INT + INT = INT... N 
           data_type+STRING=STRING   
           
           SO TAKE CARE OF THE ASSOCIATIVITY OF OPERATORS    */
           
           
           
 /******************* STRING METHODS ********  equals()  equalsIgnoreCase() */
 /********SEE RETURN TYPE IS BOOLEAN  *******/
 
 
 str1="hi";    //the string variable points to new string discarding earlier string
 str2="hey";
 temp="HeY"; 
 
 boolean comp=true;
 
 comp=str1.equals(str2);
 if(comp)
 {
      System.out.println("equal strings");
 }
 else 
 {
      System.out.println(" not equal strings");
 }      
  
  
  
 comp=temp.equalsIgnoreCase(str2);
 if(comp)
 {
      System.out.println("equal strings without case check");
 }
 else 
 {
      System.out.println(" not equal strings even after ignoring case check");
 }      
  
 
 
 /************************ starting n ending check */
 /********see RETURN TYPE IS BOOLEAN */
 
  str1="hi everyone in the world";    //the string variable points to new string discarding earlier string
 str2="hey people on earth";
 
 
 if(str1.startsWith("hi eve"))
 System.out.println("yes it starts ");
 else
  System.out.println("no it does not  start ");

 
  if(str2.endsWith("earth"))
 System.out.println("yes it ends ");
 else
  System.out.println("no it does not  end ");

 
 
 /*******************COMPARING STRINGS it does by checking unicode values*/
 /***********RETURN TYPE IS INTEGER    *******/
 
 String str3,str4,str5;
 //String str4;
 //String str5;
 int res;
 str1="yes  ";
 str2="Yes";
 str3="yes man";
 str4="he man";
 str5="123";
 
 res=str1.compareTo(str2);
 System.out.println(res);
 
 res=str2.compareTo(str1);
 System.out.println(res);
 
 res=str1.compareTo(str3);
 System.out.println(res);
 
 res=str3.compareTo(str4);
 System.out.println(res);
 
 res=str4.compareTo(str5);
 System.out.println(res);
 
 
 
 
 
 
 
 
 
 
   


}


}
