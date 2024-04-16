package ru.dodopizza.app.presentation.selectpizzeria.combined;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0014\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0014\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g;", "Lok3;", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "f", "g", Image.TYPE_HIGH, "i", "j", "k", "l", Image.TYPE_MEDIUM, "n", "o", "p", "q", "r", Image.TYPE_SMALL, "t", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g$a;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g$b;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g$c;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g$d;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g$e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g$f;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g$g;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g$h;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g$i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g$j;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g$k;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g$l;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g$m;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g$n;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g$o;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g$p;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g$q;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g$r;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g$s;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g$t;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class g extends ok3 {

    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$a;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a extends g {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$b;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lr88;", "a", "Lr88;", "()Lr88;", "pizzeriaFilterVO", "<init>", "(Lr88;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class b extends g {
        private final r88 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r88 r88Var) {
            super(null);
            z65.h(r88Var, "pizzeriaFilterVO");
            this.a = r88Var;
        }

        public final r88 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && z65.c(this.a, ((b) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            r88 r88Var = this.a;
            return "ChangePizzeriaFilterState(pizzeriaFilterVO=" + r88Var + ")";
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$c;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class c extends g {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$d;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class d extends g {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g;", "Ld88;", "a", "Ld88;", "()Ld88;", "selectedPizzeria", "<init>", "(Ld88;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class e extends g {
        private final d88 a;

        public e(d88 d88Var) {
            super(null);
            this.a = d88Var;
        }

        public final d88 a() {
            return this.a;
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$f;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class f extends g {
        public static final f a = new f();

        private f() {
            super(null);
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$g;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.selectpizzeria.combined.g$g  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0637g extends g {
        public static final C0637g a = new C0637g();

        private C0637g() {
            super(null);
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$h;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class h extends g {
        public static final h a = new h();

        private h() {
            super(null);
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000e"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g;", "Lov5;", "a", "Lov5;", "b", "()Lov5;", "location", "", "Z", "()Z", "focusOnUser", "<init>", "(Lov5;Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class i extends g {
        private final ov5 a;
        private final boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ov5 ov5Var, boolean z) {
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
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$j;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class j extends g {
        public static final j a = new j();

        private j() {
            super(null);
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$k;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class k extends g {
        public static final k a = new k();

        private k() {
            super(null);
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$l;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class l extends g {
        public static final l a = new l();

        private l() {
            super(null);
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$m;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "phoneNumber", "<init>", "(Ljava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class m extends g {
        private final String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str) {
            super(null);
            z65.h(str, "phoneNumber");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$n;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class n extends g {
        public static final n a = new n();

        private n() {
            super(null);
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$o;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class o extends g {
        public static final o a = new o();

        private o() {
            super(null);
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$p;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g;", "Ld88;", "a", "Ld88;", "()Ld88;", "pizzeria", "", "b", "I", "()I", "position", "<init>", "(Ld88;I)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class p extends g {
        private final d88 a;
        private final int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(d88 d88Var, int i) {
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
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$q;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g;", "Lb68;", "a", "Lb68;", "()Lb68;", "pizzeriaVO", "<init>", "(Lb68;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class q extends g {
        private final b68 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(b68 b68Var) {
            super(null);
            z65.h(b68Var, "pizzeriaVO");
            this.a = b68Var;
        }

        public final b68 a() {
            return this.a;
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$r;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class r extends g {
        public static final r a = new r();

        private r() {
            super(null);
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$s;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class s extends g {
        public static final s a = new s();

        private s() {
            super(null);
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$t;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/g;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class t extends g {
        public static final t a = new t();

        private t() {
            super(null);
        }
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private g() {
    }
}
