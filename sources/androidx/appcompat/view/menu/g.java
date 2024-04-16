package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.k;
import defpackage.y4;
/* compiled from: MenuItemImpl.java */
/* loaded from: classes.dex */
public final class g implements s2b {
    private View A;
    private y4 B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private CharSequence e;
    private CharSequence f;
    private Intent g;
    private char h;
    private char j;
    private Drawable l;
    e n;
    private m o;
    private Runnable p;
    private MenuItem.OnMenuItemClickListener q;
    private CharSequence r;
    private CharSequence s;
    private int z;
    private int i = 4096;
    private int k = 4096;
    private int m = 0;
    private ColorStateList t = null;
    private PorterDuff.Mode u = null;
    private boolean v = false;
    private boolean w = false;
    private boolean x = false;
    private int y = 16;
    private boolean D = false;

    /* compiled from: MenuItemImpl.java */
    /* loaded from: classes.dex */
    class a implements y4.b {
        a() {
        }

        @Override // defpackage.y4.b
        public void onActionProviderVisibilityChanged(boolean z) {
            g gVar = g.this;
            gVar.n.L(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(e eVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.n = eVar;
        this.a = i2;
        this.b = i;
        this.c = i3;
        this.d = i4;
        this.e = charSequence;
        this.z = i5;
    }

    private static void d(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.x && (this.v || this.w)) {
            drawable = f83.r(drawable).mutate();
            if (this.v) {
                f83.o(drawable, this.t);
            }
            if (this.w) {
                f83.p(drawable, this.u);
            }
            this.x = false;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A() {
        if (this.n.J() && g() != 0) {
            return true;
        }
        return false;
    }

    public boolean B() {
        if ((this.z & 4) == 4) {
            return true;
        }
        return false;
    }

    @Override // defpackage.s2b
    @NonNull
    public s2b a(y4 y4Var) {
        y4 y4Var2 = this.B;
        if (y4Var2 != null) {
            y4Var2.h();
        }
        this.A = null;
        this.B = y4Var;
        this.n.M(true);
        y4 y4Var3 = this.B;
        if (y4Var3 != null) {
            y4Var3.j(new a());
        }
        return this;
    }

    @Override // defpackage.s2b
    public y4 b() {
        return this.B;
    }

    public void c() {
        this.n.K(this);
    }

    @Override // defpackage.s2b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.n.f(this);
    }

    @Override // defpackage.s2b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.n.m(this);
    }

    public int f() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public char g() {
        if (this.n.I()) {
            return this.j;
        }
        return this.h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // defpackage.s2b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        y4 y4Var = this.B;
        if (y4Var != null) {
            View d = y4Var.d(this);
            this.A = d;
            return d;
        }
        return null;
    }

    @Override // defpackage.s2b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // defpackage.s2b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.m != 0) {
            Drawable b = on.b(this.n.w(), this.m);
            this.m = 0;
            this.l = b;
            return e(b);
        }
        return null;
    }

