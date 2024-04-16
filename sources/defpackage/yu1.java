package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
/* compiled from: ContextThemeWrapper.java */
/* renamed from: yu1  reason: default package */
/* loaded from: classes.dex */
public class yu1 extends ContextWrapper {
    private static Configuration f;
    private int a;
    private Resources.Theme b;
    private LayoutInflater c;
    private Configuration d;
    private Resources e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ContextThemeWrapper.java */
    /* renamed from: yu1$a */
    /* loaded from: classes.dex */
    public static class a {
        static Context a(yu1 yu1Var, Configuration configuration) {
            return yu1Var.createConfigurationContext(configuration);
        }
    }

    public yu1() {
        super(null);
    }

    private Resources b() {
        if (this.e == null) {
            Configuration configuration = this.d;
            if (configuration != null && (Build.VERSION.SDK_INT < 26 || !e(configuration))) {
                this.e = a.a(this, this.d).getResources();
            } else {
                this.e = super.getResources();
            }
        }
        return this.e;
    }

    private void d() {
        boolean z;
        if (this.b == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        f(this.b, this.a, z);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f = configuration2;
        }
        return configuration.equals(f);
    }

    public void a(Configuration configuration) {
        if (this.e == null) {
            if (this.d == null) {
                this.d = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.a;
    }

    protected void f(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.c == null) {
                this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = u19.e;
        }
        d();
        return this.b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.a != i) {
            this.a = i;
            d();
        }
    }

    public yu1(Context context, int i) {
        super(context);
        this.a = i;
    }

    public yu1(Context context, Resources.Theme theme) {
        super(context);
        this.b = theme;
    }
}
