import java.lang.reflect.*;

public class EverythingIsTrue {
   static void setFinalStatic(Field field, Object newValue) throws Exception {
      field.setAccessible(true);

      Field modifiersField = Field.class.getDeclaredField("modifiers");
      modifiersField.setAccessible(true);
      modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

      field.set(null, newValue);
   }
   public static void main(String args[]) throws Exception {      
      setFinalStatic(Boolean.class.getField("FALSE"), true);

      System.out.format("Everything is %s\n", false);
      System.out.println(false);
      System.out.println(Boolean.class.getField("FALSE"));
      System.out.println(true);
      System.out.println(false);
   }
}