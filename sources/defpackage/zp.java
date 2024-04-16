package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import ch.qos.logback.core.CoreConstants;
import defpackage.nv4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ApplyDefaultStrategy.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lzp;", "Lxj6;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lod9;", "message", "Lyh6;", "state", "", "error", "Lnv4;", "a", "Landroid/graphics/Bitmap;", "b", "Landroid/graphics/Bitmap;", "defaultImage", "<init>", "(Landroid/graphics/Bitmap;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: zp  reason: default package */
/* loaded from: classes.dex */
public final class zp implements xj6 {
    private final Bitmap b;

    public zp(Bitmap bitmap) {
        this.b = bitmap;
    }

    @Override // defpackage.xj6
    public nv4 a(Context context, od9 od9Var, yh6 yh6Var, Throwable th) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(od9Var, "message");
        z65.h(yh6Var, "state");
        z65.h(th, "error");
        return new nv4.a(this.b);
    }

    public /* synthetic */ zp(Bitmap bitmap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bitmap);
    }
}
