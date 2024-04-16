package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: yuc  reason: default package */
/* loaded from: classes2.dex */
public final class yuc extends Fragment implements kp5 {
    private static final WeakHashMap e = new WeakHashMap();
    private final Map b = Collections.synchronizedMap(new lr());
    private int c = 0;
    private Bundle d;

    public static yuc ih(d dVar) {
        yuc yucVar;
        WeakHashMap weakHashMap = e;
        WeakReference weakReference = (WeakReference) weakHashMap.get(dVar);
        if (weakReference != null && (yucVar = (yuc) weakReference.get()) != null) {
            return yucVar;
        }
        try {
            yuc yucVar2 = (yuc) dVar.getSupportFragmentManager().l0("SupportLifecycleFragmentImpl");
            if (yucVar2 == null || yucVar2.isRemoving()) {
                yucVar2 = new yuc();
                dVar.getSupportFragmentManager().p().f(yucVar2, "SupportLifecycleFragmentImpl").l();
            }
            weakHashMap.put(dVar, new WeakReference(yucVar2));
            return yucVar2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
        }
    }

    @Override // defpackage.kp5
    public final void E1(String str, @NonNull LifecycleCallback lifecycleCallback) {
        if (!this.b.containsKey(str)) {
            this.b.put(str, lifecycleCallback);
            if (this.c > 0) {
                new v0d(Looper.getMainLooper()).post(new etc(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    @Override // defpackage.kp5
    public final <T extends LifecycleCallback> T d4(String str, Class<T> cls) {
        return cls.cast(this.b.get(str));
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.b.values()) {
            lifecycleCallback.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // defpackage.kp5
    public final /* synthetic */ Activity mc() {
        return getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.b.values()) {
            lifecycleCallback.e(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.c = 1;
        this.d = bundle;
        for (Map.Entry entry : this.b.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.f(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.c = 5;
        for (LifecycleCallback lifecycleCallback : this.b.values()) {
            lifecycleCallback.g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.c = 3;
        for (LifecycleCallback lifecycleCallback : this.b.values()) {
            lifecycleCallback.h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.b.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.c = 2;
        for (LifecycleCallback lifecycleCallback : this.b.values()) {
            lifecycleCallback.j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.c = 4;
        for (LifecycleCallback lifecycleCallback : this.b.values()) {
            lifecycleCallback.k();
        }
    }
}
