package com.dodopizza.order.feature.selectionmap.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.LatLng;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SelectionMapEvent.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0010\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0010\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d;", "Lok3;", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "f", "g", Image.TYPE_HIGH, "i", "j", "k", "l", Image.TYPE_MEDIUM, "n", "o", "p", "Lcom/dodopizza/order/feature/selectionmap/presentation/d$a;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d$b;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d$c;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d$d;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d$e;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d$f;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d$g;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d$h;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d$i;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d$j;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d$k;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d$l;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d$m;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d$n;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d$o;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d$p;", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class d extends ok3 {

    /* compiled from: SelectionMapEvent.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$a;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d;", "", "toString", "", "hashCode", "", "other", "", "equals", "Ls88;", "a", "Ls88;", "()Ls88;", "pizzeriaFilterVO", "<init>", "(Ls88;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a extends d {
        private final s88 a;

        public a(s88 s88Var) {
            super(null);
            this.a = s88Var;
        }

        public final s88 a() {
            return this.a;
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
            s88 s88Var = this.a;
            if (s88Var == null) {
                return 0;
            }
            return s88Var.hashCode();
        }

        public String toString() {
            s88 s88Var = this.a;
            return "ChangePizzeriaFilterState(pizzeriaFilterVO=" + s88Var + ")";
        }
    }

    /* compiled from: SelectionMapEvent.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003¨\u0006\f"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$b;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d;", "", "toString", "", "hashCode", "", "other", "", "equals", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class b extends d {
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
            return -756610261;
        }

        public String toString() {
            return "ClosePizzeriaCard";
        }
    }

    /* compiled from: SelectionMapEvent.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003¨\u0006\f"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$c;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d;", "", "toString", "", "hashCode", "", "other", "", "equals", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class c extends d {
        public static final c a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return true;
        }

        public int hashCode() {
            return -1127614586;
        }

        public String toString() {
            return "LocationNotAvailable";
        }
    }

    /* compiled from: SelectionMapEvent.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003¨\u0006\f"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$d;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d;", "", "toString", "", "hashCode", "", "other", "", "equals", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.order.feature.selectionmap.presentation.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0204d extends d {
        public static final C0204d a = new C0204d();

        private C0204d() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0204d)) {
                return false;
            }
            C0204d c0204d = (C0204d) obj;
            return true;
        }

        public int hashCode() {
            return 316614810;
        }

        public String toString() {
            return "LocationPermissionDenied";
        }
    }

    /* compiled from: SelectionMapEvent.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003¨\u0006\f"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$e;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d;", "", "toString", "", "hashCode", "", "other", "", "equals", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class e extends d {
        public static final e a = new e();

        private e() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return true;
        }

        public int hashCode() {
            return -1052481722;
        }

        public String toString() {
            return "MyLocationPressed";
        }
    }

    /* compiled from: SelectionMapEvent.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$f;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lov5;", "a", "Lov5;", "b", "()Lov5;", "location", "Z", "()Z", "focusOnUser", "<init>", "(Lov5;Z)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class f extends d {
        private final ov5 a;
        private final boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ov5 ov5Var, boolean z) {
            super(null);
            z65.h(ov5Var, "location");
            this.a = ov5Var;
            this.b = z;
        }

        public final boolean a() {
            return this.b;
        }

        public final ov5 b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (z65.c(this.a, fVar.a) && this.b == fVar.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + a91.a(this.b);
        }

        public String toString() {
            ov5 ov5Var = this.a;
            boolean z = this.b;
            return "NewUserLocation(location=" + ov5Var + ", focusOnUser=" + z + ")";
        }
    }

    /* compiled from: SelectionMapEvent.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003¨\u0006\f"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$g;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d;", "", "toString", "", "hashCode", "", "other", "", "equals", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class g extends d {
        public static final g a = new g();

        private g() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return true;
        }

        public int hashCode() {
            return -424719295;
        }

        public String toString() {
            return "OnBackPressed";
        }
    }

    /* compiled from: SelectionMapEvent.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$h;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lyv5;", "a", "Lyv5;", "()Lyv5;", "result", "b", "Z", "()Z", "isInitialRequest", "<init>", "(Lyv5;Z)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class h extends d {
        private final yv5 a;
        private final boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(yv5 yv5Var, boolean z) {
            super(null);
            z65.h(yv5Var, "result");
            this.a = yv5Var;
            this.b = z;
        }

        public final yv5 a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (z65.c(this.a, hVar.a) && this.b == hVar.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + a91.a(this.b);
        }

        public String toString() {
            yv5 yv5Var = this.a;
            boolean z = this.b;
            return "OnLocationApproveClicked(result=" + yv5Var + ", isInitialRequest=" + z + ")";
        }
    }

    /* compiled from: SelectionMapEvent.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003¨\u0006\f"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$i;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d;", "", "toString", "", "hashCode", "", "other", "", "equals", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class i extends d {
        public static final i a = new i();

        private i() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return true;
        }

        public int hashCode() {
            return -393741215;
        }

        public String toString() {
            return "OnMapReady";
        }
    }

    /* compiled from: SelectionMapEvent.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$j;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/google/android/gms/maps/model/LatLng;", "a", "Lcom/google/android/gms/maps/model/LatLng;", "()Lcom/google/android/gms/maps/model/LatLng;", "latLng", "<init>", "(Lcom/google/android/gms/maps/model/LatLng;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class j extends d {
        private final LatLng a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(LatLng latLng) {
            super(null);
            z65.h(latLng, "latLng");
            this.a = latLng;
        }

        public final LatLng a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof j) && z65.c(this.a, ((j) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            LatLng latLng = this.a;
            return "OnPinMoveFinished(latLng=" + latLng + ")";
        }
    }

    /* compiled from: SelectionMapEvent.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003¨\u0006\f"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$k;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d;", "", "toString", "", "hashCode", "", "other", "", "equals", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class k extends d {
        public static final k a = new k();

        private k() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return true;
        }

        public int hashCode() {
            return 73187797;
        }

        public String toString() {
            return "OnPinMoveStarted";
        }
    }

    /* compiled from: SelectionMapEvent.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003¨\u0006\f"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$l;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d;", "", "toString", "", "hashCode", "", "other", "", "equals", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class l extends d {
        public static final l a = new l();

        private l() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return true;
        }

        public int hashCode() {
            return 88144325;
        }

        public String toString() {
            return "PermissionDenied";
        }
    }

    /* compiled from: SelectionMapEvent.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$m;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d;", "", "toString", "", "hashCode", "", "other", "", "equals", "Ld88;", "a", "Ld88;", "()Ld88;", "pizzeria", "b", "I", "()I", "position", "<init>", "(Ld88;I)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class m extends d {
        private final d88 a;
        private final int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(d88 d88Var, int i) {
            super(null);
            z65.h(d88Var, "pizzeria");
            this.a = d88Var;
            this.b = i;
        }

        public final d88 a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            if (z65.c(this.a, mVar.a) && this.b == mVar.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b;
        }

        public String toString() {
            d88 d88Var = this.a;
            int i = this.b;
            return "PizzeriaTapInSuggestion(pizzeria=" + d88Var + ", position=" + i + ")";
        }
    }

    /* compiled from: SelectionMapEvent.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$n;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lb68;", "a", "Lb68;", "()Lb68;", "pizzeriaVO", "<init>", "(Lb68;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class n extends d {
        private final b68 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(b68 b68Var) {
            super(null);
            z65.h(b68Var, "pizzeriaVO");
            this.a = b68Var;
        }

        public final b68 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof n) && z65.c(this.a, ((n) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            b68 b68Var = this.a;
            return "PizzeriaTapOnMap(pizzeriaVO=" + b68Var + ")";
        }
    }

    /* compiled from: SelectionMapEvent.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003¨\u0006\f"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$o;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d;", "", "toString", "", "hashCode", "", "other", "", "equals", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class o extends d {
        public static final o a = new o();

        private o() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return true;
        }

        public int hashCode() {
            return -2129913086;
        }

        public String toString() {
            return "RefreshPressed";
        }
    }

    /* compiled from: SelectionMapEvent.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003¨\u0006\f"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/d$p;", "Lcom/dodopizza/order/feature/selectionmap/presentation/d;", "", "toString", "", "hashCode", "", "other", "", "equals", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class p extends d {
        public static final p a = new p();

        private p() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return true;
        }

        public int hashCode() {
            return 2089904739;
        }

        public String toString() {
            return "ShowNearbyRestaurantsPressed";
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private d() {
    }
}
