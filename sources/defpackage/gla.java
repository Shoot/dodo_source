package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import cloud.mindbox.mobile_sdk.inapp.presentation.view.InAppConstraintLayout;
import com.bumptech.glide.b;
import com.bumptech.glide.load.engine.GlideException;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.qz4;
import kotlin.Metadata;
/* compiled from: SimpleImageInAppViewHolder.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0016R\u0014\u0010%\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010$¨\u0006("}, d2 = {"Lgla;", "Luz4;", "Lqz4$a;", "Landroid/view/ViewGroup;", "currentRoot", "", "n", "o", "i", "p", "Y0", "Lrz4;", "a", "Lrz4;", "()Lrz4;", "wrapper", "Lhx4;", "b", "Lhx4;", "inAppCallback", "Landroid/view/View;", c.a, "Landroid/view/View;", "currentBlur", "Lcloud/mindbox/mobile_sdk/inapp/presentation/view/InAppConstraintLayout;", DateTokenConverter.CONVERTER_KEY, "Lcloud/mindbox/mobile_sdk/inapp/presentation/view/InAppConstraintLayout;", "currentDialog", "", e.a, "Z", "shouldUseBlur", "f", "isInAppMessageActive", "g", "typingView", "()Z", "isActive", "<init>", "(Lrz4;Lhx4;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: gla  reason: default package */
/* loaded from: classes.dex */
public final class gla implements uz4<qz4.a> {
    private final rz4<qz4.a> a;
    private final hx4 b;
    private View c;
    private InAppConstraintLayout d;
    private final boolean e;
    private boolean f;
    private View g;

    /* compiled from: SimpleImageInAppViewHolder.kt */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u0004\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J>\u0010\u000e\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"gla$a", "Lvi9;", "Landroid/graphics/drawable/Drawable;", "Lcom/bumptech/glide/load/engine/GlideException;", e.a, "", "model", "Ln6b;", "target", "", "isFirstResource", "resource", "Ldl2;", "dataSource", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: gla$a */
    /* loaded from: classes.dex */
    public static final class a implements vi9<Drawable> {
        final /* synthetic */ ViewGroup b;

        a(ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // defpackage.vi9
        /* renamed from: a */
        public boolean f(Drawable drawable, Object obj, n6b<Drawable> n6bVar, dl2 dl2Var, boolean z) {
            gla.this.i(this.b);
            return false;
        }

        @Override // defpackage.vi9
        public boolean e(GlideException glideException, Object obj, n6b<Drawable> n6bVar, boolean z) {
            gla glaVar = gla.this;
            Throwable th = glideException;
            if (glideException == null) {
                th = new RuntimeException("Failed to load inapp image");
            }
            gk6.b(glaVar, "Failed to load inapp image", th);
            gla.this.Y0();
            gla.this.f = false;
            return false;
        }
    }

