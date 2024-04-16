package defpackage;

import com.facebook.flipper.plugins.databases.DatabaseDriver;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B<\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0002\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR3\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lg4a;", "T", "R", "Lu95;", "", "cause", "", "Lv5a;", e.a, "Lv5a;", DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_SELECT, "Lkotlin/Function2;", "Lcv1;", "", "f", "Lkotlin/jvm/functions/Function2;", "block", "<init>", "(Lv5a;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: g4a  reason: default package */
/* loaded from: classes3.dex */
public final class g4a<T, R> extends u95 {
    private final v5a<R> e;
    private final Function2<T, cv1<? super R>, Object> f;

    /* JADX WARN: Multi-variable type inference failed */
    public g4a(v5a<? super R> v5aVar, Function2<? super T, ? super cv1<? super R>, ? extends Object> function2) {
        this.e = v5aVar;
        this.f = function2;
    }

    @Override // defpackage.wl1
    public void R(Throwable th) {
        if (this.e.o()) {
            S().Q0(this.e, this.f);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        R(th);
        return Unit.a;
    }
}
