package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
/* compiled from: ContextAwareHelper.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0006R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0012"}, d2 = {"Lhu1;", "", "Landroid/content/Context;", DateTokenConverter.CONVERTER_KEY, "Ls77;", "listener", "", "a", e.a, CoreConstants.CONTEXT_SCOPE_VALUE, c.a, "b", "", "Ljava/util/Set;", "listeners", "Landroid/content/Context;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: hu1  reason: default package */
/* loaded from: classes.dex */
public final class hu1 {
    private final Set<s77> a = new CopyOnWriteArraySet();
    private volatile Context b;

    public final void a(s77 s77Var) {
        z65.h(s77Var, "listener");
        Context context = this.b;
        if (context != null) {
            s77Var.a(context);
        }
        this.a.add(s77Var);
    }

    public final void b() {
        this.b = null;
    }

    public final void c(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.b = context;
        for (s77 s77Var : this.a) {
            s77Var.a(context);
        }
    }

    public final Context d() {
        return this.b;
    }

    public final void e(s77 s77Var) {
        z65.h(s77Var, "listener");
        this.a.remove(s77Var);
    }
}
