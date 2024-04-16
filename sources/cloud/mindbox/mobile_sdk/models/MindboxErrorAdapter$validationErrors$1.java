package cloud.mindbox.mobile_sdk.models;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MindboxErrorAdapter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MindboxErrorAdapter$validationErrors$1 extends ej5 implements Function0<List<Object>> {
    final /* synthetic */ yb5 $reader;
    final /* synthetic */ MindboxErrorAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MindboxErrorAdapter$validationErrors$1(MindboxErrorAdapter mindboxErrorAdapter, yb5 yb5Var) {
        super(0);
        this.this$0 = mindboxErrorAdapter;
        this.$reader = yb5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<Object> invoke() {
        Gson gson;
        gson = this.this$0.getGson();
        Object i = gson.i(this.$reader, new TypeToken<List<Object>>() { // from class: cloud.mindbox.mobile_sdk.models.MindboxErrorAdapter$validationErrors$1.1
        }.getType());
        z65.g(i, "gson.fromJson<List<Valid…ge>>() {}.type,\n        )");
        return (List) i;
    }
}
