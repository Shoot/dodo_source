package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SemanticsProperties.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J,\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R0\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Liba;", "T", "", "parentValue", "childValue", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Ljba;", "thisRef", "Lje5;", "property", "value", "", c.a, "(Ljba;Lje5;Ljava/lang/Object;)V", "", "toString", "a", "Ljava/lang/String;", "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "Lkotlin/Function2;", "Lkotlin/jvm/functions/Function2;", "getMergePolicy$ui_release", "()Lkotlin/jvm/functions/Function2;", "mergePolicy", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: iba  reason: default package */
/* loaded from: classes.dex */
public final class iba<T> {
    private final String a;
    private final Function2<T, T, T> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\b\u0010\u0002\u001a\u0004\u0018\u0001H\u00012\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "parentValue", "childValue", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: iba$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function2<T, T, T> {
        public static final a a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final T invoke(T t, T t2) {
            if (t == null) {
                return t2;
            }
            return t;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public iba(String str, Function2<? super T, ? super T, ? extends T> function2) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(function2, "mergePolicy");
        this.a = str;
        this.b = function2;
    }

    public final String a() {
        return this.a;
    }

    public final T b(T t, T t2) {
        return this.b.invoke(t, t2);
    }

    public final void c(jba jbaVar, je5<?> je5Var, T t) {
        z65.h(jbaVar, "thisRef");
        z65.h(je5Var, "property");
        jbaVar.d(this, t);
    }

    public String toString() {
        return "SemanticsPropertyKey: " + this.a;
    }

    public /* synthetic */ iba(String str, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? a.a : function2);
    }
}
