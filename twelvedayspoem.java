import java.util.Scanner;

public class twelvedayspoem {

static boolean b =false;

private static String firstLine(int day)
{
return "On the " + DAYS.getName(day) +
" day of Christmas my true love sent to me:\n";
}

private static String firstLineDig(int day)
{
return "On the " + DAYS.getVal(day) +
" day of Christmas my true love sent to me:\n"; 
}

private static String IterallGifts(int day) {
StringBuilder sb = new StringBuilder();

for (int i = day; i>0; i--) {
sb.append("\n"+ GIFTS.getGift(i));
}
sb.append("\n" +"and "+ GIFTS.getGift(0));

return sb.toString();
}


private static String allGifts(int day)
{
if( day == 0 ) 
{ 
return "and " + GIFTS.getGift(0); 
}
else 
{ 
return GIFTS.getGift(day) + "\n" + allGifts(day-1);	
}
}

private static String fun(boolean b, int i) {
	if(b == false) {return firstLine(i);}
	else {return firstLineDig(i);}
}

private static String poem() {
Scanner userinp = new Scanner(System.in);
	System.out.println("Digits or words?");
	String inp = userinp.nextLine();
	
	if (inp.equals("digit") || inp.equals("DIGIT") || inp.equals("Digit")) {
		
		b =true;
		
	}
	else {b =false;}
String poem = fun(b, 0) + GIFTS.getGift(0) + "\n\n";
for( int day = 1; day < 12; day++ )
{ 
poem += fun(b, day) + allGifts(day) + "\n\n"; 
//poem += fun(b, day) + IterallGifts(day) + "\n\n"; 

}

System.out.print(poem);

return poem;
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		poem();
		
	}

}
