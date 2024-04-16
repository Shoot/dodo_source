package defpackage;

import java.util.concurrent.Semaphore;
import org.osmdroid.tileprovider.tilesource.BitmapTileSourceBase;
/* compiled from: OnlineTileSourceBase.java */
/* renamed from: da7  reason: default package */
/* loaded from: classes3.dex */
public abstract class da7 extends BitmapTileSourceBase {
    private final String[] j;
    private final Semaphore k;
    private final agb l;

    public da7(String str, int i, int i2, int i3, String str2, String[] strArr) {
        this(str, i, i2, i3, str2, strArr, null);
    }

    public void j() throws InterruptedException {
        Semaphore semaphore = this.k;
        if (semaphore == null) {
            return;
        }
        semaphore.acquire();
    }

    public String k() {
        String[] strArr = this.j;
        if (strArr != null && strArr.length > 0) {
            return strArr[this.g.nextInt(strArr.length)];
        }
        return "";
    }

    public agb l() {
        return this.l;
    }

    public abstract String m(long j);

    public void n() {
        Semaphore semaphore = this.k;
        if (semaphore == null) {
            return;
        }
        semaphore.release();
    }

    public da7(String str, int i, int i2, int i3, String str2, String[] strArr, String str3) {
        this(str, i, i2, i3, str2, strArr, str3, new agb());
    }

    public da7(String str, int i, int i2, int i3, String str2, String[] strArr, String str3, agb agbVar) {
        super(str, i, i2, i3, str2, str3);
        this.j = strArr;
        this.l = agbVar;
        if (agbVar.h() > 0) {
            this.k = new Semaphore(agbVar.h(), true);
        } else {
            this.k = null;
        }
    }
}
