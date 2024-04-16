package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: RecyclerDecoration.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000b"}, d2 = {"Lv99;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "startPadding", "Landroidx/recyclerview/widget/RecyclerView$o;", "a", c.a, "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: v99  reason: default package */
/* loaded from: classes.dex */
public final class v99 {
    public static final v99 a = new v99();

    private v99() {
    }

    public static /* synthetic */ RecyclerView.o b(v99 v99Var, Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 16;
        }
        return v99Var.a(context, i);
    }

    public final RecyclerView.o a(Context context, int i) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        jx9 jx9Var = jx9.a;
        return new qta(jx9Var.a(i), iu1.c(context, jw8.f), jx9Var.a(1), true, jx9Var.a(16));
    }

    public final RecyclerView.o c(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        jx9 jx9Var = jx9.a;
        return new qta(jx9Var.a(16), iu1.c(context, jw8.f), jx9Var.a(1), false, jx9Var.a(16));
    }
}
