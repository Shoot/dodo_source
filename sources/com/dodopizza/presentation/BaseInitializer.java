package com.dodopizza.presentation;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: BaseInitializer.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u00050\u0004H\u0016J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&R$\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/dodopizza/presentation/BaseInitializer;", "Ly25;", "", "Llm1;", "", "Ljava/lang/Class;", "a", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, c.a, DateTokenConverter.CONVERTER_KEY, "Lkm1;", "<set-?>", "Lkm1;", "getComponentDependenciesRegistry", "()Lkm1;", "componentDependenciesRegistry", "<init>", "()V", "presentation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class BaseInitializer implements y25<Unit>, lm1 {
    private km1 a;

    @Override // defpackage.y25
    public List<Class<? extends y25<?>>> a() {
        List<Class<? extends y25<?>>> l;
        l = kc1.l();
        return l;
    }

    @Override // defpackage.y25
    public /* bridge */ /* synthetic */ Unit b(Context context) {
        c(context);
        return Unit.a;
    }

    public final void c(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = eu2.b(context);
        d(context);
    }

    public abstract void d(Context context);

    @Override // defpackage.lm1
    public final km1 getComponentDependenciesRegistry() {
        km1 km1Var = this.a;
        if (km1Var != null) {
            return km1Var;
        }
        z65.z("componentDependenciesRegistry");
        return null;
    }
}
