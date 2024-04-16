package defpackage;
/* compiled from: MeanCalculator.java */
/* renamed from: lb6  reason: default package */
/* loaded from: classes.dex */
public class lb6 {
    private float a;
    private int b;

    public void a(float f) {
        float f2 = this.a + f;
        this.a = f2;
        int i = this.b + 1;
        this.b = i;
        if (i == Integer.MAX_VALUE) {
            this.a = f2 / 2.0f;
            this.b = i / 2;
        }
    }
}
