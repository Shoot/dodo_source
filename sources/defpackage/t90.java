package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: Basket.java */
/* renamed from: t90  reason: default package */
/* loaded from: classes4.dex */
public class t90 {
    public static final t90 e = new t90(d88.x.a(), op8.b(), Collections.unmodifiableList(new ArrayList()), w18.b());
    private final d88 a;
    private final op8 b;
    private final w18 c;
    private final List<ce0> d;

    public t90(d88 d88Var, op8 op8Var, List<ce0> list, w18 w18Var) {
        this.a = d88Var;
        this.b = op8Var;
        this.c = w18Var;
        this.d = list;
    }

    public List<ce0> a() {
        return this.d;
    }

    public w18 b() {
        return this.c;
    }

    public op8 c() {
        return this.b;
    }

    public d88 d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t90 t90Var = (t90) obj;
        if (!this.a.equals(t90Var.a) || !this.b.equals(t90Var.b)) {
            return false;
        }
        return !this.d.equals(t90Var.d);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.d.hashCode();
    }
}
