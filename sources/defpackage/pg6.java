package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.b;
import com.bumptech.glide.g;
import com.huawei.hms.opendevice.c;
import defpackage.fr5;
import java.util.List;
import kotlin.Metadata;
/* compiled from: MenuPreloadModelProvider.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0014\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lpg6;", "Lfr5$a;", "Lye6;", "", "position", "", "a", "item", "Lcom/bumptech/glide/g;", c.a, "Landroid/content/Context;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "b", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "items", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pg6  reason: default package */
/* loaded from: classes2.dex */
public final class pg6 implements fr5.a<ye6> {
    private final Context a;
    private final List<ye6> b;

    /* JADX WARN: Multi-variable type inference failed */
    public pg6(Context context, List<? extends ye6> list) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(list, "items");
        this.a = context;
        this.b = list;
    }

    @Override // defpackage.fr5.a
    public List<ye6> a(int i) {
        List<ye6> e;
        e = jc1.e(this.b.get(i));
        return e;
    }

    @Override // defpackage.fr5.a
    /* renamed from: c */
    public g<?> b(ye6 ye6Var) {
        z65.h(ye6Var, "item");
        g<Drawable> t = b.t(this.a).t(ye6Var.y());
        z65.g(t, "load(...)");
        return t;
    }
}
