package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: AddressCatcherEvents.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0016\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0006\u0010\f\u001a\u00020\u0004¨\u0006\r"}, d2 = {"Lqw1;", "position", "", "formattedAddress", "Ldc;", DateTokenConverter.CONVERTER_KEY, "b", "Lqd;", "sender", com.huawei.hms.opendevice.c.a, "f", com.huawei.hms.push.e.a, "a", "geo_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: a7  reason: default package */
/* loaded from: classes2.dex */
public final class a7 {

    /* compiled from: AddressCatcherEvents.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: a7$a */
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ qw1 a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(qw1 qw1Var, String str) {
            super(1);
            this.a = qw1Var;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, "position", this.a, false, 4, null);
            return bc.e(bcVar, "formattedAddress", this.b, false, 4, null);
        }
    }

    /* compiled from: AddressCatcherEvents.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: a7$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ qd a;
        final /* synthetic */ qw1 b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(qd qdVar, qw1 qw1Var, String str) {
            super(1);
            this.a = qdVar;
            this.b = qw1Var;
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.z(bcVar, this.a);
            bc.e(bcVar, "position", this.b, false, 4, null);
            return bc.e(bcVar, "formattedAddress", this.c, false, 4, null);
        }
    }

    /* compiled from: AddressCatcherEvents.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: a7$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ qw1 a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(qw1 qw1Var, String str) {
            super(1);
            this.a = qw1Var;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, "position", this.a, false, 4, null);
            return bc.e(bcVar, "formattedAddress", this.b, false, 4, null);
        }
    }

    /* compiled from: AddressCatcherEvents.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: a7$d */
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ qw1 a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(qw1 qw1Var, String str) {
            super(1);
            this.a = qw1Var;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, "position", this.a, false, 4, null);
            return bc.e(bcVar, "formattedAddress", this.b, false, 4, null);
        }
    }

    /* compiled from: AddressCatcherEvents.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: a7$e */
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ qw1 a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(qw1 qw1Var, String str) {
            super(1);
            this.a = qw1Var;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, "position", this.a, false, 4, null);
            return bc.e(bcVar, "formattedAddress", this.b, false, 4, null);
        }
    }

    public static final dc a() {
        return ec.b("address_catcher_active_button_show", null, 2, null);
    }

    public static final dc b(qw1 qw1Var, String str) {
        z65.h(qw1Var, "position");
        z65.h(str, "formattedAddress");
        return ec.a("address_catcher_find_out_about_opening_click", new a(qw1Var, str));
    }

    public static final dc c(qd qdVar, qw1 qw1Var, String str) {
        z65.h(qdVar, "sender");
        z65.h(qw1Var, "position");
        z65.h(str, "formattedAddress");
        return ec.a("address_catcher_pickup_order_click", new b(qdVar, qw1Var, str));
    }

    public static final dc d(qw1 qw1Var, String str) {
        z65.h(qw1Var, "position");
        z65.h(str, "formattedAddress");
        return ec.a("address_catcher_shown", new c(qw1Var, str));
    }

    public static final dc e(qw1 qw1Var, String str) {
        z65.h(qw1Var, "position");
        z65.h(str, "formattedAddress");
        return ec.a("address_catcher_show_menu_click", new d(qw1Var, str));
    }

    public static final dc f(qw1 qw1Var, String str) {
        z65.h(qw1Var, "position");
        z65.h(str, "formattedAddress");
        return ec.a("address_catcher_success_shown", new e(qw1Var, str));
    }
}
