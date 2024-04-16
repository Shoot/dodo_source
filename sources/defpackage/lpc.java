package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: lpc  reason: default package */
/* loaded from: classes2.dex */
final class lpc implements Iterator<bpc> {
    private int a = 0;
    private final /* synthetic */ gpc b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public lpc(gpc gpcVar) {
        this.b = gpcVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i = this.a;
        str = this.b.a;
        if (i < str.length()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ bpc next() {
        String str;
        String str2;
        int i = this.a;
        str = this.b.a;
        if (i < str.length()) {
            str2 = this.b.a;
            int i2 = this.a;
            this.a = i2 + 1;
            return new gpc(String.valueOf(str2.charAt(i2)));
        }
        throw new NoSuchElementException();
    }
}
