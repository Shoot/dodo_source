package defpackage;

import java.util.Collection;
import kotlin.Metadata;
/* compiled from: CommonAnalyticsConsumer.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lrj1;", "Llc;", "", "event", "", "b", "", "a", "Ljava/util/Collection;", "interceptEvents", "<init>", "(Ljava/util/Collection;)V", "analytics-core"}, k = 1, mv = {1, 7, 1})
/* renamed from: rj1  reason: default package */
/* loaded from: classes.dex */
public abstract class rj1 implements lc {
    private final Collection<String> a;

    public rj1(Collection<String> collection) {
        z65.h(collection, "interceptEvents");
        this.a = collection;
    }

    @Override // defpackage.lc
    public boolean b(String str) {
        z65.h(str, "event");
        return this.a.contains(str);
    }
}
