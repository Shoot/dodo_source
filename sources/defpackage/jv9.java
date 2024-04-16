package defpackage;
/* compiled from: ScaleXY.java */
/* renamed from: jv9  reason: default package */
/* loaded from: classes.dex */
public class jv9 {
    private float a;
    private float b;

    public jv9(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public boolean a(float f, float f2) {
        if (this.a == f && this.b == f2) {
            return true;
        }
        return false;
    }

    public float b() {
        return this.a;
    }

    public float c() {
        return this.b;
    }

    public void d(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public String toString() {
        return b() + "x" + c();
    }

    public jv9() {
        this(1.0f, 1.0f);
    }
}
