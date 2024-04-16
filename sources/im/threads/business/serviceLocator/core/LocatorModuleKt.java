package im.threads.business.serviceLocator.core;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: LocatorModule.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\";\u0010\t\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00008F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"", "Lim/threads/business/serviceLocator/core/LocatorModule;", "", "Lod5;", "Lkotlin/Function0;", "", "Lim/threads/business/serviceLocator/core/Declaration;", "getDeclarationRegistry", "(Ljava/util/List;)Ljava/util/Map;", "declarationRegistry", "threads_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class LocatorModuleKt {
    public static final Map<od5<?>, Function0<Object>> getDeclarationRegistry(List<LocatorModule> list) {
        Map o;
        z65.h(list, "<this>");
        List<LocatorModule> list2 = list;
        Map<od5<?>, Function0<Object>> declarationRegistry = list.get(0).getDeclarationRegistry();
        for (LocatorModule locatorModule : list2) {
            o = g86.o(declarationRegistry, locatorModule.getDeclarationRegistry());
            z65.f(o, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.reflect.KClass<*>, kotlin.Function0<kotlin.Any>{ im.threads.business.serviceLocator.core.LocatorDeclarationKt.Declaration<kotlin.Any> }>");
            declarationRegistry = unb.d(o);
        }
        return declarationRegistry;
    }
}
