package defpackage;
/* compiled from: XYTileSource.java */
/* renamed from: vbc  reason: default package */
/* loaded from: classes3.dex */
public class vbc extends da7 {
    public vbc(String str, int i, int i2, int i3, String str2, String[] strArr) {
        super(str, i, i2, i3, str2, strArr);
    }

    @Override // defpackage.da7
    public String m(long j) {
        return k() + k76.e(j) + "/" + k76.c(j) + "/" + k76.d(j) + this.f;
    }

    @Override // org.osmdroid.tileprovider.tilesource.BitmapTileSourceBase
    public String toString() {
        return name();
    }

    public vbc(String str, int i, int i2, int i3, String str2, String[] strArr, String str3) {
        super(str, i, i2, i3, str2, strArr, str3);
    }

    public vbc(String str, int i, int i2, int i3, String str2, String[] strArr, String str3, agb agbVar) {
        super(str, i, i2, i3, str2, strArr, str3, agbVar);
    }
}
