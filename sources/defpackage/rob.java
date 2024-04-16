package defpackage;

import android.graphics.Typeface;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidParagraphIntrinsics.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0010\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0012¨\u0006\u0016"}, d2 = {"Lrob;", "", "Lcua;", "a", "Lcua;", "resolveResult", "b", "Lrob;", StatisticManager.NEXT, c.a, "Ljava/lang/Object;", "getInitial", "()Ljava/lang/Object;", "initial", "Landroid/graphics/Typeface;", "()Landroid/graphics/Typeface;", "typeface", "", "()Z", "isStaleResolvedFont", "<init>", "(Lcua;Lrob;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: rob  reason: default package */
/* loaded from: classes.dex */
public final class rob {
    private final cua<Object> a;
    private final rob b;
    private final Object c;

    public rob(cua<? extends Object> cuaVar, rob robVar) {
        z65.h(cuaVar, "resolveResult");
        this.a = cuaVar;
        this.b = robVar;
        this.c = cuaVar.getValue();
    }

    public final Typeface a() {
        Object obj = this.c;
        z65.f(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    public final boolean b() {
        rob robVar;
        if (this.a.getValue() == this.c && ((robVar = this.b) == null || !robVar.b())) {
            return false;
        }
        return true;
    }
}
