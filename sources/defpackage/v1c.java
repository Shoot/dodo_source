package defpackage;

import defpackage.da5;
import defpackage.v1c;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: VisibilityChecker.java */
/* renamed from: v1c  reason: default package */
/* loaded from: classes2.dex */
public interface v1c<T extends v1c<T>> {

    /* compiled from: VisibilityChecker.java */
    /* renamed from: v1c$a */
    /* loaded from: classes2.dex */
    public static class a implements v1c<a>, Serializable {
        protected static final a f;
        protected static final a g;
        protected final da5.c a;
        protected final da5.c b;
        protected final da5.c c;
        protected final da5.c d;
        protected final da5.c e;

        static {
            da5.c cVar = da5.c.PUBLIC_ONLY;
            da5.c cVar2 = da5.c.ANY;
            f = new a(cVar, cVar, cVar2, cVar2, cVar);
            g = new a(cVar, cVar, cVar, cVar, cVar);
        }

        public a(da5.c cVar, da5.c cVar2, da5.c cVar3, da5.c cVar4, da5.c cVar5) {
            this.a = cVar;
            this.b = cVar2;
            this.c = cVar3;
            this.d = cVar4;
            this.e = cVar5;
        }

        private da5.c n(da5.c cVar, da5.c cVar2) {
            if (cVar2 == da5.c.DEFAULT) {
                return cVar;
            }
            return cVar2;
        }

        public static a q() {
            return g;
        }

        public static a r() {
            return f;
        }

        @Override // defpackage.v1c
        /* renamed from: E */
        public a l(da5.c cVar) {
            if (cVar == da5.c.DEFAULT) {
                cVar = f.d;
            }
            da5.c cVar2 = cVar;
            if (this.d == cVar2) {
                return this;
            }
            return new a(this.a, this.b, this.c, cVar2, this.e);
        }

        @Override // defpackage.v1c
        /* renamed from: G */
        public a k(da5.c cVar) {
            if (cVar == da5.c.DEFAULT) {
                cVar = f.e;
            }
            da5.c cVar2 = cVar;
            if (this.e == cVar2) {
                return this;
            }
            return new a(this.a, this.b, this.c, this.d, cVar2);
        }

        @Override // defpackage.v1c
        /* renamed from: H */
        public a f(da5.c cVar) {
            if (cVar == da5.c.DEFAULT) {
                cVar = f.a;
            }
            da5.c cVar2 = cVar;
            if (this.a == cVar2) {
                return this;
            }
            return new a(cVar2, this.b, this.c, this.d, this.e);
        }

        @Override // defpackage.v1c
        /* renamed from: K */
        public a m(da5.c cVar) {
            if (cVar == da5.c.DEFAULT) {
                cVar = f.b;
            }
            da5.c cVar2 = cVar;
            if (this.b == cVar2) {
                return this;
            }
            return new a(this.a, cVar2, this.c, this.d, this.e);
        }

        @Override // defpackage.v1c
        /* renamed from: L */
        public a e(da5.b bVar) {
            if (bVar != null) {
                return o(n(this.a, bVar.e()), n(this.b, bVar.f()), n(this.c, bVar.i()), n(this.d, bVar.c()), n(this.e, bVar.d()));
            }
            return this;
        }

        @Override // defpackage.v1c
        /* renamed from: M */
        public a d(da5.c cVar) {
            if (cVar == da5.c.DEFAULT) {
                cVar = f.c;
            }
            da5.c cVar2 = cVar;
            if (this.c == cVar2) {
                return this;
            }
            return new a(this.a, this.b, cVar2, this.d, this.e);
        }

        @Override // defpackage.v1c
        public boolean b(fl flVar) {
            return s(flVar.q());
        }

        @Override // defpackage.v1c
        public boolean c(il ilVar) {
            return w(ilVar.w());
        }

        @Override // defpackage.v1c
        public boolean i(il ilVar) {
            return u(ilVar.w());
        }

        @Override // defpackage.v1c
        public boolean j(il ilVar) {
            return x(ilVar.w());
        }

        protected a o(da5.c cVar, da5.c cVar2, da5.c cVar3, da5.c cVar4, da5.c cVar5) {
            if (cVar == this.a && cVar2 == this.b && cVar3 == this.c && cVar4 == this.d && cVar5 == this.e) {
                return this;
            }
            return new a(cVar, cVar2, cVar3, cVar4, cVar5);
        }

        public boolean s(Field field) {
            return this.e.a(field);
        }

        public String toString() {
            return String.format("[Visibility: getter=%s,isGetter=%s,setter=%s,creator=%s,field=%s]", this.a, this.b, this.c, this.d, this.e);
        }

        public boolean u(Method method) {
            return this.a.a(method);
        }

        public boolean w(Method method) {
            return this.b.a(method);
        }

        public boolean x(Method method) {
            return this.c.a(method);
        }

        @Override // defpackage.v1c
        /* renamed from: y */
        public a a(da5 da5Var) {
            if (da5Var != null) {
                return o(n(this.a, da5Var.getterVisibility()), n(this.b, da5Var.isGetterVisibility()), n(this.c, da5Var.setterVisibility()), n(this.d, da5Var.creatorVisibility()), n(this.e, da5Var.fieldVisibility()));
            }
            return this;
        }
    }

    T a(da5 da5Var);

    boolean b(fl flVar);

    boolean c(il ilVar);

    T d(da5.c cVar);

    T e(da5.b bVar);

    T f(da5.c cVar);

    boolean i(il ilVar);

    boolean j(il ilVar);

    T k(da5.c cVar);

    T l(da5.c cVar);

    T m(da5.c cVar);
}
