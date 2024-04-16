package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderTypeAnalytics.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\u000b\u0017\u0018\u000f\u0005\u0014\u0013\t\u0019\u001a\u001b\u001cB\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¨\u0006\u001d"}, d2 = {"Llk7;", "", "Llk7$d;", "pizzeriaSource", "", DateTokenConverter.CONVERTER_KEY, "Lbc;", "Llk7$j;", "result", "g", "Ld88;", "pizzeria", "", "isNearest", "Ldc;", com.huawei.hms.opendevice.c.a, "(Ld88;Llk7$d;Ljava/lang/Boolean;)Ldc;", "Lqd;", "sender", "f", com.huawei.hms.push.e.a, "<init>", "()V", "a", "b", Image.TYPE_HIGH, "i", "j", "k", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lk7  reason: default package */
/* loaded from: classes4.dex */
public final class lk7 {
    public static final lk7 a = new lk7();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OrderTypeAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Llk7$a;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lk7$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static final a b = new a("NEW", 0, "new");
        public static final a c = new a("SAVED", 1, "saved");
        public static final a d = new a("PREDEFINED", 2, "predefined");
        private static final /* synthetic */ a[] e;
        private static final /* synthetic */ kj3 f;
        private final String a;

        static {
            a[] a = a();
            e = a;
            f = lj3.a(a);
        }

        private a(String str, int i, String str2) {
            this.a = str2;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{b, c, d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }

        public final String getValue() {
            return this.a;
        }
    }

    /* compiled from: OrderTypeAnalytics.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Llk7$b;", "Ldc;", "Lqc;", "a", "Ld88;", "Ld88;", "pizzeria", "", "b", "Z", "isPreOrder", "", com.huawei.hms.opendevice.c.a, "Ljava/lang/String;", "preOrderTime", DateTokenConverter.CONVERTER_KEY, "panicMode", "Llk7$c;", com.huawei.hms.push.e.a, "Llk7$c;", "result", "", "f", "I", "estimatedTime", "<init>", "(Ld88;ZLjava/lang/String;ZLlk7$c;I)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lk7$b */
    /* loaded from: classes4.dex */
    public static final class b implements dc {
        private final d88 a;
        private final boolean b;
        private final String c;
        private final boolean d;
        private final c e;
        private final int f;

        public b(d88 d88Var, boolean z, String str, boolean z2, c cVar, int i) {
            z65.h(cVar, "result");
            this.a = d88Var;
            this.b = z;
            this.c = str;
            this.d = z2;
            this.e = cVar;
            this.f = i;
        }

        @Override // defpackage.dc
        public qc a() {
            return bc.e(bc.e(bc.e(bc.e(bc.e(vc.w(new bc("change_delivery_time"), this.a), "preorder", Boolean.valueOf(this.b), false, 4, null), "preorderTime", this.c, false, 4, null), "panicmode", Boolean.valueOf(this.d), false, 4, null), "result", this.e.a(), false, 4, null), "estimatedTime", Integer.valueOf(this.f), false, 4, null).a();
        }
    }

    /* compiled from: OrderTypeAnalytics.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\tB\u0011\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Llk7$c;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;)V", "b", "Llk7$c$a;", "Llk7$c$b;", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lk7$c */
    /* loaded from: classes4.dex */
    public static abstract class c {
        private final String a;

        /* compiled from: OrderTypeAnalytics.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llk7$c$a;", "Llk7$c;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: lk7$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends c {
            public static final a b = new a();

            private a() {
                super("failure", null);
            }
        }

        /* compiled from: OrderTypeAnalytics.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llk7$c$b;", "Llk7$c;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: lk7$c$b */
        /* loaded from: classes4.dex */
        public static final class b extends c {
            public static final b b = new b();

            private b() {
                super("success", null);
            }
        }

