package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.e;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CheckoutState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lsx6;", "Ljava/io/Serializable;", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, "Lsx6$b;", "Lsx6$c;", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: sx6  reason: default package */
/* loaded from: classes4.dex */
public abstract class sx6 implements Serializable {

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lsx6$a;", "Ljava/io/Serializable;", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "Lsx6$a$a;", "Lsx6$a$b;", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: sx6$a */
    /* loaded from: classes4.dex */
    public static abstract class a implements Serializable {

        /* compiled from: CheckoutState.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsx6$a$a;", "Lsx6$a;", "Ljava/io/Serializable;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: sx6$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0671a extends a implements Serializable {
            public static final C0671a a = new C0671a();

            private C0671a() {
                super(null);
            }
        }

        /* compiled from: CheckoutState.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\b\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lsx6$a$b;", "Lsx6$a;", "Ljava/io/Serializable;", "", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", CrashHianalyticsData.TIME, "", "g", "()Z", "isSelected", "b", "isLoading", "<init>", "(Ljava/lang/Long;)V", "Lsx6$a$c;", "Lsx6$a$d;", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: sx6$a$b */
        /* loaded from: classes4.dex */
        public static abstract class b extends a implements Serializable {
            private final Long a;

            public /* synthetic */ b(Long l, DefaultConstructorMarker defaultConstructorMarker) {
                this(l);
            }

            public final Long a() {
                return this.a;
            }

            public abstract boolean b();

            public abstract boolean g();

            private b(Long l) {
                super(null);
                this.a = l;
            }
        }

        /* compiled from: CheckoutState.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\t\u0010\n\u001a\u00020\u0003HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0010\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\b\u0010\u0016¨\u0006\u001a"}, d2 = {"Lsx6$a$c;", "Lsx6$a$b;", "Ljava/io/Serializable;", "", "title", "", "isSelected", "isLoading", "isSuggested", com.huawei.hms.opendevice.c.a, "toString", "", "hashCode", "", "other", "equals", "b", "Ljava/lang/String;", e.a, "()Ljava/lang/String;", "Z", "g", "()Z", DateTokenConverter.CONVERTER_KEY, "<init>", "(Ljava/lang/String;ZZZ)V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: sx6$a$c */
        /* loaded from: classes4.dex */
        public static final class c extends b implements Serializable {
            private final String b;
            private final boolean c;
            private final boolean d;
            private final boolean e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z, boolean z2, boolean z3) {
                super(null, null);
                z65.h(str, "title");
                this.b = str;
                this.c = z;
                this.d = z2;
                this.e = z3;
            }

            public static /* synthetic */ c d(c cVar, String str, boolean z, boolean z2, boolean z3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = cVar.b;
                }
                if ((i & 2) != 0) {
                    z = cVar.c;
                }
                if ((i & 4) != 0) {
                    z2 = cVar.d;
                }
                if ((i & 8) != 0) {
                    z3 = cVar.e;
                }
                return cVar.c(str, z, z2, z3);
            }

            @Override // defpackage.sx6.a.b
            public boolean b() {
                return this.d;
            }

            public final c c(String str, boolean z, boolean z2, boolean z3) {
                z65.h(str, "title");
                return new c(str, z, z2, z3);
            }

            public String e() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                if (z65.c(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e) {
                    return true;
                }
                return false;
            }

            @Override // defpackage.sx6.a.b
            public boolean g() {
                return this.c;
            }

            public int hashCode() {
                return (((((this.b.hashCode() * 31) + a91.a(this.c)) * 31) + a91.a(this.d)) * 31) + a91.a(this.e);
            }

