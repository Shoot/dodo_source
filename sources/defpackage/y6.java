package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: AddressAnalytics.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\n\u0005B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J&\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bJ\u0016\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fJ\u001e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fJ\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¨\u0006\u0019"}, d2 = {"Ly6;", "", "Lqd;", "sender", "Ldc;", "b", "", "isNewAddressSystem", "f", com.huawei.hms.push.e.a, "a", "Le91;", "newClientLocation", "oldClientLocation", com.huawei.hms.opendevice.c.a, "", "addressListSize", Image.TYPE_HIGH, "selectedAddressIndex", DateTokenConverter.CONVERTER_KEY, "Ly6$b;", "approved", "g", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: y6  reason: default package */
/* loaded from: classes4.dex */
public final class y6 {
    public static final y6 a = new y6();

    /* compiled from: AddressAnalytics.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\u0010"}, d2 = {"Ly6$a;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "address", "<init>", "(Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: y6$a */
    /* loaded from: classes4.dex */
    public static final class a implements dc {
        private final String a;

        public a(String str) {
            z65.h(str, "address");
            this.a = str;
        }

        @Override // defpackage.dc
        public qc a() {
            return new bc("catch_address").d("address", this.a, true).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && z65.c(this.a, ((a) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            String str = this.a;
            return "CatchAddressEvent(address=" + str + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AddressAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Ly6$b;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", com.huawei.hms.opendevice.c.a, "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: y6$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public static final b b = new b("YES", 0, "yes");
        public static final b c = new b("NO", 1, "no");
        private static final /* synthetic */ b[] d;
        private static final /* synthetic */ kj3 e;
        private final String a;

        static {
            b[] a = a();
            d = a;
            e = lj3.a(a);
        }

        private b(String str, int i, String str2) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddressAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y6$c */
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ qd a;
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(qd qdVar, boolean z) {
            super(1);
            this.a = qdVar;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.z(bcVar, this.a);
            return vc.h(bcVar, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddressAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y6$d */
    /* loaded from: classes4.dex */
    public static final class d extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ qd a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(qd qdVar) {
            super(1);
            this.a = qdVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return vc.z(bcVar, this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddressAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y6$e */
    /* loaded from: classes4.dex */
    public static final class e extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ e91 a;
        final /* synthetic */ e91 b;
        final /* synthetic */ qd c;
        final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(e91 e91Var, e91 e91Var2, qd qdVar, boolean z) {
            super(1);
            this.a = e91Var;
            this.b = e91Var2;
            this.c = qdVar;
            this.d = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            List I0;
            z65.h(bcVar, "$this$eventProducer");
            jx2 c = this.a.c();
            jx2 c2 = this.b.c();
            Map<String, String> c3 = c.c();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : c3.entrySet()) {
                if (!z65.c(entry.getValue(), c2.c().get(entry.getKey()))) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                arrayList.add((String) entry2.getKey());
            }
            I0 = sc1.I0(arrayList);
            if (!z65.c(c.f(), c2.f())) {
                I0.add("formatted address");
            }
            vc.z(bcVar, this.c);
            vc.h(bcVar, this.d);
            return bc.e(bcVar, "edited fields", I0, false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddressAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y6$f */
    /* loaded from: classes4.dex */
    public static final class f extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ qd a;
        final /* synthetic */ int b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(qd qdVar, int i, int i2) {
            super(1);
            this.a = qdVar;
            this.b = i;
            this.c = i2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.z(bcVar, this.a);
            bc.e(bcVar, "address_list_size", Integer.valueOf(this.b), false, 4, null);
            return bc.e(bcVar, "selected_address", Integer.valueOf(this.c + 1), false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddressAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y6$g */
    /* loaded from: classes4.dex */
    public static final class g extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ qd a;
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(qd qdVar, boolean z) {
            super(1);
            this.a = qdVar;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.z(bcVar, this.a);
            return vc.h(bcVar, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddressAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y6$h */
    /* loaded from: classes4.dex */
    public static final class h extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ qd a;
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(qd qdVar, boolean z) {
            super(1);
            this.a = qdVar;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.z(bcVar, this.a);
            return vc.h(bcVar, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddressAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y6$i */
    /* loaded from: classes4.dex */
    public static final class i extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(1);
            this.a = bVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return bc.e(bcVar, "approved", this.a.getValue(), false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddressAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y6$j */
    /* loaded from: classes4.dex */
    public static final class j extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ qd a;
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(qd qdVar, int i) {
            super(1);
            this.a = qdVar;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.z(bcVar, this.a);
            return bc.e(bcVar, "address_list_size", Integer.valueOf(this.b), false, 4, null);
        }
    }

    private y6() {
    }

    public final dc a(qd qdVar, boolean z) {
        z65.h(qdVar, "sender");
        return ec.a("address_add_new_click", new c(qdVar, z));
    }

    public final dc b(qd qdVar) {
        z65.h(qdVar, "sender");
        return ec.a("address_delete_click", new d(qdVar));
    }

    public final dc c(qd qdVar, boolean z, e91 e91Var, e91 e91Var2) {
        z65.h(qdVar, "sender");
        z65.h(e91Var, "newClientLocation");
        z65.h(e91Var2, "oldClientLocation");
        return ec.a("edited_address_save_click", new e(e91Var, e91Var2, qdVar, z));
    }

    public final dc d(qd qdVar, int i2, int i3) {
        z65.h(qdVar, "sender");
        return ec.a("screen_address_list_click", new f(qdVar, i2, i3));
    }

    public final dc e(qd qdVar, boolean z) {
        z65.h(qdVar, "sender");
        return ec.a("address_save_click", new g(qdVar, z));
    }

    public final dc f(qd qdVar, boolean z) {
        z65.h(qdVar, "sender");
        return ec.a("address_change_click", new h(qdVar, z));
    }

    public final dc g(b bVar) {
        z65.h(bVar, "approved");
        return ec.a("clear_cart_notification", new i(bVar));
    }

    public final dc h(qd qdVar, int i2) {
        z65.h(qdVar, "sender");
        return ec.a("screen_address_list", new j(qdVar, i2));
    }
}
