package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: opc  reason: default package */
/* loaded from: classes2.dex */
final class opc implements Iterator<bpc> {
    private int a = 0;
    private final /* synthetic */ gpc b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public opc(gpc gpcVar) {
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
        int i = this.a;
        str = this.b.a;
        if (i < str.length()) {
            int i2 = this.a;
            this.a = i2 + 1;
            return new gpc(String.valueOf(i2));
        }
        throw new NoSuchElementException();
    }
}
