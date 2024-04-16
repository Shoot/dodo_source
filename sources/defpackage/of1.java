package defpackage;
/* compiled from: ColorUtils.java */
/* renamed from: of1  reason: default package */
/* loaded from: classes.dex */
public class of1 {
    public static boolean a(int i) {
        float[] fArr = new float[3];
        qf1.h(i, fArr);
        return b(fArr);
    }

    public static boolean b(float[] fArr) {
        if (fArr[2] < 0.5f) {
            return true;
        }
        return false;
    }
}
