interface CanClimb { int maxHeight();}
interface HasClaws { boolean isSharp();}

class Koala implements CanClimb, HasClaws {
    public boolean isSharp() { return true;}
    public int maxHeight() { return 15;}

    public static void main(String [] args) {
        Object koala = new Koala();
        CanClimb canClimb = (CanClimb) koala;
        HasClaws hasClaws = (HasClaws) canClimb;
        Runnable c = (Runnable) canClimb; //WTF Why does this compile?!
        System.out.println(canClimb.maxHeight());
        System.out.println(hasClaws.isSharp());
    }
}
