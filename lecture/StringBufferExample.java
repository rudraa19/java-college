public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        // sb.append("java");                           // output: Hello java
        // sb.insert(1, "java");                        // output: Hjavaello 
        // sb.replace(1, 3, "java");                    // output: Hjavalo
        // sb.delete(1, 3);                             // output: Hlo
        // sb.reverse();                                // output:  olleH
        System.out.println(sb);
    }
}