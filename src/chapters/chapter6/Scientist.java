package chapters.chapter6;

public class Scientist {


    public String experiment(int numAtoms, int years) {
        Atom[] atoms = atomList(numAtoms);
        int alive = 0;
        int decayed;
        String year = years == 1? "year" : "years";
        for(int i = 1; i <= years; i++){
                alive = 0;
                decayed = 0;
            for(Atom atom: atoms){
                if(atom.getCondition() == "Alive"){
                    alive++;
                } else{
                    decayed++;
                }
            }
            System.out.println("Live atoms: " + alive + ", Decayed atoms: " + decayed + " Year " + i);
        }
        return "After " + years + " " + year + " there are " + alive + " live atoms out of " + numAtoms;
}

    private Atom[] atomList(int numAtoms) {
        Atom[] atom = new Atom[numAtoms];
        for(int i = 0; i < numAtoms; i++){
            atom[i] = new Atom();
        }
        return atom;
    }
    }
