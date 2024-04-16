package defpackage;

import android.content.res.Resources;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DeviceInfoForOrderCreator.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0007B\u001d\u0012\u0006\u0010\n\u001a\u00020\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0013"}, d2 = {"Lx13;", "Lw13;", "", "b", "", com.huawei.hms.opendevice.c.a, "Lv13;", "a", "Lmh0;", "Lmh0;", "buildInfo", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "appNameProvider", "Ljava/lang/String;", "userAgent", "<init>", "(Lmh0;Lkotlin/jvm/functions/Function0;)V", DateTokenConverter.CONVERTER_KEY, "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: x13  reason: default package */
/* loaded from: classes4.dex */
public final class x13 implements w13 {
    public static final a d = new a(null);
    private final mh0 a;
    private final Function0<String> b;
    private final String c;

    /* compiled from: DeviceInfoForOrderCreator.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lx13$a;", "", "", "DEFAULT_ACCEPT_HEADER", "Ljava/lang/String;", "", "DEFAULT_COLOR_DEPTH", "I", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: x13$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeviceInfoForOrderCreator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x13$b */
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function0<String> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            String str = this.a;
            String property = System.getProperty("http.agent");
            z65.e(property);
            return str + " " + property;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeviceInfoForOrderCreator.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x13$c */
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function1<Throwable, String> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Throwable th) {
            z65.h(th, "it");
            String str = this.a;
            return str + " User Agent";
        }
    }

    public x13(mh0 mh0Var, Function0<String> function0) {
        z65.h(mh0Var, "buildInfo");
        z65.h(function0, "appNameProvider");
        this.a = mh0Var;
        this.b = function0;
        this.c = c();
    }

    private final int b() {
        return ((int) TimeUnit.MILLISECONDS.toMinutes(new GregorianCalendar().getTimeZone().getRawOffset())) * (-1);
    }

    private final String c() {
        String invoke = this.b.invoke();
        String str = ((Object) invoke) + "/" + this.a.h();
        return (String) fnb.a.a(new b(str)).a(new c(str));
    }

    @Override // defpackage.w13
    public v13 a() {
        String language = Locale.getDefault().getLanguage();
        z65.g(language, "getLanguage(...)");
        return new v13("application/json", language, 24, Resources.getSystem().getDisplayMetrics().heightPixels, Resources.getSystem().getDisplayMetrics().widthPixels, b(), this.c);
    }
}
