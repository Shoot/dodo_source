package ru.dodopizza.app.presentation.checkout.details;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.lk7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: fsm.kt */
@Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:;\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001;?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxy¨\u0006z"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b;", "Lok3;", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "f", "g", Image.TYPE_HIGH, "i", "j", "k", "l", Image.TYPE_MEDIUM, "n", "o", "p", "q", "r", Image.TYPE_SMALL, "t", "u", "v", "w", "x", "y", "z", "a0", "b0", "c0", "d0", "e0", "f0", "g0", "h0", "i0", "j0", "k0", "l0", "m0", "n0", "o0", "p0", "q0", "r0", "s0", "t0", "u0", "v0", "w0", "x0", "y0", "z0", "a1", "b1", "c1", "d1", "e1", "f1", "g1", "Lru/dodopizza/app/presentation/checkout/details/b$a;", "Lru/dodopizza/app/presentation/checkout/details/b$b;", "Lru/dodopizza/app/presentation/checkout/details/b$c;", "Lru/dodopizza/app/presentation/checkout/details/b$d;", "Lru/dodopizza/app/presentation/checkout/details/b$e;", "Lru/dodopizza/app/presentation/checkout/details/b$f;", "Lru/dodopizza/app/presentation/checkout/details/b$g;", "Lru/dodopizza/app/presentation/checkout/details/b$h;", "Lru/dodopizza/app/presentation/checkout/details/b$i;", "Lru/dodopizza/app/presentation/checkout/details/b$j;", "Lru/dodopizza/app/presentation/checkout/details/b$k;", "Lru/dodopizza/app/presentation/checkout/details/b$l;", "Lru/dodopizza/app/presentation/checkout/details/b$m;", "Lru/dodopizza/app/presentation/checkout/details/b$n;", "Lru/dodopizza/app/presentation/checkout/details/b$o;", "Lru/dodopizza/app/presentation/checkout/details/b$p;", "Lru/dodopizza/app/presentation/checkout/details/b$q;", "Lru/dodopizza/app/presentation/checkout/details/b$r;", "Lru/dodopizza/app/presentation/checkout/details/b$s;", "Lru/dodopizza/app/presentation/checkout/details/b$t;", "Lru/dodopizza/app/presentation/checkout/details/b$u;", "Lru/dodopizza/app/presentation/checkout/details/b$v;", "Lru/dodopizza/app/presentation/checkout/details/b$w;", "Lru/dodopizza/app/presentation/checkout/details/b$x;", "Lru/dodopizza/app/presentation/checkout/details/b$y;", "Lru/dodopizza/app/presentation/checkout/details/b$z;", "Lru/dodopizza/app/presentation/checkout/details/b$a0;", "Lru/dodopizza/app/presentation/checkout/details/b$b0;", "Lru/dodopizza/app/presentation/checkout/details/b$c0;", "Lru/dodopizza/app/presentation/checkout/details/b$d0;", "Lru/dodopizza/app/presentation/checkout/details/b$e0;", "Lru/dodopizza/app/presentation/checkout/details/b$f0;", "Lru/dodopizza/app/presentation/checkout/details/b$g0;", "Lru/dodopizza/app/presentation/checkout/details/b$h0;", "Lru/dodopizza/app/presentation/checkout/details/b$i0;", "Lru/dodopizza/app/presentation/checkout/details/b$j0;", "Lru/dodopizza/app/presentation/checkout/details/b$k0;", "Lru/dodopizza/app/presentation/checkout/details/b$l0;", "Lru/dodopizza/app/presentation/checkout/details/b$m0;", "Lru/dodopizza/app/presentation/checkout/details/b$n0;", "Lru/dodopizza/app/presentation/checkout/details/b$o0;", "Lru/dodopizza/app/presentation/checkout/details/b$p0;", "Lru/dodopizza/app/presentation/checkout/details/b$q0;", "Lru/dodopizza/app/presentation/checkout/details/b$r0;", "Lru/dodopizza/app/presentation/checkout/details/b$s0;", "Lru/dodopizza/app/presentation/checkout/details/b$t0;", "Lru/dodopizza/app/presentation/checkout/details/b$u0;", "Lru/dodopizza/app/presentation/checkout/details/b$v0;", "Lru/dodopizza/app/presentation/checkout/details/b$w0;", "Lru/dodopizza/app/presentation/checkout/details/b$x0;", "Lru/dodopizza/app/presentation/checkout/details/b$y0;", "Lru/dodopizza/app/presentation/checkout/details/b$z0;", "Lru/dodopizza/app/presentation/checkout/details/b$a1;", "Lru/dodopizza/app/presentation/checkout/details/b$b1;", "Lru/dodopizza/app/presentation/checkout/details/b$c1;", "Lru/dodopizza/app/presentation/checkout/details/b$d1;", "Lru/dodopizza/app/presentation/checkout/details/b$e1;", "Lru/dodopizza/app/presentation/checkout/details/b$f1;", "Lru/dodopizza/app/presentation/checkout/details/b$g1;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class b extends ok3 {

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$a;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a extends b {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\b\u0010\u0014¨\u0006\u0018"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$a0;", "Lru/dodopizza/app/presentation/checkout/details/b;", "", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", "deferredTime", "", "b", "Ljava/lang/String;", com.huawei.hms.opendevice.c.a, "()Ljava/lang/String;", "title", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "isSuggested", "", "I", "()I", "positionSelected", "<init>", "(Ljava/lang/Long;Ljava/lang/String;ZI)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a0 extends b {
        private final Long a;
        private final String b;
        private final boolean c;
        private final int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(Long l, String str, boolean z, int i) {
            super(null);
            z65.h(str, "title");
            this.a = l;
            this.b = str;
            this.c = z;
            this.d = i;
        }

        public final Long a() {
            return this.a;
        }

        public final int b() {
            return this.d;
        }

        public final String c() {
            return this.b;
        }

        public final boolean d() {
            return this.c;
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000e"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$a1;", "Lru/dodopizza/app/presentation/checkout/details/b;", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", RemoteMessageConst.Notification.URL, "Lhu9;", "Lhu9;", "()Lhu9;", "sbpBank", "<init>", "(Ljava/lang/String;Lhu9;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a1 extends b {
        private final String a;
        private final hu9 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a1(String str, hu9 hu9Var) {
            super(null);
            z65.h(str, RemoteMessageConst.Notification.URL);
            z65.h(hu9Var, "sbpBank");
            this.a = str;
            this.b = hu9Var;
        }

        public final hu9 a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$b;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.checkout.details.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0529b extends b {
        public static final C0529b a = new C0529b();

        private C0529b() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$b0;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class b0 extends b {
        public static final b0 a = new b0();

        private b0() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$b1;", "Lru/dodopizza/app/presentation/checkout/details/b;", "", "a", "Z", "()Z", "isFromAlert", "<init>", "(Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class b1 extends b {
        private final boolean a;

        public b1(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$c;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class c extends b {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$c0;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class c0 extends b {
        public static final c0 a = new c0();

        private c0() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$c1;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class c1 extends b {
        public static final c1 a = new c1();

        private c1() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$d;", "Lru/dodopizza/app/presentation/checkout/details/b;", "", "a", "I", "()I", "positionSelected", "<init>", "(I)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class d extends b {
        private final int a;

        public d() {
            this(0, 1, null);
        }

        public final int a() {
            return this.a;
        }

        public d(int i) {
            super(null);
            this.a = i;
        }

        public /* synthetic */ d(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$d0;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class d0 extends b {
        public static final d0 a = new d0();

        private d0() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$d1;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class d1 extends b {
        public static final d1 a = new d1();

        private d1() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$e;", "Lru/dodopizza/app/presentation/checkout/details/b;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", RemoteMessageConst.Notification.URL, "", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "error", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class e extends b {
        private final String a;
        private final Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Throwable th) {
            super(null);
            z65.h(str, RemoteMessageConst.Notification.URL);
            z65.h(th, "error");
            this.a = str;
            this.b = th;
        }

        public final Throwable a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (z65.c(this.a, eVar.a) && z65.c(this.b, eVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            Throwable th = this.b;
            return "App2AppPayDeepLinkOpenFailed(url=" + str + ", error=" + th + ")";
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$e0;", "Lru/dodopizza/app/presentation/checkout/details/b;", "", "a", "Z", "()Z", "isTakeaway", "<init>", "(Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class e0 extends b {
        private final boolean a;

        public e0(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$e1;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class e1 extends b {
        public static final e1 a = new e1();

        private e1() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$f;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class f extends b {
        public static final f a = new f();

        private f() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$f0;", "Lru/dodopizza/app/presentation/checkout/details/b;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Z", "()Z", "isRedirectSavedCardChecked", "<init>", "(Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class f0 extends b {
        private final boolean a;

        public f0(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof f0) && this.a == ((f0) obj).a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return a91.a(this.a);
        }

        public String toString() {
            boolean z = this.a;
            return "PaymentMethodIsRedirectSaveCardChecked(isRedirectSavedCardChecked=" + z + ")";
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$f1;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class f1 extends b {
        public static final f1 a = new f1();

        private f1() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$g;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class g extends b {
        public static final g a = new g();

        private g() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u000e"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$g0;", "Lru/dodopizza/app/presentation/checkout/details/b;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "sbpUrl", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class g0 extends b {
        private final String a;

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof g0) && z65.c(this.a, ((g0) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            String str = this.a;
            return "PaymentMethodSbpPressed(sbpUrl=" + str + ")";
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$g1;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class g1 extends b {
        public static final g1 a = new g1();

        private g1() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$h;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class h extends b {
        public static final h a = new h();

        private h() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$h0;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class h0 extends b {
        public static final h0 a = new h0();

        private h0() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$i;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class i extends b {
        public static final i a = new i();

        private i() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$i0;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class i0 extends b {
        public static final i0 a = new i0();

        private i0() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$j;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class j extends b {
        public static final j a = new j();

        private j() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$j0;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class j0 extends b {
        public static final j0 a = new j0();

        private j0() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$k;", "Lru/dodopizza/app/presentation/checkout/details/b;", "Lhn6;", "a", "Lhn6;", "()Lhn6;", "amount", "<init>", "(Lhn6;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class k extends b {
        private final hn6 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(hn6 hn6Var) {
            super(null);
            z65.h(hn6Var, "amount");
            this.a = hn6Var;
        }

        public final hn6 a() {
            return this.a;
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$k0;", "Lru/dodopizza/app/presentation/checkout/details/b;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "infoUrl", "<init>", "(Ljava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class k0 extends b {
        private final String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(String str) {
            super(null);
            z65.h(str, "infoUrl");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof k0) && z65.c(this.a, ((k0) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            String str = this.a;
            return "ReusablePackageInfoClicked(infoUrl=" + str + ")";
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$l;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class l extends b {
        public static final l a = new l();

        private l() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$l0;", "Lru/dodopizza/app/presentation/checkout/details/b;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Z", "()Z", "isSelected", "<init>", "(Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class l0 extends b {
        private final boolean a;

        public l0(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof l0) && this.a == ((l0) obj).a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return a91.a(this.a);
        }

        public String toString() {
            boolean z = this.a;
            return "ReusablePackageSwitcherToggled(isSelected=" + z + ")";
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$m;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class m extends b {
        public static final m a = new m();

        private m() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$m0;", "Lru/dodopizza/app/presentation/checkout/details/b;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "sberAppDeepLink", "", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "error", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class m0 extends b {
        private final String a;
        private final Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(String str, Throwable th) {
            super(null);
            z65.h(str, "sberAppDeepLink");
            z65.h(th, "error");
            this.a = str;
            this.b = th;
        }

        public final Throwable a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m0)) {
                return false;
            }
            m0 m0Var = (m0) obj;
            if (z65.c(this.a, m0Var.a) && z65.c(this.b, m0Var.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            Throwable th = this.b;
            return "SberPayDeepLinkOpenFailed(sberAppDeepLink=" + str + ", error=" + th + ")";
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$n;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class n extends b {
        public static final n a = new n();

        private n() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$n0;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class n0 extends b {
        public static final n0 a = new n0();

        private n0() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$o;", "Lru/dodopizza/app/presentation/checkout/details/b;", "Lou2;", "a", "Lou2;", "()Lou2;", "deliverablePlace", "", "b", "Z", "()Z", "setDeliveryOrderType", "<init>", "(Lou2;Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class o extends b {
        private final ou2 a;
        private final boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ou2 ou2Var, boolean z) {
            super(null);
            z65.h(ou2Var, "deliverablePlace");
            this.a = ou2Var;
            this.b = z;
        }

        public final ou2 a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0016"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$o0;", "Lru/dodopizza/app/presentation/checkout/details/b;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getSbpUrl", "()Ljava/lang/String;", "sbpUrl", "", "b", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "error", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class o0 extends b {
        private final String a;
        private final Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(String str, Throwable th) {
            super(null);
            z65.h(str, "sbpUrl");
            z65.h(th, "error");
            this.a = str;
            this.b = th;
        }

        public final Throwable a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o0)) {
                return false;
            }
            o0 o0Var = (o0) obj;
            if (z65.c(this.a, o0Var.a) && z65.c(this.b, o0Var.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            Throwable th = this.b;
            return "SbpLinkOpenFailed(sbpUrl=" + str + ", error=" + th + ")";
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u000b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$p;", "Lru/dodopizza/app/presentation/checkout/details/b;", "Le91;", "a", "Le91;", "()Le91;", "newClientDeliveryLocation", "b", "oldClientDeliveryLocation", "<init>", "(Le91;Le91;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class p extends b {
        private final e91 a;
        private final e91 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(e91 e91Var, e91 e91Var2) {
            super(null);
            z65.h(e91Var, "newClientDeliveryLocation");
            z65.h(e91Var2, "oldClientDeliveryLocation");
            this.a = e91Var;
            this.b = e91Var2;
        }

        public final e91 a() {
            return this.a;
        }

        public final e91 b() {
            return this.b;
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003¨\u0006\f"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$p0;", "Lru/dodopizza/app/presentation/checkout/details/b;", "", "toString", "", "hashCode", "", "other", "", "equals", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class p0 extends b {
        public static final p0 a = new p0();

        private p0() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p0)) {
                return false;
            }
            p0 p0Var = (p0) obj;
            return true;
        }

        public int hashCode() {
            return -1646615160;
        }

        public String toString() {
            return "SbpLinkOpened";
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$q;", "Lru/dodopizza/app/presentation/checkout/details/b;", "", "a", "I", "()I", "tableNumber", "<init>", "(I)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class q extends b {
        private final int a;

        public q(int i) {
            super(null);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$q0;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class q0 extends b {
        public static final q0 a = new q0();

        private q0() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$r;", "Lru/dodopizza/app/presentation/checkout/details/b;", "", "a", "I", "()I", "tableNumber", "<init>", "(I)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class r extends b {
        private final int a;

        public r(int i) {
            super(null);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$r0;", "Lru/dodopizza/app/presentation/checkout/details/b;", "Lj3a;", "a", "Lj3a;", "()Lj3a;", "result", "<init>", "(Lj3a;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class r0 extends b {
        private final j3a a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(j3a j3aVar) {
            super(null);
            z65.h(j3aVar, "result");
            this.a = j3aVar;
        }

        public final j3a a() {
            return this.a;
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$s;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class s extends b {
        public static final s a = new s();

        private s() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$s0;", "Lru/dodopizza/app/presentation/checkout/details/b;", "Ld88;", "a", "Ld88;", "()Ld88;", "pizzeria", "Llk7$d;", "b", "Llk7$d;", "()Llk7$d;", KustoStorage.KustoTable.COLUMN_SOURCE, "<init>", "(Ld88;Llk7$d;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class s0 extends b {
        private final d88 a;
        private final lk7.d b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(d88 d88Var, lk7.d dVar) {
            super(null);
            z65.h(d88Var, "pizzeria");
            z65.h(dVar, KustoStorage.KustoTable.COLUMN_SOURCE);
            this.a = d88Var;
            this.b = dVar;
        }

        public final d88 a() {
            return this.a;
        }

        public final lk7.d b() {
            return this.b;
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$t;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class t extends b {
        public static final t a = new t();

        private t() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$t0;", "Lru/dodopizza/app/presentation/checkout/details/b;", "", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", "deferredTime", "<init>", "(Ljava/lang/Long;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class t0 extends b {
        private final Long a;

        public t0(Long l) {
            super(null);
            this.a = l;
        }

        public final Long a() {
            return this.a;
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$u;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class u extends b {
        public static final u a = new u();

        private u() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$u0;", "Lru/dodopizza/app/presentation/checkout/details/b;", "Lou2;", "a", "Lou2;", "()Lou2;", "deliverablePlaceCandidate", "", "b", "Z", "()Z", "setDeliveryOrderType", "<init>", "(Lou2;Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class u0 extends b {
        private final ou2 a;
        private final boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(ou2 ou2Var, boolean z) {
            super(null);
            z65.h(ou2Var, "deliverablePlaceCandidate");
            this.a = ou2Var;
            this.b = z;
        }

        public final ou2 a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u000b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$v;", "Lru/dodopizza/app/presentation/checkout/details/b;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "paymentId", "b", "paymentToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class v extends b {
        private final String a;
        private final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str, String str2) {
            super(null);
            z65.h(str, "paymentId");
            z65.h(str2, "paymentToken");
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$v0;", "Lru/dodopizza/app/presentation/checkout/details/b;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lv51;", "a", "Lv51;", "()Lv51;", "error", "<init>", "(Lv51;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class v0 extends b {
        private final v51 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v0(v51 v51Var) {
            super(null);
            z65.h(v51Var, "error");
            this.a = v51Var;
        }

        public final v51 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof v0) && z65.c(this.a, ((v0) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            v51 v51Var = this.a;
            return "SelectDeliveryAddressResultErrorsEvent(error=" + v51Var + ")";
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$w;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class w extends b {
        public static final w a = new w();

        private w() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$w0;", "Lru/dodopizza/app/presentation/checkout/details/b;", "Ljw7;", "a", "Ljw7;", "()Ljw7;", "paymentWay", "<init>", "(Ljw7;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class w0 extends b {
        private final jw7 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w0(jw7 jw7Var) {
            super(null);
            z65.h(jw7Var, "paymentWay");
            this.a = jw7Var;
        }

        public final jw7 a() {
            return this.a;
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$x;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class x extends b {
        public static final x a = new x();

        private x() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$x0;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class x0 extends b {
        public static final x0 a = new x0();

        private x0() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$y;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class y extends b {
        public static final y a = new y();

        private y() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$y0;", "Lru/dodopizza/app/presentation/checkout/details/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class y0 extends b {
        public static final y0 a = new y0();

        private y0() {
            super(null);
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0013"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$z;", "Lru/dodopizza/app/presentation/checkout/details/b;", "", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", "deferredTime", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "title", "", com.huawei.hms.opendevice.c.a, "Z", "()Z", "isSuggested", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class z extends b {
        private final Long a;
        private final String b;
        private final boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(Long l, String str, boolean z) {
            super(null);
            z65.h(str, "title");
            this.a = l;
            this.b = str;
            this.c = z;
        }

        public final Long a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final boolean c() {
            return this.c;
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0013"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/b$z0;", "Lru/dodopizza/app/presentation/checkout/details/b;", "Ld88;", "a", "Ld88;", "()Ld88;", "pizzeria", "Llk7$d;", "b", "Llk7$d;", "()Llk7$d;", KustoStorage.KustoTable.COLUMN_SOURCE, "", com.huawei.hms.opendevice.c.a, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isNearestPizzeria", "<init>", "(Ld88;Llk7$d;Ljava/lang/Boolean;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class z0 extends b {
        private final d88 a;
        private final lk7.d b;
        private final Boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z0(d88 d88Var, lk7.d dVar, Boolean bool) {
            super(null);
            z65.h(d88Var, "pizzeria");
            z65.h(dVar, KustoStorage.KustoTable.COLUMN_SOURCE);
            this.a = d88Var;
            this.b = dVar;
            this.c = bool;
        }

        public final d88 a() {
            return this.a;
        }

        public final lk7.d b() {
            return this.b;
        }

        public final Boolean c() {
            return this.c;
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
