package defpackage;

import java.util.List;
/* compiled from: BasketFromStateBuilder.java */
/* renamed from: u90  reason: default package */
/* loaded from: classes3.dex */
public class u90 {
    private d88 a;
    private op8 b = op8.b();
    private w18 c = w18.b();
    private List<ce0> d;

    public u90(d88 d88Var, List<ce0> list) {
        this.a = d88Var;
        this.d = list;
    }

    public t90 a() {
        return new t90(this.a, this.b, this.d, this.c);
    }

    public void b(w18 w18Var) {
        this.c = w18Var;
    }

    public void c(op8 op8Var) {
        this.b = op8Var;
    }
}
