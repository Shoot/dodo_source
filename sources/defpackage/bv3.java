package defpackage;

import java.io.Serializable;
/* compiled from: FilteredBeanPropertyWriter.java */
/* renamed from: bv3  reason: default package */
/* loaded from: classes2.dex */
public abstract class bv3 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FilteredBeanPropertyWriter.java */
    /* renamed from: bv3$a */
    /* loaded from: classes2.dex */
    public static final class a extends ka0 implements Serializable {
        protected final ka0 t;
        protected final Class<?>[] u;

        protected a(ka0 ka0Var, Class<?>[] clsArr) {
            super(ka0Var);
            this.t = ka0Var;
            this.u = clsArr;
        }

        private final boolean M(Class<?> cls) {
            if (cls == null) {
                return true;
            }
            int length = this.u.length;
            for (int i = 0; i < length; i++) {
                if (this.u[i].isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.ka0
        /* renamed from: N */
        public a u(ps6 ps6Var) {
            return new a(this.t.u(ps6Var), this.u);
        }

        @Override // defpackage.ka0
        public void i(gc5<Object> gc5Var) {
            this.t.i(gc5Var);
        }

        @Override // defpackage.ka0
        public void j(gc5<Object> gc5Var) {
            this.t.j(gc5Var);
        }

        @Override // defpackage.ka0
        public void w(Object obj, ua5 ua5Var, bda bdaVar) throws Exception {
            if (M(bdaVar.h0())) {
                this.t.w(obj, ua5Var, bdaVar);
            } else {
                this.t.E(obj, ua5Var, bdaVar);
            }
        }

        @Override // defpackage.ka0
        public void x(Object obj, ua5 ua5Var, bda bdaVar) throws Exception {
            if (M(bdaVar.h0())) {
                this.t.x(obj, ua5Var, bdaVar);
            } else {
                this.t.y(obj, ua5Var, bdaVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FilteredBeanPropertyWriter.java */
    /* renamed from: bv3$b */
    /* loaded from: classes2.dex */
    public static final class b extends ka0 implements Serializable {
        protected final ka0 t;
        protected final Class<?> u;

        protected b(ka0 ka0Var, Class<?> cls) {
            super(ka0Var);
            this.t = ka0Var;
            this.u = cls;
        }

        @Override // defpackage.ka0
        /* renamed from: M */
        public b u(ps6 ps6Var) {
            return new b(this.t.u(ps6Var), this.u);
        }

        @Override // defpackage.ka0
        public void i(gc5<Object> gc5Var) {
            this.t.i(gc5Var);
        }

        @Override // defpackage.ka0
        public void j(gc5<Object> gc5Var) {
            this.t.j(gc5Var);
        }

        @Override // defpackage.ka0
        public void w(Object obj, ua5 ua5Var, bda bdaVar) throws Exception {
            Class<?> h0 = bdaVar.h0();
            if (h0 != null && !this.u.isAssignableFrom(h0)) {
                this.t.E(obj, ua5Var, bdaVar);
            } else {
                this.t.w(obj, ua5Var, bdaVar);
            }
        }

        @Override // defpackage.ka0
        public void x(Object obj, ua5 ua5Var, bda bdaVar) throws Exception {
            Class<?> h0 = bdaVar.h0();
            if (h0 != null && !this.u.isAssignableFrom(h0)) {
                this.t.y(obj, ua5Var, bdaVar);
            } else {
                this.t.x(obj, ua5Var, bdaVar);
            }
        }
    }

    public static ka0 a(ka0 ka0Var, Class<?>[] clsArr) {
        if (clsArr.length == 1) {
            return new b(ka0Var, clsArr[0]);
        }
        return new a(ka0Var, clsArr);
    }
}
