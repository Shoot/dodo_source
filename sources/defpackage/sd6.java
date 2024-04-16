package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import androidx.annotation.NonNull;
/* compiled from: MenuItemCompat.java */
/* renamed from: sd6  reason: default package */
/* loaded from: classes.dex */
public final class sd6 {

    /* compiled from: MenuItemCompat.java */
    /* renamed from: sd6$a */
    /* loaded from: classes.dex */
    static class a {
        static int a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        static CharSequence b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        static ColorStateList c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        static PorterDuff.Mode d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        static int e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        static CharSequence f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        static MenuItem g(MenuItem menuItem, char c, int i) {
            return menuItem.setAlphabeticShortcut(c, i);
        }

        static MenuItem h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        static MenuItem i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        static MenuItem j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        static MenuItem k(MenuItem menuItem, char c, int i) {
            return menuItem.setNumericShortcut(c, i);
        }

        static MenuItem l(MenuItem menuItem, char c, char c2, int i, int i2) {
            return menuItem.setShortcut(c, c2, i, i2);
        }

        static MenuItem m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    public static MenuItem a(@NonNull MenuItem menuItem, y4 y4Var) {
        if (menuItem instanceof s2b) {
            return ((s2b) menuItem).a(y4Var);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static void b(@NonNull MenuItem menuItem, char c, int i) {
        if (menuItem instanceof s2b) {
            ((s2b) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.g(menuItem, c, i);
        }
    }

    public static void c(@NonNull MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof s2b) {
            ((s2b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.h(menuItem, charSequence);
        }
    }

    public static void d(@NonNull MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof s2b) {
            ((s2b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.i(menuItem, colorStateList);
        }
    }

    public static void e(@NonNull MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof s2b) {
            ((s2b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.j(menuItem, mode);
        }
    }

    public static void f(@NonNull MenuItem menuItem, char c, int i) {
        if (menuItem instanceof s2b) {
            ((s2b) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.k(menuItem, c, i);
        }
    }

    public static void g(@NonNull MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof s2b) {
            ((s2b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m(menuItem, charSequence);
        }
    }
}
