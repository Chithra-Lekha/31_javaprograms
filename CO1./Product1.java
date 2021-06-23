class Product{
int pcode;
String pname;
double price;
}
class Product1 {
public static void main(String args[]) {
Product pro1 = new Product();
Product pro2 = new Product();
Product pro3 = new Product();
pro1.pcode=101;
pro1.pname="Comb";
pro1.price=45;
pro2.pcode=102;
pro2.pname="Jeans";
pro2.price=600;
pro3.pcode=103;
pro3.pname="Shirt";
pro3.price=450;
if(pro1.price<pro2.price)
{
 if(pro1.price<pro3.price)
  {
   System.out.println("The Lowest price is "+pro1.price);
  }
else
  {
   System.out.println("The Lowest price is "+pro3.price);
  }
}
else
{
if(pro2.price<pro3.price)
{
   System.out.println("The Lowest price is "+pro2.price);
}
else
{
System.out.println("The Lowest price is "+pro3.price);
}
}
}
}