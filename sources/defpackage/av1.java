package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.widget.Toast;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: ContextUtils.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u001a\u0012\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\u0000\u001a\u0006\u0010\u000b\u001a\u00020\u0003\u001a\f\u0010\r\u001a\u00020\f*\u0004\u0018\u00010\u0000¨\u0006\u000e"}, d2 = {"Landroid/content/Context;", "", DateTokenConverter.CONVERTER_KEY, "", "appPackageName", e.a, "phoneNumber", "f", RemoteMessageConst.Notification.URL, "g", com.huawei.hms.opendevice.c.a, "a", "", "b", "android_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: av1  reason: default package */
/* loaded from: classes.dex */
public final class av1 {

    /* compiled from: ContextUtils.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: av1$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Toast.makeText(this.a, "can't open app setting", 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ContextUtils.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: av1$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, String str) {
            super(0);
            this.a = context;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Context context = this.a;
            String str = this.b;
            av1.g(context, "https://play.google.com/store/apps/details?id=" + str);
        }
    }

    /* compiled from: ContextUtils.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: av1$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function0<Unit> {
        final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Toast.makeText(this.a, "can't open dial app", 0).show();
        }
    }

    public static final String a() {
        os5 a2 = eq1.a(Resources.getSystem().getConfiguration());
        z65.g(a2, "getLocales(...)");
        Locale c2 = a2.c(0);
        if (c2 == null) {
            c2 = Locale.getDefault();
        }
        String country = c2.getCountry();
        z65.g(country, "getCountry(...)");
        return country;
    }

    public static final boolean b(Context context) {
        if (context == null) {
            return true;
        }
        if ((context instanceof Application) || !(context instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) context;
        return activity.isFinishing() | activity.isDestroyed();
    }

    public static final void c(Context context) {
        z65.h(context, "<this>");
        String packageName = context.getPackageName();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + packageName));
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        intent.addFlags(8388608);
        d6.a(d6.b(d6.c(context, intent), new a(context)));
    }

    public static final void d(Context context) {
        z65.h(context, "<this>");
        String packageName = context.getPackageName();
        z65.g(packageName, "getPackageName(...)");
        e(context, packageName);
    }

    private static final void e(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str));
        intent.setFlags(268435456);
        d6.a(d6.b(d6.c(context, intent), new b(context, str)));
    }

    public static final void f(Context context, String str) {
        z65.h(context, "<this>");
        if (str != null && str.length() > 0) {
            Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str));
            intent.setFlags(268435456);
            d6.a(d6.b(d6.c(context, intent), new c(context)));
        }
    }

    public static final void g(Context context, String str) {
        z65.h(context, "<this>");
        z65.h(str, RemoteMessageConst.Notification.URL);
        if (str.length() > 0) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setFlags(268435456);
            d6.a(d6.c(context, intent));
        }
    }
}
