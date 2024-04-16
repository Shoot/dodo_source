package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import androidx.savedstate.a;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.push.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: DisposableSaveableStateRegistry.android.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u001a\"\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010\u0018\u00010\u000f*\u00020\u000eH\u0002\u001a \u0010\u0012\u001a\u00020\u000e*\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00100\u000fH\u0002\"\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroid/view/View;", "view", "Lnt9;", "owner", "Lh43;", "a", "", "id", "savedStateRegistryOwner", "b", "", "value", "", e.a, "Landroid/os/Bundle;", "", "", "g", "f", "", "Ljava/lang/Class;", "[Ljava/lang/Class;", "AcceptableClasses", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: i43  reason: default package */
/* loaded from: classes.dex */
public final class i43 {
    private static final Class<? extends Object>[] a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DisposableSaveableStateRegistry.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i43$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ boolean a;
        final /* synthetic */ androidx.savedstate.a b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z, androidx.savedstate.a aVar, String str) {
            super(0);
            this.a = z;
            this.b = aVar;
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.a) {
                this.b.j(this.c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DisposableSaveableStateRegistry.android.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/os/Bundle;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i43$b */
    /* loaded from: classes.dex */
    public static final class b implements a.c {
        final /* synthetic */ et9 a;

        b(et9 et9Var) {
            this.a = et9Var;
        }

        @Override // androidx.savedstate.a.c
        public final Bundle a() {
            return i43.f(this.a.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DisposableSaveableStateRegistry.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i43$c */
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function1<Object, Boolean> {
        public static final c a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "it");
            return Boolean.valueOf(i43.e(obj));
        }
    }

    public static final h43 a(View view, nt9 nt9Var) {
        String str;
        z65.h(view, "view");
        z65.h(nt9Var, "owner");
        ViewParent parent = view.getParent();
        z65.f(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(ly8.compose_view_saveable_id_tag);
        if (tag instanceof String) {
            str = (String) tag;
        } else {
            str = null;
        }
        if (str == null) {
            str = String.valueOf(view2.getId());
        }
        return b(str, nt9Var);
    }

    public static final h43 b(String str, nt9 nt9Var) {
        Map<String, List<Object>> map;
        boolean z;
        z65.h(str, "id");
        z65.h(nt9Var, "savedStateRegistryOwner");
        String str2 = et9.class.getSimpleName() + CoreConstants.COLON_CHAR + str;
        androidx.savedstate.a savedStateRegistry = nt9Var.getSavedStateRegistry();
        Bundle b2 = savedStateRegistry.b(str2);
        if (b2 != null) {
            map = g(b2);
        } else {
            map = null;
        }
        et9 a2 = gt9.a(map, c.a);
        try {
            savedStateRegistry.h(str2, new b(a2));
            z = true;
        } catch (IllegalArgumentException unused) {
            z = false;
        }
        return new h43(a2, new a(z, savedStateRegistry, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(Object obj) {
        if (obj instanceof mpa) {
            mpa mpaVar = (mpa) obj;
            if (mpaVar.a() != qpa.f() && mpaVar.a() != qpa.h() && mpaVar.a() != qpa.g()) {
                return false;
            }
            T value = mpaVar.getValue();
            if (value == 0) {
                return true;
            }
            return e(value);
        } else if ((obj instanceof b94) && (obj instanceof Serializable)) {
            return false;
        } else {
            for (Class<? extends Object> cls : a) {
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle f(Map<String, ? extends List<? extends Object>> map) {
        ArrayList<? extends Parcelable> arrayList;
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<? extends Object> value = entry.getValue();
            if (value instanceof ArrayList) {
                arrayList = (ArrayList) value;
            } else {
                arrayList = new ArrayList<>(value);
            }
            bundle.putParcelableArrayList(key, arrayList);
        }
        return bundle;
    }

    private static final Map<String, List<Object>> g(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> keySet = bundle.keySet();
        z65.g(keySet, "this.keySet()");
        for (String str : keySet) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            z65.f(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            z65.g(str, Action.KEY_ATTRIBUTE);
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
