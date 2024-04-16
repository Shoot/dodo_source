package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PaymentListItemVO.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Let7;", "", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "Let7$a;", "Let7$b;", "Let7$c;", "Let7$d;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: et7  reason: default package */
/* loaded from: classes4.dex */
public abstract class et7 {

    /* compiled from: PaymentListItemVO.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Let7$a;", "Let7;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: et7$a */
    /* loaded from: classes4.dex */
    public static final class a extends et7 {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* compiled from: PaymentListItemVO.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016¨\u0006\u001c"}, d2 = {"Let7$b;", "Let7;", "", "email", "", "isSubscribedToNews", "a", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", e.a, "(Ljava/lang/String;)V", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "setSubscribedToNews", "(Z)V", com.huawei.hms.opendevice.c.a, "f", "isLoading", "<init>", "(Ljava/lang/String;Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: et7$b */
    /* loaded from: classes4.dex */
    public static final class b extends et7 {
        private String a;
        private boolean b;
        private boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, boolean z) {
            super(null);
            z65.h(str, "email");
            this.a = str;
            this.b = z;
        }

        public final b a(String str, boolean z) {
            z65.h(str, "email");
            return new b(str, z);
        }

        public final String b() {
            return this.a;
        }

        public final boolean c() {
            return this.c;
        }

        public final boolean d() {
            return this.b;
        }

        public final void e(String str) {
            z65.h(str, "<set-?>");
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (z65.c(this.a, bVar.a) && this.b == bVar.b) {
                return true;
            }
            return false;
        }

        public final void f(boolean z) {
            this.c = z;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + a91.a(this.b);
        }

        public String toString() {
            String str = this.a;
            boolean z = this.b;
            return "EmailForCheckVO(email=" + str + ", isSubscribedToNews=" + z + ")";
        }
    }

    /* compiled from: PaymentListItemVO.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\bB\u0019\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\"\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Let7$c;", "Let7;", "Ljw7;", "a", "Ljw7;", "()Ljw7;", "paymentWay", "", "b", "Z", "()Z", "setSelected", "(Z)V", "isSelected", "<init>", "(Ljw7;Z)V", "Let7$c$a;", "Let7$c$b;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: et7$c */
    /* loaded from: classes4.dex */
    public static abstract class c extends et7 {
        private final jw7 a;
        private boolean b;

        /* compiled from: PaymentListItemVO.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\f"}, d2 = {"Let7$c$a;", "Let7$c;", "", com.huawei.hms.opendevice.c.a, "Z", "()Z", "isCarryoutOrRestaurant", "Ljw7;", "paymentWay", "isSelected", "<init>", "(Ljw7;ZZ)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
        /* renamed from: et7$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends c {
            private final boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(jw7 jw7Var, boolean z, boolean z2) {
                super(jw7Var, z2, null);
                z65.h(jw7Var, "paymentWay");
                this.c = z;
            }

            public final boolean c() {
                return this.c;
            }
        }

        /* compiled from: PaymentListItemVO.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005\"\u0004\b\b\u0010\tR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\u000b\u0010\u0005\"\u0004\b\f\u0010\tR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000e\u0010\u0005\"\u0004\b\u000f\u0010\t¨\u0006\u0016"}, d2 = {"Let7$c$b;", "Let7$c;", "", com.huawei.hms.opendevice.c.a, "Z", "()Z", "isCarryoutOrRestaurant", DateTokenConverter.CONVERTER_KEY, "g", "(Z)V", "isCheckboxEnabled", e.a, Image.TYPE_HIGH, "isChecked", "f", "i", "isEditing", "Ljw7;", "paymentWay", "isSelected", "<init>", "(Ljw7;ZZ)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
        /* renamed from: et7$c$b */
        /* loaded from: classes4.dex */
        public static class b extends c {
            private final boolean c;
            private boolean d;
            private boolean e;
            private boolean f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(jw7 jw7Var, boolean z, boolean z2) {
                super(jw7Var, z2, null);
                z65.h(jw7Var, "paymentWay");
                this.c = z;
                this.d = true;
            }

            public final boolean c() {
                return this.c;
            }

            public final boolean d() {
                return this.d;
            }

            public final boolean e() {
                return this.e;
            }

            public final boolean f() {
                return this.f;
            }

            public final void g(boolean z) {
                this.d = z;
            }

            public final void h(boolean z) {
                this.e = z;
            }

            public final void i(boolean z) {
                this.f = z;
            }
        }

        public /* synthetic */ c(jw7 jw7Var, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(jw7Var, z);
        }

        public final jw7 a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        private c(jw7 jw7Var, boolean z) {
            super(null);
            this.a = jw7Var;
            this.b = z;
        }
    }

    /* compiled from: PaymentListItemVO.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0016\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Let7$d;", "Let7;", "", "taxPayerId", "a", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", e.a, "(Ljava/lang/String;)V", "Z", com.huawei.hms.opendevice.c.a, "()Z", DateTokenConverter.CONVERTER_KEY, "(Z)V", "isLoading", "<init>", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: et7$d */
    /* loaded from: classes4.dex */
    public static final class d extends et7 {
        private String a;
        private boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(null);
            z65.h(str, "taxPayerId");
            this.a = str;
        }

        public final d a(String str) {
            z65.h(str, "taxPayerId");
            return new d(str);
        }

        public final String b() {
            return this.a;
        }

        public final boolean c() {
            return this.b;
        }

        public final void d(boolean z) {
            this.b = z;
        }

        public final void e(String str) {
            z65.h(str, "<set-?>");
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && z65.c(this.a, ((d) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            String str = this.a;
            return "TaxPayerIdVO(taxPayerId=" + str + ")";
        }
    }

    private et7() {
    }

    public /* synthetic */ et7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
