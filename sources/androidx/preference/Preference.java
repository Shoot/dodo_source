package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.preference.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    private boolean A;
    private boolean B;
    private boolean I;
    private int S4;
    private b T4;
    private List<Preference> U4;
    private PreferenceGroup V4;
    private boolean W4;
    private boolean X;
    private boolean X4;
    private boolean Y;
    private e Y4;
    private int Z;
    private f Z4;
    private Context a;
    private final View.OnClickListener a5;
    private g b;
    private long c;
    private boolean d;
    private c e;
    private d f;
    private int g;
    private int h;
    private CharSequence i;
    private CharSequence j;
    private int k;
    private Drawable l;
    private String m;
    private Intent n;
    private String o;
    private Bundle p;
    private boolean q;
    private boolean r;
    private boolean s;
    private String t;
    private Object u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    /* loaded from: classes.dex */
    public static class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new a();

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<BaseSavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public BaseSavedState[] newArray(int i) {
                return new BaseSavedState[i];
            }
        }

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.p0(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        void d(Preference preference);

        void g(Preference preference);
    }

    /* loaded from: classes.dex */
    public interface c {
        boolean a(Preference preference, Object obj);
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean a(Preference preference);
    }

    /* loaded from: classes.dex */
    private static class e implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
        private final Preference a;

        e(Preference preference) {
            this.a = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence K = this.a.K();
            if (this.a.P() && !TextUtils.isEmpty(K)) {
                contextMenu.setHeaderTitle(K);
                contextMenu.add(0, 0, 0, a19.copy).setOnMenuItemClickListener(this);
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            CharSequence K = this.a.K();
            ((ClipboardManager) this.a.s().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", K));
            Toast.makeText(this.a.s(), this.a.s().getString(a19.preference_copied, K), 0).show();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface f<T extends Preference> {
        CharSequence a(T t);
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.g = Integer.MAX_VALUE;
        this.h = 0;
        this.q = true;
        this.r = true;
        this.s = true;
        this.v = true;
        this.w = true;
        this.x = true;
        this.y = true;
        this.z = true;
        this.B = true;
        this.Y = true;
        int i3 = pz8.preference;
        this.Z = i3;
        this.a5 = new a();
        this.a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k29.s0, i, i2);
        this.k = fob.n(obtainStyledAttributes, k29.Q0, k29.t0, 0);
        this.m = fob.o(obtainStyledAttributes, k29.T0, k29.z0);
        this.i = fob.p(obtainStyledAttributes, k29.b1, k29.x0);
        this.j = fob.p(obtainStyledAttributes, k29.a1, k29.A0);
        this.g = fob.d(obtainStyledAttributes, k29.V0, k29.B0, Integer.MAX_VALUE);
        this.o = fob.o(obtainStyledAttributes, k29.P0, k29.G0);
        this.Z = fob.n(obtainStyledAttributes, k29.U0, k29.w0, i3);
        this.S4 = fob.n(obtainStyledAttributes, k29.c1, k29.C0, 0);
        this.q = fob.b(obtainStyledAttributes, k29.O0, k29.v0, true);
        this.r = fob.b(obtainStyledAttributes, k29.X0, k29.y0, true);
        this.s = fob.b(obtainStyledAttributes, k29.W0, k29.u0, true);
        this.t = fob.o(obtainStyledAttributes, k29.M0, k29.D0);
        int i4 = k29.J0;
        this.y = fob.b(obtainStyledAttributes, i4, i4, this.r);
        int i5 = k29.K0;
        this.z = fob.b(obtainStyledAttributes, i5, i5, this.r);
        int i6 = k29.L0;
        if (obtainStyledAttributes.hasValue(i6)) {
            this.u = g0(obtainStyledAttributes, i6);
        } else {
            int i7 = k29.E0;
            if (obtainStyledAttributes.hasValue(i7)) {
                this.u = g0(obtainStyledAttributes, i7);
            }
        }
        this.Y = fob.b(obtainStyledAttributes, k29.Y0, k29.F0, true);
        int i8 = k29.Z0;
        boolean hasValue = obtainStyledAttributes.hasValue(i8);
        this.A = hasValue;
        if (hasValue) {
            this.B = fob.b(obtainStyledAttributes, i8, k29.H0, true);
        }
        this.I = fob.b(obtainStyledAttributes, k29.R0, k29.I0, false);
        int i9 = k29.S0;
        this.x = fob.b(obtainStyledAttributes, i9, i9, true);
        int i10 = k29.N0;
        this.X = fob.b(obtainStyledAttributes, i10, i10, false);
        obtainStyledAttributes.recycle();
    }

    private void N0(@NonNull SharedPreferences.Editor editor) {
        if (this.b.t()) {
            editor.apply();
        }
    }

    private void O0() {
        Preference q;
        String str = this.t;
        if (str != null && (q = q(str)) != null) {
            q.P0(this);
        }
    }

    private void P0(Preference preference) {
        List<Preference> list = this.U4;
        if (list != null) {
            list.remove(preference);
        }
    }

    private void p() {
        H();
        if (M0() && J().contains(this.m)) {
            n0(true, null);
            return;
        }
        Object obj = this.u;
        if (obj != null) {
            n0(false, obj);
        }
    }

    private void u0() {
        if (TextUtils.isEmpty(this.t)) {
            return;
        }
        Preference q = q(this.t);
        if (q != null) {
            q.v0(this);
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.t + "\" not found for preference \"" + this.m + "\" (title: \"" + ((Object) this.i) + "\"");
    }

    private void v0(Preference preference) {
        if (this.U4 == null) {
            this.U4 = new ArrayList();
        }
        this.U4.add(preference);
        preference.e0(this, L0());
    }

    private void y0(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                y0(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public final int A() {
        return this.Z;
    }

    public void A0(Drawable drawable) {
        if (this.l != drawable) {
            this.l = drawable;
            this.k = 0;
            V();
        }
    }

    public int B() {
        return this.g;
    }

    public void B0(Intent intent) {
        this.n = intent;
    }

    public PreferenceGroup C() {
        return this.V4;
    }

    public void C0(int i) {
        this.Z = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean D(boolean z) {
        if (!M0()) {
            return z;
        }
        H();
        return this.b.l().getBoolean(this.m, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void D0(b bVar) {
        this.T4 = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int E(int i) {
        if (!M0()) {
            return i;
        }
        H();
        return this.b.l().getInt(this.m, i);
    }

    public void E0(c cVar) {
        this.e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String F(String str) {
        if (!M0()) {
            return str;
        }
        H();
        return this.b.l().getString(this.m, str);
    }

    public void F0(d dVar) {
        this.f = dVar;
    }

    public Set<String> G(Set<String> set) {
        if (!M0()) {
            return set;
        }
        H();
        return this.b.l().getStringSet(this.m, set);
    }

    public void G0(int i) {
        if (i != this.g) {
            this.g = i;
            X();
        }
    }

    public uh8 H() {
        g gVar = this.b;
        if (gVar != null) {
            gVar.j();
        }
        return null;
    }

    public void H0(CharSequence charSequence) {
        if (L() == null) {
            if (!TextUtils.equals(this.j, charSequence)) {
                this.j = charSequence;
                V();
                return;
            }
            return;
        }
        throw new IllegalStateException("Preference already has a SummaryProvider set.");
    }

    public g I() {
        return this.b;
    }

    public final void I0(f fVar) {
        this.Z4 = fVar;
        V();
    }

    public SharedPreferences J() {
        if (this.b != null) {
            H();
            return this.b.l();
        }
        return null;
    }

    public void J0(int i) {
        K0(this.a.getString(i));
    }

    public CharSequence K() {
        if (L() != null) {
            return L().a(this);
        }
        return this.j;
    }

    public void K0(CharSequence charSequence) {
        if ((charSequence == null && this.i != null) || (charSequence != null && !charSequence.equals(this.i))) {
            this.i = charSequence;
            V();
        }
    }

    public final f L() {
        return this.Z4;
    }

    public boolean L0() {
        return !Q();
    }

    public CharSequence M() {
        return this.i;
    }

    protected boolean M0() {
        if (this.b != null && R() && O()) {
            return true;
        }
        return false;
    }

    public final int N() {
        return this.S4;
    }

    public boolean O() {
        return !TextUtils.isEmpty(this.m);
    }

    public boolean P() {
        return this.X;
    }

    public boolean Q() {
        if (this.q && this.v && this.w) {
            return true;
        }
        return false;
    }

    public boolean R() {
        return this.s;
    }

    public boolean T() {
        return this.r;
    }

    public final boolean U() {
        return this.x;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void V() {
        b bVar = this.T4;
        if (bVar != null) {
            bVar.d(this);
        }
    }

    public void W(boolean z) {
        List<Preference> list = this.U4;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).e0(this, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void X() {
        b bVar = this.T4;
        if (bVar != null) {
            bVar.g(this);
        }
    }

    public void Y() {
        u0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.V4 != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.V4 = preferenceGroup;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a0(g gVar) {
        this.b = gVar;
        if (!this.d) {
            this.c = gVar.f();
        }
        p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b0(g gVar, long j) {
        this.c = j;
        this.d = true;
        try {
            a0(gVar);
        } finally {
            this.d = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c0(androidx.preference.PreferenceViewHolder r9) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.c0(androidx.preference.PreferenceViewHolder):void");
    }

    public void e0(Preference preference, boolean z) {
        if (this.v == z) {
            this.v = !z;
            W(L0());
            V();
        }
    }

    public void f0() {
        O0();
        this.W4 = true;
    }

    public boolean g(Object obj) {
        c cVar = this.e;
        if (cVar != null && !cVar.a(this, obj)) {
            return false;
        }
        return true;
    }

    protected Object g0(TypedArray typedArray, int i) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        this.W4 = false;
    }

    @Override // java.lang.Comparable
    /* renamed from: i */
    public int compareTo(@NonNull Preference preference) {
        int i = this.g;
        int i2 = preference.g;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.i;
        CharSequence charSequence2 = preference.i;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.i.toString());
    }

    public void i0(Preference preference, boolean z) {
        if (this.w == z) {
            this.w = !z;
            W(L0());
            V();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(Bundle bundle) {
        Parcelable parcelable;
        if (O() && (parcelable = bundle.getParcelable(this.m)) != null) {
            this.X4 = false;
            k0(parcelable);
            if (!this.X4) {
                throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k0(Parcelable parcelable) {
        this.X4 = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Parcelable l0() {
        this.X4 = true;
        return AbsSavedState.EMPTY_STATE;
    }

    @Deprecated
    protected void n0(boolean z, Object obj) {
        m0(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(Bundle bundle) {
        if (O()) {
            this.X4 = false;
            Parcelable l0 = l0();
            if (this.X4) {
                if (l0 != null) {
                    bundle.putParcelable(this.m, l0);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
        }
    }

    public void o0() {
        g.c h;
        if (Q() && T()) {
            d0();
            d dVar = this.f;
            if (dVar != null && dVar.a(this)) {
                return;
            }
            g I = I();
            if ((I == null || (h = I.h()) == null || !h.ig(this)) && this.n != null) {
                s().startActivity(this.n);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p0(View view) {
        o0();
    }

    protected <T extends Preference> T q(@NonNull String str) {
        g gVar = this.b;
        if (gVar == null) {
            return null;
        }
        return (T) gVar.a(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean q0(boolean z) {
        if (!M0()) {
            return false;
        }
        if (z == D(!z)) {
            return true;
        }
        H();
        SharedPreferences.Editor e2 = this.b.e();
        e2.putBoolean(this.m, z);
        N0(e2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean r0(int i) {
        if (!M0()) {
            return false;
        }
        if (i == E(~i)) {
            return true;
        }
        H();
        SharedPreferences.Editor e2 = this.b.e();
        e2.putInt(this.m, i);
        N0(e2);
        return true;
    }

    public Context s() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean s0(String str) {
        if (!M0()) {
            return false;
        }
        if (TextUtils.equals(str, F(null))) {
            return true;
        }
        H();
        SharedPreferences.Editor e2 = this.b.e();
        e2.putString(this.m, str);
        N0(e2);
        return true;
    }

    public Bundle t() {
        if (this.p == null) {
            this.p = new Bundle();
        }
        return this.p;
    }

    public boolean t0(Set<String> set) {
        if (!M0()) {
            return false;
        }
        if (set.equals(G(null))) {
            return true;
        }
        H();
        SharedPreferences.Editor e2 = this.b.e();
        e2.putStringSet(this.m, set);
        N0(e2);
        return true;
    }

    public String toString() {
        return u().toString();
    }

    StringBuilder u() {
        StringBuilder sb = new StringBuilder();
        CharSequence M = M();
        if (!TextUtils.isEmpty(M)) {
            sb.append(M);
            sb.append(' ');
        }
        CharSequence K = K();
        if (!TextUtils.isEmpty(K)) {
            sb.append(K);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    public String v() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long w() {
        return this.c;
    }

    public void w0(Bundle bundle) {
        k(bundle);
    }

    public Intent x() {
        return this.n;
    }

    public void x0(Bundle bundle) {
        o(bundle);
    }

    public String z() {
        return this.m;
    }

    public void z0(int i) {
        A0(on.b(this.a, i));
        this.k = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d0() {
    }

    @Deprecated
    public void h0(d4 d4Var) {
    }

    protected void m0(Object obj) {
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fob.a(context, vv8.preferenceStyle, 16842894));
    }

    public Preference(Context context) {
        this(context, null);
    }
}
