package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* loaded from: classes.dex */
public class ShareActionProvider extends y4 {
    private int d;
    private final a e;
    final Context f;
    String g;

    /* loaded from: classes.dex */
    private class a implements MenuItem.OnMenuItemClickListener {
        a() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ShareActionProvider shareActionProvider = ShareActionProvider.this;
            Intent b = c.d(shareActionProvider.f, shareActionProvider.g).b(menuItem.getItemId());
            if (b != null) {
                String action = b.getAction();
                if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                    ShareActionProvider.this.l(b);
                }
                ShareActionProvider.this.f.startActivity(b);
                return true;
            }
            return true;
        }
    }

    public ShareActionProvider(Context context) {
        super(context);
        this.d = 4;
        this.e = new a();
        this.g = "share_history.xml";
        this.f = context;
    }

    @Override // defpackage.y4
    public boolean a() {
        return true;
    }

    @Override // defpackage.y4
    public View c() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(c.d(this.f, this.g));
        }
        TypedValue typedValue = new TypedValue();
        this.f.getTheme().resolveAttribute(aw8.j, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(on.b(this.f, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(h19.r);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(h19.q);
        return activityChooserView;
    }

    @Override // defpackage.y4
    public void f(SubMenu subMenu) {
        subMenu.clear();
        c d = c.d(this.f, this.g);
        PackageManager packageManager = this.f.getPackageManager();
        int f = d.f();
        int min = Math.min(f, this.d);
        for (int i = 0; i < min; i++) {
            ResolveInfo e = d.e(i);
            subMenu.add(0, i, i, e.loadLabel(packageManager)).setIcon(e.loadIcon(packageManager)).setOnMenuItemClickListener(this.e);
        }
        if (min < f) {
            SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.f.getString(h19.b));
            for (int i2 = 0; i2 < f; i2++) {
                ResolveInfo e2 = d.e(i2);
                addSubMenu.add(0, i2, i2, e2.loadLabel(packageManager)).setIcon(e2.loadIcon(packageManager)).setOnMenuItemClickListener(this.e);
            }
        }
    }

    void l(Intent intent) {
        intent.addFlags(134742016);
    }
}