    public gla(rz4<qz4.a> rz4Var, hx4 hx4Var) {
        z65.h(rz4Var, "wrapper");
        z65.h(hx4Var, "inAppCallback");
        this.a = rz4Var;
        this.b = hx4Var;
        this.e = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(ViewGroup viewGroup) {
        final ImageView imageView = (ImageView) viewGroup.findViewById(sx8.iv_close);
        if (imageView != null) {
            imageView.setVisibility(0);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: cla
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gla.j(imageView, this, view);
                }
            });
        }
        InAppConstraintLayout inAppConstraintLayout = this.d;
        View view = null;
        if (inAppConstraintLayout == null) {
            z65.z("currentDialog");
            inAppConstraintLayout = null;
        }
        vn3.i(inAppConstraintLayout, new View.OnClickListener() { // from class: dla
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                gla.k(gla.this, view2);
            }
        });
        InAppConstraintLayout inAppConstraintLayout2 = this.d;
        if (inAppConstraintLayout2 == null) {
            z65.z("currentDialog");
            inAppConstraintLayout2 = null;
        }
        inAppConstraintLayout2.setDismissListener(new View.OnClickListener() { // from class: ela
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                gla.l(gla.this, view2);
            }
        });
        View view2 = this.c;
        if (view2 == null) {
            z65.z("currentBlur");
            view2 = null;
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: fla
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                gla.m(gla.this, view3);
            }
        });
        View view3 = this.c;
        if (view3 == null) {
            z65.z("currentBlur");
        } else {
            view = view3;
        }
        view.setVisibility(0);
        gk6.d(this, "In-app shown");
        a().e().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(ImageView imageView, gla glaVar, View view) {
        z65.h(imageView, "$this_apply");
        z65.h(glaVar, "this$0");
        gk6.d(imageView, "In-app dismissed by close click");
        glaVar.b.b(glaVar.a().c().a());
        glaVar.Y0();
        glaVar.f = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(gla glaVar, View view) {
        boolean y;
        boolean y2;
        z65.h(glaVar, "this$0");
        glaVar.a().d().onClick();
        glaVar.b.a(glaVar.a().c().a(), glaVar.a().c().d(), glaVar.a().c().c());
        y = l0b.y(glaVar.a().c().d());
        if (!(!y)) {
            y2 = l0b.y(glaVar.a().c().c());
            if (!(!y2)) {
                return;
            }
        }
        glaVar.b.b(glaVar.a().c().a());
        gk6.d(glaVar, "In-app dismissed by click");
        glaVar.f = false;
        glaVar.Y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(gla glaVar, View view) {
        z65.h(glaVar, "this$0");
        glaVar.b.b(glaVar.a().c().a());
        gk6.d(glaVar, "In-app dismissed by dialog click");
        glaVar.f = false;
        glaVar.Y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(gla glaVar, View view) {
        z65.h(glaVar, "this$0");
        glaVar.b.b(glaVar.a().c().a());
        gk6.d(glaVar, "In-app dismissed by background click");
        glaVar.f = false;
        glaVar.Y0();
    }

    private final void n(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null && inputMethodManager.isAcceptingText()) {
            this.g = viewGroup.findFocus();
            inputMethodManager.hideSoftInputFromWindow(viewGroup.getWindowToken(), 0);
        }
        View inflate = from.inflate(qz8.blur_layout, viewGroup, false);
        z65.g(inflate, "inflater.inflate(\n      …          false\n        )");
        this.c = inflate;
        if (!this.e) {
            gk6.d(this, "Disable blur");
            View view = this.c;
            if (view == null) {
                z65.z("currentBlur");
                view = null;
            }
            view.setBackgroundColor(iu1.c(context, 17170445));
        }
        View inflate2 = from.inflate(qz8.default_inapp_layout, viewGroup, false);
        z65.f(inflate2, "null cannot be cast to non-null type cloud.mindbox.mobile_sdk.inapp.presentation.view.InAppConstraintLayout");
        this.d = (InAppConstraintLayout) inflate2;
    }

    private final void o() {
        View view = this.g;
        if (view != null) {
            view.requestFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(view, 1);
            }
        }
    }

    @Override // defpackage.uz4
    public void Y0() {
        ViewGroup viewGroup;
        gk6.d(this, "hide " + a().c().a() + " on " + hashCode());
        o();
        InAppConstraintLayout inAppConstraintLayout = this.d;
        View view = null;
        if (inAppConstraintLayout == null) {
            z65.z("currentDialog");
            inAppConstraintLayout = null;
        }
        ViewParent parent = inAppConstraintLayout.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            InAppConstraintLayout inAppConstraintLayout2 = this.d;
            if (inAppConstraintLayout2 == null) {
                z65.z("currentDialog");
                inAppConstraintLayout2 = null;
            }
            viewGroup.removeView(inAppConstraintLayout2);
            View view2 = this.c;
            if (view2 == null) {
                z65.z("currentBlur");
            } else {
                view = view2;
            }
            viewGroup.removeView(view);
        }
    }

    @Override // defpackage.uz4
    public rz4<qz4.a> a() {
        return this.a;
    }

    @Override // defpackage.uz4
    public boolean b() {
        return this.f;
    }

    public void p(ViewGroup viewGroup) {
        boolean y;
        z65.h(viewGroup, "currentRoot");
        gk6.d(this, "Show " + a().c().a() + " on " + hashCode());
        y = l0b.y(a().c().b());
        if (y) {
            gk6.d(this, "In-app image url is blank");
            return;
        }
        n(viewGroup);
        this.f = true;
        View view = this.c;
        InAppConstraintLayout inAppConstraintLayout = null;
        if (view == null) {
            z65.z("currentBlur");
            view = null;
        }
        viewGroup.addView(view);
        InAppConstraintLayout inAppConstraintLayout2 = this.d;
        if (inAppConstraintLayout2 == null) {
            z65.z("currentDialog");
            inAppConstraintLayout2 = null;
        }
        viewGroup.addView(inAppConstraintLayout2);
        InAppConstraintLayout inAppConstraintLayout3 = this.d;
        if (inAppConstraintLayout3 == null) {
            z65.z("currentDialog");
        } else {
            inAppConstraintLayout = inAppConstraintLayout3;
        }
        inAppConstraintLayout.requestFocus();
        ImageView imageView = (ImageView) viewGroup.findViewById(sx8.iv_content);
        z65.g(imageView, "show$lambda$6");
        gk6.d(imageView, "Try to show inapp with id " + a().c().a());
        b.t(viewGroup.getContext().getApplicationContext()).t(a().c().b()).S(true).J0(new a(viewGroup)).d().G0(imageView);
    }
}
