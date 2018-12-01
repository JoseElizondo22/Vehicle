        //  filename Main.java
        class Grandparent   {
            public void printMe()   {
                System.out.println("Grandparent");
            }
        }

        class Parent extends Grandparent    {
            public void printMe(){
                super.printMe();
                System.out.println("Parent");
            }
        }

        class Child extends Parent  {
            public void printMe(){
                super.printMe();
                System.out.println("Child");
            }
        }

        class Main  {
            public static void main(String[]args)   {
                Child c = new Child();
                c.printMe();
            }
        }