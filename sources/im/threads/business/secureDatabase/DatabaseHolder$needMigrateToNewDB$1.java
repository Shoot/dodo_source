package im.threads.business.secureDatabase;

import android.content.Context;
import im.threads.R;
import im.threads.business.utils.Balloon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DatabaseHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.business.secureDatabase.DatabaseHolder$needMigrateToNewDB$1", f = "DatabaseHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DatabaseHolder$needMigrateToNewDB$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    int label;
    final /* synthetic */ DatabaseHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatabaseHolder$needMigrateToNewDB$1(DatabaseHolder databaseHolder, cv1<? super DatabaseHolder$needMigrateToNewDB$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = databaseHolder;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new DatabaseHolder$needMigrateToNewDB$1(this.this$0, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((DatabaseHolder$needMigrateToNewDB$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Context context;
        Context context2;
        c75.d();
        if (this.label == 0) {
            vk9.b(obj);
            context = this.this$0.context;
            context2 = this.this$0.context;
            String string = context2.getString(R.string.ecc_not_enough_space);
            z65.g(string, "context.getString(R.string.ecc_not_enough_space)");
            Balloon.show(context, string);
            return Unit.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
