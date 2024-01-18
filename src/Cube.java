public class Cube {

    //side represents the length of a side of the cube
    private int side;

    public Cube() {

        side = 1;

    }

    public Cube(int side) {

        if (side < 1) {

            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");

        }

        this.side = side;

    }


    public int getSide() {

        return side;

    }

    public void setSide(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }

        side = n;

    }


    public int getSurfaceArea() {

        int surfaceArea = side*side*6;

        return surfaceArea;

    }


    public int getVolume() {

        int volume = side*side*side;

        return volume;
    }

    public String toString() {

        return "Cube" + "{" + "side=" + side + "}";

    }


}
