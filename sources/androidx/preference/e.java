package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PreferenceGroupAdapter.java */
/* loaded from: classes.dex */
public class e extends RecyclerView.h<PreferenceViewHolder> implements Preference.b {
    private PreferenceGroup a;
    private List<Preference> b;
    private List<Preference> c;
    private List<c> d;
    private Runnable f = new a();
    private Handler e = new Handler();

    /* compiled from: PreferenceGroupAdapter.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PreferenceGroupAdapter.java */
    /* loaded from: classes.dex */
    public class b implements Preference.d {
        final /* synthetic */ PreferenceGroup a;

        b(PreferenceGroup preferenceGroup) {
            this.a = preferenceGroup;
        }

        @Override // androidx.preference.Preference.d
        public boolean a(Preference preference) {
            this.a.Z0(Integer.MAX_VALUE);
            e.this.g(preference);
            this.a.U0();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PreferenceGroupAdapter.java */
    /* loaded from: classes.dex */
    public static class c {
        int a;
        int b;
        String c;

        c(Preference preference) {
            this.c = preference.getClass().getName();
            this.a = preference.A();
            this.b = preference.N();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.a != cVar.a || this.b != cVar.b || !TextUtils.equals(this.c, cVar.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((((527 + this.a) * 31) + this.b) * 31) + this.c.hashCode();
        }
    }

    public e(PreferenceGroup preferenceGroup) {
        this.a = preferenceGroup;
        this.a.D0(this);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        PreferenceGroup preferenceGroup2 = this.a;
        if (preferenceGroup2 instanceof PreferenceScreen) {
            setHasStableIds(((PreferenceScreen) preferenceGroup2).c1());
        } else {
            setHasStableIds(true);
        }
        p();
    }

    private androidx.preference.b i(PreferenceGroup preferenceGroup, List<Preference> list) {
        androidx.preference.b bVar = new androidx.preference.b(preferenceGroup.s(), list, preferenceGroup.w());
        bVar.F0(new b(preferenceGroup));
        return bVar;
    }

    private List<Preference> j(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int W0 = preferenceGroup.W0();
        int i = 0;
        for (int i2 = 0; i2 < W0; i2++) {
            Preference V0 = preferenceGroup.V0(i2);
            if (V0.U()) {
                if (m(preferenceGroup) && i >= preferenceGroup.T0()) {
                    arrayList2.add(V0);
                } else {
                    arrayList.add(V0);
                }
                if (!(V0 instanceof PreferenceGroup)) {
                    i++;
                } else {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) V0;
                    if (!preferenceGroup2.X0()) {
                        continue;
                    } else if (m(preferenceGroup) && m(preferenceGroup2)) {
                        throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                    } else {
                        for (Preference preference : j(preferenceGroup2)) {
                            if (m(preferenceGroup) && i >= preferenceGroup.T0()) {
                                arrayList2.add(preference);
                            } else {
                                arrayList.add(preference);
                            }
                            i++;
                        }
                    }
                }
            }
        }
        if (m(preferenceGroup) && i > preferenceGroup.T0()) {
            arrayList.add(i(preferenceGroup, arrayList2));
        }
        return arrayList;
    }

    private void k(List<Preference> list, PreferenceGroup preferenceGroup) {
        preferenceGroup.b1();
        int W0 = preferenceGroup.W0();
        for (int i = 0; i < W0; i++) {
            Preference V0 = preferenceGroup.V0(i);
            list.add(V0);
            c cVar = new c(V0);
            if (!this.d.contains(cVar)) {
                this.d.add(cVar);
            }
            if (V0 instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) V0;
                if (preferenceGroup2.X0()) {
                    k(list, preferenceGroup2);
                }
            }
            V0.D0(this);
        }
    }

    private boolean m(PreferenceGroup preferenceGroup) {
        if (preferenceGroup.T0() != Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    @Override // androidx.preference.Preference.b
    public void d(Preference preference) {
        int indexOf = this.c.indexOf(preference);
        if (indexOf != -1) {
            notifyItemChanged(indexOf, preference);
        }
    }

    @Override // androidx.preference.Preference.b
    public void g(Preference preference) {
        this.e.removeCallbacks(this.f);
        this.e.post(this.f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i) {
        if (!hasStableIds()) {
            return -1L;
        }
        return l(i).w();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i) {
        c cVar = new c(l(i));
        int indexOf = this.d.indexOf(cVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.d.size();
        this.d.add(cVar);
        return size;
    }

    public Preference l(int i) {
        if (i >= 0 && i < getItemCount()) {
            return this.c.get(i);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: n */
    public void onBindViewHolder(@NonNull PreferenceViewHolder preferenceViewHolder, int i) {
        l(i).c0(preferenceViewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NonNull
    /* renamed from: o */
    public PreferenceViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        c cVar = this.d.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, k29.p);
        Drawable drawable = obtainStyledAttributes.getDrawable(k29.q);
        if (drawable == null) {
            drawable = on.b(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(cVar.a, viewGroup, false);
        if (inflate.getBackground() == null) {
            syb.y0(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i2 = cVar.b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new PreferenceViewHolder(inflate);
    }

    void p() {
        for (Preference preference : this.b) {
            preference.D0(null);
        }
        ArrayList arrayList = new ArrayList(this.b.size());
        this.b = arrayList;
        k(arrayList, this.a);
        this.c = j(this.a);
        g I = this.a.I();
        if (I != null) {
            I.i();
        }
        notifyDataSetChanged();
        for (Preference preference2 : this.b) {
            preference2.h();
        }
    }
}
