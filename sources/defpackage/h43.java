package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: DisposableSaveableStateRegistry.android.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0002H\u0096\u0001J\u0006\u0010\b\u001a\u00020\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\n¨\u0006\u000f"}, d2 = {"Lh43;", "Let9;", "", "", "", "", "a", "", "b", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "onDispose", "saveableStateRegistry", "<init>", "(Let9;Lkotlin/jvm/functions/Function0;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: h43  reason: default package */
/* loaded from: classes.dex */
public final class h43 implements et9 {
    private final Function0<Unit> a;
    private final /* synthetic */ et9 b;

    public h43(et9 et9Var, Function0<Unit> function0) {
        z65.h(et9Var, "saveableStateRegistry");
        z65.h(function0, "onDispose");
        this.a = function0;
        this.b = et9Var;
    }

    @Override // defpackage.et9
    public Map<String, List<Object>> a() {
        return this.b.a();
    }

    public final void b() {
        this.a.invoke();
    }
}
