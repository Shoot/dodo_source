package defpackage;
/* compiled from: R8$$SyntheticClass */
/* renamed from: nkb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nkb {
    public static /* synthetic */ int a(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }
}
