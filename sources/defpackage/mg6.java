package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import java.lang.reflect.Method;
/* compiled from: MenuPopupWindow.java */
/* renamed from: mg6  reason: default package */
/* loaded from: classes.dex */
public class mg6 extends dr5 implements ge6 {
    private static Method W4;
    private ge6 V4;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MenuPopupWindow.java */
    /* renamed from: mg6$a */
    /* loaded from: classes.dex */
    public static class a {
        static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MenuPopupWindow.java */
    /* renamed from: mg6$b */
    /* loaded from: classes.dex */
    public static class b {
        static void a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    /* compiled from: MenuPopupWindow.java */
    /* renamed from: mg6$c */
    /* loaded from: classes.dex */
    public static class c extends c93 {
        final int o;
        final int p;
        private ge6 q;
        private MenuItem r;

        /* compiled from: MenuPopupWindow.java */
        /* renamed from: mg6$c$a */
        /* loaded from: classes.dex */
        static class a {
            static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z) {
            super(context, z);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.o = 21;
                this.p = 22;
                return;
            }
            this.o = 22;
            this.p = 21;
        }

        @Override // defpackage.c93
        public /* bridge */ /* synthetic */ int f(int i, int i2, int i3, int i4, int i5) {
            return super.f(i, i2, i3, i4, i5);
        }

        @Override // defpackage.c93
        public /* bridge */ /* synthetic */ boolean g(MotionEvent motionEvent, int i) {
            return super.g(motionEvent, i);
        }

        @Override // defpackage.c93, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // defpackage.c93, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // defpackage.c93, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // defpackage.c93, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // defpackage.c93, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            d dVar;
            int i;
            g gVar;
            int pointToPosition;
            int i2;
            if (this.q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    dVar = (d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    dVar = (d) adapter;
                    i = 0;
                }
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < dVar.getCount()) {
                    gVar = dVar.getItem(i2);
                } else {
                    gVar = null;
                }
                MenuItem menuItem = this.r;
                if (menuItem != gVar) {
                    e b = dVar.b();
                    if (menuItem != null) {
                        this.q.o(b, menuItem);
                    }
                    this.r = gVar;
                    if (gVar != null) {
                        this.q.e(b, gVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            d dVar;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView != null && i == this.p) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    dVar = (d) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    dVar = (d) adapter;
                }
                dVar.b().e(false);
                return true;
            } else {
                return super.onKeyDown(i, keyEvent);
            }
        }

        @Override // defpackage.c93, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(ge6 ge6Var) {
            this.q = ge6Var;
        }

        @Override // defpackage.c93, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                W4 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public mg6(@NonNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void R(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.a(this.Z, (Transition) obj);
        }
    }

    public void S(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.b(this.Z, (Transition) obj);
        }
    }

    public void T(ge6 ge6Var) {
        this.V4 = ge6Var;
    }

    public void U(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = W4;
            if (method != null) {
                try {
                    method.invoke(this.Z, Boolean.valueOf(z));
                    return;
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    return;
                }
            }
            return;
        }
        b.a(this.Z, z);
    }

    @Override // defpackage.ge6
    public void e(@NonNull e eVar, @NonNull MenuItem menuItem) {
        ge6 ge6Var = this.V4;
        if (ge6Var != null) {
            ge6Var.e(eVar, menuItem);
        }
    }

    @Override // defpackage.ge6
    public void o(@NonNull e eVar, @NonNull MenuItem menuItem) {
        ge6 ge6Var = this.V4;
        if (ge6Var != null) {
            ge6Var.o(eVar, menuItem);
        }
    }

    @Override // defpackage.dr5
    @NonNull
    c93 s(Context context, boolean z) {
        c cVar = new c(context, z);
        cVar.setHoverListener(this);
        return cVar;
    }
}
