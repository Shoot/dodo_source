package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.opendevice.c;
import defpackage.n22;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CreationExtras.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Ljq6;", "Ln22;", "T", "Ln22$b;", Action.KEY_ATTRIBUTE, "t", "", c.a, "(Ln22$b;Ljava/lang/Object;)V", "a", "(Ln22$b;)Ljava/lang/Object;", "initialExtras", "<init>", "(Ln22;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: jq6  reason: default package */
/* loaded from: classes.dex */
public final class jq6 extends n22 {
    public jq6() {
        this(null, 1, null);
    }

    @Override // defpackage.n22
    public <T> T a(n22.b<T> bVar) {
        z65.h(bVar, Action.KEY_ATTRIBUTE);
        return (T) b().get(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void c(n22.b<T> bVar, T t) {
        z65.h(bVar, Action.KEY_ATTRIBUTE);
        b().put(bVar, t);
    }

    public jq6(n22 n22Var) {
        z65.h(n22Var, "initialExtras");
        b().putAll(n22Var.b());
    }

    public /* synthetic */ jq6(n22 n22Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? n22.a.b : n22Var);
    }
}
