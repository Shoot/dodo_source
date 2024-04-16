package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
final class u3 implements Iterator {
    private int a;
    private boolean b;
    private Iterator c;
    private final /* synthetic */ n3 d;

    private final Iterator a() {
        Map map;
        if (this.c == null) {
            map = this.d.c;
            this.c = map.entrySet().iterator();
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.a + 1;
        list = this.d.b;
        if (i >= list.size()) {
            map = this.d.c;
            if (map.isEmpty() || !a().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        List list2;
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        list = this.d.b;
        if (i < list.size()) {
            list2 = this.d.b;
            return (Map.Entry) list2.get(this.a);
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.b) {
            this.b = false;
            this.d.s();
            int i = this.a;
            list = this.d.b;
            if (i < list.size()) {
                n3 n3Var = this.d;
                int i2 = this.a;
                this.a = i2 - 1;
                n3Var.m(i2);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    private u3(n3 n3Var) {
        this.d = n3Var;
        this.a = -1;
    }
}
