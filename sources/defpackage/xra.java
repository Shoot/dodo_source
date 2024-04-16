package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SplashScreen.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0004\u0005\f\u0003\rB\u0011\b\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lxra;", "", "", "b", "Lxra$c;", "a", "Lxra$c;", "impl", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "core-splashscreen_release"}, k = 1, mv = {1, 6, 0})
@SuppressLint({"CustomSplashScreen"})
/* renamed from: xra  reason: default package */
/* loaded from: classes.dex */
public final class xra {
    public static final a b = new a(null);
    private final c a;

    /* compiled from: SplashScreen.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lxra$a;", "", "Landroid/app/Activity;", "Lxra;", "a", "", "MASK_FACTOR", "F", "<init>", "()V", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: xra$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final xra a(Activity activity) {
            z65.h(activity, "<this>");
            xra xraVar = new xra(activity, null);
            xraVar.b();
            return xraVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SplashScreen.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b8\u00109J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\t\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0004R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\"\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001b\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001f\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006:"}, d2 = {"Lxra$c;", "", "", "b", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "currentTheme", "Landroid/util/TypedValue;", "typedValue", com.huawei.hms.opendevice.c.a, "Landroid/app/Activity;", "a", "Landroid/app/Activity;", "()Landroid/app/Activity;", "activity", "", "I", "getFinalThemeId", "()I", "setFinalThemeId", "(I)V", "finalThemeId", "Ljava/lang/Integer;", "getBackgroundResId", "()Ljava/lang/Integer;", "setBackgroundResId", "(Ljava/lang/Integer;)V", "backgroundResId", DateTokenConverter.CONVERTER_KEY, "getBackgroundColor", "setBackgroundColor", "backgroundColor", "Landroid/graphics/drawable/Drawable;", e.a, "Landroid/graphics/drawable/Drawable;", "getIcon", "()Landroid/graphics/drawable/Drawable;", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", RemoteMessageConst.Notification.ICON, "", "f", "Z", "getHasBackground", "()Z", "setHasBackground", "(Z)V", "hasBackground", "Lxra$d;", "g", "Lxra$d;", "getSplashScreenWaitPredicate", "()Lxra$d;", "setSplashScreenWaitPredicate", "(Lxra$d;)V", "splashScreenWaitPredicate", "<init>", "(Landroid/app/Activity;)V", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: xra$c */
    /* loaded from: classes.dex */
    public static class c {
        private final Activity a;
        private int b;
        private Integer c;
        private Integer d;
        private Drawable e;
        private boolean f;
        private d g;

        public c(Activity activity) {
            z65.h(activity, "activity");
            this.a = activity;
            this.g = new d() { // from class: yra
            };
        }

        public final Activity a() {
            return this.a;
        }

        public void b() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = this.a.getTheme();
            boolean z = true;
            if (theme.resolveAttribute(uv8.windowSplashScreenBackground, typedValue, true)) {
                this.c = Integer.valueOf(typedValue.resourceId);
                this.d = Integer.valueOf(typedValue.data);
            }
            if (theme.resolveAttribute(uv8.windowSplashScreenAnimatedIcon, typedValue, true)) {
                this.e = theme.getDrawable(typedValue.resourceId);
            }
            if (theme.resolveAttribute(uv8.splashScreenIconSize, typedValue, true)) {
                if (typedValue.resourceId != tw8.splashscreen_icon_size_with_background) {
                    z = false;
                }
                this.f = z;
            }
            z65.g(theme, "currentTheme");
            c(theme, typedValue);
        }

        protected final void c(Resources.Theme theme, TypedValue typedValue) {
            z65.h(theme, "currentTheme");
            z65.h(typedValue, "typedValue");
            if (theme.resolveAttribute(uv8.postSplashScreenTheme, typedValue, true)) {
                int i = typedValue.resourceId;
                this.b = i;
                if (i != 0) {
                    this.a.setTheme(i);
                }
            }
        }
    }

    /* compiled from: SplashScreen.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxra$d;", "", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: xra$d */
    /* loaded from: classes.dex */
    public interface d {
    }

    public /* synthetic */ xra(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        this.a.b();
    }

    private xra(Activity activity) {
        c cVar;
        if (Build.VERSION.SDK_INT >= 31) {
            cVar = new b(activity);
        } else {
            cVar = new c(activity);
        }
        this.a = cVar;
    }

    /* compiled from: SplashScreen.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lxra$b;", "Lxra$c;", "Landroid/window/SplashScreenView;", "child", "", DateTokenConverter.CONVERTER_KEY, "", "b", Image.TYPE_HIGH, "Z", "getMDecorFitWindowInsets", "()Z", e.a, "(Z)V", "mDecorFitWindowInsets", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "i", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "getHierarchyListener", "()Landroid/view/ViewGroup$OnHierarchyChangeListener;", "hierarchyListener", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: xra$b */
    /* loaded from: classes.dex */
    private static final class b extends c {
        private boolean h;
        private final ViewGroup.OnHierarchyChangeListener i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity) {
            super(activity);
            z65.h(activity, "activity");
            this.h = true;
            this.i = new a(activity);
        }

        @Override // defpackage.xra.c
        public void b() {
            Resources.Theme theme = a().getTheme();
            z65.g(theme, "activity.theme");
            c(theme, new TypedValue());
            ((ViewGroup) a().getWindow().getDecorView()).setOnHierarchyChangeListener(this.i);
        }

        public final boolean d(SplashScreenView splashScreenView) {
            WindowInsets build;
            View rootView;
            z65.h(splashScreenView, "child");
            build = zra.a().build();
            z65.g(build, "Builder().build()");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            rootView = splashScreenView.getRootView();
            if (build == rootView.computeSystemWindowInsets(build, rect) && rect.isEmpty()) {
                return false;
            }
            return true;
        }

        public final void e(boolean z) {
            this.h = z;
        }

        /* compiled from: SplashScreen.kt */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0007\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"xra$b$a", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "Landroid/view/View;", "parent", "child", "", "onChildViewAdded", "onChildViewRemoved", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0})
        /* renamed from: xra$b$a */
        /* loaded from: classes.dex */
        public static final class a implements ViewGroup.OnHierarchyChangeListener {
            final /* synthetic */ Activity b;

            a(Activity activity) {
                this.b = activity;
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View view, View view2) {
                if (csa.a(view2)) {
                    b bVar = b.this;
                    bVar.e(bVar.d(dsa.a(view2)));
                    ((ViewGroup) this.b.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View view, View view2) {
            }
        }
    }
}
