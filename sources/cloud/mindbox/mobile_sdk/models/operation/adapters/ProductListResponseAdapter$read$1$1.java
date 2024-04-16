package cloud.mindbox.mobile_sdk.models.operation.adapters;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: ProductListResponseAdapter.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ProductListResponseAdapter$read$1$1 extends ej5 implements Function0<Object> {
    final /* synthetic */ yb5 $reader;
    final /* synthetic */ ProductListResponseAdapter this$0;

    /* compiled from: ProductListResponseAdapter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[mc5.values().length];
            try {
                iArr[mc5.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mc5.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mc5.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListResponseAdapter$read$1$1(yb5 yb5Var, ProductListResponseAdapter productListResponseAdapter) {
        super(0);
        this.$reader = yb5Var;
        this.this$0 = productListResponseAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        mc5 N = this.$reader.N();
        if (N == null) {
            i = -1;
        } else {
            i = a.$EnumSwitchMapping$0[N.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return this.this$0.getGson().i(this.$reader, ft0.class);
            }
            return this.this$0.getGson().i(this.$reader, new TypeToken<List<Object>>() { // from class: cloud.mindbox.mobile_sdk.models.operation.adapters.ProductListResponseAdapter$read$1$1.1
            }.getType());
        }
        this.$reader.H();
        return null;
    }
}
