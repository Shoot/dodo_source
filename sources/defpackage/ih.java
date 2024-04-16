package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: AndroidLanguageManager.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u0010"}, d2 = {"Lih;", "", "Landroid/content/res/Resources;", "resources", "Landroid/content/res/Configuration;", "a", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "b", "", c.a, "Li32;", "Li32;", "currentLocaleProvider", "<init>", "(Li32;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ih  reason: default package */
/* loaded from: classes4.dex */
public final class ih {
    private final i32 a;

    public ih(i32 i32Var) {
        z65.h(i32Var, "currentLocaleProvider");
        this.a = i32Var;
    }

    private final Configuration a(Resources resources) {
        Locale locale = this.a.get();
        Locale.setDefault(locale);
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.setLocale(locale);
        return configuration;
    }

    public final Context b(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Resources resources = context.getResources();
        z65.g(resources, "getResources(...)");
        Context createConfigurationContext = context.createConfigurationContext(a(resources));
        z65.g(createConfigurationContext, "createConfigurationContext(...)");
        return createConfigurationContext;
    }

    public final void c(Resources resources) {
        z65.h(resources, "resources");
        resources.updateConfiguration(a(resources), resources.getDisplayMetrics());
    }
}
