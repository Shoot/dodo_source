package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DerivedState.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u001a\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\"\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\" \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\u000e"}, d2 = {"T", "Lkotlin/Function0;", "calculation", "Lcua;", c.a, "Lgr6;", "Lu03;", "b", "Lxpa;", "", "a", "Lxpa;", "calculationBlockNestedLevel", "derivedStateObservers", "runtime_release"}, k = 5, mv = {1, 8, 0}, xs = "androidx/compose/runtime/SnapshotStateKt")
/* renamed from: rpa  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rpa {
    private static final xpa<Integer> a = new xpa<>();
    private static final xpa<gr6<u03>> b = new xpa<>();

    public static final gr6<u03> b() {
        xpa<gr6<u03>> xpaVar = b;
        gr6<u03> a2 = xpaVar.a();
        if (a2 == null) {
            gr6<u03> gr6Var = new gr6<>(new u03[0], 0);
            xpaVar.b(gr6Var);
            return gr6Var;
        }
        return a2;
    }

    public static final <T> cua<T> c(Function0<? extends T> function0) {
        z65.h(function0, "calculation");
        return new s03(function0, null);
    }
}
