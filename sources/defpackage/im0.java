package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BR\u0012(\u0010\u0015\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014R9\u0010\u0015\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00108\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lim0;", "T", "Lvv0;", "Ldl8;", Action.SCOPE_ATTRIBUTE, "", Image.TYPE_HIGH, "(Ldl8;Lcv1;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lzg0;", "onBufferOverflow", "Luv0;", "i", "Lkotlin/Function2;", "Lcv1;", "", e.a, "Lkotlin/jvm/functions/Function2;", "block", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;ILzg0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: im0  reason: default package */
/* loaded from: classes3.dex */
public final class im0<T> extends vv0<T> {
    private final Function2<dl8<? super T>, cv1<? super Unit>, Object> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Builders.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @nn2(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {336}, m = "collectTo")
    /* renamed from: im0$a */
    /* loaded from: classes3.dex */
    public static final class a extends ev1 {
        Object a;
        /* synthetic */ Object b;
        final /* synthetic */ im0<T> c;
        int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(im0<T> im0Var, cv1<? super a> cv1Var) {
            super(cv1Var);
            this.c = im0Var;
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return this.c.h(null, this);
        }
    }

    public /* synthetic */ im0(Function2 function2, CoroutineContext coroutineContext, int i, zg0 zg0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i2 & 2) != 0 ? kotlin.coroutines.e.a : coroutineContext, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? zg0.SUSPEND : zg0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    @Override // defpackage.vv0, defpackage.uv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(defpackage.dl8<? super T> r5, defpackage.cv1<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.im0.a
            if (r0 == 0) goto L13
            r0 = r6
            im0$a r0 = (defpackage.im0.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            im0$a r0 = new im0$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.a
            dl8 r5 = (defpackage.dl8) r5
            defpackage.vk9.b(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.vk9.b(r6)
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = super.h(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.w()
            if (r5 == 0) goto L4c
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im0.h(dl8, cv1):java.lang.Object");
    }

    @Override // defpackage.vv0, defpackage.uv0
    protected uv0<T> i(CoroutineContext coroutineContext, int i, zg0 zg0Var) {
        return new im0(this.e, coroutineContext, i, zg0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public im0(Function2<? super dl8<? super T>, ? super cv1<? super Unit>, ? extends Object> function2, CoroutineContext coroutineContext, int i, zg0 zg0Var) {
        super(function2, coroutineContext, i, zg0Var);
        this.e = function2;
    }
}
