package im.threads.business.preferences;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: Preferences.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, d2 = {"", "T", "Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.business.preferences.Preferences$save$1", f = "Preferences.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class Preferences$save$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ String $json;
    final /* synthetic */ String $key;
    int label;
    final /* synthetic */ Preferences this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Preferences$save$1(Preferences preferences, String str, String str2, cv1<? super Preferences$save$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = preferences;
        this.$key = str;
        this.$json = str2;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new Preferences$save$1(this.this$0, this.$key, this.$json, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((Preferences$save$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        c75.d();
        if (this.label == 0) {
            vk9.b(obj);
            SharedPreferences.Editor edit = this.this$0.getSharedPreferences().edit();
            edit.putString(this.$key, this.$json);
            edit.commit();
            return Unit.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
