package ru.dodopizza.app.application;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.BaseInitializer;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.app.application.kusto.KustoInitializer;
import ru.dodopizza.app.di.AppComponent;
import ru.dodopizza.app.infrastracture.utils.RealmInitializer;
/* compiled from: AppScopeInitializer.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00030\u0002H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\r"}, d2 = {"Lru/dodopizza/app/application/AppScopeInitializer;", "Lcom/dodopizza/presentation/BaseInitializer;", "", "Ljava/lang/Class;", "Ly25;", "", "a", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AppScopeInitializer extends BaseInitializer {
    @Override // com.dodopizza.presentation.BaseInitializer, defpackage.y25
    public List<Class<? extends y25<? extends Object>>> a() {
        List<Class<? extends y25<? extends Object>>> o;
        o = kc1.o(DebugToolsInitializer.class, RealmInitializer.class, KustoInitializer.class, ProcessLifecycleInitializer.class);
        return o;
    }

    @Override // com.dodopizza.presentation.BaseInitializer
    public void d(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        vw9.a((uw9) getComponentDependenciesRegistry().a(bc9.b(AppComponent.class)));
    }
}