        public /* synthetic */ c(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public final String a() {
            return this.a;
        }

        private c(String str) {
            this.a = str;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OrderTypeAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Llk7$d;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lk7$d */
    /* loaded from: classes4.dex */
    public static final class d {
        public static final d b = new d("MAP", 0, "map");
        public static final d c = new d("LIST", 1, StatisticManager.LIST);
        public static final d d = new d("PREDEFINED", 2, "predefined");
        public static final d e = new d("GEO", 3, "null");
        private static final /* synthetic */ d[] f;
        private static final /* synthetic */ kj3 g;
        private final String a;

        static {
            d[] a = a();
            f = a;
            g = lj3.a(a);
        }

        private d(String str, int i, String str2) {
            this.a = str2;
        }

        private static final /* synthetic */ d[] a() {
            return new d[]{b, c, d, e};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f.clone();
        }

        public final String getValue() {
            return this.a;
        }
    }

    /* compiled from: OrderTypeAnalytics.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Llk7$e;", "Ldc;", "Lqc;", "a", "Ld88;", "Ld88;", "pizzeria", "Lqd;", "b", "Lqd;", "sender", "Llk7$d;", com.huawei.hms.opendevice.c.a, "Llk7$d;", "pizzeriaSource", "Llk7$j;", DateTokenConverter.CONVERTER_KEY, "Llk7$j;", "result", "<init>", "(Ld88;Lqd;Llk7$d;Llk7$j;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lk7$e */
    /* loaded from: classes4.dex */
    public static final class e implements dc {
        private final d88 a;
        private final qd b;
        private final d c;
        private final j d;

        public e(d88 d88Var, qd qdVar, d dVar, j jVar) {
            z65.h(d88Var, "pizzeria");
            z65.h(qdVar, "sender");
            z65.h(dVar, "pizzeriaSource");
            z65.h(jVar, "result");
            this.a = d88Var;
            this.b = qdVar;
            this.c = dVar;
            this.d = jVar;
        }

        @Override // defpackage.dc
        public qc a() {
            return lk7.a.g(bc.e(vc.w(bc.e(vc.z(new bc("change_delivery_type"), this.b), "deliveryType", "carryout", false, 4, null), this.a), "pizzeriaSource", this.c.getValue(), false, 4, null), this.d).a();
        }
    }

    /* compiled from: OrderTypeAnalytics.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Llk7$f;", "Ldc;", "Lqc;", "a", "Lqd;", "Lqd;", "sender", "Ld88;", "b", "Ld88;", "pizzeria", "Llk7$a;", com.huawei.hms.opendevice.c.a, "Llk7$a;", "addressSource", "Llk7$j;", DateTokenConverter.CONVERTER_KEY, "Llk7$j;", "result", "<init>", "(Lqd;Ld88;Llk7$a;Llk7$j;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lk7$f */
    /* loaded from: classes4.dex */
    public static final class f implements dc {
        private final qd a;
        private final d88 b;
        private final a c;
        private final j d;

        public f(qd qdVar, d88 d88Var, a aVar, j jVar) {
            z65.h(qdVar, "sender");
            z65.h(aVar, "addressSource");
            z65.h(jVar, "result");
            this.a = qdVar;
            this.b = d88Var;
            this.c = aVar;
            this.d = jVar;
        }

        @Override // defpackage.dc
        public qc a() {
            return lk7.a.g(bc.e(vc.w(bc.e(vc.z(new bc("change_delivery_type"), this.a), "deliveryType", "delivery", false, 4, null), this.b), "addressSource", this.c.getValue(), false, 4, null), this.d).a();
        }
    }

    /* compiled from: OrderTypeAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Llk7$g;", "Ldc;", "Lqc;", "a", "Lqd;", "Lqd;", "sender", "<init>", "(Lqd;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lk7$g */
    /* loaded from: classes4.dex */
    public static final class g implements dc {
        private final qd a;

        public g(qd qdVar) {
            z65.h(qdVar, "sender");
            this.a = qdVar;
        }

        @Override // defpackage.dc
        public qc a() {
            return bc.e(vc.z(new bc("change_delivery_type"), this.a), "deliveryType", "carryout", false, 4, null).a();
        }
    }

    /* compiled from: OrderTypeAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Llk7$h;", "Ldc;", "Lqc;", "a", "Lqd;", "Lqd;", "sender", "<init>", "(Lqd;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lk7$h */
    /* loaded from: classes4.dex */
    public static final class h implements dc {
        private final qd a;

        public h(qd qdVar) {
            z65.h(qdVar, "sender");
            this.a = qdVar;
        }

        @Override // defpackage.dc
        public qc a() {
            return bc.e(vc.z(new bc("change_delivery_type"), this.a), "deliveryType", "delivery", false, 4, null).a();
        }
    }

    /* compiled from: OrderTypeAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Llk7$i;", "Ldc;", "Lqc;", "a", "Lqd;", "Lqd;", "sender", "<init>", "(Lqd;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lk7$i */
    /* loaded from: classes4.dex */
    public static final class i implements dc {
        private final qd a;

        public i(qd qdVar) {
            z65.h(qdVar, "sender");
            this.a = qdVar;
        }

        @Override // defpackage.dc
        public qc a() {
            return bc.e(vc.z(new bc("change_delivery_type"), this.a), "deliveryType", "restaurant", false, 4, null).a();
        }
    }

    /* compiled from: OrderTypeAnalytics.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Llk7$j;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;)V", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "Llk7$j$a;", "Llk7$j$b;", "Llk7$j$c;", "Llk7$j$d;", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lk7$j */
    /* loaded from: classes4.dex */
    public static abstract class j {
        private final String a;

        /* compiled from: OrderTypeAnalytics.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llk7$j$a;", "Llk7$j;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: lk7$j$a */
        /* loaded from: classes4.dex */
        public static final class a extends j {
            public static final a b = new a();

            private a() {
                super("closed", null);
            }
        }

        /* compiled from: OrderTypeAnalytics.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Llk7$j$b;", "Llk7$j;", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "failureMessage", "<init>", "(Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: lk7$j$b */
        /* loaded from: classes4.dex */
        public static final class b extends j {
            private final String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super("failure", null);
                z65.h(str, "failureMessage");
                this.b = str;
            }

            public final String b() {
                return this.b;
            }
        }

        /* compiled from: OrderTypeAnalytics.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llk7$j$c;", "Llk7$j;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: lk7$j$c */
        /* loaded from: classes4.dex */
        public static final class c extends j {
            public static final c b = new c();

            private c() {
                super("outzone", null);
            }
        }

        /* compiled from: OrderTypeAnalytics.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llk7$j$d;", "Llk7$j;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: lk7$j$d */
        /* loaded from: classes4.dex */
        public static final class d extends j {
            public static final d b = new d();

            private d() {
                super("success", null);
            }
        }

        public /* synthetic */ j(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public final String a() {
            return this.a;
        }

        private j(String str) {
            this.a = str;
        }
    }

    /* compiled from: OrderTypeAnalytics.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Llk7$k;", "Ldc;", "Lqc;", "a", "Ld88;", "Ld88;", "pizzeria", "Lqd;", "b", "Lqd;", "sender", "Llk7$d;", com.huawei.hms.opendevice.c.a, "Llk7$d;", "pizzeriaSource", "Llk7$j;", DateTokenConverter.CONVERTER_KEY, "Llk7$j;", "result", "<init>", "(Ld88;Lqd;Llk7$d;Llk7$j;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lk7$k */
    /* loaded from: classes4.dex */
    public static final class k implements dc {
        private final d88 a;
        private final qd b;
        private final d c;
        private final j d;

        public k(d88 d88Var, qd qdVar, d dVar, j jVar) {
            z65.h(d88Var, "pizzeria");
            z65.h(qdVar, "sender");
            z65.h(dVar, "pizzeriaSource");
            z65.h(jVar, "result");
            this.a = d88Var;
            this.b = qdVar;
            this.c = dVar;
            this.d = jVar;
        }

        @Override // defpackage.dc
        public qc a() {
            return lk7.a.g(bc.e(vc.w(bc.e(vc.z(new bc("change_delivery_type"), this.b), "deliveryType", "restaurant", false, 4, null), this.a), "pizzeriaSource", this.c.getValue(), false, 4, null), this.d).a();
        }
    }

    /* compiled from: OrderTypeAnalytics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lk7$l */
    /* loaded from: classes4.dex */
    public /* synthetic */ class l {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: lk7$m */
    /* loaded from: classes4.dex */
    public static final class m extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ d88 a;
        final /* synthetic */ d b;
        final /* synthetic */ Boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(d88 d88Var, d dVar, Boolean bool) {
            super(1);
            this.a = d88Var;
            this.b = dVar;
            this.c = bool;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.x(bcVar, this.a);
            vc.A(bcVar, lk7.a.d(this.b));
            return bc.e(bcVar, "is_nearest", this.c, false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: lk7$n */
    /* loaded from: classes4.dex */
    public static final class n extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ qd a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(qd qdVar) {
            super(1);
            this.a = qdVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.z(bcVar, this.a);
            return bc.e(bcVar, "order_type", "delivery", false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderTypeAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: lk7$o */
    /* loaded from: classes4.dex */
    public static final class o extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ qd a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(qd qdVar) {
            super(1);
            this.a = qdVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.z(bcVar, this.a);
            return bc.e(bcVar, "order_type", "restaurant", false, 4, null);
        }
    }

    private lk7() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d(d dVar) {
        int i2 = l.$EnumSwitchMapping$0[dVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                if (i2 == 4) {
                    return "switcher";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "map";
        }
        return "suggestion";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bc g(bc bcVar, j jVar) {
        j.b bVar;
        bc e2 = bc.e(bcVar, "result", jVar.a(), false, 4, null);
        if (jVar instanceof j.b) {
            bVar = (j.b) jVar;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            bc.e(bcVar, "failureMessage", bVar.b(), false, 4, null);
        }
        return e2;
    }

    public final dc c(d88 d88Var, d dVar, Boolean bool) {
        z65.h(d88Var, "pizzeria");
        z65.h(dVar, "pizzeriaSource");
        return ec.a("change_restaurant", new m(d88Var, dVar, bool));
    }

    public final dc e(qd qdVar) {
        z65.h(qdVar, "sender");
        return ec.a("order_type_switcher_click", new n(qdVar));
    }

    public final dc f(qd qdVar) {
        z65.h(qdVar, "sender");
        return ec.a("order_type_switcher_click", new o(qdVar));
    }
}
