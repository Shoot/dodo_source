package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.bumptech.glide.b;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: NotificationImageLoader.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Lp27;", "", "", "imageUrl", "Ltr5;", "listener", "", "a", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: p27  reason: default package */
/* loaded from: classes3.dex */
public final class p27 {
    private final Context a;

    public p27(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = context;
    }

    public final void a(String str, tr5 tr5Var) {
        z65.h(str, "imageUrl");
        z65.h(tr5Var, "listener");
        b.t(this.a).f().M0(str).D0(new a(tr5Var));
    }

    /* compiled from: NotificationImageLoader.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0004H\u0016J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lp27$a;", "Lk42;", "Landroid/graphics/Bitmap;", "resource", "Ldlb;", "transition", "", e.a, "Landroid/graphics/drawable/Drawable;", "errorDrawable", "b", "placeholder", "i", "Ltr5;", DateTokenConverter.CONVERTER_KEY, "Ltr5;", "listener", "<init>", "(Ltr5;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: p27$a */
    /* loaded from: classes3.dex */
    private static final class a extends k42<Bitmap> {
        private final tr5 d;

        public a(tr5 tr5Var) {
            z65.h(tr5Var, "listener");
            this.d = tr5Var;
        }

        @Override // defpackage.k42, defpackage.n6b
        public void b(Drawable drawable) {
            this.d.a(null);
        }

        @Override // defpackage.n6b
        /* renamed from: e */
        public void d(Bitmap bitmap, dlb<? super Bitmap> dlbVar) {
            z65.h(bitmap, "resource");
            this.d.a(bitmap);
        }

        @Override // defpackage.n6b
        public void i(Drawable drawable) {
        }
    }
}
