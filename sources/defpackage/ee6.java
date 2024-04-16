package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
/* compiled from: MenuItemForwardCompatibilityRepository.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\"\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u0012"}, d2 = {"Lee6;", "", "", "id", "Lqd6;", "a", "", "map", "", "b", "Lne6;", "Lne6;", "menuItemRepository", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "cache", "<init>", "(Lne6;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ee6  reason: default package */
/* loaded from: classes4.dex */
public final class ee6 {
    private final ne6 a;
    private ConcurrentHashMap<String, String> b;

    public ee6(ne6 ne6Var) {
        z65.h(ne6Var, "menuItemRepository");
        this.a = ne6Var;
        this.b = new ConcurrentHashMap<>();
    }

    public final qd6 a(String str) {
        z65.h(str, "id");
        String str2 = this.b.get(str);
        if (str2 != null) {
            return this.a.a(str2);
        }
        return null;
    }

    public final void b(Map<String, String> map) {
        z65.h(map, "map");
        this.b = new ConcurrentHashMap<>(map);
    }
}
