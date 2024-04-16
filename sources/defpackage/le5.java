package defpackage;

import defpackage.je5;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: KProperty.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u0010J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00028\u0000H'¢\u0006\u0004\b\t\u0010\u0007R&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n8&X¦\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lle5;", "T", "V", "Lje5;", "Lkotlin/Function1;", "receiver", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "getDelegate", "Lle5$a;", "getGetter", "()Lle5$a;", "getGetter$annotations", "()V", "getter", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: le5  reason: default package */
/* loaded from: classes3.dex */
public interface le5<T, V> extends je5<V>, Function1<T, V> {

    /* compiled from: KProperty.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0006\b\u0003\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004¨\u0006\u0005"}, d2 = {"Lle5$a;", "T", "V", "Lje5$a;", "Lkotlin/Function1;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: le5$a */
    /* loaded from: classes3.dex */
    public interface a<T, V> extends je5.a<V>, Function1<T, V> {
    }

    V get(T t);

    Object getDelegate(T t);

    /* renamed from: getGetter */
    a<T, V> mo62getGetter();
}
