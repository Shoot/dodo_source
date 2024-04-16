package kotlin.coroutines;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CoroutineContextImpl.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001fB\u0017\u0012\u0006\u0010!\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0000H\u0002J\b\u0010\r\u001a\u00020\fH\u0002J*\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u000e*\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00028\u00002\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\u00012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016R\u0014\u0010!\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lkotlin/coroutines/c;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "i", "Lkotlin/coroutines/CoroutineContext$Element;", "element", "", DateTokenConverter.CONVERTER_KEY, CoreConstants.CONTEXT_SCOPE_VALUE, "f", "", "writeReplace", "E", "Lkotlin/coroutines/CoroutineContext$b;", Action.KEY_ATTRIBUTE, com.huawei.hms.opendevice.c.a, "(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$Element;", "R", "initial", "Lkotlin/Function2;", "operation", "m0", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "T", "other", "equals", "hashCode", "", "toString", "a", "Lkotlin/coroutines/CoroutineContext;", ElementGenerator.TEXT_ALIGN_LEFT, "b", "Lkotlin/coroutines/CoroutineContext$Element;", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class c implements CoroutineContext, Serializable {
    private final CoroutineContext a;
    private final CoroutineContext.Element b;

    /* compiled from: CoroutineContextImpl.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0001\u0007B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0002R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lkotlin/coroutines/c$a;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "", "Lkotlin/coroutines/CoroutineContext;", "a", "[Lkotlin/coroutines/CoroutineContext;", "getElements", "()[Lkotlin/coroutines/CoroutineContext;", "elements", "<init>", "([Lkotlin/coroutines/CoroutineContext;)V", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    private static final class a implements Serializable {
        public static final C0412a b = new C0412a(null);
        private final CoroutineContext[] a;

        /* compiled from: CoroutineContextImpl.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lkotlin/coroutines/c$a$a;", "", "", "serialVersionUID", "J", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
        /* renamed from: kotlin.coroutines.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0412a {
            private C0412a() {
            }

            public /* synthetic */ C0412a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public a(CoroutineContext[] coroutineContextArr) {
            z65.h(coroutineContextArr, "elements");
            this.a = coroutineContextArr;
        }

        private final Object readResolve() {
            CoroutineContext[] coroutineContextArr = this.a;
            CoroutineContext coroutineContext = e.a;
            for (CoroutineContext coroutineContext2 : coroutineContextArr) {
                coroutineContext = coroutineContext.P(coroutineContext2);
            }
            return coroutineContext;
        }
    }

    /* compiled from: CoroutineContextImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "acc", "Lkotlin/coroutines/CoroutineContext$Element;", "element", "a", "(Ljava/lang/String;Lkotlin/coroutines/CoroutineContext$Element;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    static final class b extends ej5 implements Function2<String, CoroutineContext.Element, String> {
        public static final b a = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final String invoke(String str, CoroutineContext.Element element) {
            z65.h(str, "acc");
            z65.h(element, "element");
            if (str.length() == 0) {
                return element.toString();
            }
            return str + ", " + element;
        }
    }

    /* compiled from: CoroutineContextImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/coroutines/CoroutineContext$Element;", "element", "a", "(Lkotlin/Unit;Lkotlin/coroutines/CoroutineContext$Element;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlin.coroutines.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0413c extends ej5 implements Function2<Unit, CoroutineContext.Element, Unit> {
        final /* synthetic */ CoroutineContext[] a;
        final /* synthetic */ ca9 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0413c(CoroutineContext[] coroutineContextArr, ca9 ca9Var) {
            super(2);
            this.a = coroutineContextArr;
            this.b = ca9Var;
        }

        public final void a(Unit unit, CoroutineContext.Element element) {
            z65.h(unit, "<anonymous parameter 0>");
            z65.h(element, "element");
            CoroutineContext[] coroutineContextArr = this.a;
            ca9 ca9Var = this.b;
            int i = ca9Var.a;
            ca9Var.a = i + 1;
            coroutineContextArr[i] = element;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit, CoroutineContext.Element element) {
            a(unit, element);
            return Unit.a;
        }
    }

    public c(CoroutineContext coroutineContext, CoroutineContext.Element element) {
        z65.h(coroutineContext, ElementGenerator.TEXT_ALIGN_LEFT);
        z65.h(element, "element");
        this.a = coroutineContext;
        this.b = element;
    }

    private final boolean d(CoroutineContext.Element element) {
        return z65.c(c(element.getKey()), element);
    }

    private final boolean f(c cVar) {
        while (d(cVar.b)) {
            CoroutineContext coroutineContext = cVar.a;
            if (coroutineContext instanceof c) {
                cVar = (c) coroutineContext;
            } else {
                z65.f(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return d((CoroutineContext.Element) coroutineContext);
            }
        }
        return false;
    }

    private final int i() {
        int i = 2;
        c cVar = this;
        while (true) {
            CoroutineContext coroutineContext = cVar.a;
            if (coroutineContext instanceof c) {
                cVar = (c) coroutineContext;
            } else {
                cVar = null;
            }
            if (cVar == null) {
                return i;
            }
            i++;
        }
    }

    private final Object writeReplace() {
        int i = i();
        CoroutineContext[] coroutineContextArr = new CoroutineContext[i];
        ca9 ca9Var = new ca9();
        m0(Unit.a, new C0413c(coroutineContextArr, ca9Var));
        if (ca9Var.a == i) {
            return new a(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext P(CoroutineContext coroutineContext) {
        return CoroutineContext.a.a(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext T(CoroutineContext.b<?> bVar) {
        z65.h(bVar, Action.KEY_ATTRIBUTE);
        if (this.b.c(bVar) != null) {
            return this.a;
        }
        CoroutineContext T = this.a.T(bVar);
        if (T == this.a) {
            return this;
        }
        if (T == e.a) {
            return this.b;
        }
        return new c(T, this.b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E c(CoroutineContext.b<E> bVar) {
        z65.h(bVar, Action.KEY_ATTRIBUTE);
        c cVar = this;
        while (true) {
            E e = (E) cVar.b.c(bVar);
            if (e != null) {
                return e;
            }
            CoroutineContext coroutineContext = cVar.a;
            if (coroutineContext instanceof c) {
                cVar = (c) coroutineContext;
            } else {
                return (E) coroutineContext.c(bVar);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.i() != i() || !cVar.f(this)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R m0(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        z65.h(function2, "operation");
        return function2.invoke((Object) this.a.m0(r, function2), this.b);
    }

    public String toString() {
        return '[' + ((String) m0("", b.a)) + ']';
    }
}
