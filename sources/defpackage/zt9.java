package defpackage;

import kotlin.Metadata;
/* compiled from: SberPayPaymentResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lzt9;", "", "a", "b", "Lzt9$a;", "Lzt9$b;", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zt9  reason: default package */
/* loaded from: classes2.dex */
public interface zt9 {

    /* compiled from: SberPayPaymentResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzt9$a;", "Lzt9;", "<init>", "()V", "payment_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zt9$a */
    /* loaded from: classes2.dex */
    public static final class a implements zt9 {
        public static final a a = new a();

        private a() {
        }
    }

    /* compiled from: SberPayPaymentResult.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lzt9$b;", "Lzt9;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "sberAppDeepLink", "<init>", "(Ljava/lang/String;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zt9$b */
    /* loaded from: classes2.dex */
    public static final class b implements zt9 {
        private final String a;

        public b(String str) {
            z65.h(str, "sberAppDeepLink");
            this.a = str;
        }

        public final String a() {
            return this.a;
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
            String str = this.a;
            return "Success(sberAppDeepLink=" + str + ")";
        }
    }
}
