package Project;

public interface Visualizzabile {
	  void abbassaLuminosita();
      void alzaLuminosita();
      int getLuminosita();

  public static String printLum(Immagine img) {
      String strLum = "";
      for (int f = 0; f < img.getLuminosità(); f++) {
          strLum += "*";
      }
      return strLum;
  }
  public static String printLum(Video img) {
      String strLum = "";
      for (int f = 0; f < img.getLuminosità(); f++) {
          strLum += "*";
      }
      return strLum;
  }
}
