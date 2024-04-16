package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: SelectPizzeriaAnalytics.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\r\u000eB\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u0002J\u0006\u0010\u0013\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014J)\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lc7a;", "", "Ldc;", "a", "i", "", "searchQuery", "resultCount", Image.TYPE_HIGH, "l", Image.TYPE_MEDIUM, "Lc7a$a;", KustoStorage.KustoTable.COLUMN_SOURCE, "b", com.huawei.hms.opendevice.c.a, "Lc7a$b;", "listDisplayingType", "g", "f", DateTokenConverter.CONVERTER_KEY, "Ld88;", "pizzeria", com.huawei.hms.push.e.a, "Lc7a$c;", "showPizzeriaSource", "", "position", "j", "(Ld88;Lc7a$c;Ljava/lang/Integer;)Ldc;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: c7a */
/* loaded from: classes4.dex */
public final class c7a {
    public static final c7a a = new c7a();

    /* compiled from: SelectPizzeriaAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lc7a$a;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: c7a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static final a b = new a("DEFAULT", 0, "default");
        public static final a c = new a("FIND_NEAREST", 1, "find_nearest");
        public static final a d = new a("FIND_ME", 2, "find_me");
        private static final /* synthetic */ a[] e;
        private static final /* synthetic */ kj3 f;
        private final String a;

        static {
            a[] a = a();
            e = a;
            f = lj3.a(a);
        }

        private a(String str, int i, String str2) {
            super(str, i);
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

    /* compiled from: SelectPizzeriaAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lc7a$b;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", com.huawei.hms.opendevice.c.a, "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: c7a$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public static final b b = new b("DEFAULT", 0, "default");
        public static final b c = new b("FULL", 1, "full");
        private static final /* synthetic */ b[] d;
        private static final /* synthetic */ kj3 e;
        private final String a;

        static {
            b[] a = a();
            d = a;
            e = lj3.a(a);
        }

        private b(String str, int i, String str2) {
            super(str, i);
            this.a = str2;
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{b, c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }

        public final String getValue() {
            return this.a;
        }
    }

    /* compiled from: SelectPizzeriaAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lc7a$c;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: c7a$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public static final c b = new c("CLICK_ON_MAP", 0, "click_on_map");
        public static final c c = new c("CLICK_ON_LIST", 1, "click_on_list");
        public static final c d = new c("NEAREST", 2, "nearest");
        private static final /* synthetic */ c[] e;
        private static final /* synthetic */ kj3 f;
        private final String a;

        static {
            c[] a = a();
            e = a;
            f = lj3.a(a);
        }

        private c(String str, int i, String str2) {
            super(str, i);
            this.a = str2;
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{b, c, d};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) e.clone();
        }

        public final String getValue() {
            return this.a;
        }
    }

    /* compiled from: SelectPizzeriaAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: c7a$d */
    /* loaded from: classes4.dex */
    public static final class d extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ a a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(1);
            this.a = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return vc.A(bcVar, this.a.getValue());
        }
    }

    /* compiled from: SelectPizzeriaAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: c7a$e */
    /* loaded from: classes4.dex */
    public static final class e extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ d88 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(d88 d88Var) {
            super(1);
            this.a = d88Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return vc.x(bcVar, this.a);
        }
    }

    /* compiled from: SelectPizzeriaAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: c7a$f */
    /* loaded from: classes4.dex */
    public static final class f extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(1);
            this.a = bVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return bc.e(bcVar, "position", this.a.getValue(), false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectPizzeriaAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: c7a$g */
    /* loaded from: classes4.dex */
    public static final class g extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, String str2) {
            super(1);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, "search_query", this.a, false, 4, null);
            return bc.e(bcVar, "results_count", this.b, false, 4, null);
        }
    }

    /* compiled from: SelectPizzeriaAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: c7a$h */
    /* loaded from: classes4.dex */
    public static final class h extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ d88 a;
        final /* synthetic */ c b;
        final /* synthetic */ Integer c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(d88 d88Var, c cVar, Integer num) {
            super(1);
            this.a = d88Var;
            this.b = cVar;
            this.c = num;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.x(bcVar, this.a);
            vc.A(bcVar, this.b.getValue());
            return bc.e(bcVar, "position", this.c, false, 4, null);
        }
    }

    /* compiled from: SelectPizzeriaAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: c7a$i */
    /* loaded from: classes4.dex */
    public static final class i extends ej5 implements Function1<bc, bc> {
        public static final i a = new i();

        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return bc.e(bcVar, "action", "zoom_in", false, 4, null);
        }
    }

    /* compiled from: SelectPizzeriaAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: c7a$j */
    /* loaded from: classes4.dex */
    public static final class j extends ej5 implements Function1<bc, bc> {
        public static final j a = new j();

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return bc.e(bcVar, "action", "zoom_out", false, 4, null);
        }
    }

    private c7a() {
    }

    public static /* synthetic */ dc k(c7a c7aVar, d88 d88Var, c cVar, Integer num, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        return c7aVar.j(d88Var, cVar, num);
    }

    public final dc a() {
        return ec.b("find_nearest_restaurant_click", null, 2, null);
    }

    public final dc b(a aVar) {
        z65.h(aVar, KustoStorage.KustoTable.COLUMN_SOURCE);
        return ec.a("geo_permission", new d(aVar));
    }

    public final dc c() {
        return ec.b("geo_permission_result", null, 2, null);
    }

    public final dc d() {
        return ec.b("restaurant_hide", null, 2, null);
    }

    public final dc e(d88 d88Var) {
        z65.h(d88Var, "pizzeria");
        return ec.a("restaurant_phone_click", new e(d88Var));
    }

    public final dc f() {
        return ec.b("restaurants_list_hide_try", null, 2, null);
    }

    public final dc g(b bVar) {
        z65.h(bVar, "listDisplayingType");
        return ec.a("restaurants_list_position_change", new f(bVar));
    }

    public final dc h(String str, String str2) {
        z65.h(str, "searchQuery");
        z65.h(str2, "resultCount");
        return ec.a("restaurant_address_search_result", new g(str, str2));
    }

    public final dc i() {
        return ec.b("restaurant_address_input_start", null, 2, null);
    }

    public final dc j(d88 d88Var, c cVar, Integer num) {
        z65.h(d88Var, "pizzeria");
        z65.h(cVar, "showPizzeriaSource");
        return ec.a("show_pizzeria", new h(d88Var, cVar, num));
    }

    public final dc l() {
        return ec.a("zoom_map", i.a);
    }

    public final dc m() {
        return ec.a("zoom_map", j.a);
    }
}
