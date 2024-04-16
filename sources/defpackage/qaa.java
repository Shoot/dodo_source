package defpackage;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: SelectionRegistrar.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\"\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lpaa;", "", "selectableId", "", "b", "Lxr8;", "a", "Lxr8;", "()Lxr8;", "LocalSelectionRegistrar", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: qaa  reason: default package */
/* loaded from: classes.dex */
public final class qaa {
    private static final xr8<paa> a = oo1.c(null, a.a, 1, null);

    /* compiled from: SelectionRegistrar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lpaa;", "a", "()Lpaa;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: qaa$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<paa> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final paa invoke() {
            return null;
        }
    }

    public static final xr8<paa> a() {
        return a;
    }

    public static final boolean b(paa paaVar, long j) {
        Map<Long, s9a> d;
        if (paaVar != null && (d = paaVar.d()) != null) {
            return d.containsKey(Long.valueOf(j));
        }
        return false;
    }
}
