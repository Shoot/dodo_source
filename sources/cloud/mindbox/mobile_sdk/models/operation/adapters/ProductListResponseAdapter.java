package cloud.mindbox.mobile_sdk.models.operation.adapters;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: ProductListResponseAdapter.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0014\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/operation/adapters/ProductListResponseAdapter;", "Lcom/google/gson/TypeAdapter;", "", "Ldd5;", "out", "value", "", "write", "Lyb5;", "in", "read", "Lcom/google/gson/Gson;", "gson$delegate", "Lrn5;", "getGson", "()Lcom/google/gson/Gson;", "gson", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ProductListResponseAdapter extends TypeAdapter<Object> {
    private final rn5 gson$delegate;

    /* compiled from: ProductListResponseAdapter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/gson/Gson;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<Gson> {
        public static final a INSTANCE = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Gson invoke() {
            return new Gson();
        }
    }

    /* compiled from: ProductListResponseAdapter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ldd5;", "invoke", "()Ldd5;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<dd5> {
        final /* synthetic */ dd5 $out;
        final /* synthetic */ Object $value;
        final /* synthetic */ ProductListResponseAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj, dd5 dd5Var, ProductListResponseAdapter productListResponseAdapter) {
            super(0);
            this.$value = obj;
            this.$out = dd5Var;
            this.this$0 = productListResponseAdapter;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final dd5 invoke() {
            if (this.$value == null) {
                dd5 dd5Var = this.$out;
                if (dd5Var != null) {
                    return dd5Var.s();
                }
                return null;
            }
            dd5 dd5Var2 = this.$out;
            if (dd5Var2 != null) {
                return dd5Var2.o(this.this$0.getGson().t(this.$value));
            }
            return null;
        }
    }

    public ProductListResponseAdapter() {
        rn5 b2;
        b2 = yn5.b(a.INSTANCE);
        this.gson$delegate = b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Gson getGson() {
        return (Gson) this.gson$delegate.getValue();
    }

    @Override // com.google.gson.TypeAdapter
    public Object read(yb5 yb5Var) {
        if (yb5Var == null) {
            return null;
        }
        return yx5.a.b(null, new ProductListResponseAdapter$read$1$1(yb5Var, this));
    }

    @Override // com.google.gson.TypeAdapter
    public void write(dd5 dd5Var, Object obj) {
        yx5.a.d(new b(obj, dd5Var, this));
    }
}
