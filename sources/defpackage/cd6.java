package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: MenuAnalytics.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\u0007"}, d2 = {"Lcd6;", "", "Ldc;", "a", "b", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cd6  reason: default package */
/* loaded from: classes4.dex */
public final class cd6 {
    public static final cd6 a = new cd6();

    /* compiled from: MenuAnalytics.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0003B'\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcd6$a;", "Ldc;", "Lqc;", "a", "", "Ljava/lang/String;", "getCategory", "()Ljava/lang/String;", "category", "", "b", "I", "getPosition", "()I", "position", "Lcd6$a$a;", c.a, "Lcd6$a$a;", "getAction", "()Lcd6$a$a;", "action", "Lqd;", DateTokenConverter.CONVERTER_KEY, "Lqd;", "getSender", "()Lqd;", "sender", "<init>", "(Ljava/lang/String;ILcd6$a$a;Lqd;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: cd6$a */
    /* loaded from: classes4.dex */
    public static final class a implements dc {
        private final String a;
        private final int b;
        private final EnumC0083a c;
        private final qd d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MenuAnalytics.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcd6$a$a;", "", "", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "analyticsName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, "base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: cd6$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class EnumC0083a {
            public static final EnumC0083a b = new EnumC0083a("CLICK", 0, "click");
            public static final EnumC0083a c = new EnumC0083a("SCROLL", 1, "scroll");
            private static final /* synthetic */ EnumC0083a[] d;
            private static final /* synthetic */ kj3 e;
            private final String a;

            static {
                EnumC0083a[] a = a();
                d = a;
                e = lj3.a(a);
            }

            private EnumC0083a(String str, int i, String str2) {
                this.a = str2;
            }

            private static final /* synthetic */ EnumC0083a[] a() {
                return new EnumC0083a[]{b, c};
            }

            public static EnumC0083a valueOf(String str) {
                return (EnumC0083a) Enum.valueOf(EnumC0083a.class, str);
            }

            public static EnumC0083a[] values() {
                return (EnumC0083a[]) d.clone();
            }

            public final String i() {
                return this.a;
            }
        }

        public a(String str, int i, EnumC0083a enumC0083a, qd qdVar) {
            z65.h(str, "category");
            z65.h(enumC0083a, "action");
            z65.h(qdVar, "sender");
            this.a = str;
            this.b = i;
            this.c = enumC0083a;
            this.d = qdVar;
        }

        @Override // defpackage.dc
        public qc a() {
            return vc.z(bc.e(bc.e(bc.e(new bc("open_category"), "menu_category", this.a, false, 4, null), "position", Integer.valueOf(this.b), false, 4, null), "action", this.c.i(), false, 4, null), this.d).a();
        }
    }

    /* compiled from: MenuAnalytics.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0003B/\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcd6$b;", "Ldc;", "Lqc;", "a", "", "Ljava/lang/String;", "getCategory", "()Ljava/lang/String;", "category", "b", "getSubCategory", "subCategory", "", c.a, "I", "getSubcategoryPosition", "()I", "subcategoryPosition", "Lcd6$b$a;", DateTokenConverter.CONVERTER_KEY, "Lcd6$b$a;", "getAction", "()Lcd6$b$a;", "action", "Lqd;", e.a, "Lqd;", "getSender", "()Lqd;", "sender", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcd6$b$a;Lqd;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: cd6$b */
    /* loaded from: classes4.dex */
    public static final class b implements dc {
        private final String a;
        private final String b;
        private final int c;
        private final a d;
        private final qd e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MenuAnalytics.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcd6$b$a;", "", "", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "analyticsName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, "base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: cd6$b$a */
        /* loaded from: classes4.dex */
        public static final class a {
            public static final a b = new a("CLICK", 0, "click");
            public static final a c = new a("SCROLL", 1, "scroll");
            private static final /* synthetic */ a[] d;
            private static final /* synthetic */ kj3 e;
            private final String a;

            static {
                a[] a = a();
                d = a;
                e = lj3.a(a);
            }

            private a(String str, int i, String str2) {
                this.a = str2;
            }

            private static final /* synthetic */ a[] a() {
                return new a[]{b, c};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) d.clone();
            }

            public final String i() {
                return this.a;
            }
        }

        public b(String str, String str2, int i, a aVar, qd qdVar) {
            z65.h(str, "category");
            z65.h(str2, "subCategory");
            z65.h(aVar, "action");
            z65.h(qdVar, "sender");
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = aVar;
            this.e = qdVar;
        }

        @Override // defpackage.dc
        public qc a() {
            return vc.z(bc.e(bc.e(bc.e(bc.e(new bc("menu_subcategory"), "menu_category", this.a, false, 4, null), "name_subcategory", this.b, false, 4, null), "position", Integer.valueOf(this.c), false, 4, null), "action_to_category", this.d.i(), false, 4, null), this.e).a();
        }
    }

    private cd6() {
    }

    public final dc a() {
        return ec.b("menu_v5_loaded", null, 2, null);
    }

    public final dc b() {
        return ec.b("menu_v5_rollback", null, 2, null);
    }
}
