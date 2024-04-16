package defpackage;

import android.util.Log;
/* compiled from: CloudmadeTileSource.java */
/* renamed from: ga1  reason: default package */
/* loaded from: classes3.dex */
public class ga1 extends da7 implements bt4<Integer> {
    private Integer m;

    public ga1(String str, int i, int i2, int i3, String str2, String[] strArr) {
        super(str, i, i2, i3, str2, strArr);
        this.m = 1;
    }

    @Override // defpackage.bt4
    public void g(String str) {
        try {
            this.m = Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            Log.e("OsmDroid", "Error setting integer style: " + str);
        }
    }

    @Override // org.osmdroid.tileprovider.tilesource.BitmapTileSourceBase
    public String i() {
        Integer num = this.m;
        if (num != null && num.intValue() > 1) {
            return this.d + this.m;
        }
        return this.d;
    }

    @Override // defpackage.da7
    public String m(long j) {
        String a = ha1.a();
        if (a.length() == 0) {
            Log.e("OsmDroid", "CloudMade key is not set. You should enter it in the manifest and call CloudmadeUtil.retrieveCloudmadeKey()");
        }
        return String.format(k(), a, this.m, Integer.valueOf(c()), Integer.valueOf(k76.e(j)), Integer.valueOf(k76.c(j)), Integer.valueOf(k76.d(j)), this.f, ha1.b());
    }
}
