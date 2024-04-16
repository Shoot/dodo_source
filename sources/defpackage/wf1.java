package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.sm6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: Modifier.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0001\u0012\u0006\u0010\u001b\u001a\u00020\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\f\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0013\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001a\u0010\u0018\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001e"}, d2 = {"Lwf1;", "Lsm6;", "R", "initial", "Lkotlin/Function2;", "Lsm6$b;", "operation", Image.TYPE_HIGH, "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "i", "", "other", "equals", "", "hashCode", "", "toString", c.a, "Lsm6;", Image.TYPE_SMALL, "()Lsm6;", "outer", DateTokenConverter.CONVERTER_KEY, "o", "inner", "<init>", "(Lsm6;Lsm6;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: wf1  reason: default package */
/* loaded from: classes.dex */
public final class wf1 implements sm6 {
    private final sm6 c;
    private final sm6 d;

    /* compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "acc", "Lsm6$b;", "element", "a", "(Ljava/lang/String;Lsm6$b;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: wf1$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function2<String, sm6.b, String> {
        public static final a a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final String invoke(String str, sm6.b bVar) {
            z65.h(str, "acc");
            z65.h(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public wf1(sm6 sm6Var, sm6 sm6Var2) {
        z65.h(sm6Var, "outer");
        z65.h(sm6Var2, "inner");
        this.c = sm6Var;
        this.d = sm6Var2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof wf1) {
            wf1 wf1Var = (wf1) obj;
            if (z65.c(this.c, wf1Var.c) && z65.c(this.d, wf1Var.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.sm6
    public /* synthetic */ sm6 f(sm6 sm6Var) {
        return rm6.a(this, sm6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sm6
    public <R> R h(R r, Function2<? super R, ? super sm6.b, ? extends R> function2) {
        z65.h(function2, "operation");
        return (R) this.d.h(this.c.h(r, function2), function2);
    }

    public int hashCode() {
        return this.c.hashCode() + (this.d.hashCode() * 31);
    }

    @Override // defpackage.sm6
    public boolean i(Function1<? super sm6.b, Boolean> function1) {
        z65.h(function1, "predicate");
        if (this.c.i(function1) && this.d.i(function1)) {
            return true;
        }
        return false;
    }

    public final sm6 o() {
        return this.d;
    }

    public final sm6 s() {
        return this.c;
    }

    public String toString() {
        return '[' + ((String) h("", a.a)) + ']';
    }
}
