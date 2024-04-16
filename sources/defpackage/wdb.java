package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
/* compiled from: ThreadContext.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0000\"\u0014\u0010\u000b\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n\"*\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e\"2\u0010\u0011\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0010\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00100\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e\"&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0015"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "countOrElement", com.huawei.hms.opendevice.c.a, "oldState", "", "a", "Lr3b;", "Lr3b;", "NO_THREAD_ELEMENTS", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/jvm/functions/Function2;", "countAll", "Lvdb;", "findOne", "Lfeb;", DateTokenConverter.CONVERTER_KEY, "updateState", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: wdb  reason: default package */
/* loaded from: classes3.dex */
public final class wdb {
    public static final r3b a = new r3b("NO_THREAD_ELEMENTS");
    private static final Function2<Object, CoroutineContext.Element, Object> b = a.a;
    private static final Function2<vdb<?>, CoroutineContext.Element, vdb<?>> c = b.a;
    private static final Function2<feb, CoroutineContext.Element, feb> d = c.a;

    /* compiled from: ThreadContext.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "countOrElement", "Lkotlin/coroutines/CoroutineContext$Element;", "element", "a", "(Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext$Element;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: wdb$a */
    /* loaded from: classes3.dex */
    static final class a extends ej5 implements Function2<Object, CoroutineContext.Element, Object> {
        public static final a a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(Object obj, CoroutineContext.Element element) {
            Integer num;
            int i;
            if (element instanceof vdb) {
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                } else {
                    num = null;
                }
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 1;
                }
                if (i != 0) {
                    return Integer.valueOf(i + 1);
                }
                return element;
            }
            return obj;
        }
    }

    /* compiled from: ThreadContext.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvdb;", "found", "Lkotlin/coroutines/CoroutineContext$Element;", "element", "a", "(Lvdb;Lkotlin/coroutines/CoroutineContext$Element;)Lvdb;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: wdb$b */
    /* loaded from: classes3.dex */
    static final class b extends ej5 implements Function2<vdb<?>, CoroutineContext.Element, vdb<?>> {
        public static final b a = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final vdb<?> invoke(vdb<?> vdbVar, CoroutineContext.Element element) {
            if (vdbVar != null) {
                return vdbVar;
            }
            if (element instanceof vdb) {
                return (vdb) element;
            }
            return null;
        }
    }

    /* compiled from: ThreadContext.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfeb;", "state", "Lkotlin/coroutines/CoroutineContext$Element;", "element", "a", "(Lfeb;Lkotlin/coroutines/CoroutineContext$Element;)Lfeb;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: wdb$c */
    /* loaded from: classes3.dex */
    static final class c extends ej5 implements Function2<feb, CoroutineContext.Element, feb> {
        public static final c a = new c();

        c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final feb invoke(feb febVar, CoroutineContext.Element element) {
            if (element instanceof vdb) {
                vdb<?> vdbVar = (vdb) element;
                febVar.a(vdbVar, vdbVar.o0(febVar.a));
            }
            return febVar;
        }
    }

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == a) {
            return;
        }
        if (obj instanceof feb) {
            ((feb) obj).b(coroutineContext);
            return;
        }
        Object m0 = coroutineContext.m0(null, c);
        if (m0 != null) {
            ((vdb) m0).E(coroutineContext, obj);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object m0 = coroutineContext.m0(0, b);
        z65.e(m0);
        return m0;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.m0(new feb(coroutineContext, ((Number) obj).intValue()), d);
        }
        return ((vdb) obj).o0(coroutineContext);
    }
}
