package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: SemanticsConfiguration.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u00012\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002B\u0007¢\u0006\u0004\b2\u00103J$\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rJ3\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n¢\u0006\u0004\b\u000e\u0010\rJ!\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u000fH\u0096\u0002J,\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u0006\u0010\u001c\u001a\u00020\u0000J\u0013\u0010\u001e\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010\"\u001a\u00020!H\u0016R&\u0010&\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010-\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00101\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010(\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,¨\u00064"}, d2 = {"Ltaa;", "Ljba;", "", "", "Liba;", "", "T", Action.KEY_ATTRIBUTE, "p", "(Liba;)Ljava/lang/Object;", "Lkotlin/Function0;", "defaultValue", "t", "(Liba;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "u", "", "iterator", "value", "", DateTokenConverter.CONVERTER_KEY, "(Liba;Ljava/lang/Object;)V", "", Image.TYPE_HIGH, "child", "z", "(Ltaa;)V", "peer", "g", "k", "other", "equals", "", "hashCode", "", "toString", "", "a", "Ljava/util/Map;", "props", "b", "Z", "x", "()Z", "B", "(Z)V", "isMergingSemanticsOfDescendants", c.a, "v", "A", "isClearingSemantics", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: taa  reason: default package */
/* loaded from: classes.dex */
public final class taa implements jba, Iterable<Map.Entry<? extends iba<?>, ? extends Object>>, be5 {
    private final Map<iba<?>, Object> a = new LinkedHashMap();
    private boolean b;
    private boolean c;

    public final void A(boolean z) {
        this.c = z;
    }

    public final void B(boolean z) {
        this.b = z;
    }

    @Override // defpackage.jba
    public <T> void d(iba<T> ibaVar, T t) {
        z65.h(ibaVar, Action.KEY_ATTRIBUTE);
        if ((t instanceof q2) && h(ibaVar)) {
            Object obj = this.a.get(ibaVar);
            z65.f(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            q2 q2Var = (q2) obj;
            Map<iba<?>, Object> map = this.a;
            q2 q2Var2 = (q2) t;
            String b = q2Var2.b();
            if (b == null) {
                b = q2Var.b();
            }
            b94 a = q2Var2.a();
            if (a == null) {
                a = q2Var.a();
            }
            map.put(ibaVar, new q2(b, a));
            return;
        }
        this.a.put(ibaVar, t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof taa)) {
            return false;
        }
        taa taaVar = (taa) obj;
        if (z65.c(this.a, taaVar.a) && this.b == taaVar.b && this.c == taaVar.c) {
            return true;
        }
        return false;
    }

    public final void g(taa taaVar) {
        z65.h(taaVar, "peer");
        if (taaVar.b) {
            this.b = true;
        }
        if (taaVar.c) {
            this.c = true;
        }
        for (Map.Entry<iba<?>, Object> entry : taaVar.a.entrySet()) {
            iba<?> key = entry.getKey();
            Object value = entry.getValue();
            if (!this.a.containsKey(key)) {
                this.a.put(key, value);
            } else if (value instanceof q2) {
                Object obj = this.a.get(key);
                z65.f(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                q2 q2Var = (q2) obj;
                Map<iba<?>, Object> map = this.a;
                String b = q2Var.b();
                if (b == null) {
                    b = ((q2) value).b();
                }
                b94 a = q2Var.a();
                if (a == null) {
                    a = ((q2) value).a();
                }
                map.put(key, new q2(b, a));
            }
        }
    }

    public final <T> boolean h(iba<T> ibaVar) {
        z65.h(ibaVar, Action.KEY_ATTRIBUTE);
        return this.a.containsKey(ibaVar);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + a91.a(this.b)) * 31) + a91.a(this.c);
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<? extends iba<?>, ? extends Object>> iterator() {
        return this.a.entrySet().iterator();
    }

    public final taa k() {
        taa taaVar = new taa();
        taaVar.b = this.b;
        taaVar.c = this.c;
        taaVar.a.putAll(this.a);
        return taaVar;
    }

    public final <T> T p(iba<T> ibaVar) {
        z65.h(ibaVar, Action.KEY_ATTRIBUTE);
        T t = (T) this.a.get(ibaVar);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Key not present: " + ibaVar + " - consider getOrElse or getOrNull");
    }

    public final <T> T t(iba<T> ibaVar, Function0<? extends T> function0) {
        z65.h(ibaVar, Action.KEY_ATTRIBUTE);
        z65.h(function0, "defaultValue");
        T t = (T) this.a.get(ibaVar);
        if (t == null) {
            return function0.invoke();
        }
        return t;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (this.b) {
            sb.append("");
            sb.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.c) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry<iba<?>, Object> entry : this.a.entrySet()) {
            Object value = entry.getValue();
            sb.append(str);
            sb.append(entry.getKey().a());
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return fd5.a(this, null) + "{ " + ((Object) sb) + " }";
    }

    public final <T> T u(iba<T> ibaVar, Function0<? extends T> function0) {
        z65.h(ibaVar, Action.KEY_ATTRIBUTE);
        z65.h(function0, "defaultValue");
        T t = (T) this.a.get(ibaVar);
        if (t == null) {
            return function0.invoke();
        }
        return t;
    }

    public final boolean v() {
        return this.c;
    }

    public final boolean x() {
        return this.b;
    }

    public final void z(taa taaVar) {
        z65.h(taaVar, "child");
        for (Map.Entry<iba<?>, Object> entry : taaVar.a.entrySet()) {
            iba<?> key = entry.getKey();
            Object value = entry.getValue();
            Object obj = this.a.get(key);
            z65.f(key, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object b = key.b(obj, value);
            if (b != null) {
                this.a.put(key, b);
            }
        }
    }
}
