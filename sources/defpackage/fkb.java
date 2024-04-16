package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RoomDatabaseExt.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\u0003R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lfkb;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/d;", "a", "Lkotlin/coroutines/d;", DateTokenConverter.CONVERTER_KEY, "()Lkotlin/coroutines/d;", "transactionDispatcher", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", Action.KEY_ATTRIBUTE, "b", "room-ktx_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: fkb  reason: default package */
/* loaded from: classes.dex */
public final class fkb implements CoroutineContext.Element {
    public static final a b = new a(null);
    private final d a;

    /* compiled from: RoomDatabaseExt.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lfkb$a;", "Lkotlin/coroutines/CoroutineContext$b;", "Lfkb;", "<init>", "()V", "room-ktx_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: fkb$a */
    /* loaded from: classes.dex */
    public static final class a implements CoroutineContext.b<fkb> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext P(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.d(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext T(CoroutineContext.b<?> bVar) {
        return CoroutineContext.Element.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E c(CoroutineContext.b<E> bVar) {
        return (E) CoroutineContext.Element.a.b(this, bVar);
    }

    public final d d() {
        return this.a;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.b<fkb> getKey() {
        return b;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R m0(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.a.a(this, r, function2);
    }
}
