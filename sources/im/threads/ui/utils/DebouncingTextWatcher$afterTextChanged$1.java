package im.threads.ui.utils;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: DebouncingTextWatcher.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.utils.DebouncingTextWatcher$afterTextChanged$1", f = "DebouncingTextWatcher.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DebouncingTextWatcher$afterTextChanged$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ String $newText;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DebouncingTextWatcher this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebouncingTextWatcher$afterTextChanged$1(String str, DebouncingTextWatcher debouncingTextWatcher, cv1<? super DebouncingTextWatcher$afterTextChanged$1> cv1Var) {
        super(2, cv1Var);
        this.$newText = str;
        this.this$0 = debouncingTextWatcher;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new DebouncingTextWatcher$afterTextChanged$1(this.$newText, this.this$0, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((DebouncingTextWatcher$afterTextChanged$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        DebouncingTextWatcher debouncingTextWatcher;
        long j;
        String str;
        Function1 function1;
        d = c75.d();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                str = (String) this.L$1;
                debouncingTextWatcher = (DebouncingTextWatcher) this.L$0;
                vk9.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            vk9.b(obj);
            String str2 = this.$newText;
            if (str2 != null) {
                debouncingTextWatcher = this.this$0;
                j = debouncingTextWatcher.debouncePeriod;
                this.L$0 = debouncingTextWatcher;
                this.L$1 = str2;
                this.label = 1;
                if (xt2.a(j, this) == d) {
                    return d;
                }
                str = str2;
            }
            return Unit.a;
        }
        function1 = debouncingTextWatcher.onDebouncingQueryTextChange;
        function1.invoke(str);
        return Unit.a;
    }
}
