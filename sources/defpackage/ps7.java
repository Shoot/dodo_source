package defpackage;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: PaymentAnalytics.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J1\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J\u001e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0007¨\u0006\u0017"}, d2 = {"Lps7;", "", "", "isVpnEnabled", "Ldc;", Image.TYPE_HIGH, "g", "", "paymentType", "a", com.huawei.hms.push.e.a, "errorText", "", "errorCode", com.huawei.hms.opendevice.c.a, "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Ldc;", RemoteMessageConst.Notification.URL, "f", "bin", "acquirerName", "b", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ps7  reason: default package */
/* loaded from: classes4.dex */
public final class ps7 {
    public static final ps7 a = new ps7();

    /* compiled from: PaymentAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ps7$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return bc.e(bcVar, "paymentType", this.a, false, 4, null);
        }
    }

    /* compiled from: PaymentAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ps7$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ String a;
        final /* synthetic */ boolean b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, boolean z, String str2) {
            super(1);
            this.a = str;
            this.b = z;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, "BIN", this.a, false, 4, null);
            bc.e(bcVar, "isVpnEnabled", Boolean.valueOf(this.b), false, 4, null);
            return bc.e(bcVar, "acquirer", this.c, false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ps7$c */
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ boolean a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ Integer d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z, String str, String str2, Integer num) {
            super(1);
            this.a = z;
            this.b = str;
            this.c = str2;
            this.d = num;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, "isVpnEnabled", Boolean.valueOf(this.a), false, 4, null);
            bc.e(bcVar, "paymentType", this.b, false, 4, null);
            bc.e(bcVar, "errorText", this.c, false, 4, null);
            return bc.e(bcVar, "errorCode", this.d, false, 4, null);
        }
    }

    /* compiled from: PaymentAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ps7$d */
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ boolean a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z, String str) {
            super(1);
            this.a = z;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, "isVpnEnabled", Boolean.valueOf(this.a), false, 4, null);
            return bc.e(bcVar, "paymentType", this.b, false, 4, null);
        }
    }

    /* compiled from: PaymentAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ps7$e */
    /* loaded from: classes4.dex */
    static final class e extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ boolean a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z, String str, String str2) {
            super(1);
            this.a = z;
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, "isVpnEnabled", Boolean.valueOf(this.a), false, 4, null);
            bc.e(bcVar, RemoteMessageConst.Notification.URL, this.b, false, 4, null);
            return bc.e(bcVar, "errorText", this.c, false, 4, null);
        }
    }

    /* compiled from: PaymentAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ps7$f */
    /* loaded from: classes4.dex */
    static final class f extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z) {
            super(1);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return bc.e(bcVar, "isVpnEnabled", Boolean.valueOf(this.a), false, 4, null);
        }
    }

    /* compiled from: PaymentAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ps7$g */
    /* loaded from: classes4.dex */
    static final class g extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z) {
            super(1);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return bc.e(bcVar, "isVpnEnabled", Boolean.valueOf(this.a), false, 4, null);
        }
    }

    private ps7() {
    }

    public static /* synthetic */ dc d(ps7 ps7Var, boolean z, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 8) != 0) {
            num = null;
        }
        return ps7Var.c(z, str, str2, num);
    }

    public final dc a(String str) {
        z65.h(str, "paymentType");
        return ec.a("begin_payment", new a(str));
    }

    public final dc b(String str, boolean z, String str2) {
        z65.h(str, "bin");
        z65.h(str2, "acquirerName");
        return ec.a("input_payment_card", new b(str, z, str2));
    }

    public final dc c(boolean z, String str, String str2, Integer num) {
        z65.h(str, "paymentType");
        z65.h(str2, "errorText");
        return ec.a("payment_failed", new c(z, str, str2, num));
    }

    public final dc e(boolean z, String str) {
        z65.h(str, "paymentType");
        return ec.a("payment_finished", new d(z, str));
    }

    public final dc f(boolean z, String str, String str2) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        z65.h(str2, "errorText");
        return ec.a("3ds_error", new e(z, str, str2));
    }

    public final dc g(boolean z) {
        return ec.a("3ds_loaded", new f(z));
    }

    public final dc h(boolean z) {
        return ec.a("3ds_loading_started", new g(z));
    }
}
