package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AlignmentLine.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \n2\u00020\u0001:\u0001\u0004B#\b\u0004\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tR,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006\u0082\u0001\u0001\u000b¨\u0006\f"}, d2 = {"Lhb;", "", "Lkotlin/Function2;", "", "a", "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "merger", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "b", "Lyo4;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: hb  reason: default package */
/* loaded from: classes.dex */
public abstract class hb {
    public static final a b = new a(null);
    private final Function2<Integer, Integer, Integer> a;

    /* compiled from: AlignmentLine.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lhb$a;", "", "", "Unspecified", "I", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: hb$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ hb(Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2);
    }

    public final Function2<Integer, Integer, Integer> a() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private hb(Function2<? super Integer, ? super Integer, Integer> function2) {
        this.a = function2;
    }
}
