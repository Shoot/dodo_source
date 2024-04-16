package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: analytics.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0004\u001a\u00020\u0002\u001a\u0006\u0010\u0005\u001a\u00020\u0002\u001a\u0006\u0010\u0006\u001a\u00020\u0002\u001a\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0000¨\u0006\t"}, d2 = {"", "selectLocaleButtonIsVisible", "Ldc;", com.huawei.hms.opendevice.c.a, e.a, DateTokenConverter.CONVERTER_KEY, "a", "isUserConfirmDeletion", "b", "profile_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: ed  reason: default package */
/* loaded from: classes2.dex */
public final class ed {

    /* compiled from: analytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ed$a */
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z) {
            super(1);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            int i;
            z65.h(bcVar, "$this$eventProducer");
            if (this.a) {
                i = 1;
            } else {
                i = 2;
            }
            return bc.e(bcVar, "approved", Integer.valueOf(i), false, 4, null);
        }
    }

    /* compiled from: analytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ed$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z) {
            super(1);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return bc.e(bcVar, "app_language", Boolean.valueOf(this.a), false, 4, null);
        }
    }

    /* compiled from: analytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ed$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function1<bc, bc> {
        public static final c a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return bc.e(bcVar, "user_choice", "cancel", false, 4, null);
        }
    }

    /* compiled from: analytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ed$d */
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function1<bc, bc> {
        public static final d a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return bc.e(bcVar, "user_choice", "change", false, 4, null);
        }
    }

    public static final dc a() {
        return ec.b("delete_account_click", null, 2, null);
    }

    public static final dc b(boolean z) {
        return ec.a("delete_account_approved", new a(z));
    }

    public static final dc c(boolean z) {
        return ec.a("screen_settings", new b(z));
    }

    public static final dc d() {
        return ec.a("switch_app_language_alert_click", c.a);
    }

    public static final dc e() {
        return ec.a("switch_app_language_alert_click", d.a);
    }
}
