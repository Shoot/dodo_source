package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class d extends rb {
    private com.google.android.gms.internal.measurement.f g;
    private final /* synthetic */ ob h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ob obVar, String str, int i, com.google.android.gms.internal.measurement.f fVar) {
        super(str, i);
        this.h = obVar;
        this.g = fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.rb
    public final int a() {
        return this.g.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.rb
    public final boolean i() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.rb
    public final boolean j() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k(Long l, Long l2, com.google.android.gms.internal.measurement.m0 m0Var, boolean z) {
        boolean z2;
        boolean z3;
        Object obj;
        if (t6d.a() && this.h.a().E(this.a, b0.h0)) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean N = this.g.N();
        boolean O = this.g.O();
        boolean P = this.g.P();
        if (!N && !O && !P) {
            z3 = false;
        } else {
            z3 = true;
        }
        Boolean bool = null;
        Integer num = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z && !z3) {
            m4 J = this.h.n().J();
            Integer valueOf = Integer.valueOf(this.b);
            if (this.g.Q()) {
                num = Integer.valueOf(this.g.m());
            }
            J.c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", valueOf, num);
            return true;
        }
        com.google.android.gms.internal.measurement.d J2 = this.g.J();
        boolean O2 = J2.O();
        if (m0Var.f0()) {
            if (!J2.Q()) {
                this.h.n().K().b("No number filter for long property. property", this.h.f().g(m0Var.b0()));
            } else {
                bool = rb.d(rb.c(m0Var.V(), J2.L()), O2);
            }
        } else if (m0Var.d0()) {
            if (!J2.Q()) {
                this.h.n().K().b("No number filter for double property. property", this.h.f().g(m0Var.b0()));
            } else {
                bool = rb.d(rb.b(m0Var.H(), J2.L()), O2);
            }
        } else if (m0Var.h0()) {
            if (!J2.S()) {
                if (!J2.Q()) {
                    this.h.n().K().b("No string or number filter defined. property", this.h.f().g(m0Var.b0()));
                } else if (db.h0(m0Var.c0())) {
                    bool = rb.d(rb.e(m0Var.c0(), J2.L()), O2);
                } else {
                    this.h.n().K().c("Invalid user property value for Numeric number filter. property, value", this.h.f().g(m0Var.b0()), m0Var.c0());
                }
            } else {
                bool = rb.d(rb.g(m0Var.c0(), J2.M(), this.h.n()), O2);
            }
        } else {
            this.h.n().K().b("User property has no value, property", this.h.f().g(m0Var.b0()));
        }
        m4 J3 = this.h.n().J();
        if (bool == null) {
            obj = "null";
        } else {
            obj = bool;
        }
        J3.b("Property filter result", obj);
        if (bool == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if (P && !bool.booleanValue()) {
            return true;
        }
        if (!z || this.g.N()) {
            this.d = bool;
        }
        if (bool.booleanValue() && z3 && m0Var.g0()) {
            long Y = m0Var.Y();
            if (l != null) {
                Y = l.longValue();
            }
            if (z2 && this.g.N() && !this.g.O() && l2 != null) {
                Y = l2.longValue();
            }
            if (this.g.O()) {
                this.f = Long.valueOf(Y);
            } else {
                this.e = Long.valueOf(Y);
            }
        }
        return true;
    }
}
