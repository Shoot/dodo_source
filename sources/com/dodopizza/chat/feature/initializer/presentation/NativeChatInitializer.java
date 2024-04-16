package com.dodopizza.chat.feature.initializer.presentation;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.chat.feature.initializer.NativeChatInitializerDependencies;
import com.dodopizza.presentation.BaseInitializer;
import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.app.infrastracture.utils.RealmInitializer;
/* compiled from: NativeChatInitializer.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u0011\u001a\u00020\n8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/dodopizza/chat/feature/initializer/presentation/NativeChatInitializer;", "Lcom/dodopizza/presentation/BaseInitializer;", "", "Ljava/lang/Class;", "Lru/dodopizza/app/infrastracture/utils/RealmInitializer;", "a", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", DateTokenConverter.CONVERTER_KEY, "Lheb;", "b", "Lheb;", e.a, "()Lheb;", "setThreadsLibActivitiesFix$chat_release", "(Lheb;)V", "threadsLibActivitiesFix", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class NativeChatInitializer extends BaseInitializer {
    public heb b;

    @Override // com.dodopizza.presentation.BaseInitializer, defpackage.y25
    public List<Class<RealmInitializer>> a() {
        List<Class<RealmInitializer>> e;
        e = jc1.e(RealmInitializer.class);
        return e;
    }

    @Override // com.dodopizza.presentation.BaseInitializer
    public void d(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        ot6.a.a().a((NativeChatInitializerDependencies) getComponentDependenciesRegistry().a(bc9.b(NativeChatInitializerDependencies.class))).a(this);
        e().c();
    }

    public final heb e() {
        heb hebVar = this.b;
        if (hebVar != null) {
            return hebVar;
        }
        z65.z("threadsLibActivitiesFix");
        return null;
    }
}
