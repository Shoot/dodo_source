package cloud.mindbox.mobile_sdk.models.operation.adapters;

import ch.qos.logback.core.joran.action.Action;
import cloud.mindbox.mobile_sdk.models.operation.Ids;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: IdsAdapter.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0014\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/operation/adapters/IdsAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcloud/mindbox/mobile_sdk/models/operation/Ids;", "Ldd5;", "out", "value", "", "write", "Lyb5;", "in", "read", "Lcom/google/gson/Gson;", "gson$delegate", "Lrn5;", "getGson", "()Lcom/google/gson/Gson;", "gson", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class IdsAdapter extends TypeAdapter<Ids> {
    private final rn5 gson$delegate;

    /* compiled from: IdsAdapter.kt */
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IdsAdapter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcloud/mindbox/mobile_sdk/models/operation/Ids;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function0<Ids> {
        final /* synthetic */ yb5 $reader;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: IdsAdapter.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class a extends ej5 implements Function0<Unit> {
            final /* synthetic */ Map<String, String> $ids;
            final /* synthetic */ yb5 $reader;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(yb5 yb5Var, Map<String, String> map) {
                super(0);
                this.$reader = yb5Var;
                this.$ids = map;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String y = this.$reader.y();
                String L = this.$reader.L();
                Map<String, String> map = this.$ids;
                z65.g(y, Action.KEY_ATTRIBUTE);
                map.put(y, L);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(yb5 yb5Var) {
            super(0);
            this.$reader = yb5Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Ids invoke() {
            if (this.$reader.N() == mc5.NULL) {
                this.$reader.H();
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (this.$reader.N() == mc5.BEGIN_OBJECT) {
                this.$reader.b();
                while (this.$reader.N() != mc5.END_OBJECT) {
                    yx5.a.d(new a(this.$reader, linkedHashMap));
                }
                this.$reader.k();
            }
            return new Ids(linkedHashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IdsAdapter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ldd5;", "invoke", "()Ldd5;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function0<dd5> {
        final /* synthetic */ dd5 $out;
        final /* synthetic */ Ids $value;
        final /* synthetic */ IdsAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Ids ids, dd5 dd5Var, IdsAdapter idsAdapter) {
            super(0);
            this.$value = ids;
            this.$out = dd5Var;
            this.this$0 = idsAdapter;
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
                return dd5Var2.o(this.this$0.getGson().t(this.$value.getIds()));
            }
            return null;
        }
    }

    public IdsAdapter() {
        rn5 b2;
        b2 = yn5.b(a.INSTANCE);
        this.gson$delegate = b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Gson getGson() {
        return (Gson) this.gson$delegate.getValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public Ids read(yb5 yb5Var) {
        if (yb5Var != null) {
            return (Ids) yx5.a.b(null, new b(yb5Var));
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(dd5 dd5Var, Ids ids) {
        yx5.a.d(new c(ids, dd5Var, this));
    }
}
