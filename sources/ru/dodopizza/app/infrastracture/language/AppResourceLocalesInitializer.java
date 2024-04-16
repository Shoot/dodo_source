package ru.dodopizza.app.infrastracture.language;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.BaseInitializer;
import java.util.List;
import kotlin.Metadata;
/* compiled from: AppResourceLocalesInitializer.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u00050\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016¨\u0006\u0012"}, d2 = {"Lru/dodopizza/app/infrastracture/language/AppResourceLocalesInitializer;", "Lcom/dodopizza/presentation/BaseInitializer;", "Landroid/content/ComponentCallbacks;", "Llm1;", "", "Ljava/lang/Class;", "Ly25;", "a", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", DateTokenConverter.CONVERTER_KEY, "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "onLowMemory", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AppResourceLocalesInitializer extends BaseInitializer implements ComponentCallbacks, lm1 {
    @Override // com.dodopizza.presentation.BaseInitializer, defpackage.y25
    public List<Class<? extends y25<?>>> a() {
        List<Class<? extends y25<?>>> l;
        l = kc1.l();
        return l;
    }

    @Override // com.dodopizza.presentation.BaseInitializer
    public void d(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        context.registerComponentCallbacks(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        z65.h(configuration, "newConfig");
        ((AppResourceLocalesInitializerDependencies) getComponentDependenciesRegistry().a(bc9.b(AppResourceLocalesInitializerDependencies.class))).Y().onConfigurationChanged(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }
}
