package defpackage;

import androidx.datastore.core.CorruptionException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: ReplaceFileCorruptionHandler.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lng9;", "T", "Lyx1;", "Landroidx/datastore/core/CorruptionException;", "ex", "a", "(Landroidx/datastore/core/CorruptionException;Lcv1;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "produceNewData", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "datastore-core"}, k = 1, mv = {1, 5, 1})
/* renamed from: ng9  reason: default package */
/* loaded from: classes.dex */
public final class ng9<T> implements yx1<T> {
    private final Function1<CorruptionException, T> a;

    /* JADX WARN: Multi-variable type inference failed */
    public ng9(Function1<? super CorruptionException, ? extends T> function1) {
        z65.h(function1, "produceNewData");
        this.a = function1;
    }

    @Override // defpackage.yx1
    public Object a(CorruptionException corruptionException, cv1<? super T> cv1Var) throws IOException {
        return this.a.invoke(corruptionException);
    }
}
