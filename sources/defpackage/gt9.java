package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: SaveableStateRegistry.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a8\u0010\t\u001a\u00020\b2\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0018\u00010\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\"\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\n8\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"", "", "", "", "restoredValues", "Lkotlin/Function1;", "", "canBeSaved", "Let9;", "a", "Lxr8;", "Lxr8;", "b", "()Lxr8;", "LocalSaveableStateRegistry", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: gt9  reason: default package */
/* loaded from: classes.dex */
public final class gt9 {
    private static final xr8<et9> a = oo1.d(a.a);

    /* compiled from: SaveableStateRegistry.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Let9;", "a", "()Let9;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: gt9$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<et9> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final et9 invoke() {
            return null;
        }
    }

    public static final et9 a(Map<String, ? extends List<? extends Object>> map, Function1<Object, Boolean> function1) {
        z65.h(function1, "canBeSaved");
        return new ft9(map, function1);
    }

    public static final xr8<et9> b() {
        return a;
    }
}
