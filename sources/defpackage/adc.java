package defpackage;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
/* compiled from: ZoneRules.java */
/* renamed from: adc  reason: default package */
/* loaded from: classes3.dex */
public abstract class adc {

    /* compiled from: ZoneRules.java */
    /* renamed from: adc$a */
    /* loaded from: classes3.dex */
    static final class a extends adc implements Serializable {
        private final wcc a;

        a(wcc wccVar) {
            this.a = wccVar;
        }

        @Override // defpackage.adc
        public wcc a(b55 b55Var) {
            return this.a;
        }

        @Override // defpackage.adc
        public xcc b(es5 es5Var) {
            return null;
        }

        @Override // defpackage.adc
        public List<wcc> c(es5 es5Var) {
            return Collections.singletonList(this.a);
        }

        @Override // defpackage.adc
        public boolean d(b55 b55Var) {
            return false;
        }

        @Override // defpackage.adc
        public boolean e() {
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.a.equals(((a) obj).a);
            }
            if (!(obj instanceof ota)) {
                return false;
            }
            ota otaVar = (ota) obj;
            if (otaVar.e() && this.a.equals(otaVar.a(b55.c))) {
                return true;
            }
            return false;
        }

        @Override // defpackage.adc
        public boolean f(es5 es5Var, wcc wccVar) {
            return this.a.equals(wccVar);
        }

        public int hashCode() {
            return ((this.a.hashCode() + 31) ^ (this.a.hashCode() + 31)) ^ 1;
        }

        public String toString() {
            return "FixedRules:" + this.a;
        }
    }

    public static adc i(wcc wccVar) {
        g95.i(wccVar, "offset");
        return new a(wccVar);
    }

    public abstract wcc a(b55 b55Var);

    public abstract xcc b(es5 es5Var);

    public abstract List<wcc> c(es5 es5Var);

    public abstract boolean d(b55 b55Var);

    public abstract boolean e();

    public abstract boolean f(es5 es5Var, wcc wccVar);
}
