package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: PromoCodeAnalytics.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0007\nB\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Lpp8;", "", "", "promoCode", "Lqd;", "sender", "Ldc;", "a", "<init>", "()V", "b", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pp8  reason: default package */
/* loaded from: classes4.dex */
public final class pp8 {
    public static final pp8 a = new pp8();

    /* compiled from: PromoCodeAnalytics.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\n\u0012\u0006\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0018\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lpp8$a;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getConditions", "()Ljava/lang/String;", "conditions", "b", "getResultStatus", "resultStatus", com.huawei.hms.opendevice.c.a, "getPromoAction", "promoAction", DateTokenConverter.CONVERTER_KEY, "Z", "isSecretOffer", "()Z", "Lqd;", e.a, "Lqd;", "getSender", "()Lqd;", "sender", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLqd;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: pp8$a */
    /* loaded from: classes4.dex */
    public static final class a implements dc {
        private final String a;
        private final String b;
        private final String c;
        private final boolean d;
        private final qd e;

        public a(String str, String str2, String str3, boolean z, qd qdVar) {
            z65.h(str, "conditions");
            z65.h(str2, "resultStatus");
            z65.h(str3, "promoAction");
            z65.h(qdVar, "sender");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
            this.e = qdVar;
        }

        @Override // defpackage.dc
        public qc a() {
            return vc.z(bc.e(bc.e(bc.e(bc.e(new bc("apply_personal_offer"), "conditions", this.a, false, 4, null), "promoaction", this.c, false, 4, null), "result", this.b, false, 4, null), "isSecretOffer", Boolean.valueOf(this.d), false, 4, null), this.e).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.a, aVar.a) && z65.c(this.b, aVar.b) && z65.c(this.c, aVar.c) && this.d == aVar.d && z65.c(this.e, aVar.e)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a91.a(this.d)) * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.c;
            boolean z = this.d;
            qd qdVar = this.e;
            return "PromoActionApplied(conditions=" + str + ", resultStatus=" + str2 + ", promoAction=" + str3 + ", isSecretOffer=" + z + ", sender=" + qdVar + ")";
        }
    }

    /* compiled from: PromoCodeAnalytics.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lpp8$b;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getConditions", "()Ljava/lang/String;", "conditions", "b", "getResultStatus", "resultStatus", com.huawei.hms.opendevice.c.a, "getPromoCode", "promoCode", "Lcq8;", DateTokenConverter.CONVERTER_KEY, "Lcq8;", "getSender", "()Lcq8;", "sender", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcq8;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: pp8$b */
    /* loaded from: classes4.dex */
    public static final class b implements dc {
        private final String a;
        private final String b;
        private final String c;
        private final cq8 d;

        public b(String str, String str2, String str3, cq8 cq8Var) {
            z65.h(str, "conditions");
            z65.h(str2, "resultStatus");
            z65.h(str3, "promoCode");
            z65.h(cq8Var, "sender");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = cq8Var;
        }

        @Override // defpackage.dc
        public qc a() {
            return vc.z(bc.e(bc.e(bc.e(new bc("apply_promocode"), "conditions", this.a, false, 4, null), "promocode", this.c, false, 4, null), "result", this.b, false, 4, null), this.d).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (z65.c(this.a, bVar.a) && z65.c(this.b, bVar.b) && z65.c(this.c, bVar.c) && this.d == bVar.d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.c;
            cq8 cq8Var = this.d;
            return "PromoCodeApplied(conditions=" + str + ", resultStatus=" + str2 + ", promoCode=" + str3 + ", sender=" + cq8Var + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PromoCodeAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: pp8$c */
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ String a;
        final /* synthetic */ qd b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, qd qdVar) {
            super(1);
            this.a = str;
            this.b = qdVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, "promocode", this.a, false, 4, null);
            return vc.z(bcVar, this.b);
        }
    }

    private pp8() {
    }

    public final dc a(String str, qd qdVar) {
        z65.h(str, "promoCode");
        z65.h(qdVar, "sender");
        return ec.a("cancel_promocode", new c(str, qdVar));
    }
}
