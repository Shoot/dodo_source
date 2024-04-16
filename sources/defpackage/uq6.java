package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.bi8;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Preferences.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0018\b\u0002\u0010#\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\f0\u001f\u0012\b\b\u0002\u0010'\u001a\u00020\u0019¢\u0006\u0004\b(\u0010)J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0004J&\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\f0\u000bH\u0016J,\u0010\u000f\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u000e\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u00020\u00022\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0010J)\u0010\u0015\u001a\u00020\u00022\u001a\u0010\u0014\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00130\u0012\"\u0006\u0012\u0002\b\u00030\u0013¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u0017\u0010\nJ\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016R*\u0010#\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\f0\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%¨\u0006*"}, d2 = {"Luq6;", "Lbi8;", "", e.a, "()V", "f", "T", "Lbi8$a;", Action.KEY_ATTRIBUTE, "b", "(Lbi8$a;)Ljava/lang/Object;", "", "", "a", "value", "i", "(Lbi8$a;Ljava/lang/Object;)V", "j", "", "Lbi8$b;", "pairs", "g", "([Lbi8$b;)V", Image.TYPE_HIGH, "other", "", "equals", "", "hashCode", "", "toString", "", "Ljava/util/Map;", "getPreferencesMap$datastore_preferences_core", "()Ljava/util/Map;", "preferencesMap", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "frozen", "startFrozen", "<init>", "(Ljava/util/Map;Z)V", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1})
/* renamed from: uq6  reason: default package */
/* loaded from: classes.dex */
public final class uq6 extends bi8 {
    private final Map<bi8.a<?>, Object> a;
    private final AtomicBoolean b;

    /* compiled from: Preferences.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "Lbi8$a;", "", "entry", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: uq6$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<Map.Entry<bi8.a<?>, Object>, CharSequence> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(Map.Entry<bi8.a<?>, Object> entry) {
            z65.h(entry, "entry");
            return "  " + entry.getKey().a() + " = " + entry.getValue();
        }
    }

    public uq6() {
        this(null, false, 3, null);
    }

    @Override // defpackage.bi8
    public Map<bi8.a<?>, Object> a() {
        Map<bi8.a<?>, Object> unmodifiableMap = Collections.unmodifiableMap(this.a);
        z65.g(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    @Override // defpackage.bi8
    public <T> T b(bi8.a<T> aVar) {
        z65.h(aVar, Action.KEY_ATTRIBUTE);
        return (T) this.a.get(aVar);
    }

    public final void e() {
        if (!this.b.get()) {
            return;
        }
        throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
    }

    public boolean equals(Object obj) {
        if (obj instanceof uq6) {
            return z65.c(this.a, ((uq6) obj).a);
        }
        return false;
    }

    public final void f() {
        this.b.set(true);
    }

    public final void g(bi8.b<?>... bVarArr) {
        z65.h(bVarArr, "pairs");
        e();
        for (bi8.b<?> bVar : bVarArr) {
            j(bVar.a(), bVar.b());
        }
    }

    public final <T> T h(bi8.a<T> aVar) {
        z65.h(aVar, Action.KEY_ATTRIBUTE);
        e();
        return (T) this.a.remove(aVar);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public final <T> void i(bi8.a<T> aVar, T t) {
        z65.h(aVar, Action.KEY_ATTRIBUTE);
        j(aVar, t);
    }

    public final void j(bi8.a<?> aVar, Object obj) {
        Set K0;
        z65.h(aVar, Action.KEY_ATTRIBUTE);
        e();
        if (obj == null) {
            h(aVar);
        } else if (obj instanceof Set) {
            Map<bi8.a<?>, Object> map = this.a;
            K0 = sc1.K0((Iterable) obj);
            Set unmodifiableSet = Collections.unmodifiableSet(K0);
            z65.g(unmodifiableSet, "unmodifiableSet(value.toSet())");
            map.put(aVar, unmodifiableSet);
        } else {
            this.a.put(aVar, obj);
        }
    }

    public String toString() {
        String i0;
        i0 = sc1.i0(this.a.entrySet(), ",\n", "{\n", "\n}", 0, null, a.a, 24, null);
        return i0;
    }

    public /* synthetic */ uq6(Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map, (i & 2) != 0 ? true : z);
    }

    public uq6(Map<bi8.a<?>, Object> map, boolean z) {
        z65.h(map, "preferencesMap");
        this.a = map;
        this.b = new AtomicBoolean(z);
    }
}
