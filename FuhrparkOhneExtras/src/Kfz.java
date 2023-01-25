class Kfz {
 
   String  kennzeichen;
   boolean verfuegbar;

   public  Kfz(String kennz) {
      kennzeichen = kennz;
      verfuegbar = true;
   }

   public void setzeVerfuegbarkeit(boolean status) { 
      verfuegbar = status;
   }
   
   public boolean istVerfuegbar() {
      return verfuegbar;
   }

    public void warten() {
        IO.println("Ich warte jetzt");
    }

    public void printStatus() {
        IO.println("Kfz Kennzeichen "+kennzeichen+" ist"+ ( (verfuegbar) ? " da." : " unterwegs."));
    }
}
