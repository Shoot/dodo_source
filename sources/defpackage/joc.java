package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: joc  reason: default package */
/* loaded from: classes2.dex */
public final class joc implements Iterator<bpc> {
    private final /* synthetic */ Iterator a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public joc(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ bpc next() {
        return new gpc((String) this.a.next());
    }
}
