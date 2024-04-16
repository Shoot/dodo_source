package ru.dodopizza.app.presentation.phonenumberlogin;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: PhoneNumberRequest.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lru/dodopizza/app/presentation/phonenumberlogin/e;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lru/dodopizza/app/presentation/phonenumberlogin/e$a;", "a", "Lru/dodopizza/app/presentation/phonenumberlogin/e$a;", "()Lru/dodopizza/app/presentation/phonenumberlogin/e$a;", "requestContext", "<init>", "(Lru/dodopizza/app/presentation/phonenumberlogin/e$a;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class e implements Serializable {
    private final a a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PhoneNumberRequest.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/dodopizza/app/presentation/phonenumberlogin/e$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "f", "g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        public static final a a = new a("PROFILE", 0);
        public static final a b = new a("SHOPPING_CART", 1);
        public static final a c = new a("CATCH_ADDRESS", 2);
        public static final a d = new a("PROMOCODE", 3);
        public static final a e = new a("CONTACTS", 4);
        public static final a f = new a("CHANGE_ORDER_TYPE", 5);
        public static final a g = new a("NATIVE_CHAT", 6);
        private static final /* synthetic */ a[] h;
        private static final /* synthetic */ kj3 i;

        static {
            a[] a2 = a();
            h = a2;
            i = lj3.a(a2);
        }

        private a(String str, int i2) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e, f, g};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) h.clone();
        }
    }

    public e(a aVar) {
        z65.h(aVar, "requestContext");
        this.a = aVar;
    }

    public final a a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && this.a == ((e) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        a aVar = this.a;
        return "PhoneNumberRequest(requestContext=" + aVar + ")";
    }
}
