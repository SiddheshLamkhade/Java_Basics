class Student
         {
            private String password;
            
            //getters and setters
            public void setPassword(String pass)
            {
                this.password=pass;
            }
            public String getPassword()
            {
                System.out.println("Password is private entity but using getter we have printed password outside the class.");
                return password;
            }
        }
            

            public class SetterGetter
            {
                public static void main (String args[])
                {
                    Student obj=new Student();
                    obj.setPassword("$idL@mkh@de.2406");
                    System.out.println(obj.getPassword());
                }
            }
            