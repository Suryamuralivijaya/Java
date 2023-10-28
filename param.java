//Parameterized Constructor
class param 
{
  String languages;
  param(String lang)
  {
    languages = lang;
    System.out.println(languages + " Programming Language");
  }
  public static void main(String[] args) {

    // call constructor by passing a single value
    param obj1 = new param("Java");
    param obj2 = new param("Python");
    param obj3 = new param("C");
  }
}

