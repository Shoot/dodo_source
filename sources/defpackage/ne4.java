package defpackage;

import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: GeoSerializationManagerImpl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\f"}, d2 = {"Lne4;", "Lme4;", "", "inAppGeo", "Lpe4;", "b", "a", "Lcom/google/gson/Gson;", "Lcom/google/gson/Gson;", "gson", "<init>", "(Lcom/google/gson/Gson;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ne4  reason: default package */
/* loaded from: classes.dex */
public final class ne4 implements me4 {
    private final Gson a;

    /* compiled from: GeoSerializationManagerImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lpe4;", "a", "()Lpe4;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ne4$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<pe4> {
        final /* synthetic */ String a;
        final /* synthetic */ ne4 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, ne4 ne4Var) {
            super(0);
            this.a = str;
            this.b = ne4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final pe4 invoke() {
            pe4 pe4Var;
            if (this.a.length() == 0) {
                pe4Var = new pe4("", "", "");
            } else {
                pe4Var = (pe4) this.b.a.k(this.a, pe4.class);
            }
            z65.g(pe4Var, "if (inAppGeo.isEmpty()) …class.java)\n            }");
            return pe4Var;
        }
    }

    /* compiled from: GeoSerializationManagerImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ne4$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<String> {
        final /* synthetic */ pe4 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(pe4 pe4Var) {
            super(0);
            this.b = pe4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            String t = ne4.this.a.t(this.b);
            z65.g(t, "gson.toJson(inAppGeo)");
            return t;
        }
    }

    public ne4(Gson gson) {
        z65.h(gson, "gson");
        this.a = gson;
    }

    @Override // defpackage.me4
    public String a(pe4 pe4Var) {
        z65.h(pe4Var, "inAppGeo");
        return (String) yx5.a.b("", new b(pe4Var));
    }

    @Override // defpackage.me4
    public pe4 b(String str) {
        z65.h(str, "inAppGeo");
        return (pe4) yx5.a.b(new pe4("", "", ""), new a(str, this));
    }
}
