package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.b;
import com.bumptech.glide.g;
import kotlin.Metadata;
/* compiled from: ImageLoader.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lzf4;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lxu4;", "request", "", "a", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zf4  reason: default package */
/* loaded from: classes.dex */
public final class zf4 {
    public static final zf4 a = new zf4();

    /* compiled from: ImageLoader.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0010\u0010\b\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0007H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, d2 = {"zf4$a", "Lvla;", "Landroid/graphics/drawable/Drawable;", "placeholder", "", "a", "resource", "Ldlb;", "transition", "k", "errorDrawable", "b", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zf4$a */
    /* loaded from: classes.dex */
    public static final class a extends vla<Drawable> {
        final /* synthetic */ xu4 d;

        a(xu4 xu4Var) {
            this.d = xu4Var;
        }

        @Override // defpackage.k80, defpackage.n6b
        public void a(Drawable drawable) {
            if (drawable != null) {
                this.d.c().a(drawable);
            }
        }

        @Override // defpackage.k80, defpackage.n6b
        public void b(Drawable drawable) {
            if (drawable != null) {
                this.d.c().b(drawable);
            }
        }

        @Override // defpackage.n6b
        /* renamed from: k */
        public void d(Drawable drawable, dlb<? super Drawable> dlbVar) {
            z65.h(drawable, "resource");
            this.d.c().c(drawable);
        }
    }

    private zf4() {
    }

    public final void a(Context context, xu4 xu4Var) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(xu4Var, "request");
        g<Drawable> t = b.t(context).t(xu4Var.d());
        xi9 g = new xi9().a0(xu4Var.b()).g(d33.a);
        tkb<Bitmap> a2 = xu4Var.a();
        if (a2 != null) {
            g.o0(a2);
        }
        t.b(g.b0(yj8.IMMEDIATE)).D0(new a(xu4Var));
    }
}
