    class A{  
      
    void method()
	{  
    int n=90;//local variable  
System.out.println("the local variable is ="+n);
      }
		public static void mai n(String args[])
		{
		int data=50;//instance variable  
    		 int m=100;//static variable
			System.out.println("the isnstance variable is ="+data);
			System.out.println("the static variable is ="+m);
			A obj=new A();
			obj.method();
				
		}
    }//end of class  