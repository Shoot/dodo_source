package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.lifecycle.d;
import androidx.lifecycle.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {
    private Random a = new Random();
    private final Map<Integer, String> b = new HashMap();
    final Map<String, Integer> c = new HashMap();
    private final Map<String, d> d = new HashMap();
    ArrayList<String> e = new ArrayList<>();
    final transient Map<String, c<?>> f = new HashMap();
    final Map<String, Object> g = new HashMap();
    final Bundle h = new Bundle();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class a<I> extends a6<I> {
        final /* synthetic */ String a;
        final /* synthetic */ s5 b;

        a(String str, s5 s5Var) {
            this.a = str;
            this.b = s5Var;
        }

        @Override // defpackage.a6
        public void b(I i, p5 p5Var) {
            Integer num = ActivityResultRegistry.this.c.get(this.a);
            if (num != null) {
                ActivityResultRegistry.this.e.add(this.a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.b, i, p5Var);
                    return;
                } catch (Exception e) {
                    ActivityResultRegistry.this.e.remove(this.a);
                    throw e;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.b + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // defpackage.a6
        public void c() {
            ActivityResultRegistry.this.l(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class b<I> extends a6<I> {
        final /* synthetic */ String a;
        final /* synthetic */ s5 b;

        b(String str, s5 s5Var) {
            this.a = str;
            this.b = s5Var;
        }

        @Override // defpackage.a6
        public void b(I i, p5 p5Var) {
            Integer num = ActivityResultRegistry.this.c.get(this.a);
            if (num != null) {
                ActivityResultRegistry.this.e.add(this.a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.b, i, p5Var);
                    return;
                } catch (Exception e) {
                    ActivityResultRegistry.this.e.remove(this.a);
                    throw e;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.b + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // defpackage.a6
        public void c() {
            ActivityResultRegistry.this.l(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c<O> {
        final r5<O> a;
        final s5<?, O> b;

        c(r5<O> r5Var, s5<?, O> s5Var) {
            this.a = r5Var;
            this.b = s5Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {
        final androidx.lifecycle.d a;
        private final ArrayList<g> b = new ArrayList<>();

        d(@NonNull androidx.lifecycle.d dVar) {
            this.a = dVar;
        }

        void a(@NonNull g gVar) {
            this.a.a(gVar);
            this.b.add(gVar);
        }

        void b() {
            Iterator<g> it = this.b.iterator();
            while (it.hasNext()) {
                this.a.d(it.next());
            }
            this.b.clear();
        }
    }

    private void a(int i, String str) {
        this.b.put(Integer.valueOf(i), str);
        this.c.put(str, Integer.valueOf(i));
    }

    private <O> void d(String str, int i, Intent intent, c<O> cVar) {
        if (cVar != null && cVar.a != null && this.e.contains(str)) {
            cVar.a.a(cVar.b.c(i, intent));
            this.e.remove(str);
            return;
        }
        this.g.remove(str);
        this.h.putParcelable(str, new ActivityResult(i, intent));
    }

    private int e() {
        int nextInt = this.a.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (this.b.containsKey(Integer.valueOf(i))) {
                nextInt = this.a.nextInt(2147418112);
            } else {
                return i;
            }
        }
    }

    private void k(String str) {
        if (this.c.get(str) != null) {
            return;
        }
        a(e(), str);
    }

    public final boolean b(int i, int i2, Intent intent) {
        String str = this.b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        d(str, i2, intent, this.f.get(str));
        return true;
    }

    public final <O> boolean c(int i, @SuppressLint({"UnknownNullness"}) O o) {
        r5<?> r5Var;
        String str = this.b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        c<?> cVar = this.f.get(str);
        if (cVar != null && (r5Var = cVar.a) != null) {
            if (this.e.remove(str)) {
                r5Var.a(o);
                return true;
            }
            return true;
        }
        this.h.remove(str);
        this.g.put(str, o);
        return true;
    }

    public abstract <I, O> void f(int i, @NonNull s5<I, O> s5Var, @SuppressLint({"UnknownNullness"}) I i2, p5 p5Var);

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList != null && integerArrayList != null) {
            this.e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            this.a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
            this.h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            for (int i = 0; i < stringArrayList.size(); i++) {
                String str = stringArrayList.get(i);
                if (this.c.containsKey(str)) {
                    Integer remove = this.c.remove(str);
                    if (!this.h.containsKey(str)) {
                        this.b.remove(remove);
                    }
                }
                a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
            }
        }
    }

    public final void h(@NonNull Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final <I, O> a6<I> i(@NonNull String str, @NonNull s5<I, O> s5Var, @NonNull r5<O> r5Var) {
        k(str);
        this.f.put(str, new c<>(r5Var, s5Var));
        if (this.g.containsKey(str)) {
            Object obj = this.g.get(str);
            this.g.remove(str);
            r5Var.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.h.getParcelable(str);
        if (activityResult != null) {
            this.h.remove(str);
            r5Var.a(s5Var.c(activityResult.b(), activityResult.a()));
        }
        return new b(str, s5Var);
    }

    @NonNull
    public final <I, O> a6<I> j(@NonNull final String str, @NonNull op5 op5Var, @NonNull final s5<I, O> s5Var, @NonNull final r5<O> r5Var) {
        androidx.lifecycle.d lifecycle = op5Var.getLifecycle();
        if (!lifecycle.b().i(d.b.STARTED)) {
            k(str);
            d dVar = this.d.get(str);
            if (dVar == null) {
                dVar = new d(lifecycle);
            }
            dVar.a(new g() { // from class: androidx.activity.result.ActivityResultRegistry.1
                @Override // androidx.lifecycle.g
                public void d(@NonNull op5 op5Var2, @NonNull d.a aVar) {
                    if (d.a.ON_START.equals(aVar)) {
                        ActivityResultRegistry.this.f.put(str, new c<>(r5Var, s5Var));
                        if (ActivityResultRegistry.this.g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.g.get(str);
                            ActivityResultRegistry.this.g.remove(str);
                            r5Var.a(obj);
                        }
                        ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.h.getParcelable(str);
                        if (activityResult != null) {
                            ActivityResultRegistry.this.h.remove(str);
                            r5Var.a(s5Var.c(activityResult.b(), activityResult.a()));
                        }
                    } else if (d.a.ON_STOP.equals(aVar)) {
                        ActivityResultRegistry.this.f.remove(str);
                    } else if (d.a.ON_DESTROY.equals(aVar)) {
                        ActivityResultRegistry.this.l(str);
                    }
                }
            });
            this.d.put(str, dVar);
            return new a(str, s5Var);
        }
        throw new IllegalStateException("LifecycleOwner " + op5Var + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    final void l(@NonNull String str) {
        Integer remove;
        if (!this.e.contains(str) && (remove = this.c.remove(str)) != null) {
            this.b.remove(remove);
        }
        this.f.remove(str);
        if (this.g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.g.get(str));
            this.g.remove(str);
        }
        if (this.h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.h.getParcelable(str));
            this.h.remove(str);
        }
        d dVar = this.d.get(str);
        if (dVar != null) {
            dVar.b();
            this.d.remove(str);
        }
    }
}
