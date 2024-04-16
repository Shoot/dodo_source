package defpackage;
/* compiled from: Pow2.java */
/* renamed from: cg8  reason: default package */
/* loaded from: classes3.dex */
public final class cg8 {
    public static int a(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }
}
