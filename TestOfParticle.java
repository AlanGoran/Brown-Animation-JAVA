class TestOfParticle {

    public static void main (String[] x) {

        // Partikel skapas i pos (50,50) och
        // får sedan göra 10 slumpflyttningar.

        System.out.println("Skapa partikel i pos (50, 50), flytta 10 gånger");
        Particle pia = new Particle (50.0, 50.0);
        for (int i=0; i<10; i++) {
            System.out.println
                ("x= " + pia.x + "   y= " + pia.y);
            pia.randomMove();
        }

        // Partikel skapas i slumpmässig 
        // position och får sedan göra en 
        // slumpflyttning

        System.out.println
            ("\n\nSkapa partikel i slumpposition, flytta 10 gånger");
        Particle per = new Particle();
        for (int i=0; i<10; i++) {
            System.out.println
                ("x= " + per.x + "   y= " + per.y);
            per.randomMove();
        }
    }
}