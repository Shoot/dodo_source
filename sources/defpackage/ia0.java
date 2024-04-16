package defpackage;

import defpackage.cb5;
import defpackage.ta5;
import java.io.Serializable;
/* compiled from: BeanProperty.java */
/* renamed from: ia0  reason: default package */
/* loaded from: classes2.dex */
public interface ia0 {
    public static final ta5.d D = new ta5.d();
    public static final cb5.b E = cb5.b.c();

    /* compiled from: BeanProperty.java */
    /* renamed from: ia0$a */
    /* loaded from: classes2.dex */
    public static class a implements ia0 {
        @Override // defpackage.ia0
        public ta5.d a(w76<?> w76Var, Class<?> cls) {
            return ta5.d.b();
        }

        @Override // defpackage.ia0
        public cb5.b b(w76<?> w76Var, Class<?> cls) {
            return null;
        }

        @Override // defpackage.ia0
        public hl c() {
            return null;
        }

        @Override // defpackage.ia0
        public uq8 getMetadata() {
            return uq8.j;
        }

        @Override // defpackage.ia0
        public y85 getType() {
            return rnb.b0();
        }
    }

    /* compiled from: BeanProperty.java */
    /* renamed from: ia0$b */
    /* loaded from: classes2.dex */
    public static class b implements ia0, Serializable {
        protected final vq8 a;
        protected final y85 b;
        protected final vq8 c;
        protected final uq8 d;
        protected final hl e;

        public b(vq8 vq8Var, y85 y85Var, vq8 vq8Var2, hl hlVar, uq8 uq8Var) {
            this.a = vq8Var;
            this.b = y85Var;
            this.c = vq8Var2;
            this.d = uq8Var;
            this.e = hlVar;
        }

        @Override // defpackage.ia0
        public ta5.d a(w76<?> w76Var, Class<?> cls) {
            hl hlVar;
            ta5.d r = w76Var.r(cls);
            ql i = w76Var.i();
            if (i != null && (hlVar = this.e) != null) {
                ta5.d m = i.m(hlVar);
                if (m == null) {
                    return r;
                }
                return r.u(m);
            }
            return r;
        }

        @Override // defpackage.ia0
        public cb5.b b(w76<?> w76Var, Class<?> cls) {
            hl hlVar;
            cb5.b n = w76Var.n(cls, this.b.u());
            ql i = w76Var.i();
            if (i != null && (hlVar = this.e) != null) {
                cb5.b Q = i.Q(hlVar);
                if (Q == null) {
                    return n;
                }
                return n.o(Q);
            }
            return n;
        }

        @Override // defpackage.ia0
        public hl c() {
            return this.e;
        }

        @Override // defpackage.ia0
        public uq8 getMetadata() {
            return this.d;
        }

        @Override // defpackage.ia0
        public y85 getType() {
            return this.b;
        }
    }

    ta5.d a(w76<?> w76Var, Class<?> cls);

    cb5.b b(w76<?> w76Var, Class<?> cls);

    hl c();

    uq8 getMetadata();

    y85 getType();
}
