package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // write your code below

        // AND (&)
        if (a & b) {
            System.out.println("a & b is TRUE");
        } else {
            System.out.println("a & b is FALSE");
        }

        // Short-circuit AND (&&)
        if (a && b) {
            System.out.println("a && b is TRUE");
        } else {
            System.out.println("a && b is FALSE");
        }


        // Short-circuit OR (||)
        if (a || b) {
            System.out.println("a || b is TRUE");
        } else {
            System.out.println("a || b is FALSE");
        }

        // XOR (^)
        if (a ^ b) {
            System.out.println("a ^ b is TRUE");
        } else {
            System.out.println("a ^ b is FALSE");
        }

        // NOT (!)
        if (!a) {
            System.out.println("!a is TRUE");
        } else {
            System.out.println("!a is FALSE");
        }

        if (!b) {
            System.out.println("!b is TRUE");
        } else {
            System.out.println("!b is FALSE");
        }




    }

}

