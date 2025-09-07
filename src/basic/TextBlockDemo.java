package basic;

public class TextBlockDemo {
        public static void main(String[] args){

            String greeting = """
                    Hello\s
                    World\s
                    """;
            System.out.println("Text block");
            System.out.println(greeting);

            String normal = "Hello\nWorld\n";
            System.out.println("Equivalent normal string:");
            System.out.println(normal);

            String query = """
                SELECT id, name, email
                FROM users
                WHERE active = 1
                ORDER BY name;
                """;
            System.out.println("SQL query:" + query);

            //without text blocks query would be
            String query1 = "SELECT id, name, email\n" +
                    "FROM users\n" +
                    "WHERE active = 1\n" +
                    "ORDER BY name;\n";

            String json = """
                    {
                        "name": "Vaibhav",
                        "role": "Engineer",
                    }
                    """;
            System.out.println(json);


        }

}
