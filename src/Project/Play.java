package Project;

public interface Play {
    void abbassaVolume();
    void alzaVolume();
    int getDuration();
    int getVolume();

    public static void play(Audio aud) {
        for (int i = 0; i < aud.getDurata(); i++) {
            String toPrint = aud.getType() + ": " + aud.getTitolo() + " | D: " + aud.getDurata() + " | V: ";
            for(int f = 0; f < aud.getVolume(); f++) {
                toPrint += "!";
            }
            System.out.println(toPrint);
        }
    }

    public static void play(Video vid) {
        for (int i = 0; i < vid.getDurata(); i++) {
            String toPrint = vid.getType() + ": " + vid.getTitolo() + " | D: " + vid.getDurata() + " | V: ";
            for(int f = 0; f < vid.getVolume(); f++) {
                toPrint += "!";
            }
            toPrint += " | L: " + Visualizzabile.printLum(vid);;
            System.out.println(toPrint);
        }
    }
}
