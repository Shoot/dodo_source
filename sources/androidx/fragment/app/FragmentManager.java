package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.p;
import androidx.lifecycle.d;
import androidx.savedstate.a;
import defpackage.v64;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class FragmentManager {
    private static boolean S = false;
    private a6<Intent> D;
    private a6<IntentSenderRequest> E;
    private a6<String[]> F;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private ArrayList<androidx.fragment.app.a> M;
    private ArrayList<Boolean> N;
    private ArrayList<Fragment> O;
    private androidx.fragment.app.l P;
    private v64.c Q;
    private boolean b;
    ArrayList<androidx.fragment.app.a> d;
    private ArrayList<Fragment> e;
    private OnBackPressedDispatcher g;
    private ArrayList<n> m;
    private androidx.fragment.app.h<?> v;
    private e64 w;
    private Fragment x;
    Fragment y;
    private final ArrayList<o> a = new ArrayList<>();
    private final androidx.fragment.app.o c = new androidx.fragment.app.o();
    private final androidx.fragment.app.i f = new androidx.fragment.app.i(this);
    private final i77 h = new b(false);
    private final AtomicInteger i = new AtomicInteger();
    private final Map<String, BackStackState> j = Collections.synchronizedMap(new HashMap());
    private final Map<String, Bundle> k = Collections.synchronizedMap(new HashMap());
    private final Map<String, m> l = Collections.synchronizedMap(new HashMap());
    private final androidx.fragment.app.j n = new androidx.fragment.app.j(this);
    private final CopyOnWriteArrayList<o64> o = new CopyOnWriteArrayList<>();
    private final xr1<Configuration> p = new xr1() { // from class: j64
        @Override // defpackage.xr1
        public final void accept(Object obj) {
            FragmentManager.this.V0((Configuration) obj);
        }
    };
    private final xr1<Integer> q = new xr1() { // from class: k64
        @Override // defpackage.xr1
        public final void accept(Object obj) {
            FragmentManager.this.W0((Integer) obj);
        }
    };
    private final xr1<cq6> r = new xr1() { // from class: l64
        @Override // defpackage.xr1
        public final void accept(Object obj) {
            FragmentManager.this.X0((cq6) obj);
        }
    };
    private final xr1<d68> s = new xr1() { // from class: m64
        @Override // defpackage.xr1
        public final void accept(Object obj) {
            FragmentManager.this.Y0((d68) obj);
        }
    };
    private final vg6 t = new c();
    int u = -1;
    private androidx.fragment.app.g z = null;
    private androidx.fragment.app.g A = new d();
    private w B = null;
    private w C = new e();
    ArrayDeque<LaunchedFragmentInfo> G = new ArrayDeque<>();
    private Runnable R = new f();

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();
        String a;
        int b;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public LaunchedFragmentInfo[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        LaunchedFragmentInfo(@NonNull String str, int i) {
            this.a = str;
            this.b = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeInt(this.b);
        }

        LaunchedFragmentInfo(@NonNull Parcel parcel) {
            this.a = parcel.readString();
            this.b = parcel.readInt();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements r5<Map<String, Boolean>> {
        a() {
        }

        @Override // defpackage.r5
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void a(Map<String, Boolean> map) {
            int i;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((Boolean) arrayList.get(i2)).booleanValue()) {
                    i = 0;
                } else {
                    i = -1;
                }
                iArr[i2] = i;
            }
            LaunchedFragmentInfo pollFirst = FragmentManager.this.G.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.a;
            int i3 = pollFirst.b;
            Fragment i4 = FragmentManager.this.c.i(str);
            if (i4 == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            i4.onRequestPermissionsResult(i3, strArr, iArr);
        }
    }

    /* loaded from: classes.dex */
    class b extends i77 {
        b(boolean z) {
            super(z);
        }

        @Override // defpackage.i77
        public void b() {
            FragmentManager.this.I0();
        }
    }

    /* loaded from: classes.dex */
    class c implements vg6 {
        c() {
        }

        @Override // defpackage.vg6
        public void a(@NonNull Menu menu) {
            FragmentManager.this.N(menu);
        }

        @Override // defpackage.vg6
        public void b(@NonNull Menu menu) {
            FragmentManager.this.R(menu);
        }

        @Override // defpackage.vg6
        public boolean c(@NonNull MenuItem menuItem) {
            return FragmentManager.this.M(menuItem);
        }

        @Override // defpackage.vg6
        public void d(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
            FragmentManager.this.F(menu, menuInflater);
        }
    }

    /* loaded from: classes.dex */
    class d extends androidx.fragment.app.g {
        d() {
        }

        @Override // androidx.fragment.app.g
        @NonNull
        public Fragment a(@NonNull ClassLoader classLoader, @NonNull String str) {
            return FragmentManager.this.z0().b(FragmentManager.this.z0().f(), str, null);
        }
    }

    /* loaded from: classes.dex */
    class e implements w {
        e() {
        }

        @Override // androidx.fragment.app.w
        @NonNull
        public v a(@NonNull ViewGroup viewGroup) {
            return new androidx.fragment.app.b(viewGroup);
        }
    }

    /* loaded from: classes.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.d0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements o64 {
        final /* synthetic */ Fragment a;

        g(Fragment fragment) {
            this.a = fragment;
        }

        @Override // defpackage.o64
        public void a(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
            this.a.onAttachFragment(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements r5<ActivityResult> {
        h() {
        }

        @Override // defpackage.r5
        /* renamed from: b */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.G.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.a;
            int i = pollFirst.b;
            Fragment i2 = FragmentManager.this.c.i(str);
            if (i2 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            i2.onActivityResult(i, activityResult.b(), activityResult.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements r5<ActivityResult> {
        i() {
        }

        @Override // defpackage.r5
        /* renamed from: b */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.G.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.a;
            int i = pollFirst.b;
            Fragment i2 = FragmentManager.this.c.i(str);
            if (i2 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            i2.onActivityResult(i, activityResult.b(), activityResult.a());
        }
    }

    /* loaded from: classes.dex */
    public interface j {
        String getName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class k extends s5<IntentSenderRequest, ActivityResult> {
        k() {
        }

        @Override // defpackage.s5
        @NonNull
        /* renamed from: d */
        public Intent a(@NonNull Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a = intentSenderRequest.a();
            if (a != null && (bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.a(intentSenderRequest.d()).b(null).c(intentSenderRequest.c(), intentSenderRequest.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.M0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // defpackage.s5
        @NonNull
        /* renamed from: e */
        public ActivityResult c(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* loaded from: classes.dex */
    private static class m implements r64 {
        private final androidx.lifecycle.d a;
        private final r64 b;
        private final androidx.lifecycle.g c;

        m(@NonNull androidx.lifecycle.d dVar, @NonNull r64 r64Var, @NonNull androidx.lifecycle.g gVar) {
            this.a = dVar;
            this.b = r64Var;
            this.c = gVar;
        }

        @Override // defpackage.r64
        public void a(@NonNull String str, @NonNull Bundle bundle) {
            this.b.a(str, bundle);
        }

        public boolean b(d.b bVar) {
            return this.a.b().i(bVar);
        }

        public void c() {
            this.a.d(this.c);
        }
    }

    /* loaded from: classes.dex */
    public interface n {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface o {
        boolean a(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2);
    }

    /* loaded from: classes.dex */
    private class p implements o {
        final String a;
        final int b;
        final int c;

        p(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.o
        public boolean a(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.y;
            if (fragment != null && this.b < 0 && this.a == null && fragment.getChildFragmentManager().j1()) {
                return false;
            }
            return FragmentManager.this.m1(arrayList, arrayList2, this.a, this.b, this.c);
        }
    }

    private void D1(@NonNull Fragment fragment) {
        ViewGroup w0 = w0(fragment);
        if (w0 != null && fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() > 0) {
            int i2 = sy8.c;
            if (w0.getTag(i2) == null) {
                w0.setTag(i2, fragment);
            }
            ((Fragment) w0.getTag(i2)).setPopDirection(fragment.getPopDirection());
        }
    }

    private void F1() {
        for (androidx.fragment.app.m mVar : this.c.k()) {
            f1(mVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Fragment G0(@NonNull View view) {
        Object tag = view.getTag(sy8.a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    private void G1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new u("FragmentManager"));
        androidx.fragment.app.h<?> hVar = this.v;
        if (hVar != null) {
            try {
                hVar.h("  ", null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        } else {
            try {
                Z("  ", null, printWriter, new String[0]);
            } catch (Exception e3) {
                Log.e("FragmentManager", "Failed dumping state", e3);
            }
        }
        throw runtimeException;
    }

    private void I1() {
        synchronized (this.a) {
            try {
                boolean z = true;
                if (!this.a.isEmpty()) {
                    this.h.f(true);
                } else {
                    this.h.f((s0() <= 0 || !R0(this.x)) ? false : false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean M0(int i2) {
        if (!S && !Log.isLoggable("FragmentManager", i2)) {
            return false;
        }
        return true;
    }

    private boolean N0(@NonNull Fragment fragment) {
        if ((fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.q()) {
            return true;
        }
        return false;
    }

    private void O(Fragment fragment) {
        if (fragment != null && fragment.equals(i0(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    private boolean O0() {
        Fragment fragment = this.x;
        if (fragment == null) {
            return true;
        }
        if (fragment.isAdded() && this.x.getParentFragmentManager().O0()) {
            return true;
        }
        return false;
    }

    private void V(int i2) {
        try {
            this.b = true;
            this.c.d(i2);
            c1(i2, false);
            for (v vVar : w()) {
                vVar.j();
            }
            this.b = false;
            d0(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V0(Configuration configuration) {
        if (O0()) {
            C(configuration, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W0(Integer num) {
        if (O0() && num.intValue() == 80) {
            I(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X0(cq6 cq6Var) {
        if (O0()) {
            J(cq6Var.a(), false);
        }
    }

    private void Y() {
        if (this.L) {
            this.L = false;
            F1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y0(d68 d68Var) {
        if (O0()) {
            Q(d68Var.a(), false);
        }
    }

    private void a0() {
        for (v vVar : w()) {
            vVar.j();
        }
    }

    private void c0(boolean z) {
        if (!this.b) {
            if (this.v == null) {
                if (this.K) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() == this.v.g().getLooper()) {
                if (!z) {
                    r();
                }
                if (this.M == null) {
                    this.M = new ArrayList<>();
                    this.N = new ArrayList<>();
                    return;
                }
                return;
            } else {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    private static void f0(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            androidx.fragment.app.a aVar = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue()) {
                aVar.C(-1);
                aVar.H();
            } else {
                aVar.C(1);
                aVar.G();
            }
            i2++;
        }
    }

    private void g0(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i2, int i3) {
        boolean z = arrayList.get(i2).r;
        ArrayList<Fragment> arrayList3 = this.O;
        if (arrayList3 == null) {
            this.O = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.O.addAll(this.c.o());
        Fragment D0 = D0();
        boolean z2 = false;
        for (int i4 = i2; i4 < i3; i4++) {
            androidx.fragment.app.a aVar = arrayList.get(i4);
            if (!arrayList2.get(i4).booleanValue()) {
                D0 = aVar.I(this.O, D0);
            } else {
                D0 = aVar.K(this.O, D0);
            }
            if (!z2 && !aVar.i) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        this.O.clear();
        if (!z && this.u >= 1) {
            for (int i5 = i2; i5 < i3; i5++) {
                Iterator<p.a> it = arrayList.get(i5).c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.c.r(y(fragment));
                    }
                }
            }
        }
        f0(arrayList, arrayList2, i2, i3);
        boolean booleanValue = arrayList2.get(i3 - 1).booleanValue();
        for (int i6 = i2; i6 < i3; i6++) {
            androidx.fragment.app.a aVar2 = arrayList.get(i6);
            if (booleanValue) {
                for (int size = aVar2.c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = aVar2.c.get(size).b;
                    if (fragment2 != null) {
                        y(fragment2).m();
                    }
                }
            } else {
                Iterator<p.a> it2 = aVar2.c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = it2.next().b;
                    if (fragment3 != null) {
                        y(fragment3).m();
                    }
                }
            }
        }
        c1(this.u, true);
        for (v vVar : x(arrayList, i2, i3)) {
            vVar.r(booleanValue);
            vVar.p();
            vVar.g();
        }
        while (i2 < i3) {
            androidx.fragment.app.a aVar3 = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue() && aVar3.v >= 0) {
                aVar3.v = -1;
            }
            aVar3.J();
            i2++;
        }
        if (z2) {
            s1();
        }
    }

    private int j0(String str, int i2, boolean z) {
        ArrayList<androidx.fragment.app.a> arrayList = this.d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i2 < 0) {
            if (z) {
                return 0;
            }
            return this.d.size() - 1;
        }
        int size = this.d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = this.d.get(size);
            if ((str != null && str.equals(aVar.getName())) || (i2 >= 0 && i2 == aVar.v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (z) {
            while (size > 0) {
                androidx.fragment.app.a aVar2 = this.d.get(size - 1);
                if ((str != null && str.equals(aVar2.getName())) || (i2 >= 0 && i2 == aVar2.v)) {
                    size--;
                } else {
                    return size;
                }
            }
            return size;
        } else if (size == this.d.size() - 1) {
            return -1;
        } else {
            return size + 1;
        }
    }

    private boolean l1(String str, int i2, int i3) {
        d0(false);
        c0(true);
        Fragment fragment = this.y;
        if (fragment != null && i2 < 0 && str == null && fragment.getChildFragmentManager().j1()) {
            return true;
        }
        boolean m1 = m1(this.M, this.N, str, i2, i3);
        if (m1) {
            this.b = true;
            try {
                q1(this.M, this.N);
            } finally {
                s();
            }
        }
        I1();
        Y();
        this.c.b();
        return m1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static FragmentManager n0(@NonNull View view) {
        androidx.fragment.app.d dVar;
        Fragment o0 = o0(view);
        if (o0 != null) {
            if (o0.isAdded()) {
                return o0.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + o0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (context instanceof ContextWrapper) {
                if (context instanceof androidx.fragment.app.d) {
                    dVar = (androidx.fragment.app.d) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                dVar = null;
                break;
            }
        }
        if (dVar != null) {
            return dVar.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    private static Fragment o0(@NonNull View view) {
        while (view != null) {
            Fragment G0 = G0(view);
            if (G0 != null) {
                return G0;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    private void p0() {
        for (v vVar : w()) {
            vVar.k();
        }
    }

    private boolean q0(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return false;
            }
            int size = this.a.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                z |= this.a.get(i2).a(arrayList, arrayList2);
            }
            this.a.clear();
            this.v.g().removeCallbacks(this.R);
            return z;
        }
    }

    private void q1(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                if (!arrayList.get(i2).r) {
                    if (i3 != i2) {
                        g0(arrayList, arrayList2, i3, i2);
                    }
                    i3 = i2 + 1;
                    if (arrayList2.get(i2).booleanValue()) {
                        while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).r) {
                            i3++;
                        }
                    }
                    g0(arrayList, arrayList2, i2, i3);
                    i2 = i3 - 1;
                }
                i2++;
            }
            if (i3 != size) {
                g0(arrayList, arrayList2, i3, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    private void r() {
        if (!T0()) {
            return;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    private void s() {
        this.b = false;
        this.N.clear();
        this.M.clear();
    }

    private void s1() {
        if (this.m != null) {
            for (int i2 = 0; i2 < this.m.size(); i2++) {
                this.m.get(i2).a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void t() {
        /*
            r4 = this;
            androidx.fragment.app.h<?> r0 = r4.v
            boolean r1 = r0 instanceof defpackage.vzb
            if (r1 == 0) goto L11
            androidx.fragment.app.o r0 = r4.c
            androidx.fragment.app.l r0 = r0.p()
            boolean r0 = r0.o()
            goto L27
        L11:
            android.content.Context r0 = r0.f()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L29
            androidx.fragment.app.h<?> r0 = r4.v
            android.content.Context r0 = r0.f()
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            r0 = r0 ^ 1
        L27:
            if (r0 == 0) goto L5b
        L29:
            java.util.Map<java.lang.String, androidx.fragment.app.BackStackState> r0 = r4.j
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.BackStackState r1 = (androidx.fragment.app.BackStackState) r1
            java.util.List<java.lang.String> r1 = r1.a
            java.util.Iterator r1 = r1.iterator()
        L45:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            androidx.fragment.app.o r3 = r4.c
            androidx.fragment.app.l r3 = r3.p()
            r3.h(r2)
            goto L45
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.t():void");
    }

    @NonNull
    private androidx.fragment.app.l t0(@NonNull Fragment fragment) {
        return this.P.k(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int u1(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 8194) {
            if (i2 == 8197) {
                return 4100;
            }
            if (i2 != 4099) {
                if (i2 != 4100) {
                    return 0;
                }
                return 8197;
            }
            return 4099;
        }
        return 4097;
    }

    private Set<v> w() {
        HashSet hashSet = new HashSet();
        for (androidx.fragment.app.m mVar : this.c.k()) {
            ViewGroup viewGroup = mVar.k().mContainer;
            if (viewGroup != null) {
                hashSet.add(v.o(viewGroup, E0()));
            }
        }
        return hashSet;
    }

    private ViewGroup w0(@NonNull Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.w.d()) {
            View c2 = this.w.c(fragment.mContainerId);
            if (c2 instanceof ViewGroup) {
                return (ViewGroup) c2;
            }
        }
        return null;
    }

    private Set<v> x(@NonNull ArrayList<androidx.fragment.app.a> arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            Iterator<p.a> it = arrayList.get(i2).c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(v.n(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        V(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public LayoutInflater.Factory2 A0() {
        return this.f;
    }

    @SuppressLint({"SyntheticAccessor"})
    public final void A1(@NonNull final String str, @NonNull op5 op5Var, @NonNull final r64 r64Var) {
        final androidx.lifecycle.d lifecycle = op5Var.getLifecycle();
        if (lifecycle.b() == d.b.DESTROYED) {
            return;
        }
        androidx.lifecycle.g gVar = new androidx.lifecycle.g() { // from class: androidx.fragment.app.FragmentManager.6
            @Override // androidx.lifecycle.g
            public void d(@NonNull op5 op5Var2, @NonNull d.a aVar) {
                Bundle bundle;
                if (aVar == d.a.ON_START && (bundle = (Bundle) FragmentManager.this.k.get(str)) != null) {
                    r64Var.a(str, bundle);
                    FragmentManager.this.u(str);
                }
                if (aVar == d.a.ON_DESTROY) {
                    lifecycle.d(this);
                    FragmentManager.this.l.remove(str);
                }
            }
        };
        lifecycle.a(gVar);
        m put = this.l.put(str, new m(lifecycle, r64Var, gVar));
        if (put != null) {
            put.c();
        }
        if (M0(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + r64Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        V(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public androidx.fragment.app.j B0() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B1(@NonNull Fragment fragment, @NonNull d.b bVar) {
        if (fragment.equals(i0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void C(@NonNull Configuration configuration, boolean z) {
        if (z && (this.v instanceof p77)) {
            G1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.C(configuration, true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment C0() {
        return this.x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C1(Fragment fragment) {
        if (fragment != null && (!fragment.equals(i0(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.y;
        this.y = fragment;
        O(fragment2);
        O(this.y);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean D(@NonNull MenuItem menuItem) {
        if (this.u < 1) {
            return false;
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public Fragment D0() {
        return this.y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        V(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public w E0() {
        w wVar = this.B;
        if (wVar != null) {
            return wVar;
        }
        Fragment fragment = this.x;
        if (fragment != null) {
            return fragment.mFragmentManager.E0();
        }
        return this.C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E1(@NonNull Fragment fragment) {
        if (M0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean F(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (this.u < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.c.o()) {
            if (fragment != null && Q0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                Fragment fragment2 = this.e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public v64.c F0() {
        return this.Q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G() {
        this.K = true;
        d0(true);
        a0();
        t();
        V(-1);
        androidx.fragment.app.h<?> hVar = this.v;
        if (hVar instanceof f97) {
            ((f97) hVar).removeOnTrimMemoryListener(this.q);
        }
        androidx.fragment.app.h<?> hVar2 = this.v;
        if (hVar2 instanceof p77) {
            ((p77) hVar2).removeOnConfigurationChangedListener(this.p);
        }
        androidx.fragment.app.h<?> hVar3 = this.v;
        if (hVar3 instanceof p87) {
            ((p87) hVar3).removeOnMultiWindowModeChangedListener(this.r);
        }
        androidx.fragment.app.h<?> hVar4 = this.v;
        if (hVar4 instanceof r87) {
            ((r87) hVar4).removeOnPictureInPictureModeChangedListener(this.s);
        }
        androidx.fragment.app.h<?> hVar5 = this.v;
        if (hVar5 instanceof md6) {
            ((md6) hVar5).removeMenuProvider(this.t);
        }
        this.v = null;
        this.w = null;
        this.x = null;
        if (this.g != null) {
            this.h.d();
            this.g = null;
        }
        a6<Intent> a6Var = this.D;
        if (a6Var != null) {
            a6Var.c();
            this.E.c();
            this.F.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H() {
        V(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public androidx.lifecycle.t H0(@NonNull Fragment fragment) {
        return this.P.n(fragment);
    }

    public void H1(@NonNull l lVar) {
        this.n.p(lVar);
    }

    void I(boolean z) {
        if (z && (this.v instanceof f97)) {
            G1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.I(true);
                }
            }
        }
    }

    void I0() {
        d0(true);
        if (this.h.c()) {
            j1();
        } else {
            this.g.e();
        }
    }

    void J(boolean z, boolean z2) {
        if (z2 && (this.v instanceof p87)) {
            G1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.J(z, true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J0(@NonNull Fragment fragment) {
        if (M0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            D1(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(@NonNull Fragment fragment) {
        Iterator<o64> it = this.o.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K0(@NonNull Fragment fragment) {
        if (fragment.mAdded && N0(fragment)) {
            this.H = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L() {
        for (Fragment fragment : this.c.l()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.L();
            }
        }
    }

    public boolean L0() {
        return this.K;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean M(@NonNull MenuItem menuItem) {
        if (this.u < 1) {
            return false;
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N(@NonNull Menu menu) {
        if (this.u < 1) {
            return;
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P() {
        V(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean P0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    void Q(boolean z, boolean z2) {
        if (z2 && (this.v instanceof r87)) {
            G1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.Q(z, true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean Q0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean R(@NonNull Menu menu) {
        boolean z = false;
        if (this.u < 1) {
            return false;
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null && Q0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean R0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragment.equals(fragmentManager.D0()) && R0(fragmentManager.x)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S() {
        I1();
        O(this.y);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean S0(int i2) {
        if (this.u >= i2) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        V(7);
    }

    public boolean T0() {
        if (!this.I && !this.J) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        V(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W() {
        this.J = true;
        this.P.q(true);
        V(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X() {
        V(2);
    }

    public void Z(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.e.get(i2).toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                androidx.fragment.app.a aVar = this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.E(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            try {
                int size3 = this.a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size3; i4++) {
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(this.a.get(i4));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.w);
        if (this.x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z0(@NonNull Fragment fragment, @NonNull String[] strArr, int i2) {
        if (this.F != null) {
            this.G.addLast(new LaunchedFragmentInfo(fragment.mWho, i2));
            this.F.a(strArr);
            return;
        }
        this.v.k(fragment, strArr, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a1(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (this.D != null) {
            this.G.addLast(new LaunchedFragmentInfo(fragment.mWho, i2));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.D.a(intent);
            return;
        }
        this.v.m(fragment, intent, i2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b0(@NonNull o oVar, boolean z) {
        if (!z) {
            if (this.v == null) {
                if (this.K) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            r();
        }
        synchronized (this.a) {
            try {
                if (this.v == null) {
                    if (z) {
                        return;
                    }
                    throw new IllegalStateException("Activity has been destroyed");
                }
                this.a.add(oVar);
                x1();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b1(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.E != null) {
            if (bundle != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (M0(2)) {
                    Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            } else {
                intent2 = intent;
            }
            IntentSenderRequest a2 = new IntentSenderRequest.a(intentSender).b(intent2).c(i4, i3).a();
            this.G.addLast(new LaunchedFragmentInfo(fragment.mWho, i2));
            if (M0(2)) {
                Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
            }
            this.E.a(a2);
            return;
        }
        this.v.n(fragment, intentSender, i2, intent, i3, i4, i5, bundle);
    }

    void c1(int i2, boolean z) {
        androidx.fragment.app.h<?> hVar;
        if (this.v == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!z && i2 == this.u) {
            return;
        }
        this.u = i2;
        this.c.t();
        F1();
        if (this.H && (hVar = this.v) != null && this.u == 7) {
            hVar.o();
            this.H = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d0(boolean z) {
        c0(z);
        boolean z2 = false;
        while (q0(this.M, this.N)) {
            z2 = true;
            this.b = true;
            try {
                q1(this.M, this.N);
            } finally {
                s();
            }
        }
        I1();
        Y();
        this.c.b();
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d1() {
        if (this.v == null) {
            return;
        }
        this.I = false;
        this.J = false;
        this.P.q(false);
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e0(@NonNull o oVar, boolean z) {
        if (z && (this.v == null || this.K)) {
            return;
        }
        c0(z);
        if (oVar.a(this.M, this.N)) {
            this.b = true;
            try {
                q1(this.M, this.N);
            } finally {
                s();
            }
        }
        I1();
        Y();
        this.c.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e1(@NonNull FragmentContainerView fragmentContainerView) {
        View view;
        for (androidx.fragment.app.m mVar : this.c.k()) {
            Fragment k2 = mVar.k();
            if (k2.mContainerId == fragmentContainerView.getId() && (view = k2.mView) != null && view.getParent() == null) {
                k2.mContainer = fragmentContainerView;
                mVar.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f1(@NonNull androidx.fragment.app.m mVar) {
        Fragment k2 = mVar.k();
        if (k2.mDeferStart) {
            if (this.b) {
                this.L = true;
                return;
            }
            k2.mDeferStart = false;
            mVar.m();
        }
    }

    public void g1() {
        b0(new p(null, -1, 0), false);
    }

    public boolean h0() {
        boolean d0 = d0(true);
        p0();
        return d0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h1(int i2, int i3, boolean z) {
        if (i2 >= 0) {
            b0(new p(null, i2, i3), z);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(androidx.fragment.app.a aVar) {
        if (this.d == null) {
            this.d = new ArrayList<>();
        }
        this.d.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment i0(@NonNull String str) {
        return this.c.f(str);
    }

    public void i1(String str, int i2) {
        b0(new p(str, -1, i2), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.fragment.app.m j(@NonNull Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            v64.f(fragment, str);
        }
        if (M0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        androidx.fragment.app.m y = y(fragment);
        fragment.mFragmentManager = this;
        this.c.r(y);
        if (!fragment.mDetached) {
            this.c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (N0(fragment)) {
                this.H = true;
            }
        }
        return y;
    }

    public boolean j1() {
        return l1(null, -1, 0);
    }

    public void k(@NonNull o64 o64Var) {
        this.o.add(o64Var);
    }

    public Fragment k0(int i2) {
        return this.c.g(i2);
    }

    public boolean k1(int i2, int i3) {
        if (i2 >= 0) {
            return l1(null, i2, i3);
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(@NonNull Fragment fragment) {
        this.P.f(fragment);
    }

    public Fragment l0(String str) {
        return this.c.h(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m() {
        return this.i.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment m0(@NonNull String str) {
        return this.c.i(str);
    }

    boolean m1(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        boolean z;
        if ((i3 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        int j0 = j0(str, i2, z);
        if (j0 < 0) {
            return false;
        }
        for (int size = this.d.size() - 1; size >= j0; size--) {
            arrayList.add(this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"SyntheticAccessor"})
    public void n(@NonNull androidx.fragment.app.h<?> hVar, @NonNull e64 e64Var, Fragment fragment) {
        String str;
        if (this.v == null) {
            this.v = hVar;
            this.w = e64Var;
            this.x = fragment;
            if (fragment != null) {
                k(new g(fragment));
            } else if (hVar instanceof o64) {
                k((o64) hVar);
            }
            if (this.x != null) {
                I1();
            }
            if (hVar instanceof k77) {
                k77 k77Var = (k77) hVar;
                OnBackPressedDispatcher onBackPressedDispatcher = k77Var.getOnBackPressedDispatcher();
                this.g = onBackPressedDispatcher;
                op5 op5Var = k77Var;
                if (fragment != null) {
                    op5Var = fragment;
                }
                onBackPressedDispatcher.b(op5Var, this.h);
            }
            if (fragment != null) {
                this.P = fragment.mFragmentManager.t0(fragment);
            } else if (hVar instanceof vzb) {
                this.P = androidx.fragment.app.l.l(((vzb) hVar).getViewModelStore());
            } else {
                this.P = new androidx.fragment.app.l(false);
            }
            this.P.q(T0());
            this.c.A(this.P);
            androidx.fragment.app.h<?> hVar2 = this.v;
            if ((hVar2 instanceof nt9) && fragment == null) {
                androidx.savedstate.a savedStateRegistry = ((nt9) hVar2).getSavedStateRegistry();
                savedStateRegistry.h("android:support:fragments", new a.c() { // from class: n64
                    @Override // androidx.savedstate.a.c
                    public final Bundle a() {
                        Bundle U0;
                        U0 = FragmentManager.this.U0();
                        return U0;
                    }
                });
                Bundle b2 = savedStateRegistry.b("android:support:fragments");
                if (b2 != null) {
                    t1(b2);
                }
            }
            androidx.fragment.app.h<?> hVar3 = this.v;
            if (hVar3 instanceof b6) {
                ActivityResultRegistry activityResultRegistry = ((b6) hVar3).getActivityResultRegistry();
                if (fragment != null) {
                    str = fragment.mWho + ":";
                } else {
                    str = "";
                }
                String str2 = "FragmentManager:" + str;
                this.D = activityResultRegistry.i(str2 + "StartActivityForResult", new x5(), new h());
                this.E = activityResultRegistry.i(str2 + "StartIntentSenderForResult", new k(), new i());
                this.F = activityResultRegistry.i(str2 + "RequestPermissions", new w5(), new a());
            }
            androidx.fragment.app.h<?> hVar4 = this.v;
            if (hVar4 instanceof p77) {
                ((p77) hVar4).addOnConfigurationChangedListener(this.p);
            }
            androidx.fragment.app.h<?> hVar5 = this.v;
            if (hVar5 instanceof f97) {
                ((f97) hVar5).addOnTrimMemoryListener(this.q);
            }
            androidx.fragment.app.h<?> hVar6 = this.v;
            if (hVar6 instanceof p87) {
                ((p87) hVar6).addOnMultiWindowModeChangedListener(this.r);
            }
            androidx.fragment.app.h<?> hVar7 = this.v;
            if (hVar7 instanceof r87) {
                ((r87) hVar7).addOnPictureInPictureModeChangedListener(this.s);
            }
            androidx.fragment.app.h<?> hVar8 = this.v;
            if ((hVar8 instanceof md6) && fragment == null) {
                ((md6) hVar8).addMenuProvider(this.t);
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public void n1(@NonNull Bundle bundle, @NonNull String str, @NonNull Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            G1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(@NonNull Fragment fragment) {
        if (M0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.c.a(fragment);
                if (M0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (N0(fragment)) {
                    this.H = true;
                }
            }
        }
    }

    public void o1(@NonNull l lVar, boolean z) {
        this.n.o(lVar, z);
    }

    @NonNull
    public androidx.fragment.app.p p() {
        return new androidx.fragment.app.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p1(@NonNull Fragment fragment) {
        if (M0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            this.c.u(fragment);
            if (N0(fragment)) {
                this.H = true;
            }
            fragment.mRemoving = true;
            D1(fragment);
        }
    }

    boolean q() {
        boolean z = false;
        for (Fragment fragment : this.c.l()) {
            if (fragment != null) {
                z = N0(fragment);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public j r0(int i2) {
        return this.d.get(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r1(@NonNull Fragment fragment) {
        this.P.p(fragment);
    }

    public int s0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t1(Parcelable parcelable) {
        androidx.fragment.app.m mVar;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.v.f().getClassLoader());
                this.k.put(str.substring(7), bundle2);
            }
        }
        ArrayList<FragmentState> arrayList = new ArrayList<>();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.v.f().getClassLoader());
                arrayList.add((FragmentState) bundle.getParcelable("state"));
            }
        }
        this.c.x(arrayList);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        this.c.v();
        Iterator<String> it = fragmentManagerState.a.iterator();
        while (it.hasNext()) {
            FragmentState B = this.c.B(it.next(), null);
            if (B != null) {
                Fragment j2 = this.P.j(B.b);
                if (j2 != null) {
                    if (M0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + j2);
                    }
                    mVar = new androidx.fragment.app.m(this.n, this.c, j2, B);
                } else {
                    mVar = new androidx.fragment.app.m(this.n, this.c, this.v.f().getClassLoader(), x0(), B);
                }
                Fragment k2 = mVar.k();
                k2.mFragmentManager = this;
                if (M0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + k2.mWho + "): " + k2);
                }
                mVar.o(this.v.f().getClassLoader());
                this.c.r(mVar);
                mVar.u(this.u);
            }
        }
        for (Fragment fragment : this.P.m()) {
            if (!this.c.c(fragment.mWho)) {
                if (M0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + fragmentManagerState.a);
                }
                this.P.p(fragment);
                fragment.mFragmentManager = this;
                androidx.fragment.app.m mVar2 = new androidx.fragment.app.m(this.n, this.c, fragment);
                mVar2.u(1);
                mVar2.m();
                fragment.mRemoving = true;
                mVar2.m();
            }
        }
        this.c.w(fragmentManagerState.b);
        if (fragmentManagerState.c != null) {
            this.d = new ArrayList<>(fragmentManagerState.c.length);
            int i2 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.c;
                if (i2 >= backStackRecordStateArr.length) {
                    break;
                }
                androidx.fragment.app.a b2 = backStackRecordStateArr[i2].b(this);
                if (M0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + b2.v + "): " + b2);
                    PrintWriter printWriter = new PrintWriter(new u("FragmentManager"));
                    b2.F("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(b2);
                i2++;
            }
        } else {
            this.d = null;
        }
        this.i.set(fragmentManagerState.d);
        String str3 = fragmentManagerState.e;
        if (str3 != null) {
            Fragment i0 = i0(str3);
            this.y = i0;
            O(i0);
        }
        ArrayList<String> arrayList2 = fragmentManagerState.f;
        if (arrayList2 != null) {
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                this.j.put(arrayList2.get(i3), fragmentManagerState.g.get(i3));
            }
        }
        this.G = new ArrayDeque<>(fragmentManagerState.h);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.x;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.x)));
            sb.append("}");
        } else {
            androidx.fragment.app.h<?> hVar = this.v;
            if (hVar != null) {
                sb.append(hVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(@NonNull String str) {
        this.k.remove(str);
        if (M0(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public e64 u0() {
        return this.w;
    }

    public final void v(@NonNull String str) {
        m remove = this.l.remove(str);
        if (remove != null) {
            remove.c();
        }
        if (M0(2)) {
            Log.v("FragmentManager", "Clearing FragmentResultListener for key " + str);
        }
    }

    public Fragment v0(@NonNull Bundle bundle, @NonNull String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment i0 = i0(string);
        if (i0 == null) {
            G1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return i0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: v1 */
    public Bundle U0() {
        BackStackRecordState[] backStackRecordStateArr;
        int size;
        Bundle bundle = new Bundle();
        p0();
        a0();
        d0(true);
        this.I = true;
        this.P.q(true);
        ArrayList<String> y = this.c.y();
        ArrayList<FragmentState> m2 = this.c.m();
        if (m2.isEmpty()) {
            if (M0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
        } else {
            ArrayList<String> z = this.c.z();
            ArrayList<androidx.fragment.app.a> arrayList = this.d;
            if (arrayList != null && (size = arrayList.size()) > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i2 = 0; i2 < size; i2++) {
                    backStackRecordStateArr[i2] = new BackStackRecordState(this.d.get(i2));
                    if (M0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.d.get(i2));
                    }
                }
            } else {
                backStackRecordStateArr = null;
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.a = y;
            fragmentManagerState.b = z;
            fragmentManagerState.c = backStackRecordStateArr;
            fragmentManagerState.d = this.i.get();
            Fragment fragment = this.y;
            if (fragment != null) {
                fragmentManagerState.e = fragment.mWho;
            }
            fragmentManagerState.f.addAll(this.j.keySet());
            fragmentManagerState.g.addAll(this.j.values());
            fragmentManagerState.h = new ArrayList<>(this.G);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.k.keySet()) {
                bundle.putBundle("result_" + str, this.k.get(str));
            }
            Iterator<FragmentState> it = m2.iterator();
            while (it.hasNext()) {
                FragmentState next = it.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", next);
                bundle.putBundle("fragment_" + next.b, bundle2);
            }
        }
        return bundle;
    }

    public Fragment.SavedState w1(@NonNull Fragment fragment) {
        androidx.fragment.app.m n2 = this.c.n(fragment.mWho);
        if (n2 == null || !n2.k().equals(fragment)) {
            G1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return n2.r();
    }

    @NonNull
    public androidx.fragment.app.g x0() {
        androidx.fragment.app.g gVar = this.z;
        if (gVar != null) {
            return gVar;
        }
        Fragment fragment = this.x;
        if (fragment != null) {
            return fragment.mFragmentManager.x0();
        }
        return this.A;
    }

    void x1() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.v.g().removeCallbacks(this.R);
                    this.v.g().post(this.R);
                    I1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public androidx.fragment.app.m y(@NonNull Fragment fragment) {
        androidx.fragment.app.m n2 = this.c.n(fragment.mWho);
        if (n2 != null) {
            return n2;
        }
        androidx.fragment.app.m mVar = new androidx.fragment.app.m(this.n, this.c, fragment);
        mVar.o(this.v.f().getClassLoader());
        mVar.u(this.u);
        return mVar;
    }

    @NonNull
    public List<Fragment> y0() {
        return this.c.o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y1(@NonNull Fragment fragment, boolean z) {
        ViewGroup w0 = w0(fragment);
        if (w0 != null && (w0 instanceof FragmentContainerView)) {
            ((FragmentContainerView) w0).setDrawDisappearingViewsLast(!z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(@NonNull Fragment fragment) {
        if (M0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (M0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.c.u(fragment);
                if (N0(fragment)) {
                    this.H = true;
                }
                D1(fragment);
            }
        }
    }

    @NonNull
    public androidx.fragment.app.h<?> z0() {
        return this.v;
    }

    public final void z1(@NonNull String str, @NonNull Bundle bundle) {
        m mVar = this.l.get(str);
        if (mVar != null && mVar.b(d.b.STARTED)) {
            mVar.a(str, bundle);
        } else {
            this.k.put(str, bundle);
        }
        if (M0(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {
        public void d(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void e(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void f(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void i(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void k(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void l(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void n(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        @Deprecated
        public void a(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, Bundle bundle) {
        }

        public void b(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        }

        public void c(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, Bundle bundle) {
        }

        public void g(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        }

        public void h(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, Bundle bundle) {
        }

        public void j(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Bundle bundle) {
        }

        public void m(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view, Bundle bundle) {
        }
    }
}
