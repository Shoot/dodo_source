package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobCancellationException;
/* compiled from: ChannelCoroutine.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010+\u001a\u00020*\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010,\u001a\u00020\u0007\u0012\u0006\u0010-\u001a\u00020\u0007¢\u0006\u0004\b.\u0010/J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0001J\u001f\u0010\u000b\u001a\u00020\u00032\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00030\tH\u0097\u0001J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0096\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0097\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0096Aø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u000fJ'\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001c\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001bJ\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R \u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$R#\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120&8\u0016X\u0096\u0005ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Ltv0;", "E", "Le1;", "", "Lrv0;", "", "cause", "", "v", "Lkotlin/Function1;", "handler", "g", "Law0;", "iterator", "poll", "()Ljava/lang/Object;", "f", "(Lcv1;)Ljava/lang/Object;", "Lcw0;", DateTokenConverter.CONVERTER_KEY, "element", "p", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", Image.TYPE_SMALL, Image.TYPE_HIGH, "(Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "a", "R", c.a, "Lrv0;", "g1", "()Lrv0;", "_channel", "w", "()Z", "isClosedForSend", "Ll4a;", "i", "()Ll4a;", "onReceiveCatching", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lrv0;ZZ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: tv0  reason: default package */
/* loaded from: classes3.dex */
public class tv0<E> extends e1<Unit> implements rv0<E> {
    private final rv0<E> c;

    public tv0(CoroutineContext coroutineContext, rv0<E> rv0Var, boolean z, boolean z2) {
        super(coroutineContext, z, z2);
        this.c = rv0Var;
    }

    @Override // defpackage.v95
    public void R(Throwable th) {
        CancellationException V0 = v95.V0(this, th, null, 1, null);
        this.c.a(V0);
        J(V0);
    }

    @Override // defpackage.v95, defpackage.l95, defpackage.a99
    public final void a(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(X(), null, this);
        }
        R(cancellationException);
    }

    @Override // defpackage.a99
    public Object d(cv1<? super cw0<? extends E>> cv1Var) {
        Object d = this.c.d(cv1Var);
        c75.d();
        return d;
    }

    @Override // defpackage.a99
    public Object f(cv1<? super E> cv1Var) {
        return this.c.f(cv1Var);
    }

    @Override // defpackage.lba
    public void g(Function1<? super Throwable, Unit> function1) {
        this.c.g(function1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final rv0<E> g1() {
        return this.c;
    }

    @Override // defpackage.lba
    public Object h(E e) {
        return this.c.h(e);
    }

    @Override // defpackage.a99
    public l4a<cw0<E>> i() {
        return this.c.i();
    }

    @Override // defpackage.a99
    public aw0<E> iterator() {
        return this.c.iterator();
    }

    @Override // defpackage.lba
    public Object p(E e, cv1<? super Unit> cv1Var) {
        return this.c.p(e, cv1Var);
    }

    @Override // defpackage.a99
    public E poll() {
        return this.c.poll();
    }

    @Override // defpackage.a99
    public Object s() {
        return this.c.s();
    }

    @Override // defpackage.lba
    public boolean v(Throwable th) {
        return this.c.v(th);
    }

    @Override // defpackage.lba
    public boolean w() {
        return this.c.w();
    }
}
