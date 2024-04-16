package defpackage;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: InvalidationLiveDataContainer.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R$\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Li75;", "", "Lun9;", "a", "Lun9;", "database", "", "Landroidx/lifecycle/LiveData;", "b", "Ljava/util/Set;", "getLiveDataSet$room_runtime_release", "()Ljava/util/Set;", "liveDataSet", "<init>", "(Lun9;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: i75  reason: default package */
/* loaded from: classes.dex */
public final class i75 {
    private final un9 a;
    private final Set<LiveData<?>> b;

    public i75(un9 un9Var) {
        z65.h(un9Var, "database");
        this.a = un9Var;
        Set<LiveData<?>> newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        z65.g(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.b = newSetFromMap;
    }
}
