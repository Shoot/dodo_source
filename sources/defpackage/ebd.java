package defpackage;

import java.io.IOException;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: ebd  reason: default package */
/* loaded from: classes2.dex */
public final class ebd implements Iterable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ ybd b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ebd(ybd ybdVar, CharSequence charSequence) {
        this.b = ybdVar;
        this.a = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator h;
        h = this.b.h(this.a);
        return h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb.append(c9d.a(it.next(), ", "));
                while (it.hasNext()) {
                    sb.append((CharSequence) ", ");
                    sb.append(c9d.a(it.next(), ", "));
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
