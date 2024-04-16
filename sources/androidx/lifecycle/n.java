package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.lifecycle.n;
import androidx.savedstate.a;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SavedStateHandle.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0001\fB\u001f\b\u0016\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aB\t\b\u0016¢\u0006\u0004\b\u0019\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J(\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR$\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR(\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00120\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/n;", "", "Landroidx/savedstate/a$c;", com.huawei.hms.opendevice.c.a, "T", "", Action.KEY_ATTRIBUTE, "value", "", com.huawei.hms.push.e.a, "(Ljava/lang/String;Ljava/lang/Object;)V", "", "a", "Ljava/util/Map;", "regular", "b", "savedStateProviders", "liveDatas", "Lfr6;", DateTokenConverter.CONVERTER_KEY, "flows", "Landroidx/savedstate/a$c;", "savedStateProvider", "", "initialState", "<init>", "(Ljava/util/Map;)V", "()V", "f", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class n {
    public static final a f = new a(null);
    private static final Class<? extends Object>[] g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    private final Map<String, Object> a;
    private final Map<String, a.c> b;
    private final Map<String, Object> c;
    private final Map<String, fr6<Object>> d;
    private final a.c e;

    /* compiled from: SavedStateHandle.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0007R$\u0010\f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/n$a;", "", "Landroid/os/Bundle;", "restoredState", "defaultState", "Landroidx/lifecycle/n;", "a", "value", "", "b", "", "Ljava/lang/Class;", "ACCEPTABLE_CLASSES", "[Ljava/lang/Class;", "", "KEYS", "Ljava/lang/String;", "VALUES", "<init>", "()V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new n();
                }
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    z65.g(str, Action.KEY_ATTRIBUTE);
                    hashMap.put(str, bundle2.get(str));
                }
                return new n(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i = 0; i < size; i++) {
                    Object obj = parcelableArrayList.get(i);
                    z65.f(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
                }
                return new n(linkedHashMap);
            }
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }

        public final boolean b(Object obj) {
            Class[] clsArr;
            if (obj == null) {
                return true;
            }
            for (Class cls : n.g) {
                z65.e(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public n(Map<String, ? extends Object> map) {
        z65.h(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new a.c() { // from class: it9
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                Bundle d;
                d = n.d(n.this);
                return d;
            }
        };
        linkedHashMap.putAll(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(n nVar) {
        Map u;
        z65.h(nVar, "this$0");
        u = g86.u(nVar.b);
        for (Map.Entry entry : u.entrySet()) {
            nVar.e((String) entry.getKey(), ((a.c) entry.getValue()).a());
        }
        Set<String> keySet = nVar.a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(nVar.a.get(str));
        }
        return zh0.a(lnb.a("keys", arrayList), lnb.a("values", arrayList2));
    }

    public final a.c c() {
        return this.e;
    }

    public final <T> void e(String str, T t) {
        qq6 qq6Var;
        z65.h(str, Action.KEY_ATTRIBUTE);
        if (f.b(t)) {
            Object obj = this.c.get(str);
            if (obj instanceof qq6) {
                qq6Var = (qq6) obj;
            } else {
                qq6Var = null;
            }
            if (qq6Var != null) {
                qq6Var.n(t);
            } else {
                this.a.put(str, t);
            }
            fr6<Object> fr6Var = this.d.get(str);
            if (fr6Var != null) {
                fr6Var.setValue(t);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't put value with type ");
        z65.e(t);
        sb.append(t.getClass());
        sb.append(" into saved state");
        throw new IllegalArgumentException(sb.toString());
    }

    public n() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new a.c() { // from class: it9
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                Bundle d;
                d = n.d(n.this);
                return d;
            }
        };
    }
}
