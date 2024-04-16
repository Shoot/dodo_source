package com.dodopizza.core.feature.remoteconfig.presentation;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.core.feature.remoteconfig.RemoteConfigFeatureDependencies;
import com.dodopizza.presentation.BaseInitializer;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: RemoteConfigInitializer.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/dodopizza/core/feature/remoteconfig/presentation/RemoteConfigInitializer;", "Lcom/dodopizza/presentation/BaseInitializer;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", DateTokenConverter.CONVERTER_KEY, "Lgd9;", "b", "Lgd9;", e.a, "()Lgd9;", "setRemoteConfigInteractor", "(Lgd9;)V", "remoteConfigInteractor", "<init>", "()V", "core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RemoteConfigInitializer extends BaseInitializer {
    public gd9 b;

    @Override // com.dodopizza.presentation.BaseInitializer
    public void d(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        cd9.a.a().a((RemoteConfigFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(RemoteConfigFeatureDependencies.class))).a(this);
        e().f();
    }

    public final gd9 e() {
        gd9 gd9Var = this.b;
        if (gd9Var != null) {
            return gd9Var;
        }
        z65.z("remoteConfigInteractor");
        return null;
    }
}
