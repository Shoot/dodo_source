package com.dodopizza.order.feature.selectionmap.presentation;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SelectPizzeriaVO.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/c;", "Ljava/io/Serializable;", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, "Lcom/dodopizza/order/feature/selectionmap/presentation/c$a;", "Lcom/dodopizza/order/feature/selectionmap/presentation/c$b;", "Lcom/dodopizza/order/feature/selectionmap/presentation/c$c;", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class c implements Serializable {

    /* compiled from: SelectPizzeriaVO.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003¨\u0006\f"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/c$a;", "Lcom/dodopizza/order/feature/selectionmap/presentation/c;", "", "toString", "", "hashCode", "", "other", "", "equals", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a extends c {
        public static final a a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return true;
        }

        public int hashCode() {
            return -633073401;
        }

        public String toString() {
            return "LoadFailed";
        }
    }

    /* compiled from: SelectPizzeriaVO.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003¨\u0006\f"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/c$b;", "Lcom/dodopizza/order/feature/selectionmap/presentation/c;", "", "toString", "", "hashCode", "", "other", "", "equals", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class b extends c {
        public static final b a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return true;
        }

        public int hashCode() {
            return -2092902536;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* compiled from: SelectPizzeriaVO.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\n\u0012\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/c$c;", "Lcom/dodopizza/order/feature/selectionmap/presentation/c;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "Lb68;", "a", "Ljava/util/List;", "()Ljava/util/List;", "pizzerias", "Ls88;", "b", "pizzeriasFilters", com.huawei.hms.opendevice.c.a, "Z", "isShortNameEnabled", "()Z", "<init>", "(Ljava/util/List;Ljava/util/List;Z)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.order.feature.selectionmap.presentation.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0203c extends c {
        private final List<b68> a;
        private final List<s88> b;
        private final boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0203c(List<b68> list, List<s88> list2, boolean z) {
            super(null);
            z65.h(list, "pizzerias");
            z65.h(list2, "pizzeriasFilters");
            this.a = list;
            this.b = list2;
            this.c = z;
        }

        public final List<b68> a() {
            return this.a;
        }

        public final List<s88> b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0203c)) {
                return false;
            }
            C0203c c0203c = (C0203c) obj;
            if (z65.c(this.a, c0203c.a) && z65.c(this.b, c0203c.b) && this.c == c0203c.c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a91.a(this.c);
        }

        public String toString() {
            List<b68> list = this.a;
            List<s88> list2 = this.b;
            boolean z = this.c;
            return "Pizzerias(pizzerias=" + list + ", pizzeriasFilters=" + list2 + ", isShortNameEnabled=" + z + ")";
        }
    }

    private c() {
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
