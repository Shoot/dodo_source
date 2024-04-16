package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jspecify.nullness.NullMarked;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@NullMarked
/* renamed from: ybd  reason: default package */
/* loaded from: classes2.dex */
public final class ybd {
    private final k6d a;
    private final boolean b;
    private final uad c;

    private ybd(uad uadVar, boolean z, k6d k6dVar, int i, byte[] bArr) {
        this.c = uadVar;
        this.b = z;
        this.a = k6dVar;
    }

    public static ybd c(k6d k6dVar) {
        return new ybd(new uad(k6dVar), false, a5d.b, Integer.MAX_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator h(CharSequence charSequence) {
        return new nad(this.c, this, charSequence);
    }

    public final ybd b() {
        return new ybd(this.c, true, this.a, Integer.MAX_VALUE, null);
    }

    public final Iterable d(CharSequence charSequence) {
        return new ebd(this, charSequence);
    }

    public final List f(CharSequence charSequence) {
        charSequence.getClass();
        Iterator h = h(charSequence);
        ArrayList arrayList = new ArrayList();
        while (h.hasNext()) {
            arrayList.add((String) h.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
