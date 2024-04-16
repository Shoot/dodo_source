package defpackage;

import ch.qos.logback.core.joran.action.Action;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: DataStoreFactory.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012Jb\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¨\u0006\u0013"}, d2 = {"Lol2;", "", "T", "Lxca;", "serializer", "Lng9;", "corruptionHandler", "", "Lwk2;", "migrations", "Lqx1;", Action.SCOPE_ATTRIBUTE, "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Lnl2;", "a", "<init>", "()V", "datastore-core"}, k = 1, mv = {1, 5, 1})
/* renamed from: ol2  reason: default package */
/* loaded from: classes.dex */
public final class ol2 {
    public static final ol2 a = new ol2();

    private ol2() {
    }

    public final <T> nl2<T> a(xca<T> xcaVar, ng9<T> ng9Var, List<? extends wk2<T>> list, qx1 qx1Var, Function0<? extends File> function0) {
        List e;
        z65.h(xcaVar, "serializer");
        z65.h(list, "migrations");
        z65.h(qx1Var, Action.SCOPE_ATTRIBUTE);
        z65.h(function0, "produceFile");
        if (ng9Var == null) {
            ng9Var = (ng9<T>) new gz6();
        }
        ng9<T> ng9Var2 = ng9Var;
        e = jc1.e(xk2.a.b(list));
        return new pma(function0, xcaVar, e, ng9Var2, qx1Var);
    }
}
