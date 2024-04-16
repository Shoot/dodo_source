package defpackage;

import defpackage.cb5;
import defpackage.ic5;
import defpackage.j4;
import defpackage.j81;
import defpackage.ta5;
import defpackage.w76;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;
/* compiled from: MapperConfig.java */
/* renamed from: w76  reason: default package */
/* loaded from: classes2.dex */
public abstract class w76<T extends w76<T>> implements j81.a, Serializable {
    protected static final cb5.b c = cb5.b.c();
    protected static final ta5.d d = ta5.d.b();
    protected final long a;
    protected final i80 b;

    /* JADX INFO: Access modifiers changed from: protected */
    public w76(i80 i80Var, long j) {
        this.b = i80Var;
        this.a = j;
    }

    public static <F extends Enum<F> & mp1> int c(Class<F> cls) {
        int i = 0;
        for (Enum r3 : (Enum[]) cls.getEnumConstants()) {
            mp1 mp1Var = (mp1) r3;
            if (mp1Var.a()) {
                i |= mp1Var.i();
            }
        }
        return i;
    }

    public final im4 E() {
        this.b.f();
        return null;
    }

    public final Locale G() {
        return this.b.i();
    }

    public se8 H() {
        se8 j = this.b.j();
        if (j == dj5.a && S(y76.BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES)) {
            return new hp2();
        }
        return j;
    }

    public final wq8 K() {
        return this.b.k();
    }

    public final TimeZone L() {
        return this.b.l();
    }

    public final rnb M() {
        return this.b.m();
    }

    public fa0 N(y85 y85Var) {
        return k().a(this, y85Var, this);
    }

    public fa0 P(Class<?> cls) {
        return N(e(cls));
    }

    public final boolean Q() {
        return S(y76.USE_ANNOTATIONS);
    }

    public final boolean S(y76 y76Var) {
        return y76Var.o(this.a);
    }

    public final boolean T() {
        return S(y76.SORT_PROPERTIES_ALPHABETICALLY);
    }

    public snb W(al alVar, Class<? extends snb> cls) {
        E();
        return (snb) q81.k(cls, b());
    }

    public aob<?> Z(al alVar, Class<? extends aob<?>> cls) {
        E();
        return (aob) q81.k(cls, b());
    }

    public final boolean b() {
        return S(y76.CAN_OVERRIDE_ACCESS_MODIFIERS);
    }

    public mca d(String str) {
        return new vca(str);
    }

    public final y85 e(Class<?> cls) {
        return M().Q(cls);
    }

    public final j4.a f() {
        return this.b.a();
    }

    public ql i() {
        if (S(y76.USE_ANNOTATIONS)) {
            return this.b.b();
        }
        return f07.a;
    }

    public v60 j() {
        return this.b.c();
    }

    public j81 k() {
        return this.b.d();
    }

    public abstract up1 l(Class<?> cls);

    public final DateFormat m() {
        return this.b.e();
    }

    public abstract cb5.b n(Class<?> cls, Class<?> cls2);

    public cb5.b o(Class<?> cls, Class<?> cls2, cb5.b bVar) {
        return cb5.b.l(bVar, l(cls).d(), l(cls2).e());
    }

    public abstract Boolean q();

    public abstract ta5.d r(Class<?> cls);

    public abstract cb5.b s(Class<?> cls);

    public cb5.b u(Class<?> cls, cb5.b bVar) {
        cb5.b d2 = l(cls).d();
        if (d2 != null) {
            return d2;
        }
        return bVar;
    }

    public abstract ic5.a w();

    public final aob<?> x(y85 y85Var) {
        return this.b.n();
    }

    public abstract v1c<?> y(Class<?> cls, bl blVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public w76(w76<T> w76Var, long j) {
        this.b = w76Var.b;
        this.a = j;
    }
}
