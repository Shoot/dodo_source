package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
/* compiled from: AuthAnalytics.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0003\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Llz;", "", "Ldc;", "a", "<init>", "()V", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lz  reason: default package */
/* loaded from: classes4.dex */
public final class lz {
    public static final lz a = new lz();

    /* compiled from: AuthAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Llz$a;", "Ldc;", "Lqc;", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lz$a */
    /* loaded from: classes4.dex */
    public static final class a implements dc {
        public static final a a = new a();

        private a() {
        }

        @Override // defpackage.dc
        public qc a() {
            return new bc("login").d("platform", "Android", true).a();
        }
    }

    /* compiled from: AuthAnalytics.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u0011"}, d2 = {"Llz$b;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lqd;", "Lqd;", "sender", "<init>", "(Lqd;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lz$b */
    /* loaded from: classes4.dex */
    public static final class b implements dc {
        private final qd a;

        public b(qd qdVar) {
            z65.h(qdVar, "sender");
            this.a = qdVar;
        }

        @Override // defpackage.dc
        public qc a() {
            return vc.z(new bc("screen_sign_in"), this.a).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && z65.c(this.a, ((b) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            qd qdVar = this.a;
            return "OpenSignInScreenEvent(sender=" + qdVar + ")";
        }
    }

    /* compiled from: AuthAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Llz$c;", "Ldc;", "Lqc;", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lz$c */
    /* loaded from: classes4.dex */
    public static final class c implements dc {
        public static final c a = new c();

        private c() {
        }

        @Override // defpackage.dc
        public qc a() {
            return new bc("sign_in_submit_phone").a();
        }
    }

    /* compiled from: AuthAnalytics.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Llz$d;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lqd;", "Lqd;", "sender", "Ld88;", "b", "Ld88;", "pizzeria", com.huawei.hms.opendevice.c.a, "Z", "isNewUser", "<init>", "(Lqd;Ld88;Z)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lz$d */
    /* loaded from: classes4.dex */
    public static final class d implements dc {
        private final qd a;
        private final d88 b;
        private final boolean c;

        public d(qd qdVar, d88 d88Var, boolean z) {
            z65.h(qdVar, "sender");
            z65.h(d88Var, "pizzeria");
            this.a = qdVar;
            this.b = d88Var;
            this.c = z;
        }

        @Override // defpackage.dc
        public qc a() {
            String str;
            bc w = vc.w(vc.z(new bc("sign_in"), this.a), this.b);
            if (this.c) {
                str = "registration";
            } else {
                str = "authorization";
            }
            return bc.e(w, "auth_type", str, false, 4, null).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (z65.c(this.a, dVar.a) && z65.c(this.b, dVar.b) && this.c == dVar.c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a91.a(this.c);
        }

        public String toString() {
            qd qdVar = this.a;
            d88 d88Var = this.b;
            boolean z = this.c;
            return "UserLoginEvent(sender=" + qdVar + ", pizzeria=" + d88Var + ", isNewUser=" + z + ")";
        }
    }

    private lz() {
    }

    public final dc a() {
        return ec.b("sign_in_submit_code", null, 2, null);
    }
}
