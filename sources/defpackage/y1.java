package defpackage;

import java.util.AbstractSet;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: AbstractMutableSet.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ly1;", "E", "", "Ljava/util/AbstractSet;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: y1  reason: default package */
/* loaded from: classes3.dex */
public abstract class y1<E> extends AbstractSet<E> implements Set<E>, ie5 {
    public abstract int d();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return d();
    }
}