    @Override // defpackage.s2b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.t;
    }

    @Override // defpackage.s2b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // defpackage.s2b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        if (charSequence == null) {
            return this.e;
        }
        return charSequence;
    }

    @Override // defpackage.s2b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String h() {
        int i;
        char g = g();
        if (g == 0) {
            return "";
        }
        Resources resources = this.n.w().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.n.w()).hasPermanentMenuKey()) {
            sb.append(resources.getString(h19.o));
        }
        if (this.n.I()) {
            i = this.k;
        } else {
            i = this.i;
        }
        d(sb, i, 65536, resources.getString(h19.k));
        d(sb, i, 4096, resources.getString(h19.g));
        d(sb, i, 2, resources.getString(h19.f));
        d(sb, i, 1, resources.getString(h19.l));
        d(sb, i, 4, resources.getString(h19.n));
        d(sb, i, 8, resources.getString(h19.j));
        if (g != '\b') {
            if (g != '\n') {
                if (g != ' ') {
                    sb.append(g);
                } else {
                    sb.append(resources.getString(h19.m));
                }
            } else {
                sb.append(resources.getString(h19.i));
            }
        } else {
            sb.append(resources.getString(h19.h));
        }
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        if (this.o != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence i(k.a aVar) {
        if (aVar != null && aVar.f()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    @Override // defpackage.s2b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        if ((this.y & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        if ((this.y & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        if ((this.y & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        y4 y4Var = this.B;
        if (y4Var != null && y4Var.g()) {
            if ((this.y & 8) != 0 || !this.B.b()) {
                return false;
            }
            return true;
        } else if ((this.y & 8) != 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean j() {
        y4 y4Var;
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null && (y4Var = this.B) != null) {
            this.A = y4Var.d(this);
        }
        if (this.A == null) {
            return false;
        }
        return true;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.g != null) {
            try {
                this.n.w().startActivity(this.g);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        y4 y4Var = this.B;
        if (y4Var != null && y4Var.e()) {
            return true;
        }
        return false;
    }

    public boolean l() {
        if ((this.y & 32) == 32) {
            return true;
        }
        return false;
    }

    public boolean m() {
        if ((this.y & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean n() {
        if ((this.z & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean o() {
        if ((this.z & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // defpackage.s2b, android.view.MenuItem
    @NonNull
    /* renamed from: p */
    public s2b setActionView(int i) {
        Context w = this.n.w();
        setActionView(LayoutInflater.from(w).inflate(i, (ViewGroup) new LinearLayout(w), false));
        return this;
    }

    @Override // defpackage.s2b, android.view.MenuItem
    @NonNull
    /* renamed from: q */
    public s2b setActionView(View view) {
        int i;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i = this.a) > 0) {
            view.setId(i);
        }
        this.n.K(this);
        return this;
    }

    public void r(boolean z) {
        this.D = z;
        this.n.M(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(boolean z) {
        int i;
        int i2 = this.y;
        int i3 = i2 & (-3);
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        int i4 = i | i3;
        this.y = i4;
        if (i2 != i4) {
            this.n.M(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.j == c) {
            return this;
        }
        this.j = Character.toLowerCase(c);
        this.n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.y;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.y = i2;
        if (i != i2) {
            this.n.M(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.y & 4) != 0) {
            this.n.X(this);
        } else {
            s(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.y |= 16;
        } else {
            this.y &= -17;
        }
        this.n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.m = 0;
        this.l = drawable;
        this.x = true;
        this.n.M(false);
        return this;
    }

    @Override // defpackage.s2b, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.t = colorStateList;
        this.v = true;
        this.x = true;
        this.n.M(false);
        return this;
    }

    @Override // defpackage.s2b, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.u = mode;
        this.w = true;
        this.x = true;
        this.n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.h == c) {
            return this;
        }
        this.h = c;
        this.n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.h = c;
        this.j = Character.toLowerCase(c2);
        this.n.M(false);
        return this;
    }

    @Override // defpackage.s2b, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.z = i;
        this.n.K(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.n.M(false);
        m mVar = this.o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (y(z)) {
            this.n.L(this);
        }
        return this;
    }

    public void t(boolean z) {
        int i;
        int i2 = this.y & (-5);
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        this.y = i | i2;
    }

    public String toString() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z) {
        if (z) {
            this.y |= 32;
        } else {
            this.y &= -33;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // defpackage.s2b, android.view.MenuItem
    @NonNull
    /* renamed from: w */
    public s2b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public void x(m mVar) {
        this.o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean y(boolean z) {
        int i;
        int i2 = this.y;
        int i3 = i2 & (-9);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        int i4 = i | i3;
        this.y = i4;
        if (i2 == i4) {
            return false;
        }
        return true;
    }

    public boolean z() {
        return this.n.C();
    }

    @Override // android.view.MenuItem
    @NonNull
    public s2b setContentDescription(CharSequence charSequence) {
        this.r = charSequence;
        this.n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.l = null;
        this.m = i;
        this.x = true;
        this.n.M(false);
        return this;
    }

    @Override // defpackage.s2b, android.view.MenuItem
    @NonNull
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.h == c && this.i == i) {
            return this;
        }
        this.h = c;
        this.i = KeyEvent.normalizeMetaState(i);
        this.n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    @NonNull
    public s2b setTooltipText(CharSequence charSequence) {
        this.s = charSequence;
        this.n.M(false);
        return this;
    }

    @Override // defpackage.s2b, android.view.MenuItem
    @NonNull
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.j == c && this.k == i) {
            return this;
        }
        this.j = Character.toLowerCase(c);
        this.k = KeyEvent.normalizeMetaState(i);
        this.n.M(false);
        return this;
    }

    @Override // defpackage.s2b, android.view.MenuItem
    @NonNull
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.h = c;
        this.i = KeyEvent.normalizeMetaState(i);
        this.j = Character.toLowerCase(c2);
        this.k = KeyEvent.normalizeMetaState(i2);
        this.n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        return setTitle(this.n.w().getString(i));
    }
}
