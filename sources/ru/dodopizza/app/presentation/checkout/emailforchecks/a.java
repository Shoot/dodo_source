package ru.dodopizza.app.presentation.checkout.emailforchecks;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: EmailForChecksPresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/emailforchecks/a;", "", "<init>", "()V", "a", "b", "Lru/dodopizza/app/presentation/checkout/emailforchecks/a$a;", "Lru/dodopizza/app/presentation/checkout/emailforchecks/a$b;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class a {

    /* compiled from: EmailForChecksPresenter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/dodopizza/app/presentation/checkout/emailforchecks/a$a;", "Lru/dodopizza/app/presentation/checkout/emailforchecks/a;", "", "email", "", "isSubscribedToNews", "a", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", com.huawei.hms.opendevice.c.a, "()Ljava/lang/String;", "b", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "<init>", "(Ljava/lang/String;Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.checkout.emailforchecks.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0535a extends a {
        private final String a;
        private final boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0535a(String str, boolean z) {
            super(null);
            z65.h(str, "email");
            this.a = str;
            this.b = z;
        }

        public static /* synthetic */ C0535a b(C0535a c0535a, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c0535a.a;
            }
            if ((i & 2) != 0) {
                z = c0535a.b;
            }
            return c0535a.a(str, z);
        }

        public final C0535a a(String str, boolean z) {
            z65.h(str, "email");
            return new C0535a(str, z);
        }

        public final String c() {
            return this.a;
        }

        public final boolean d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0535a)) {
                return false;
            }
            C0535a c0535a = (C0535a) obj;
            if (z65.c(this.a, c0535a.a) && this.b == c0535a.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + a91.a(this.b);
        }

        public String toString() {
            String str = this.a;
            boolean z = this.b;
            return "EmailForChecksVOData(email=" + str + ", isSubscribedToNews=" + z + ")";
        }
    }

    /* compiled from: EmailForChecksPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/emailforchecks/a$b;", "Lru/dodopizza/app/presentation/checkout/emailforchecks/a;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class b extends a {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    private a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
