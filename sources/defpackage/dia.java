package defpackage;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: SharedValues.java */
/* renamed from: dia  reason: default package */
/* loaded from: classes.dex */
public class dia {
    private SparseIntArray a = new SparseIntArray();
    private HashMap<Integer, HashSet<WeakReference<a>>> b = new HashMap<>();

    /* compiled from: SharedValues.java */
    /* renamed from: dia$a */
    /* loaded from: classes.dex */
    public interface a {
    }

    public void a(int i, a aVar) {
        HashSet<WeakReference<a>> hashSet = this.b.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.b.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference<>(aVar));
    }
}
