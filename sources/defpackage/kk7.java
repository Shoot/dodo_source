package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CheckoutDetails.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lkk7;", "", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, "Lkk7$a;", "Lkk7$b;", "Lkk7$c;", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: kk7  reason: default package */
/* loaded from: classes4.dex */
public abstract class kk7 {

    /* compiled from: CheckoutDetails.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lkk7$a;", "Lkk7;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "pizzeriaId", "<init>", "(Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: kk7$a */
    /* loaded from: classes4.dex */
    public static final class a extends kk7 {
        private final String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            z65.h(str, "pizzeriaId");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }
    }

    /* compiled from: CheckoutDetails.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lkk7$b;", "Lkk7;", "<init>", "()V", "a", "b", "Lkk7$b$a;", "Lkk7$b$b;", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: kk7$b */
    /* loaded from: classes4.dex */
    public static abstract class b extends kk7 {

        /* compiled from: CheckoutDetails.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lkk7$b$a;", "Lkk7$b;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "addressId", "<init>", "(Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: kk7$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends b {
            private final String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(null);
                z65.h(str, "addressId");
                this.a = str;
            }

            public final String a() {
                return this.a;
            }
        }

        /* compiled from: CheckoutDetails.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lkk7$b$b;", "Lkk7$b;", "Le91;", "a", "Le91;", "()Le91;", "clientDeliveryLocation", "<init>", "(Le91;)V", "base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: kk7$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0408b extends b {
            private final e91 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0408b(e91 e91Var) {
                super(null);
                z65.h(e91Var, "clientDeliveryLocation");
                this.a = e91Var;
            }

            public final e91 a() {
                return this.a;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
            super(null);
        }
    }

    /* compiled from: CheckoutDetails.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lkk7$c;", "Lkk7;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "pizzeriaId", "<init>", "(Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: kk7$c */
    /* loaded from: classes4.dex */
    public static final class c extends kk7 {
        private final String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            z65.h(str, "pizzeriaId");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }
    }

    private kk7() {
    }

    public /* synthetic */ kk7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
