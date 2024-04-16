package im.threads.business.serviceLocator.core;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: LocatorModule.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\u0007\u001a\u00020\u0006\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00012\u0018\b\b\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0004H\u0086\bø\u0001\u0000J\u001c\u0010\b\u001a\u00028\u0000\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\b\u0010\tR7\u0010\f\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00010\u0003j\b\u0012\u0004\u0012\u00020\u0001`\u00040\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Lim/threads/business/serviceLocator/core/LocatorModule;", "", "T", "Lkotlin/Function0;", "Lim/threads/business/serviceLocator/core/Declaration;", "declaration", "", "factory", "get", "()Ljava/lang/Object;", "", "Lod5;", "declarationRegistry", "Ljava/util/Map;", "getDeclarationRegistry", "()Ljava/util/Map;", "<init>", "()V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class LocatorModule {
    private final Map<od5<?>, Function0<Object>> declarationRegistry = new ConcurrentHashMap();

    public final /* synthetic */ <T> void factory(Function0<? extends T> function0) {
        z65.h(function0, "declaration");
        Map<od5<?>, Function0<Object>> declarationRegistry = getDeclarationRegistry();
        z65.n(4, "T");
        declarationRegistry.put(bc9.b(Object.class), function0);
    }

    public final /* synthetic */ <T> T get() {
        T t;
        Map<od5<?>, Function0<Object>> declarationRegistry = getDeclarationRegistry();
        z65.n(4, "T");
        Function0<Object> function0 = declarationRegistry.get(bc9.b(Object.class));
        if (function0 != null) {
            t = (T) function0.invoke();
        } else {
            t = null;
        }
        if (t == null) {
            Map<od5<?>, Function0<Object>> declarations = LocatorContext.INSTANCE.getLocator().getDeclarations();
            z65.n(4, "T");
            Function0<Object> function02 = declarations.get(bc9.b(Object.class));
            if (function02 == null || (t = (T) function02.invoke()) == null) {
                z65.n(4, "T");
                String c = bc9.b(Object.class).c();
                throw new IllegalStateException(("Unable to find declaration of type " + c).toString());
            }
        }
        z65.n(1, "T");
        return t;
    }

    public final Map<od5<?>, Function0<Object>> getDeclarationRegistry() {
        return this.declarationRegistry;
    }
}
