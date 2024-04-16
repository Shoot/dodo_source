package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
/* compiled from: AnnotatedMethodMap.java */
/* renamed from: kl  reason: default package */
/* loaded from: classes2.dex */
public final class kl implements Iterable<il> {
    protected Map<rc6, il> a;

    public kl() {
    }

    public kl(Map<rc6, il> map) {
        this.a = map;
    }

    @Override // java.lang.Iterable
    public Iterator<il> iterator() {
        Map<rc6, il> map = this.a;
        if (map == null) {
            return Collections.emptyIterator();
        }
        return map.values().iterator();
    }
}
