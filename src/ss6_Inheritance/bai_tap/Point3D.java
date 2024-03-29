package ss6_Inheritance.bai_tap;

public class Point3D extends Point2D {
    private float z = 0.0f;


    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] res = {getX(), getY(), getZ()};
        return res;
    }

    @Override
    public String toString() {
        return
                "Point3D{" + getX() + "," + getY() + "," + z + "}";
    }
}
