package defpackage;
/* compiled from: IntegerArrayAdapter.java */
/* renamed from: c65  reason: default package */
/* loaded from: classes.dex */
public final class c65 implements cr<int[]> {
    @Override // defpackage.cr
    public String a() {
        return "IntegerArrayPool";
    }

    @Override // defpackage.cr
    public int b() {
        return 4;
    }

    @Override // defpackage.cr
    /* renamed from: d */
    public int c(int[] iArr) {
        return iArr.length;
    }

    @Override // defpackage.cr
    /* renamed from: e */
    public int[] newArray(int i) {
        return new int[i];
    }
}
