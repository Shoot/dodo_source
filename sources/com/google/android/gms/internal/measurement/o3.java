package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
final class o3 implements Iterator {
    private int a;
    private Iterator b;
    private final /* synthetic */ n3 c;

    private final Iterator a() {
        Map map;
        if (this.b == null) {
            map = this.c.f;
            this.b = map.entrySet().iterator();
        }
        return this.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i = this.a;
        if (i > 0) {
            list = this.c.b;
            if (i <= list.size()) {
                return true;
            }
        }
        if (a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        if (!a().hasNext()) {
            list = this.c.b;
            int i = this.a - 1;
            this.a = i;
            return (Map.Entry) list.get(i);
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private o3(n3 n3Var) {
        List list;
        this.c = n3Var;
        list = n3Var.b;
        this.a = list.size();
    }
}
