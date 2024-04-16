package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: ContextForLocaleResolver.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"Lku1;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "a", "Ltl5;", "Ltl5;", "languageConfig", "<init>", "(Ltl5;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ku1  reason: default package */
/* loaded from: classes4.dex */
public final class ku1 {
    private final tl5 a;

    public ku1(tl5 tl5Var) {
        z65.h(tl5Var, "languageConfig");
        this.a = tl5Var;
    }

    public final Context a(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(ul5.b(this.a));
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        z65.g(createConfigurationContext, "createConfigurationContext(...)");
        return createConfigurationContext;
    }
}
