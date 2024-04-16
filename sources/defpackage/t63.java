package defpackage;

import android.content.Context;
import com.dodopizza.android.view.custom.doubleimageview.DoubleImageView;
import kotlin.Metadata;
/* compiled from: DoubleImageHandler.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¨\u0006\r"}, d2 = {"Lt63;", "", "Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;", "target", "", "firstImageUrl", "secondImageUrl", "", "placeHolderResId", "", "a", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: t63  reason: default package */
/* loaded from: classes.dex */
public final class t63 {
    public static final t63 a = new t63();

    private t63() {
    }

    public final void a(DoubleImageView doubleImageView, String str, String str2, int i) {
        z65.h(doubleImageView, "target");
        z65.h(str, "firstImageUrl");
        z65.h(str2, "secondImageUrl");
        u63 u63Var = new u63(doubleImageView, null, 2, null);
        yu4 yu4Var = new yu4();
        yu4Var.f().invoke(str);
        yu4Var.g().invoke(Integer.valueOf(i));
        yu4Var.h().invoke(u63Var.f());
        xu4 e = yu4Var.e();
        yu4 yu4Var2 = new yu4();
        yu4Var2.f().invoke(str2);
        yu4Var2.g().invoke(Integer.valueOf(i));
        yu4Var2.h().invoke(u63Var.g());
        xu4 e2 = yu4Var2.e();
        zf4 zf4Var = zf4.a;
        Context context = doubleImageView.getContext();
        z65.g(context, "getContext(...)");
        zf4Var.a(context, e);
        Context context2 = doubleImageView.getContext();
        z65.g(context2, "getContext(...)");
        zf4Var.a(context2, e2);
    }
}
