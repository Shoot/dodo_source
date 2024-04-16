package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.preference.DialogPreference;
import androidx.preference.g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: PreferenceFragmentCompat.java */
/* loaded from: classes.dex */
public abstract class d extends Fragment implements g.c, g.a, g.b, DialogPreference.a {
    private g c;
    RecyclerView d;
    private boolean e;
    private boolean f;
    private Runnable h;
    private final c b = new c();
    private int g = pz8.preference_list_fragment;
    private Handler i = new a();
    private final Runnable j = new b();

    /* compiled from: PreferenceFragmentCompat.java */
    /* loaded from: classes.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                d.this.hh();
            }
        }
    }

    /* compiled from: PreferenceFragmentCompat.java */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = d.this.d;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PreferenceFragmentCompat.java */
    /* loaded from: classes.dex */
    public class c extends RecyclerView.o {
        private Drawable a;
        private int b;
        private boolean c = true;

        c() {
        }

        private boolean d(View view, RecyclerView recyclerView) {
            RecyclerView.d0 childViewHolder = recyclerView.getChildViewHolder(view);
            boolean z = false;
            if (!(childViewHolder instanceof PreferenceViewHolder) || !((PreferenceViewHolder) childViewHolder).isDividerAllowedBelow()) {
                return false;
            }
            boolean z2 = this.c;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild < recyclerView.getChildCount() - 1) {
                RecyclerView.d0 childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(indexOfChild + 1));
                if ((childViewHolder2 instanceof PreferenceViewHolder) && ((PreferenceViewHolder) childViewHolder2).isDividerAllowedAbove()) {
                    z = true;
                }
                return z;
            }
            return z2;
        }

        public void a(boolean z) {
            this.c = z;
        }

        public void b(Drawable drawable) {
            if (drawable != null) {
                this.b = drawable.getIntrinsicHeight();
            } else {
                this.b = 0;
            }
            this.a = drawable;
            d.this.d.invalidateItemDecorations();
        }

        public void c(int i) {
            this.b = i;
            d.this.d.invalidateItemDecorations();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            if (d(view, recyclerView)) {
                rect.bottom = this.b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            if (this.a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (d(childAt, recyclerView)) {
                    int y = ((int) childAt.getY()) + childAt.getHeight();
                    this.a.setBounds(0, y, width, this.b + y);
                    this.a.draw(canvas);
                }
            }
        }
    }

    /* compiled from: PreferenceFragmentCompat.java */
    /* renamed from: androidx.preference.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0043d {
        boolean a(@NonNull d dVar, Preference preference);
    }

    /* compiled from: PreferenceFragmentCompat.java */
    /* loaded from: classes.dex */
    public interface e {
        boolean a(d dVar, Preference preference);
    }

    /* compiled from: PreferenceFragmentCompat.java */
    /* loaded from: classes.dex */
    public interface f {
        boolean a(d dVar, PreferenceScreen preferenceScreen);
    }

    private void rh() {
        if (this.i.hasMessages(1)) {
            return;
        }
        this.i.obtainMessage(1).sendToTarget();
    }

    private void sh() {
        if (this.c != null) {
            return;
        }
        throw new RuntimeException("This should be called after super.onCreate.");
    }

    private void wh() {
        jh().setAdapter(null);
        PreferenceScreen kh = kh();
        if (kh != null) {
            kh.f0();
        }
        qh();
    }

    @Override // androidx.preference.g.b
    public void L7(PreferenceScreen preferenceScreen) {
        if ((!(ih() instanceof f) || !((f) ih()).a(this, preferenceScreen)) && (getActivity() instanceof f)) {
            ((f) getActivity()).a(this, preferenceScreen);
        }
    }

    public void gh(int i) {
        sh();
        vh(this.c.m(getContext(), i, kh()));
    }

    void hh() {
        PreferenceScreen kh = kh();
        if (kh != null) {
            jh().setAdapter(mh(kh));
            kh.Y();
        }
        lh();
    }

    @Override // androidx.preference.g.c
    public boolean ig(Preference preference) {
        boolean z;
        if (preference.v() == null) {
            return false;
        }
        if (ih() instanceof e) {
            z = ((e) ih()).a(this, preference);
        } else {
            z = false;
        }
        if (!z && (getActivity() instanceof e)) {
            z = ((e) getActivity()).a(this, preference);
        }
        if (!z) {
            Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
            FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
            Bundle t = preference.t();
            Fragment a2 = supportFragmentManager.x0().a(requireActivity().getClassLoader(), preference.v());
            a2.setArguments(t);
            a2.setTargetFragment(this, 0);
            supportFragmentManager.p().u(((View) getView().getParent()).getId(), a2).i(null).k();
            return true;
        }
        return true;
    }

    public Fragment ih() {
        return null;
    }

    public final RecyclerView jh() {
        return this.d;
    }

    public PreferenceScreen kh() {
        return this.c.k();
    }

    protected RecyclerView.h mh(PreferenceScreen preferenceScreen) {
        return new androidx.preference.e(preferenceScreen);
    }

    public RecyclerView.p nh() {
        return new LinearLayoutManager(getContext());
    }

    @Override // androidx.preference.g.a
    public void of(Preference preference) {
        boolean z;
        androidx.fragment.app.c oh;
        if (ih() instanceof InterfaceC0043d) {
            z = ((InterfaceC0043d) ih()).a(this, preference);
        } else {
            z = false;
        }
        if (!z && (getActivity() instanceof InterfaceC0043d)) {
            z = ((InterfaceC0043d) getActivity()).a(this, preference);
        }
        if (z || getParentFragmentManager().l0("androidx.preference.PreferenceFragment.DIALOG") != null) {
            return;
        }
        if (preference instanceof EditTextPreference) {
            oh = androidx.preference.a.oh(preference.z());
        } else if (preference instanceof ListPreference) {
            oh = er5.oh(preference.z());
        } else if (preference instanceof MultiSelectListPreference) {
            oh = wp6.oh(preference.z());
        } else {
            throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
        }
        oh.setTargetFragment(this, 0);
        oh.show(getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
    }

    public abstract void oh(Bundle bundle, String str);

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(vv8.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = n19.PreferenceThemeOverlay;
        }
        getActivity().getTheme().applyStyle(i, false);
        g gVar = new g(getContext());
        this.c = gVar;
        gVar.p(this);
        if (getArguments() != null) {
            str = getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        } else {
            str = null;
        }
        oh(bundle, str);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, k29.e1, vv8.preferenceFragmentCompatStyle, 0);
        this.g = obtainStyledAttributes.getResourceId(k29.f1, this.g);
        Drawable drawable = obtainStyledAttributes.getDrawable(k29.g1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(k29.h1, -1);
        boolean z = obtainStyledAttributes.getBoolean(k29.i1, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(getContext());
        View inflate = cloneInContext.inflate(this.g, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView ph = ph(cloneInContext, viewGroup2, bundle);
            if (ph != null) {
                this.d = ph;
                ph.addItemDecoration(this.b);
                th(drawable);
                if (dimensionPixelSize != -1) {
                    uh(dimensionPixelSize);
                }
                this.b.a(z);
                if (this.d.getParent() == null) {
                    viewGroup2.addView(this.d);
                }
                this.i.post(this.j);
                return inflate;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.i.removeCallbacks(this.j);
        this.i.removeMessages(1);
        if (this.e) {
            wh();
        }
        this.d = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen kh = kh();
        if (kh != null) {
            Bundle bundle2 = new Bundle();
            kh.x0(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.c.q(this);
        this.c.o(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.c.q(null);
        this.c.o(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen kh;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (kh = kh()) != null) {
            kh.w0(bundle2);
        }
        if (this.e) {
            hh();
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
                this.h = null;
            }
        }
        this.f = true;
    }

    public RecyclerView ph(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (getContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(vy8.b)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(pz8.preference_recyclerview, viewGroup, false);
        recyclerView2.setLayoutManager(nh());
        recyclerView2.setAccessibilityDelegateCompat(new zh8(recyclerView2));
        return recyclerView2;
    }

    @Override // androidx.preference.DialogPreference.a
    public <T extends Preference> T sa(@NonNull CharSequence charSequence) {
        g gVar = this.c;
        if (gVar == null) {
            return null;
        }
        return (T) gVar.a(charSequence);
    }

    public void th(Drawable drawable) {
        this.b.b(drawable);
    }

    public void uh(int i) {
        this.b.c(i);
    }

    public void vh(PreferenceScreen preferenceScreen) {
        if (this.c.r(preferenceScreen) && preferenceScreen != null) {
            qh();
            this.e = true;
            if (this.f) {
                rh();
            }
        }
    }

    protected void lh() {
    }

    protected void qh() {
    }
}