            public String toString() {
                String str = this.b;
                boolean z = this.c;
                boolean z2 = this.d;
                boolean z3 = this.e;
                return "FasterTimeVO(title=" + str + ", isSelected=" + z + ", isLoading=" + z2 + ", isSuggested=" + z3 + ")";
            }
        }

        /* compiled from: CheckoutState.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 JD\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u0013\u0010\u001dR\u001a\u0010\n\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006!"}, d2 = {"Lsx6$a$d;", "Lsx6$a$b;", "Ljava/io/Serializable;", "", "fromTime", "", "title", "", "isSelected", "isLoading", "isSuggested", com.huawei.hms.opendevice.c.a, "(Ljava/lang/Long;Ljava/lang/String;ZZZ)Lsx6$a$d;", "toString", "", "hashCode", "", "other", "equals", "b", "Ljava/lang/Long;", e.a, "()Ljava/lang/Long;", "Ljava/lang/String;", "f", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "Z", "g", "()Z", "i", "<init>", "(Ljava/lang/Long;Ljava/lang/String;ZZZ)V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: sx6$a$d */
        /* loaded from: classes4.dex */
        public static final class d extends b implements Serializable {
            private final Long b;
            private final String c;
            private final boolean d;
            private final boolean e;
            private final boolean f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Long l, String str, boolean z, boolean z2, boolean z3) {
                super(l, null);
                z65.h(str, "title");
                this.b = l;
                this.c = str;
                this.d = z;
                this.e = z2;
                this.f = z3;
            }

            public static /* synthetic */ d d(d dVar, Long l, String str, boolean z, boolean z2, boolean z3, int i, Object obj) {
                if ((i & 1) != 0) {
                    l = dVar.b;
                }
                if ((i & 2) != 0) {
                    str = dVar.c;
                }
                String str2 = str;
                if ((i & 4) != 0) {
                    z = dVar.d;
                }
                boolean z4 = z;
                if ((i & 8) != 0) {
                    z2 = dVar.e;
                }
                boolean z5 = z2;
                if ((i & 16) != 0) {
                    z3 = dVar.f;
                }
                return dVar.c(l, str2, z4, z5, z3);
            }

            @Override // defpackage.sx6.a.b
            public boolean b() {
                return this.e;
            }

            public final d c(Long l, String str, boolean z, boolean z2, boolean z3) {
                z65.h(str, "title");
                return new d(l, str, z, z2, z3);
            }

            public final Long e() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                if (z65.c(this.b, dVar.b) && z65.c(this.c, dVar.c) && this.d == dVar.d && this.e == dVar.e && this.f == dVar.f) {
                    return true;
                }
                return false;
            }

            public String f() {
                return this.c;
            }

            @Override // defpackage.sx6.a.b
            public boolean g() {
                return this.d;
            }

            public int hashCode() {
                int hashCode;
                Long l = this.b;
                if (l == null) {
                    hashCode = 0;
                } else {
                    hashCode = l.hashCode();
                }
                return (((((((hashCode * 31) + this.c.hashCode()) * 31) + a91.a(this.d)) * 31) + a91.a(this.e)) * 31) + a91.a(this.f);
            }

            public boolean i() {
                return this.f;
            }

            public String toString() {
                Long l = this.b;
                String str = this.c;
                boolean z = this.d;
                boolean z2 = this.e;
                boolean z3 = this.f;
                return "TimeVO(fromTime=" + l + ", title=" + str + ", isSelected=" + z + ", isLoading=" + z2 + ", isSuggested=" + z3 + ")";
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u000bB\u0017\b\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lsx6$b;", "Lsx6;", "Ljava/io/Serializable;", "", "Lsx6$a;", "a", "Ljava/util/List;", "()Ljava/util/List;", "times", "<init>", "(Ljava/util/List;)V", "b", "Lsx6$b$a;", "Lsx6$b$b;", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: sx6$b */
    /* loaded from: classes4.dex */
    public static abstract class b extends sx6 implements Serializable {
        private final List<a> a;

        /* compiled from: CheckoutState.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\r"}, d2 = {"Lsx6$b$a;", "Lsx6$b;", "Ljava/io/Serializable;", "Ld41;", "b", "Ld41;", "()Ld41;", "error", "", "Lsx6$a;", "times", "<init>", "(Ljava/util/List;Ld41;)V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: sx6$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends b implements Serializable {
            private final d41 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<? extends a> list, d41 d41Var) {
                super(list, null);
                z65.h(list, "times");
                z65.h(d41Var, "error");
                this.b = d41Var;
            }

            public final d41 b() {
                return this.b;
            }
        }

        /* compiled from: CheckoutState.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsx6$b$b;", "Lsx6$b;", "Ljava/io/Serializable;", "", "Lsx6$a;", "times", "<init>", "(Ljava/util/List;)V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: sx6$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0672b extends b implements Serializable {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0672b(List<? extends a> list) {
                super(list, null);
                z65.h(list, "times");
            }
        }

        public /* synthetic */ b(List list, DefaultConstructorMarker defaultConstructorMarker) {
            this(list);
        }

        public final List<a> a() {
            return this.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private b(List<? extends a> list) {
            super(null);
            this.a = list;
        }
    }

    /* compiled from: CheckoutState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsx6$c;", "Lsx6;", "Ljava/io/Serializable;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: sx6$c */
    /* loaded from: classes4.dex */
    public static final class c extends sx6 implements Serializable {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    private sx6() {
    }

    public /* synthetic */ sx6(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
