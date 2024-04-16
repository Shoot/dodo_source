package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CheckoutState.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000e\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lu31;", "Ljava/io/Serializable;", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "f", "g", Image.TYPE_HIGH, "i", "j", "k", "l", Image.TYPE_MEDIUM, "n", "Lu31$a;", "Lu31$b;", "Lu31$c;", "Lu31$d;", "Lu31$e;", "Lu31$f;", "Lu31$g;", "Lu31$h;", "Lu31$i;", "Lu31$j;", "Lu31$k;", "Lu31$l;", "Lu31$m;", "Lu31$n;", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: u31  reason: default package */
/* loaded from: classes4.dex */
public abstract class u31 implements Serializable {

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lu31$a;", "Lu31;", "Ljava/io/Serializable;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: u31$a */
    /* loaded from: classes4.dex */
    public static final class a extends u31 implements Serializable {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lu31$b;", "Lu31;", "Ljava/io/Serializable;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: u31$b */
    /* loaded from: classes4.dex */
    public static final class b extends u31 implements Serializable {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lu31$c;", "Lu31;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lpf0;", "a", "Lpf0;", "()Lpf0;", "brandName", "<init>", "(Lpf0;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: u31$c */
    /* loaded from: classes4.dex */
    public static final class c extends u31 implements Serializable {
        private final pf0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(pf0 pf0Var) {
            super(null);
            z65.h(pf0Var, "brandName");
            this.a = pf0Var;
        }

        public final pf0 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && this.a == ((c) obj).a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            pf0 pf0Var = this.a;
            return "App2App(brandName=" + pf0Var + ")";
        }
    }

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lu31$d;", "Lu31;", "Ljava/io/Serializable;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: u31$d */
    /* loaded from: classes4.dex */
    public static final class d extends u31 implements Serializable {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lu31$e;", "Lu31;", "Ljava/io/Serializable;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: u31$e */
    /* loaded from: classes4.dex */
    public static final class e extends u31 implements Serializable {
        public static final e a = new e();

        private e() {
            super(null);
        }
    }

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lu31$f;", "Lu31;", "Ljava/io/Serializable;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: u31$f */
    /* loaded from: classes4.dex */
    public static final class f extends u31 implements Serializable {
        public static final f a = new f();

        private f() {
            super(null);
        }
    }

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u0004\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000b¨\u0006\u0011"}, d2 = {"Lu31$g;", "Lu31;", "Ljava/io/Serializable;", "Lhn6;", "a", "Lhn6;", "b", "()Lhn6;", "moneyToAdd", "", "Z", "()Z", "containsGoods", com.huawei.hms.opendevice.c.a, "isGoodsIncludedIntoMinDeliveryPrice", "<init>", "(Lhn6;ZZ)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: u31$g */
    /* loaded from: classes4.dex */
    public static final class g extends u31 implements Serializable {
        private final hn6 a;
        private final boolean b;
        private final boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(hn6 hn6Var, boolean z, boolean z2) {
            super(null);
            z65.h(hn6Var, "moneyToAdd");
            this.a = hn6Var;
            this.b = z;
            this.c = z2;
        }

        public final boolean a() {
            return this.b;
        }

        public final hn6 b() {
            return this.a;
        }

        public final boolean c() {
            return this.c;
        }
    }

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lu31$h;", "Lu31;", "Ljava/io/Serializable;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: u31$h */
    /* loaded from: classes4.dex */
    public static final class h extends u31 implements Serializable {
        public static final h a = new h();

        private h() {
            super(null);
        }
    }

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lu31$i;", "Lu31;", "Ljava/io/Serializable;", "<init>", "()V", "a", "b", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: u31$i */
    /* loaded from: classes4.dex */
    public static abstract class i extends u31 implements Serializable {

        /* compiled from: CheckoutState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu31$i$a;", "Lu31$i;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: u31$i$a */
        /* loaded from: classes4.dex */
        public static final class a extends i {
            public static final a a = new a();

            private a() {
            }
        }

        /* compiled from: CheckoutState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu31$i$b;", "Lu31$i;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: u31$i$b */
        /* loaded from: classes4.dex */
        public static final class b extends i {
            public static final b a = new b();

            private b() {
            }
        }

        public i() {
            super(null);
        }
    }

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lu31$j;", "Lu31;", "Ljava/io/Serializable;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: u31$j */
    /* loaded from: classes4.dex */
    public static final class j extends u31 implements Serializable {
        public static final j a = new j();

        private j() {
            super(null);
        }
    }

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lu31$k;", "Lu31;", "Ljava/io/Serializable;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: u31$k */
    /* loaded from: classes4.dex */
    public static final class k extends u31 implements Serializable {
        public static final k a = new k();

        private k() {
            super(null);
        }
    }

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lu31$l;", "Lu31;", "Ljava/io/Serializable;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: u31$l */
    /* loaded from: classes4.dex */
    public static final class l extends u31 implements Serializable {
        public static final l a = new l();

        private l() {
            super(null);
        }
    }

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lu31$m;", "Lu31;", "Ljava/io/Serializable;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: u31$m */
    /* loaded from: classes4.dex */
    public static final class m extends u31 implements Serializable {
        public static final m a = new m();

        private m() {
            super(null);
        }
    }

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lu31$n;", "Lu31;", "Ljava/io/Serializable;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: u31$n */
    /* loaded from: classes4.dex */
    public static final class n extends u31 implements Serializable {
        public static final n a = new n();

        private n() {
            super(null);
        }
    }

    private u31() {
    }

    public /* synthetic */ u31(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
