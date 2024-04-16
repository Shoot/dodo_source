package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BR\u0012(\u0010\u0016\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J!\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0094@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016R9\u0010\u0016\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00118\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lvv0;", "T", "Luv0;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lzg0;", "onBufferOverflow", "i", "Ldl8;", Action.SCOPE_ATTRIBUTE, "", Image.TYPE_HIGH, "(Ldl8;Lcv1;)Ljava/lang/Object;", "", "toString", "Lkotlin/Function2;", "Lcv1;", "", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function2;", "block", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;ILzg0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: vv0  reason: default package */
/* loaded from: classes3.dex */
public class vv0<T> extends uv0<T> {
    private final Function2<dl8<? super T>, cv1<? super Unit>, Object> d;

    public /* synthetic */ vv0(Function2 function2, CoroutineContext coroutineContext, int i, zg0 zg0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i2 & 2) != 0 ? e.a : coroutineContext, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? zg0.SUSPEND : zg0Var);
    }

    static /* synthetic */ Object n(vv0 vv0Var, dl8 dl8Var, cv1 cv1Var) {
        Object d;
        Object invoke = vv0Var.d.invoke(dl8Var, cv1Var);
        d = c75.d();
        if (invoke == d) {
            return invoke;
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.uv0
    public Object h(dl8<? super T> dl8Var, cv1<? super Unit> cv1Var) {
        return n(this, dl8Var, cv1Var);
    }

    @Override // defpackage.uv0
    protected uv0<T> i(CoroutineContext coroutineContext, int i, zg0 zg0Var) {
        return new vv0(this.d, coroutineContext, i, zg0Var);
    }

    @Override // defpackage.uv0
    public String toString() {
        return "block[" + this.d + "] -> " + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vv0(Function2<? super dl8<? super T>, ? super cv1<? super Unit>, ? extends Object> function2, CoroutineContext coroutineContext, int i, zg0 zg0Var) {
        super(coroutineContext, i, zg0Var);
        this.d = function2;
    }
}
