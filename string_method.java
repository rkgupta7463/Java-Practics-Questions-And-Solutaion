import java.lang.String;
public class string_method {
    public static void main(String[] args) {
        String name ="Rishu kumar";
        String st = "Rihsu           kumar   .";
        String st1=st.trim();
        System.out.println("String methonds in Java");
        System.out.println("Lower case : "+name.toLowerCase());
        System.out.println("Upper case : "+name.toUpperCase());
        System.out.println("Length of name : "+name.length());
        System.out.println("Comparision : "+name.compareTo("Gupta"));
        System.out.println("Concatenation : "+name.concat(" Gupta"));
        System.out.println("Replace : "+name.replace("kumar", "Gupta"));
        System.out.println("Trim method : "+st1);
        System.out.println("Equal method : "+st1.equals(name));
        System.out.println("Equal method : "+st1.equals(name));
        System.out.println("StartsWith method : "+name.startsWith("kumar"));
        System.out.println("EndsWith method : "+name.endsWith("kumar"));
        System.out.println("SubString method : "+name.substring(0, 5));
    }
}


// write a progarm for two string and apply equal's method of string class 